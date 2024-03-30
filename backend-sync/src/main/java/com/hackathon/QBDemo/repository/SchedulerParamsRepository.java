package com.hackathon.QBDemo.repository;

import com.hackathon.QBDemo.model.entity.SchedulerParamsEntity;
import com.hackathon.QBDemo.model.entity.compositeKey.SchedulerParamsDataCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchedulerParamsRepository extends JpaRepository<SchedulerParamsEntity, SchedulerParamsDataCompositeKey> {
    List<SchedulerParamsEntity> findByKeyId(String id);
}
