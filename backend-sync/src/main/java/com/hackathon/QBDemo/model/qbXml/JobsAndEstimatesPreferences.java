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
 *         &lt;element ref="{}IsUsingEstimates"/>
 *         &lt;element ref="{}IsUsingProgressInvoicing"/>
 *         &lt;element ref="{}IsPrintingItemsWithZeroAmounts"/>
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
    "isUsingEstimates",
    "isUsingProgressInvoicing",
    "isPrintingItemsWithZeroAmounts"
})
@XmlRootElement(name = "JobsAndEstimatesPreferences")
public class JobsAndEstimatesPreferences {

    @XmlElement(name = "IsUsingEstimates", required = true)
    protected String isUsingEstimates;
    @XmlElement(name = "IsUsingProgressInvoicing", required = true)
    protected String isUsingProgressInvoicing;
    @XmlElement(name = "IsPrintingItemsWithZeroAmounts", required = true)
    protected String isPrintingItemsWithZeroAmounts;

    /**
     * Gets the value of the isUsingEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUsingEstimates() {
        return isUsingEstimates;
    }

    /**
     * Sets the value of the isUsingEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUsingEstimates(String value) {
        this.isUsingEstimates = value;
    }

    /**
     * Gets the value of the isUsingProgressInvoicing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsUsingProgressInvoicing() {
        return isUsingProgressInvoicing;
    }

    /**
     * Sets the value of the isUsingProgressInvoicing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsUsingProgressInvoicing(String value) {
        this.isUsingProgressInvoicing = value;
    }

    /**
     * Gets the value of the isPrintingItemsWithZeroAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrintingItemsWithZeroAmounts() {
        return isPrintingItemsWithZeroAmounts;
    }

    /**
     * Sets the value of the isPrintingItemsWithZeroAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrintingItemsWithZeroAmounts(String value) {
        this.isPrintingItemsWithZeroAmounts = value;
    }

}
