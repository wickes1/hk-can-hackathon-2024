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
 *         &lt;element ref="{}FromReportModifiedDate" minOccurs="0"/>
 *         &lt;element ref="{}ToReportModifiedDate" minOccurs="0"/>
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
    "fromReportModifiedDate",
    "toReportModifiedDate"
})
@XmlRootElement(name = "ReportModifiedDateRangeFilter")
public class ReportModifiedDateRangeFilter {

    @XmlElement(name = "FromReportModifiedDate")
    protected String fromReportModifiedDate;
    @XmlElement(name = "ToReportModifiedDate")
    protected String toReportModifiedDate;

    /**
     * Gets the value of the fromReportModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromReportModifiedDate() {
        return fromReportModifiedDate;
    }

    /**
     * Sets the value of the fromReportModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromReportModifiedDate(String value) {
        this.fromReportModifiedDate = value;
    }

    /**
     * Gets the value of the toReportModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToReportModifiedDate() {
        return toReportModifiedDate;
    }

    /**
     * Sets the value of the toReportModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToReportModifiedDate(String value) {
        this.toReportModifiedDate = value;
    }

}
