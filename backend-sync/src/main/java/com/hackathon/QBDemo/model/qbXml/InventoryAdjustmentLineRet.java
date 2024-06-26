//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.qbXml;

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
 *         &lt;element ref="{}TxnLineID"/>
 *         &lt;element ref="{}ItemRef"/>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{}SerialNumberRet"/>
 *           &lt;element name="LotNumber" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{}STRTYPE">
 *                 &lt;maxLength value="40"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element ref="{}InventorySiteLocationRef" minOccurs="0"/>
 *         &lt;element ref="{}QuantityDifference"/>
 *         &lt;element ref="{}ValueDifference"/>
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
    "txnLineID",
    "itemRef",
    "serialNumber",
    "serialNumberAddedOrRemoved",
    "lotNumber",
    "inventorySiteLocationRef",
    "quantityDifference",
    "valueDifference"
})
@XmlRootElement(name = "InventoryAdjustmentLineRet")
public class InventoryAdjustmentLineRet {

    @XmlElement(name = "TxnLineID", required = true)
    protected String txnLineID;
    @XmlElement(name = "ItemRef", required = true)
    protected ItemRef itemRef;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "SerialNumberAddedOrRemoved")
    protected String serialNumberAddedOrRemoved;
    @XmlElement(name = "LotNumber")
    protected String lotNumber;
    @XmlElement(name = "InventorySiteLocationRef")
    protected InventorySiteLocationRef inventorySiteLocationRef;
    @XmlElement(name = "QuantityDifference", required = true)
    protected String quantityDifference;
    @XmlElement(name = "ValueDifference", required = true)
    protected String valueDifference;

    /**
     * Gets the value of the txnLineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnLineID() {
        return txnLineID;
    }

    /**
     * Sets the value of the txnLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnLineID(String value) {
        this.txnLineID = value;
    }

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRef }
     *     
     */
    public ItemRef getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRef }
     *     
     */
    public void setItemRef(ItemRef value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the serialNumberAddedOrRemoved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberAddedOrRemoved() {
        return serialNumberAddedOrRemoved;
    }

    /**
     * Sets the value of the serialNumberAddedOrRemoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberAddedOrRemoved(String value) {
        this.serialNumberAddedOrRemoved = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
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
     * Gets the value of the quantityDifference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityDifference() {
        return quantityDifference;
    }

    /**
     * Sets the value of the quantityDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityDifference(String value) {
        this.quantityDifference = value;
    }

    /**
     * Gets the value of the valueDifference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDifference() {
        return valueDifference;
    }

    /**
     * Sets the value of the valueDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDifference(String value) {
        this.valueDifference = value;
    }

}
