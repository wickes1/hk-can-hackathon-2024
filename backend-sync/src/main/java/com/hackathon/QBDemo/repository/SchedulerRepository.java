package com.hackathon.QBDemo.repository;

import com.hackathon.QBDemo.model.entity.SchedulerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface SchedulerRepository extends JpaRepository<SchedulerEntity, String> {
    @Modifying
    @Query("UPDATE SchedulerEntity s SET s.isLocked = true, s.lockRequestId = :requestId where s.isLocked = false and s.id=:id and s.lockRequestId is null")
    int lockScheduler(@Param("id") String id, @Param("requestId") String requestId);

    @Modifying
    @Query("UPDATE SchedulerEntity s SET s.isLocked = false, s.lastExecDate = :lastExecDate, s.lockRequestId = null where s.isLocked = true and s.id=:id and s.lockRequestId=:requestId")
    int unlockScheduler(@Param("id") String id, @Param("lastExecDate") Date lastExecDate, @Param("requestId") String requestId);
}
