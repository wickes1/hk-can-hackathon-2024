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
 *         &lt;group ref="{}ListCoreMod"/>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}BarCode" minOccurs="0"/>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}ParentRef" minOccurs="0"/>
 *         &lt;element name="ManufacturerPartNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}UnitOfMeasureSetRef" minOccurs="0"/>
 *         &lt;element ref="{}ForceUOMChange" minOccurs="0"/>
 *         &lt;element ref="{}IsTaxIncluded" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCodeRef" minOccurs="0"/>
 *         &lt;element name="SalesDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}SalesPrice" minOccurs="0"/>
 *         &lt;element ref="{}IncomeAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}ApplyIncomeAccountRefToExistingTxns" minOccurs="0"/>
 *         &lt;element name="PurchaseDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}PurchaseCost" minOccurs="0"/>
 *         &lt;element ref="{}PurchaseTaxCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}COGSAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}ApplyCOGSAccountRefToExistingTxns" minOccurs="0"/>
 *         &lt;element ref="{}PrefVendorRef" minOccurs="0"/>
 *         &lt;element ref="{}AssetAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}ReorderPoint" minOccurs="0"/>
 *         &lt;element ref="{}Max" minOccurs="0"/>
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
    "listID",
    "editSequence",
    "name",
    "barCode",
    "isActive",
    "classRef",
    "parentRef",
    "manufacturerPartNumber",
    "unitOfMeasureSetRef",
    "forceUOMChange",
    "isTaxIncluded",
    "salesTaxCodeRef",
    "salesDesc",
    "salesPrice",
    "incomeAccountRef",
    "applyIncomeAccountRefToExistingTxns",
    "purchaseDesc",
    "purchaseCost",
    "purchaseTaxCodeRef",
    "cogsAccountRef",
    "applyCOGSAccountRefToExistingTxns",
    "prefVendorRef",
    "assetAccountRef",
    "reorderPoint",
    "max"
})
@XmlRootElement(name = "ItemInventoryMod")
public class ItemInventoryMod {

