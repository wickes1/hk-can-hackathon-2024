package com.hackathon.QBDemo.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "scheduler")
@Getter
@Setter
@ToString
public class SchedulerEntity {
    @Id
    private String id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastExecDate;

    private Boolean isLocked;

    private String lockRequestId;

    private Boolean isActive;

    @OneToMany(mappedBy = "scheduler", fetch = FetchType.LAZY)
    private List<SchedulerParamsEntity> schedulerParamsEntity;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "schedulerId", referencedColumnName = "id")
    private List<SchedulerErrorLogEntity> schedulerErrorLogEntity;

}
