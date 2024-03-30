package com.hackathon.QBDemo.service;

import com.hackathon.QBDemo.exception.AppSchedulerException;
import com.hackathon.QBDemo.model.entity.SchedulerEntity;
import com.hackathon.QBDemo.repository.SchedulerErrorLogRepository;
import com.hackathon.QBDemo.repository.SchedulerRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

import static com.hackathon.QBDemo.constant.SchedulerConstant.SchedulerExceptionCode.LOCK_SCHEDULER_FAILED;
import static com.hackathon.QBDemo.constant.SchedulerConstant.SchedulerExceptionCode.UNLOCK_SCHEDULER_FAILED;

@Service
public class SchedulerService {

    private final SchedulerRepository schedulerRepository;

    public SchedulerService(SchedulerRepository schedulerRepository){
        this.schedulerRepository = schedulerRepository;
    }

    public boolean createScheduler(String schedulerId){
        if(!schedulerRepository.existsById(schedulerId)){
            SchedulerEntity schedulerEntity = new SchedulerEntity();
            schedulerEntity.setId(schedulerId);
            schedulerEntity.setIsActive(true);
            schedulerEntity.setIsLocked(false);
            schedulerRepository.save(schedulerEntity);
            return true;
        }
        return false;
    }

    public Boolean isSchedulerActive(String schedulerId) throws Exception {
        Optional<SchedulerEntity> entity = schedulerRepository.findById(schedulerId);
        if(entity.isPresent()){
            return entity.get().getIsActive();
        }
        return false;
    }

    public void lockScheduler(String schedulerId, String requestId) throws Exception {
        int count = schedulerRepository.lockScheduler(schedulerId, requestId);
        if(count != 1)
            throw new AppSchedulerException(LOCK_SCHEDULER_FAILED);
    }

    public void unlockScheduler(String schedulerId, String requestId) throws Exception {
        int count = schedulerRepository.unlockScheduler(schedulerId, new Date(), requestId);
        if(count != 1)
            throw new AppSchedulerException(UNLOCK_SCHEDULER_FAILED);
    }
}