    @XmlElement(name = "ListID", required = true)
    protected String listID;
    @XmlElement(name = "EditSequence", required = true)
    protected String editSequence;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "BarCode")
    protected BarCode barCode;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "ParentRef")
    protected ParentRef parentRef;
    @XmlElement(name = "ManufacturerPartNumber")
    protected String manufacturerPartNumber;
    @XmlElement(name = "UnitOfMeasureSetRef")
    protected UnitOfMeasureSetRef unitOfMeasureSetRef;
    @XmlElement(name = "ForceUOMChange")
    protected String forceUOMChange;
    @XmlElement(name = "IsTaxIncluded")
    protected String isTaxIncluded;
    @XmlElement(name = "SalesTaxCodeRef")
    protected SalesTaxCodeRef salesTaxCodeRef;
    @XmlElement(name = "SalesDesc")
    protected String salesDesc;
    @XmlElement(name = "SalesPrice")
    protected String salesPrice;
    @XmlElement(name = "IncomeAccountRef")
    protected IncomeAccountRef incomeAccountRef;
    @XmlElement(name = "ApplyIncomeAccountRefToExistingTxns")
    protected String applyIncomeAccountRefToExistingTxns;
    @XmlElement(name = "PurchaseDesc")
    protected String purchaseDesc;
    @XmlElement(name = "PurchaseCost")
    protected String purchaseCost;
    @XmlElement(name = "PurchaseTaxCodeRef")
    protected PurchaseTaxCodeRef purchaseTaxCodeRef;
    @XmlElement(name = "COGSAccountRef")
    protected COGSAccountRef cogsAccountRef;
    @XmlElement(name = "ApplyCOGSAccountRefToExistingTxns")
    protected String applyCOGSAccountRefToExistingTxns;
    @XmlElement(name = "PrefVendorRef")
    protected PrefVendorRef prefVendorRef;
    @XmlElement(name = "AssetAccountRef")
    protected AssetAccountRef assetAccountRef;
    @XmlElement(name = "ReorderPoint")
    protected String reorderPoint;
    @XmlElement(name = "Max")
    protected String max;

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the editSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditSequence() {
        return editSequence;
    }

    /**
     * Sets the value of the editSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditSequence(String value) {
        this.editSequence = value;
    }

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
     * Gets the value of the forceUOMChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceUOMChange() {
        return forceUOMChange;
    }

    /**
     * Sets the value of the forceUOMChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceUOMChange(String value) {
        this.forceUOMChange = value;
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
     * Gets the value of the salesDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDesc() {
        return salesDesc;
    }

    /**
     * Sets the value of the salesDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDesc(String value) {
        this.salesDesc = value;
    }

    /**
     * Gets the value of the salesPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPrice(String value) {
        this.salesPrice = value;
    }

    /**
     * Gets the value of the incomeAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeAccountRef }
     *     
     */
    public IncomeAccountRef getIncomeAccountRef() {
        return incomeAccountRef;
    }

    /**
     * Sets the value of the incomeAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeAccountRef }
     *     
     */
    public void setIncomeAccountRef(IncomeAccountRef value) {
        this.incomeAccountRef = value;
    }

    /**
     * Gets the value of the applyIncomeAccountRefToExistingTxns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyIncomeAccountRefToExistingTxns() {
        return applyIncomeAccountRefToExistingTxns;
    }

    /**
     * Sets the value of the applyIncomeAccountRefToExistingTxns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyIncomeAccountRefToExistingTxns(String value) {
        this.applyIncomeAccountRefToExistingTxns = value;
    }

    /**
     * Gets the value of the purchaseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDesc() {
        return purchaseDesc;
    }

    /**
     * Sets the value of the purchaseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDesc(String value) {
        this.purchaseDesc = value;
    }

    /**
     * Gets the value of the purchaseCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseCost() {
        return purchaseCost;
    }

    /**
     * Sets the value of the purchaseCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseCost(String value) {
        this.purchaseCost = value;
    }

    /**
     * Gets the value of the purchaseTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseTaxCodeRef }
     *     
     */
    public PurchaseTaxCodeRef getPurchaseTaxCodeRef() {
        return purchaseTaxCodeRef;
    }

    /**
     * Sets the value of the purchaseTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseTaxCodeRef }
     *     
     */
    public void setPurchaseTaxCodeRef(PurchaseTaxCodeRef value) {
        this.purchaseTaxCodeRef = value;
    }

    /**
     * Gets the value of the cogsAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link COGSAccountRef }
     *     
     */
    public COGSAccountRef getCOGSAccountRef() {
        return cogsAccountRef;
    }

    /**
     * Sets the value of the cogsAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link COGSAccountRef }
     *     
     */
    public void setCOGSAccountRef(COGSAccountRef value) {
        this.cogsAccountRef = value;
    }

    /**
     * Gets the value of the applyCOGSAccountRefToExistingTxns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyCOGSAccountRefToExistingTxns() {
        return applyCOGSAccountRefToExistingTxns;
    }

    /**
     * Sets the value of the applyCOGSAccountRefToExistingTxns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyCOGSAccountRefToExistingTxns(String value) {
        this.applyCOGSAccountRefToExistingTxns = value;
    }

    /**
     * Gets the value of the prefVendorRef property.
     * 
     * @return
     *     possible object is
     *     {@link PrefVendorRef }
     *     
     */
    public PrefVendorRef getPrefVendorRef() {
        return prefVendorRef;
    }

    /**
     * Sets the value of the prefVendorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefVendorRef }
     *     
     */
    public void setPrefVendorRef(PrefVendorRef value) {
        this.prefVendorRef = value;
    }

    /**
     * Gets the value of the assetAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAccountRef }
     *     
     */
    public AssetAccountRef getAssetAccountRef() {
        return assetAccountRef;
    }

    /**
     * Sets the value of the assetAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAccountRef }
     *     
     */
    public void setAssetAccountRef(AssetAccountRef value) {
        this.assetAccountRef = value;
    }

    /**
     * Gets the value of the reorderPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReorderPoint() {
        return reorderPoint;
    }

    /**
     * Sets the value of the reorderPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReorderPoint(String value) {
        this.reorderPoint = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMax(String value) {
        this.max = value;
    }

}
