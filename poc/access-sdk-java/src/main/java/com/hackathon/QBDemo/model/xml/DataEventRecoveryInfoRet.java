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
 *         &lt;element ref="{}SubscriberID"/>
 *         &lt;element ref="{}DataEventRecoveryTime" minOccurs="0"/>
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
    "subscriberID",
    "dataEventRecoveryTime"
})
@XmlRootElement(name = "DataEventRecoveryInfoRet")
public class DataEventRecoveryInfoRet {

    @XmlElement(name = "SubscriberID", required = true)
    protected String subscriberID;
    @XmlElement(name = "DataEventRecoveryTime")
    protected String dataEventRecoveryTime;

    /**
     * Gets the value of the subscriberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberID() {
        return subscriberID;
    }

    /**
     * Sets the value of the subscriberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberID(String value) {
        this.subscriberID = value;
    }

    /**
     * Gets the value of the dataEventRecoveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEventRecoveryTime() {
        return dataEventRecoveryTime;
    }

    /**
     * Sets the value of the dataEventRecoveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEventRecoveryTime(String value) {
        this.dataEventRecoveryTime = value;
    }

}
