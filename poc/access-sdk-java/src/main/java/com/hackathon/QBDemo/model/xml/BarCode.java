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
 *         &lt;element name="BarCodeValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}AssignEvenIfUsed" minOccurs="0"/>
 *         &lt;element ref="{}AllowOverride" minOccurs="0"/>
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
    "barCodeValue",
    "assignEvenIfUsed",
    "allowOverride"
})
@XmlRootElement(name = "BarCode")
public class BarCode {

    @XmlElement(name = "BarCodeValue")
    protected String barCodeValue;
    @XmlElement(name = "AssignEvenIfUsed")
    protected String assignEvenIfUsed;
    @XmlElement(name = "AllowOverride")
    protected String allowOverride;

    /**
     * Gets the value of the barCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCodeValue() {
        return barCodeValue;
    }

    /**
     * Sets the value of the barCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCodeValue(String value) {
        this.barCodeValue = value;
    }

    /**
     * Gets the value of the assignEvenIfUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignEvenIfUsed() {
        return assignEvenIfUsed;
    }

    /**
     * Sets the value of the assignEvenIfUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignEvenIfUsed(String value) {
        this.assignEvenIfUsed = value;
    }

    /**
     * Gets the value of the allowOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowOverride() {
        return allowOverride;
    }

    /**
     * Sets the value of the allowOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowOverride(String value) {
        this.allowOverride = value;
    }

}
