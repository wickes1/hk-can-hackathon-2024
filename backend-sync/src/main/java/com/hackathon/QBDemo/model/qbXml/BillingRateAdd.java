//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.qbXml;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element ref="{}FixedBillingRate"/>
 *           &lt;element ref="{}BillingRatePerItem" maxOccurs="unbounded"/>
 *         &lt;/choice>
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
    "name",
    "fixedBillingRate",
    "billingRatePerItem"
})
@XmlRootElement(name = "BillingRateAdd")
public class BillingRateAdd {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FixedBillingRate")
    protected String fixedBillingRate;
    @XmlElement(name = "BillingRatePerItem")
    protected List<BillingRatePerItem> billingRatePerItem;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fixedBillingRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedBillingRate() {
        return fixedBillingRate;
    }

    /**
     * Sets the value of the fixedBillingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedBillingRate(String value) {
        this.fixedBillingRate = value;
    }

    /**
     * Gets the value of the billingRatePerItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingRatePerItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingRatePerItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingRatePerItem }
     * 
     * 
     */
    public List<BillingRatePerItem> getBillingRatePerItem() {
        if (billingRatePerItem == null) {
            billingRatePerItem = new ArrayList<BillingRatePerItem>();
        }
        return this.billingRatePerItem;
    }

}
