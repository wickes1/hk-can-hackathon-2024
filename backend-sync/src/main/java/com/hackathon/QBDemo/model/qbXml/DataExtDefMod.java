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
 *         &lt;element ref="{}OwnerID"/>
 *         &lt;element name="DataExtName">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DataExtNewName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}AssignToObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}RemoveFromObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DataExtListRequire" minOccurs="0"/>
 *         &lt;element ref="{}DataExtTxnRequire" minOccurs="0"/>
 *         &lt;element ref="{}DataExtFormatString" minOccurs="0"/>
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
    "ownerID",
    "dataExtName",
    "dataExtNewName",
    "assignToObject",
    "removeFromObject",
    "dataExtListRequire",
    "dataExtTxnRequire",
    "dataExtFormatString"
})
@XmlRootElement(name = "DataExtDefMod")
public class DataExtDefMod {

    @XmlElement(name = "OwnerID", required = true)
    protected String ownerID;
    @XmlElement(name = "DataExtName", required = true)
    protected String dataExtName;
    @XmlElement(name = "DataExtNewName")
    protected String dataExtNewName;
    @XmlElement(name = "AssignToObject")
    protected List<String> assignToObject;
    @XmlElement(name = "RemoveFromObject")
    protected List<String> removeFromObject;
    @XmlElement(name = "DataExtListRequire")
    protected String dataExtListRequire;
    @XmlElement(name = "DataExtTxnRequire")
    protected String dataExtTxnRequire;
    @XmlElement(name = "DataExtFormatString")
    protected String dataExtFormatString;

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerID(String value) {
        this.ownerID = value;
    }

    /**
     * Gets the value of the dataExtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtName() {
        return dataExtName;
    }

    /**
     * Sets the value of the dataExtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtName(String value) {
        this.dataExtName = value;
    }

    /**
     * Gets the value of the dataExtNewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtNewName() {
        return dataExtNewName;
    }

    /**
     * Sets the value of the dataExtNewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtNewName(String value) {
        this.dataExtNewName = value;
    }

    /**
     * Gets the value of the assignToObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignToObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignToObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssignToObject() {
        if (assignToObject == null) {
            assignToObject = new ArrayList<String>();
        }
        return this.assignToObject;
    }

    /**
     * Gets the value of the removeFromObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removeFromObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoveFromObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemoveFromObject() {
        if (removeFromObject == null) {
            removeFromObject = new ArrayList<String>();
        }
        return this.removeFromObject;
    }

    /**
     * Gets the value of the dataExtListRequire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtListRequire() {
        return dataExtListRequire;
    }

    /**
     * Sets the value of the dataExtListRequire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtListRequire(String value) {
        this.dataExtListRequire = value;
    }

    /**
     * Gets the value of the dataExtTxnRequire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtTxnRequire() {
        return dataExtTxnRequire;
    }

    /**
     * Sets the value of the dataExtTxnRequire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtTxnRequire(String value) {
        this.dataExtTxnRequire = value;
    }

    /**
     * Gets the value of the dataExtFormatString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExtFormatString() {
        return dataExtFormatString;
    }

    /**
     * Sets the value of the dataExtFormatString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExtFormatString(String value) {
        this.dataExtFormatString = value;
    }

}
