//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Form1099CategoryAccountMappingModRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Form1099CategoryAccountMappingModRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Form1099CategoryAccountMappingMod"/>
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
@XmlType(name = "Form1099CategoryAccountMappingModRqType", propOrder = {
    "form1099CategoryAccountMappingMod"
})
public class Form1099CategoryAccountMappingModRqType {

    @XmlElement(name = "Form1099CategoryAccountMappingMod", required = true)
    protected Form1099CategoryAccountMappingMod form1099CategoryAccountMappingMod;
    @XmlAttribute(name = "requestID")
    protected String requestID;

    /**
     * Gets the value of the form1099CategoryAccountMappingMod property.
     * 
     * @return
     *     possible object is
     *     {@link Form1099CategoryAccountMappingMod }
     *     
     */
    public Form1099CategoryAccountMappingMod getForm1099CategoryAccountMappingMod() {
        return form1099CategoryAccountMappingMod;
    }

    /**
     * Sets the value of the form1099CategoryAccountMappingMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Form1099CategoryAccountMappingMod }
     *     
     */
    public void setForm1099CategoryAccountMappingMod(Form1099CategoryAccountMappingMod value) {
        this.form1099CategoryAccountMappingMod = value;
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
