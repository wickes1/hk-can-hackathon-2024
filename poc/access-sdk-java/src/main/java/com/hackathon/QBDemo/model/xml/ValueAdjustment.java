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
 *         &lt;choice>
 *           &lt;element ref="{}NewQuantity" minOccurs="0"/>
 *           &lt;element ref="{}QuantityDifference"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="0" minOccurs="0">
 *           &lt;element ref="{}NewValue"/>
 *           &lt;element ref="{}ValueDifference"/>
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
    "newQuantity",
    "quantityDifference",
    "newValue",
    "valueDifference"
})
@XmlRootElement(name = "ValueAdjustment")
public class ValueAdjustment {

    @XmlElement(name = "NewQuantity")
    protected String newQuantity;
    @XmlElement(name = "QuantityDifference")
    protected String quantityDifference;
    @XmlElement(name = "NewValue")
    protected String newValue;
    @XmlElement(name = "ValueDifference")
    protected String valueDifference;

    /**
     * Gets the value of the newQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewQuantity() {
        return newQuantity;
    }

    /**
     * Sets the value of the newQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewQuantity(String value) {
        this.newQuantity = value;
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
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
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
