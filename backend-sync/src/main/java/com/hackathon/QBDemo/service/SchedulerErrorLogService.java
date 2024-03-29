package com.hackathon.QBDemo.service;

import com.hackathon.QBDemo.model.entity.SchedulerErrorLogEntity;
import com.hackathon.QBDemo.repository.SchedulerErrorLogRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
public class SchedulerErrorLogService {

    private final SchedulerErrorLogRepository schedulerErrorLogRepository;

    public SchedulerErrorLogService(SchedulerErrorLogRepository schedulerErrorLogRepository){
        this.schedulerErrorLogRepository = schedulerErrorLogRepository;
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void log(String SchedulerId, Date reportDate, String log){
        SchedulerErrorLogEntity entity = new SchedulerErrorLogEntity();
        entity.setSchedulerId(SchedulerId);
        entity.setReportDate(reportDate);
        entity.setLog(log);
        schedulerErrorLogRepository.saveAndFlush(entity);
    }

}
