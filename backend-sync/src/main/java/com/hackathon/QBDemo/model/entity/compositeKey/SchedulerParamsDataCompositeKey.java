package com.hackathon.QBDemo.model.entity.compositeKey;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class SchedulerParamsDataCompositeKey implements Serializable {
    private String id;
    private String paramName;
}
