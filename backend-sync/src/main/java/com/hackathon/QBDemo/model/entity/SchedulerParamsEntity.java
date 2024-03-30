package com.hackathon.QBDemo.model.entity;

import com.hackathon.QBDemo.model.entity.compositeKey.SchedulerParamsDataCompositeKey;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "schedulerParams")
@Getter
@Setter
@ToString
public class SchedulerParamsEntity {
    @EmbeddedId
    private SchedulerParamsDataCompositeKey key;
    private String paramValue;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "id")
    private SchedulerEntity scheduler;
}
