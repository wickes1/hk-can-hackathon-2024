//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}TxnLineGroupCoreAdd"/>
 *         &lt;element ref="{}ServiceDate" minOccurs="0"/>
 *         &lt;element ref="{}InventorySiteRef" minOccurs="0"/>
 *         &lt;element ref="{}InventorySiteLocationRef" minOccurs="0"/>
 *         &lt;element ref="{}DataExt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemGroupRef",
    "desc",
    "quantity",
    "unitOfMeasure",
    "serviceDate",
    "inventorySiteRef",
    "inventorySiteLocationRef",
    "dataExt"
})
@XmlRootElement(name = "CreditMemoLineGroupAdd")
public class CreditMemoLineGroupAdd {

    @XmlElement(name = "ItemGroupRef", required = true)
    protected ItemGroupRef itemGroupRef;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "ServiceDate")
    protected String serviceDate;
    @XmlElement(name = "InventorySiteRef")
    protected InventorySiteRef inventorySiteRef;
    @XmlElement(name = "InventorySiteLocationRef")
    protected InventorySiteLocationRef inventorySiteLocationRef;
    @XmlElement(name = "DataExt")
    protected List<DataExt> dataExt;

    /**
     * Gets the value of the itemGroupRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemGroupRef }
     *     
     */
    public ItemGroupRef getItemGroupRef() {
        return itemGroupRef;
    }

    /**
     * Sets the value of the itemGroupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemGroupRef }
     *     
     */
    public void setItemGroupRef(ItemGroupRef value) {
        this.itemGroupRef = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(String value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the inventorySiteRef property.
     * 
     * @return
     *     possible object is
     *     {@link InventorySiteRef }
     *     
     */
    public InventorySiteRef getInventorySiteRef() {
        return inventorySiteRef;
    }

    /**
     * Sets the value of the inventorySiteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventorySiteRef }
     *     
     */
    public void setInventorySiteRef(InventorySiteRef value) {
        this.inventorySiteRef = value;
    }

    /**
     * Gets the value of the inventorySiteLocationRef property.
     * 
     * @return
     *     possible object is
     *     {@link InventorySiteLocationRef }
     *     
     */
    public InventorySiteLocationRef getInventorySiteLocationRef() {
        return inventorySiteLocationRef;
    }

    /**
     * Sets the value of the inventorySiteLocationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventorySiteLocationRef }
     *     
     */
    public void setInventorySiteLocationRef(InventorySiteLocationRef value) {
        this.inventorySiteLocationRef = value;
    }

    /**
     * Gets the value of the dataExt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataExt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataExt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataExt }
     * 
     * 
     */
    public List<DataExt> getDataExt() {
        if (dataExt == null) {
            dataExt = new ArrayList<DataExt>();
        }
        return this.dataExt;
    }

}
