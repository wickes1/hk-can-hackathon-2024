package com.hackathon.QBDemo.scheduler.processor;


import com.hackathon.QBDemo.constant.QBQueryConstant.ResponseStatus;
import com.hackathon.QBDemo.constant.SchedulerConstant.SchedulerExceptionCode;
import com.hackathon.QBDemo.constant.SchedulerConstant.SchedulerKey;
import com.hackathon.QBDemo.exception.AppSchedulerException;
import com.hackathon.QBDemo.factory.qbQuery.QBInventoryQueryRqFactory;
import com.hackathon.QBDemo.model.entity.InventoryEntity;
import com.hackathon.QBDemo.model.qbXml.ItemInventoryQueryRsType;
import com.hackathon.QBDemo.model.qbXml.QBXML;
import com.hackathon.QBDemo.repository.InventoryRepository;
import com.hackathon.QBDemo.service.QBXmlRequestProcessorService;
import com.hackathon.QBDemo.service.SchedulerErrorLogService;
import com.hackathon.QBDemo.service.SchedulerParamsService;
import com.hackathon.QBDemo.service.SchedulerService;
import com.hackathon.QBDemo.util.QBXmlMarshaller;
import com.jacob.com.Variant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.hackathon.QBDemo.constant.QBQueryConstant.qbQueryModifiedDateformat;
import static com.hackathon.QBDemo.constant.SchedulerConstant.SchedulerExceptionCode.SCHEDULER_PARAMS_NOT_FOUND;

@Component
public class QBInventorySyncSchedulerProcessor extends SchedulerProcessor {
    private final String key = SchedulerKey.QBInventorySync.getKey();
    private final Logger logger = LoggerFactory.getLogger(QBInventorySyncSchedulerProcessor.class);
    private final InventoryRepository inventoryRepository;
    private final QBXmlRequestProcessorService qbXmlRequestProcessorService;
    private final QBInventoryQueryRqFactory qbInventoryQueryRqFactory;
    private final SchedulerParamsService schedulerParamsService;
    private enum schedulerParamsEnum {
        NextQueryStartDate
    }

    public QBInventorySyncSchedulerProcessor(InventoryRepository inventoryRepository,
                                             SchedulerService schedulerService,
                                             SchedulerParamsService schedulerParamsService,
                                             SchedulerErrorLogService schedulerErrorLogService,
                                             QBXmlRequestProcessorService qbRequestProcessorService,
                                             QBInventoryQueryRqFactory queryFactory){
        super(schedulerService, schedulerErrorLogService);
        this.schedulerParamsService = schedulerParamsService;
        this.inventoryRepository = inventoryRepository;
        this.qbXmlRequestProcessorService = qbRequestProcessorService;
        this.qbInventoryQueryRqFactory = queryFactory;
    }

    @Override
    public String getSchedulerKey() {
        return key;
    }

    @Override
    public void init(Date executeDate, String requestId) throws Exception{
        logger.info(String.format("Proceed to sync all Inventory QuickBook data to database, RequestId: [%s]", requestId));
        executeDataSync(null, executeDate, requestId);
        schedulerParamsService.saveSchedulerParams(constructScheduleParam(executeDate), getSchedulerKey());
        logger.info(String.format("Completed sync all Inventory QuickBook data to database, RequestId: [%s]", requestId));
    }

    @Override
    public void execute(Date executeDate, String requestId) throws Exception {
        logger.info(String.format("Proceed to sync Inventory QuickBook data to database, RequestId: [%s]", requestId));
        Map<String, String> schedulerParams = schedulerParamsService.getSchedulerParams(getSchedulerKey());
        if(!schedulerParams.containsKey(schedulerParamsEnum.NextQueryStartDate.toString()))
            throw new AppSchedulerException(SCHEDULER_PARAMS_NOT_FOUND);

        String fromDateStr = schedulerParams.get(schedulerParamsEnum.NextQueryStartDate.toString());
        executeDataSync(new Date(Long.parseLong(fromDateStr)), executeDate, requestId);
        schedulerParamsService.saveSchedulerParams(constructScheduleParam(executeDate), getSchedulerKey());
        logger.info(String.format("Completed sync Inventory QuickBook data to database, RequestId: [%s]", requestId));
    }


