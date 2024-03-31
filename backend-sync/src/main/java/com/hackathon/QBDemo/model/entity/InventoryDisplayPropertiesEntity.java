package com.hackathon.QBDemo.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventoryDisplayProperties")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class InventoryDisplayPropertiesEntity extends BaseEntity {
    @Id
    private String itemCode;
    private String imageUrl;
    @Column(columnDefinition = "jsonb")
    private String categories;
}

