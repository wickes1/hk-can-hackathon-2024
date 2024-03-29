package com.hackathon.QBDemo.repository;

import com.hackathon.QBDemo.model.entity.SchedulerErrorLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchedulerErrorLogRepository extends JpaRepository<SchedulerErrorLogEntity, Integer> {
}