    private void executeDataSync(Date dataFromDate, Date executeDate, String requestId) throws Exception {
        Variant qbSession = qbXmlRequestProcessorService.beginSession();
        try {
            BigInteger remainingCount = new BigInteger("0");
            boolean isFirstIterate = true;
            QBXML inventoryQuery = null;
            ItemInventoryQueryRsType inventoryResponse = null;

            // loop to call Quickbook iterator until no remaining records
            while (remainingCount.compareTo(BigInteger.ZERO) > 0 || isFirstIterate) {
                if (isFirstIterate) {
                    isFirstIterate = false;
                    inventoryQuery = qbInventoryQueryRqFactory.getAll(requestId, executeDate);
                } else {
                    // query to continue the iteration of the query created by first iteration, by using the iteratorId returned by the previous iteration
                    inventoryQuery = qbInventoryQueryRqFactory.getNextIteration(requestId, inventoryResponse.getIteratorID());
                }
                // send request to Quickbook
                Variant qbResponse = qbXmlRequestProcessorService.sendRequest(qbSession, QBXmlMarshaller.marshall(inventoryQuery));

                // received response
                QBXML response = QBXmlMarshaller.unmarshall(qbResponse);
                // ItemInventoryQueryRsType is the actual response by the query, use stream api to find the response
                inventoryResponse = response
                        .getQBXMLMsgsRs()
                        .getHostQueryRsOrCompanyQueryRsOrCompanyActivityQueryRs()
                        .stream()
                        .filter(rs -> rs instanceof ItemInventoryQueryRsType)
                        .map(rs -> (ItemInventoryQueryRsType) rs)
                        .findFirst()
                        // if no ItemInventoryQueryRsType was found, throw error
                        .orElseThrow(() -> new AppSchedulerException(SchedulerExceptionCode.QB_QUERY_RESPONSE_MALFORMAT));

                // in case Quickbook response as error
                if(inventoryResponse.getStatusCode().compareTo(ResponseStatus.SUCCESS.getCode()) != 0 &&
                        inventoryResponse.getStatusCode().compareTo(ResponseStatus.NO_MATCH.getCode()) != 0){
                    throw new AppSchedulerException(
                            SchedulerExceptionCode.QB_QUERY_RESPONSE_ERROR,
                            String.format("[%s] StatusCode: %s - %s", inventoryResponse.getStatusSeverity(), inventoryResponse.getStatusCode(), inventoryResponse.getStatusMessage()));
                }

                // Loop the response array, create entity and save to database
                // As of 2024-04-04, updates on quantity on hand won't include in Inventory Query Request with modified date filtering
                // As consequence, whole dataset need to be query out and do custom filtering in backend logic
                List<InventoryEntity> dataToAdd = inventoryResponse
                        .getItemInventoryRet()
                        .stream()
                        .filter((entry) -> {
                            boolean isWithinDateRange = false;
                            Date recordModifiedDate = null;
                            try {
                                // notices that the simple date format used to parse date string is constructed without timezone
                                // which quickbook have timezone issue, same date and time was updated in QB database, but with different timezone with server
                                recordModifiedDate = qbQueryModifiedDateformat.parse(entry.getTimeModified());
                            } catch (ParseException e) {
                                throw new RuntimeException(e);
                            }
                            if(dataFromDate != null)
                                isWithinDateRange = recordModifiedDate.compareTo(dataFromDate) >= 0 && recordModifiedDate.compareTo(executeDate) <= 0;
                            else
                                isWithinDateRange = recordModifiedDate.compareTo(executeDate) <= 0;

                            return isWithinDateRange;
                        })
                        .map(InventoryEntity::new)
                        .collect(Collectors.toList());

                if(!dataToAdd.isEmpty())
                    inventoryRepository.saveAll(dataToAdd);

                // update remainingCount for further process of while loop
                remainingCount = inventoryResponse.getIteratorRemainingCount();
            }
        } finally {
            qbXmlRequestProcessorService.closeSession(qbSession);
        }
    }

    private Map<String, String> constructScheduleParam(Date nextQueryStartDate){
        return new HashMap<String, String>(){{
            put(schedulerParamsEnum.NextQueryStartDate.toString(), String.valueOf(nextQueryStartDate.getTime()));
        }};
    }

}
