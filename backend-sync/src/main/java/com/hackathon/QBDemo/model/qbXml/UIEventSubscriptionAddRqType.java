//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.qbXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UIEventSubscriptionAddRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UIEventSubscriptionAddRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}UIEventSubscriptionAdd"/>
 *       &lt;/sequence>
 *       &lt;attribute name="requestID" type="{}STRTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UIEventSubscriptionAddRqType", propOrder = {
    "uiEventSubscriptionAdd"
})
public class UIEventSubscriptionAddRqType {

    @XmlElement(name = "UIEventSubscriptionAdd", required = true)
    protected UIEventSubscriptionAdd uiEventSubscriptionAdd;
    @XmlAttribute(name = "requestID")
    protected String requestID;

    /**
     * Gets the value of the uiEventSubscriptionAdd property.
     * 
     * @return
     *     possible object is
     *     {@link UIEventSubscriptionAdd }
     *     
     */
    public UIEventSubscriptionAdd getUIEventSubscriptionAdd() {
        return uiEventSubscriptionAdd;
    }

    /**
     * Sets the value of the uiEventSubscriptionAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UIEventSubscriptionAdd }
     *     
     */
    public void setUIEventSubscriptionAdd(UIEventSubscriptionAdd value) {
        this.uiEventSubscriptionAdd = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

}
