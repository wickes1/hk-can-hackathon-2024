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
 *         &lt;element name="Desc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}Price"/>
 *           &lt;element ref="{}PricePercent"/>
 *         &lt;/choice>
 *         &lt;element ref="{}AccountRef" minOccurs="0"/>
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
    "desc",
    "price",
    "pricePercent",
    "accountRef"
})
@XmlRootElement(name = "SalesOrPurchase")
public class SalesOrPurchase {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Price")
    protected String price;
    @XmlElement(name = "PricePercent")
    protected String pricePercent;
    @XmlElement(name = "AccountRef")
    protected AccountRef accountRef;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the pricePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePercent() {
        return pricePercent;
    }

    /**
     * Sets the value of the pricePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePercent(String value) {
        this.pricePercent = value;
    }

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRef }
     *     
     */
    public AccountRef getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRef }
     *     
     */
    public void setAccountRef(AccountRef value) {
        this.accountRef = value;
    }

}
