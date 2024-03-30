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
 *         &lt;element ref="{}ThousandSeparator" minOccurs="0"/>
 *         &lt;element ref="{}ThousandSeparatorGrouping" minOccurs="0"/>
 *         &lt;element ref="{}DecimalPlaces" minOccurs="0"/>
 *         &lt;element ref="{}DecimalSeparator" minOccurs="0"/>
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
    "thousandSeparator",
    "thousandSeparatorGrouping",
    "decimalPlaces",
    "decimalSeparator"
})
@XmlRootElement(name = "CurrencyFormat")
public class CurrencyFormat {

    @XmlElement(name = "ThousandSeparator", defaultValue = "Comma")
    protected String thousandSeparator;
    @XmlElement(name = "ThousandSeparatorGrouping", defaultValue = "XX_XXX_XXX")
    protected String thousandSeparatorGrouping;
    @XmlElement(name = "DecimalPlaces", defaultValue = "2")
    protected String decimalPlaces;
    @XmlElement(name = "DecimalSeparator", defaultValue = "Period")
    protected String decimalSeparator;

    /**
     * Gets the value of the thousandSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThousandSeparator() {
        return thousandSeparator;
    }

    /**
     * Sets the value of the thousandSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThousandSeparator(String value) {
        this.thousandSeparator = value;
    }

    /**
     * Gets the value of the thousandSeparatorGrouping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThousandSeparatorGrouping() {
        return thousandSeparatorGrouping;
    }

    /**
     * Sets the value of the thousandSeparatorGrouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThousandSeparatorGrouping(String value) {
        this.thousandSeparatorGrouping = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalPlaces(String value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the decimalSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    /**
     * Sets the value of the decimalSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalSeparator(String value) {
        this.decimalSeparator = value;
    }

}