package com.hackathon.QBDemo.factory.qbQuery;

import com.hackathon.QBDemo.constant.QBQueryConstant;
import com.hackathon.QBDemo.model.qbXml.ItemInventoryQueryRqType;
import com.hackathon.QBDemo.model.qbXml.QBXML;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Date;

import static com.hackathon.QBDemo.constant.QBQueryConstant.qbQueryDateformat;

@Service
public class QBInventoryItemRetrievalQueryFactory extends QBDataRetrievalQueryFactory<ItemInventoryQueryRqType> {
    private final BigInteger qbQueryLimit = new BigInteger("100");

    public QBXML getAll(String qbRequestId, Date fromDate, Date toDate){
        createBaseQBXmlMsgRq();
        ItemInventoryQueryRqType inventoryQuery = createBaseInventoryQuery(qbRequestId, QBQueryConstant.RecordActiveStatus.All);
        // use iterator to prevent query all data in once
        inventoryQuery.setIterator(QBQueryConstant.Iterator.Start.toString());
        if(fromDate != null)
            inventoryQuery.setFromModifiedDate(qbQueryDateformat.format(fromDate));
        if(toDate != null)
            inventoryQuery.setToModifiedDate(qbQueryDateformat.format(toDate));
        addQuery(inventoryQuery);
        return getQbxml();
    }

    public QBXML getNextIteration(String qbRequestId, String iteratorId){
        createBaseQBXmlMsgRq();
        ItemInventoryQueryRqType inventoryQuery = createBaseInventoryQuery(qbRequestId, QBQueryConstant.RecordActiveStatus.All);
        // continue iterating using iteratorId returned by previous iteration
        inventoryQuery.setIterator(QBQueryConstant.Iterator.Continue.toString());
        inventoryQuery.setIteratorID(iteratorId);
        addQuery(inventoryQuery);
        return getQbxml();
    }

    private ItemInventoryQueryRqType createBaseInventoryQuery(String qbRequestId, QBQueryConstant.RecordActiveStatus activeStatus){
        // ItemInventoryQueryRqType - for query inventory
        ItemInventoryQueryRqType inventoryQuery = new ItemInventoryQueryRqType();
        inventoryQuery.setRequestID(qbRequestId);
        // query all inventory item,
        inventoryQuery.setActiveStatus(activeStatus.toString());
        // currently query 100 items for each iteration
        inventoryQuery.setMaxReturned(qbQueryLimit);
        // for include all data saved (e.g. custom fields)
        inventoryQuery.getOwnerID().add("0");
        return inventoryQuery;
    }
}
