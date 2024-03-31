package com.hackathon.QBDemo.model.entity;

import com.hackathon.QBDemo.model.qbXml.DataExtRet;
import com.hackathon.QBDemo.model.qbXml.ItemInventoryRet;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Map;
import java.util.stream.Collectors;

@Entity
@Table(name = "inventory")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class InventoryEntity extends BaseEntity{
    @Id
    private String itemCode;
    private String barCode;
    private String description;
    private String quantity;
    private String size;
    private String expiryDate;
    private Boolean isActive;

    @OneToOne
    @JoinColumn(name = "itemCode", referencedColumnName = "itemCode")
    private InventoryDisplayPropertiesEntity inventoryDisplayProperties;

    public InventoryEntity(ItemInventoryRet qbInventoryItem){
        Map<String, String> customData = qbInventoryItem
                .getDataExtRet()
                .stream()
                .collect(Collectors.toMap((dataExtRet) -> dataExtRet.getDataExtName().toLowerCase(), DataExtRet::getDataExtValue));

        this.itemCode = qbInventoryItem.getName();
        this.barCode = customData.getOrDefault("barcode", "");
        this.description = qbInventoryItem.getSalesDesc();
        this.quantity = qbInventoryItem.getQuantityOnHand();
        this.size = customData.getOrDefault("itemsize", "");
        this.expiryDate = customData.getOrDefault("expirydate", "");
        this.isActive = Boolean.valueOf(qbInventoryItem.getIsActive()) ;
    }
}
