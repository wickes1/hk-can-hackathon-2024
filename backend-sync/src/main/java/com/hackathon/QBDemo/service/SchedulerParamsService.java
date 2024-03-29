package com.hackathon.QBDemo.service;

import com.hackathon.QBDemo.model.entity.SchedulerParamsEntity;
import com.hackathon.QBDemo.model.entity.compositeKey.SchedulerParamsDataCompositeKey;
import com.hackathon.QBDemo.repository.SchedulerParamsRepository;
import com.hackathon.QBDemo.repository.SchedulerRepository;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SchedulerParamsService {

    private final SchedulerRepository schedulerRepository;
    private final SchedulerParamsRepository schedulerParamsRepository;

    public SchedulerParamsService(SchedulerRepository schedulerRepository, SchedulerParamsRepository schedulerParamsRepository){
        this.schedulerRepository = schedulerRepository;
        this.schedulerParamsRepository = schedulerParamsRepository;
    }

    public Map<String, String> getSchedulerParams(String schedulerId){
        return schedulerParamsRepository
                .findByKeyId(schedulerId)
                .stream()
                .collect(Collectors.toMap((entity) -> entity.getKey().getParamName(), SchedulerParamsEntity::getParamValue));
    }

    public void saveSchedulerParams(Map<String, String> params, String schedulerId) {
        for(Map.Entry<String, String> entry : params.entrySet()){
            SchedulerParamsEntity entity = new SchedulerParamsEntity();
            SchedulerParamsDataCompositeKey compositeKey = new SchedulerParamsDataCompositeKey(schedulerId, entry.getKey());
            entity.setKey(compositeKey);
            entity.setParamValue(entry.getValue());
            entity.setScheduler(schedulerRepository.getReferenceById(schedulerId));
            schedulerParamsRepository.save(entity);
        }
    }
}
