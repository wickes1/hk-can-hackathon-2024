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
 *         &lt;element ref="{}PrimaryContact" minOccurs="0"/>
 *         &lt;element ref="{}SecondaryContact" minOccurs="0"/>
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
    "primaryContact",
    "secondaryContact"
})
@XmlRootElement(name = "EmergencyContacts")
public class EmergencyContacts {

    @XmlElement(name = "PrimaryContact")
    protected PrimaryContact primaryContact;
    @XmlElement(name = "SecondaryContact")
    protected SecondaryContact secondaryContact;

    /**
     * Gets the value of the primaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryContact }
     *     
     */
    public PrimaryContact getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Sets the value of the primaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryContact }
     *     
     */
    public void setPrimaryContact(PrimaryContact value) {
        this.primaryContact = value;
    }

    /**
     * Gets the value of the secondaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryContact }
     *     
     */
    public SecondaryContact getSecondaryContact() {
        return secondaryContact;
    }

    /**
     * Sets the value of the secondaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryContact }
     *     
     */
    public void setSecondaryContact(SecondaryContact value) {
        this.secondaryContact = value;
    }

}
