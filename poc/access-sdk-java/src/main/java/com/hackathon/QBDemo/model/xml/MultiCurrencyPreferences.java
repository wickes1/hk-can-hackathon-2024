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
 *         &lt;element ref="{}IsMultiCurrencyOn" minOccurs="0"/>
 *         &lt;element ref="{}HomeCurrencyRef" minOccurs="0"/>
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
    "isMultiCurrencyOn",
    "homeCurrencyRef"
})
@XmlRootElement(name = "MultiCurrencyPreferences")
public class MultiCurrencyPreferences {

    @XmlElement(name = "IsMultiCurrencyOn")
    protected String isMultiCurrencyOn;
    @XmlElement(name = "HomeCurrencyRef")
    protected HomeCurrencyRef homeCurrencyRef;

    /**
     * Gets the value of the isMultiCurrencyOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultiCurrencyOn() {
        return isMultiCurrencyOn;
    }

    /**
     * Sets the value of the isMultiCurrencyOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultiCurrencyOn(String value) {
        this.isMultiCurrencyOn = value;
    }

    /**
     * Gets the value of the homeCurrencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link HomeCurrencyRef }
     *     
     */
    public HomeCurrencyRef getHomeCurrencyRef() {
        return homeCurrencyRef;
    }

    /**
     * Sets the value of the homeCurrencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeCurrencyRef }
     *     
     */
    public void setHomeCurrencyRef(HomeCurrencyRef value) {
        this.homeCurrencyRef = value;
    }

}
