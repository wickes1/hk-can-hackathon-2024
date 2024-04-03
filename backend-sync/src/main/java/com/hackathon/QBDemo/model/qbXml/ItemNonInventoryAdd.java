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
 *         &lt;element name="Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}BarCode" minOccurs="0"/>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}ParentRef" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element name="ManufacturerPartNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}UnitOfMeasureSetRef" minOccurs="0"/>
 *         &lt;element ref="{}IsTaxIncluded" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCodeRef" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}SalesOrPurchase"/>
 *           &lt;element ref="{}SalesAndPurchase"/>
 *         &lt;/choice>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
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
    "barCode",
    "isActive",
    "parentRef",
    "classRef",
    "manufacturerPartNumber",
    "unitOfMeasureSetRef",
    "isTaxIncluded",
    "salesTaxCodeRef",
    "salesOrPurchase",
    "salesAndPurchase",
    "externalGUID"
})
@XmlRootElement(name = "ItemNonInventoryAdd")
public class ItemNonInventoryAdd {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "BarCode")
    protected BarCode barCode;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "ParentRef")
    protected ParentRef parentRef;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "ManufacturerPartNumber")
    protected String manufacturerPartNumber;
    @XmlElement(name = "UnitOfMeasureSetRef")
    protected UnitOfMeasureSetRef unitOfMeasureSetRef;
    @XmlElement(name = "IsTaxIncluded")
    protected String isTaxIncluded;
    @XmlElement(name = "SalesTaxCodeRef")
    protected SalesTaxCodeRef salesTaxCodeRef;
    @XmlElement(name = "SalesOrPurchase")
    protected SalesOrPurchase salesOrPurchase;
    @XmlElement(name = "SalesAndPurchase")
    protected SalesAndPurchase salesAndPurchase;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;

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
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link BarCode }
     *     
     */
    public BarCode getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarCode }
     *     
     */
    public void setBarCode(BarCode value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParentRef }
     *     
     */
    public ParentRef getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentRef }
     *     
     */
    public void setParentRef(ParentRef value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRef }
     *     
     */
    public ClassRef getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRef }
     *     
     */
    public void setClassRef(ClassRef value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the manufacturerPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerPartNumber() {
        return manufacturerPartNumber;
    }

    /**
     * Sets the value of the manufacturerPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerPartNumber(String value) {
        this.manufacturerPartNumber = value;
    }

    /**
     * Gets the value of the unitOfMeasureSetRef property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureSetRef }
     *     
     */
    public UnitOfMeasureSetRef getUnitOfMeasureSetRef() {
        return unitOfMeasureSetRef;
    }

    /**
     * Sets the value of the unitOfMeasureSetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureSetRef }
     *     
     */
    public void setUnitOfMeasureSetRef(UnitOfMeasureSetRef value) {
        this.unitOfMeasureSetRef = value;
    }

    /**
     * Gets the value of the isTaxIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTaxIncluded() {
        return isTaxIncluded;
    }

    /**
     * Sets the value of the isTaxIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTaxIncluded(String value) {
        this.isTaxIncluded = value;
    }

    /**
     * Gets the value of the salesTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxCodeRef }
     *     
     */
    public SalesTaxCodeRef getSalesTaxCodeRef() {
        return salesTaxCodeRef;
    }

    /**
     * Sets the value of the salesTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxCodeRef }
     *     
     */
    public void setSalesTaxCodeRef(SalesTaxCodeRef value) {
        this.salesTaxCodeRef = value;
    }

    /**
     * Gets the value of the salesOrPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrPurchase }
     *     
     */
    public SalesOrPurchase getSalesOrPurchase() {
        return salesOrPurchase;
    }

    /**
     * Sets the value of the salesOrPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrPurchase }
     *     
     */
    public void setSalesOrPurchase(SalesOrPurchase value) {
        this.salesOrPurchase = value;
    }

    /**
     * Gets the value of the salesAndPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link SalesAndPurchase }
     *     
     */
    public SalesAndPurchase getSalesAndPurchase() {
        return salesAndPurchase;
    }

    /**
     * Sets the value of the salesAndPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesAndPurchase }
     *     
     */
    public void setSalesAndPurchase(SalesAndPurchase value) {
        this.salesAndPurchase = value;
    }

    /**
     * Gets the value of the externalGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalGUID() {
        return externalGUID;
    }

    /**
     * Sets the value of the externalGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalGUID(String value) {
        this.externalGUID = value;
    }

}