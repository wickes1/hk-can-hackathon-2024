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
 *         &lt;element ref="{}COMCallbackInfo"/>
 *         &lt;element ref="{}DeliveryPolicy"/>
 *         &lt;element ref="{}CompanyFileEventSubscription"/>
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
    "comCallbackInfo",
    "deliveryPolicy",
    "companyFileEventSubscription"
})
@XmlRootElement(name = "UIEventSubscriptionAdd")
public class UIEventSubscriptionAdd {

    @XmlElement(name = "SubscriberID", required = true)
    protected String subscriberID;
    @XmlElement(name = "COMCallbackInfo", required = true)
    protected COMCallbackInfo comCallbackInfo;
    @XmlElement(name = "DeliveryPolicy", required = true)
    protected String deliveryPolicy;
    @XmlElement(name = "CompanyFileEventSubscription", required = true)
    protected CompanyFileEventSubscription companyFileEventSubscription;

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
     * Gets the value of the comCallbackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link COMCallbackInfo }
     *     
     */
    public COMCallbackInfo getCOMCallbackInfo() {
        return comCallbackInfo;
    }

    /**
     * Sets the value of the comCallbackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMCallbackInfo }
     *     
     */
    public void setCOMCallbackInfo(COMCallbackInfo value) {
        this.comCallbackInfo = value;
    }

    /**
     * Gets the value of the deliveryPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPolicy() {
        return deliveryPolicy;
    }

    /**
     * Sets the value of the deliveryPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPolicy(String value) {
        this.deliveryPolicy = value;
    }

    /**
     * Gets the value of the companyFileEventSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyFileEventSubscription }
     *     
     */
    public CompanyFileEventSubscription getCompanyFileEventSubscription() {
        return companyFileEventSubscription;
    }

    /**
     * Sets the value of the companyFileEventSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyFileEventSubscription }
     *     
     */
    public void setCompanyFileEventSubscription(CompanyFileEventSubscription value) {
        this.companyFileEventSubscription = value;
    }

}
