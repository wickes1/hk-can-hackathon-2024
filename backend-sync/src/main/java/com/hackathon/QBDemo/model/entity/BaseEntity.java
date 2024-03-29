package com.hackathon.QBDemo.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


/**
 * metadata for database entities
 */
@MappedSuperclass
@Getter
@Setter
@ToString
public abstract class BaseEntity {

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createDate", updatable = false)
    protected Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updateDate")
    protected Date updateDate;

    /*
        Removed @Version field, as empty version no. record will be regarded as new record
        and apparently record from QuickBook won't have the version no saved in database
        which in consequence result in always "insert" for saveALl() function, and violating the primary key
     */
    // version field to enable optimistic locking, to prevent race condition when saving
    //@Version
    //protected Long version;
}
