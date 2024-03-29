package com.hackathon.QBDemo.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "schedulerErrorLog", indexes = @Index(columnList = "schedulerId, reportDate"))
@Getter
@Setter
public class SchedulerErrorLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String schedulerId;
    private Date reportDate;
    private String log;
}
