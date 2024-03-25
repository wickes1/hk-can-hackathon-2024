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
 *         &lt;element ref="{}IsAutomaticLoginAllowed"/>
 *         &lt;element name="AutomaticLoginUserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="29"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsPersonalDataAccessAllowed"/>
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
    "isAutomaticLoginAllowed",
    "automaticLoginUserName",
    "isPersonalDataAccessAllowed"
})
@XmlRootElement(name = "CurrentAppAccessRights")
public class CurrentAppAccessRights {

    @XmlElement(name = "IsAutomaticLoginAllowed", required = true)
    protected String isAutomaticLoginAllowed;
    @XmlElement(name = "AutomaticLoginUserName")
    protected String automaticLoginUserName;
    @XmlElement(name = "IsPersonalDataAccessAllowed", required = true)
    protected String isPersonalDataAccessAllowed;

    /**
     * Gets the value of the isAutomaticLoginAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAutomaticLoginAllowed() {
        return isAutomaticLoginAllowed;
    }

    /**
     * Sets the value of the isAutomaticLoginAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAutomaticLoginAllowed(String value) {
        this.isAutomaticLoginAllowed = value;
    }

    /**
     * Gets the value of the automaticLoginUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticLoginUserName() {
        return automaticLoginUserName;
    }

    /**
     * Sets the value of the automaticLoginUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticLoginUserName(String value) {
        this.automaticLoginUserName = value;
    }

    /**
     * Gets the value of the isPersonalDataAccessAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPersonalDataAccessAllowed() {
        return isPersonalDataAccessAllowed;
    }

    /**
     * Sets the value of the isPersonalDataAccessAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPersonalDataAccessAllowed(String value) {
        this.isPersonalDataAccessAllowed = value;
    }

}
