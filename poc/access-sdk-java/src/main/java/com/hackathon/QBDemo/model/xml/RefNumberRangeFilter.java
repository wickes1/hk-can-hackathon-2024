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
 *         &lt;element ref="{}FromRefNumber" minOccurs="0"/>
 *         &lt;element ref="{}ToRefNumber" minOccurs="0"/>
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
    "fromRefNumber",
    "toRefNumber"
})
@XmlRootElement(name = "RefNumberRangeFilter")
public class RefNumberRangeFilter {

    @XmlElement(name = "FromRefNumber")
    protected String fromRefNumber;
    @XmlElement(name = "ToRefNumber")
    protected String toRefNumber;

    /**
     * Gets the value of the fromRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRefNumber() {
        return fromRefNumber;
    }

    /**
     * Sets the value of the fromRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRefNumber(String value) {
        this.fromRefNumber = value;
    }

    /**
     * Gets the value of the toRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRefNumber() {
        return toRefNumber;
    }

    /**
     * Sets the value of the toRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRefNumber(String value) {
        this.toRefNumber = value;
    }

}
