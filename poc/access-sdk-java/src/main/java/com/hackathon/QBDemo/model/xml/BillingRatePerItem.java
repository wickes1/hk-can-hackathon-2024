//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.xml;

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
 *         &lt;element ref="{}ItemRef"/>
 *         &lt;choice>
 *           &lt;group ref="{}ORCustomRate"/>
 *           &lt;group ref="{}BillingRateAdjustment"/>
 *         &lt;/choice>
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
    "itemRef",
    "customRate",
    "customRatePercent",
    "adjustPercentage",
    "adjustBillingRateRelativeTo"
})
@XmlRootElement(name = "BillingRatePerItem")
public class BillingRatePerItem {

    @XmlElement(name = "ItemRef", required = true)
    protected ItemRef itemRef;
    @XmlElement(name = "CustomRate")
    protected String customRate;
    @XmlElement(name = "CustomRatePercent")
    protected String customRatePercent;
    @XmlElement(name = "AdjustPercentage")
    protected String adjustPercentage;
    @XmlElement(name = "AdjustBillingRateRelativeTo")
    protected String adjustBillingRateRelativeTo;

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
     * Gets the value of the customRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomRate() {
        return customRate;
    }

    /**
     * Sets the value of the customRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomRate(String value) {
        this.customRate = value;
    }

    /**
     * Gets the value of the customRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomRatePercent() {
        return customRatePercent;
    }

    /**
     * Sets the value of the customRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomRatePercent(String value) {
        this.customRatePercent = value;
    }

    /**
     * Gets the value of the adjustPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustPercentage() {
        return adjustPercentage;
    }

    /**
     * Sets the value of the adjustPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustPercentage(String value) {
        this.adjustPercentage = value;
    }

    /**
     * Gets the value of the adjustBillingRateRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustBillingRateRelativeTo() {
        return adjustBillingRateRelativeTo;
    }

    /**
     * Sets the value of the adjustBillingRateRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustBillingRateRelativeTo(String value) {
        this.adjustBillingRateRelativeTo = value;
    }

}
