package com.hackathon.QBDemo.scheduler.processor;

import com.hackathon.QBDemo.exception.AppSchedulerException;
import com.hackathon.QBDemo.service.SchedulerErrorLogService;
import com.hackathon.QBDemo.service.SchedulerService;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.UUID;

import static com.hackathon.QBDemo.constant.SchedulerConstant.SchedulerExceptionCode.SCHEDULER_INACTIVE;

public abstract class SchedulerProcessor {
    private final SchedulerService schedulerService;
    private final SchedulerErrorLogService schedulerErrorLogService;

    public SchedulerProcessor(SchedulerService schedulerService,
                              SchedulerErrorLogService schedulerErrorLogService){
        this.schedulerService = schedulerService;
        this.schedulerErrorLogService = schedulerErrorLogService;
    }

    public abstract String getSchedulerKey();
    public abstract void init(Date executeDate, String requestId) throws Exception;
    public abstract void execute(Date executeDate, String requestId) throws Exception;

    @Transactional(rollbackOn = Exception.class)
    public void executeProcessor() throws Exception {
        Date executeDate = new Date();
        String requestId = UUID.randomUUID().toString();
        String schedulerKey = getSchedulerKey();

        try{
            boolean isCreatedScheduler = schedulerService.createScheduler(schedulerKey);
            schedulerService.lockScheduler(schedulerKey, requestId);
            if(isCreatedScheduler){
                init(executeDate, requestId);
            } else {
                if(schedulerService.isSchedulerActive(schedulerKey))
                    execute(executeDate, requestId);
                else
                    throw new AppSchedulerException(SCHEDULER_INACTIVE);
            }
            schedulerService.unlockScheduler(schedulerKey, requestId);
        } catch (Exception ex){
            schedulerErrorLogService.log(getSchedulerKey(), executeDate, ex.getMessage());
            throw ex;
        }
    }
}
