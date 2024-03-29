//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.qbXml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;/sequence>
 *       &lt;attribute name="colID" use="required" type="{}INTTYPE" />
 *       &lt;attribute name="value" type="{}STRTYPE" />
 *       &lt;attribute name="dataType">
 *         &lt;simpleType>
 *           &lt;restriction base="{}STRTYPE">
 *             &lt;enumeration value="IDTYPE"/>
 *             &lt;enumeration value="GUIDTYPE"/>
 *             &lt;enumeration value="STRTYPE"/>
 *             &lt;enumeration value="BOOLTYPE"/>
 *             &lt;enumeration value="DATETYPE"/>
 *             &lt;enumeration value="DATETIMETYPE"/>
 *             &lt;enumeration value="TIMEINTERVALTYPE"/>
 *             &lt;enumeration value="AMTTYPE"/>
 *             &lt;enumeration value="PRICETYPE"/>
 *             &lt;enumeration value="QUANTYPE"/>
 *             &lt;enumeration value="PERCENTTYPE"/>
 *             &lt;enumeration value="ENUMTYPE"/>
 *             &lt;enumeration value="INTTYPE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ColData")
public class ColData {

    @XmlAttribute(name = "colID", required = true)
    protected BigInteger colID;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "dataType")
    protected String dataType;

    /**
     * Gets the value of the colID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColID() {
        return colID;
    }

    /**
     * Sets the value of the colID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColID(BigInteger value) {
        this.colID = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

}
