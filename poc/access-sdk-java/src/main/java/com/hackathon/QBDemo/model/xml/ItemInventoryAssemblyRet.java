//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.xml;

import java.math.BigInteger;
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
 *         &lt;group ref="{}ListCore"/>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FullName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="159"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BarCodeValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}ParentRef" minOccurs="0"/>
 *         &lt;element ref="{}Sublevel" minOccurs="0"/>
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
 *         &lt;element name="SalesDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}SalesPrice" minOccurs="0"/>
 *         &lt;element ref="{}IncomeAccountRef" minOccurs="0"/>
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
 *         &lt;element ref="{}PrefVendorRef" minOccurs="0"/>
 *         &lt;element ref="{}AssetAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}BuildPoint" minOccurs="0"/>
 *         &lt;element ref="{}Max" minOccurs="0"/>
 *         &lt;element ref="{}QuantityOnHand" minOccurs="0"/>
 *         &lt;element ref="{}AverageCost" minOccurs="0"/>
 *         &lt;element ref="{}QuantityOnOrder" minOccurs="0"/>
 *         &lt;element ref="{}QuantityOnSalesOrder" minOccurs="0"/>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
 *         &lt;element ref="{}ItemInventoryAssemblyLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DataExtRet" maxOccurs="unbounded" minOccurs="0"/>
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
    "timeCreated",
    "timeModified",
    "editSequence",
    "name",
    "fullName",
    "barCodeValue",
    "isActive",
    "classRef",
    "parentRef",
    "sublevel",
    "manufacturerPartNumber",
    "unitOfMeasureSetRef",
    "isTaxIncluded",
    "salesTaxCodeRef",
    "salesDesc",
    "salesPrice",
    "incomeAccountRef",
    "purchaseDesc",
    "purchaseCost",
    "purchaseTaxCodeRef",
    "cogsAccountRef",
    "prefVendorRef",
    "assetAccountRef",
    "buildPoint",
    "max",
    "quantityOnHand",
    "averageCost",
    "quantityOnOrder",
    "quantityOnSalesOrder",
    "externalGUID",
    "itemInventoryAssemblyLine",
    "dataExtRet"
})
@XmlRootElement(name = "ItemInventoryAssemblyRet")
public class ItemInventoryAssemblyRet {

    @XmlElement(name = "ListID")
    protected String listID;
    @XmlElement(name = "TimeCreated")
    protected String timeCreated;
    @XmlElement(name = "TimeModified")
    protected String timeModified;
    @XmlElement(name = "EditSequence")
    protected String editSequence;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "BarCodeValue")
    protected String barCodeValue;
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "ParentRef")
    protected ParentRef parentRef;
    @XmlElement(name = "Sublevel")
    protected BigInteger sublevel;
    @XmlElement(name = "ManufacturerPartNumber")
    protected String manufacturerPartNumber;
    @XmlElement(name = "UnitOfMeasureSetRef")
    protected UnitOfMeasureSetRef unitOfMeasureSetRef;
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
    @XmlElement(name = "PurchaseDesc")
    protected String purchaseDesc;
    @XmlElement(name = "PurchaseCost")
    protected String purchaseCost;
    @XmlElement(name = "PurchaseTaxCodeRef")
    protected PurchaseTaxCodeRef purchaseTaxCodeRef;
    @XmlElement(name = "COGSAccountRef")
    protected COGSAccountRef cogsAccountRef;
    @XmlElement(name = "PrefVendorRef")
    protected PrefVendorRef prefVendorRef;
    @XmlElement(name = "AssetAccountRef")
    protected AssetAccountRef assetAccountRef;
    @XmlElement(name = "BuildPoint")
    protected String buildPoint;
    @XmlElement(name = "Max")
    protected String max;
    @XmlElement(name = "QuantityOnHand")
    protected String quantityOnHand;
    @XmlElement(name = "AverageCost")
    protected String averageCost;
    @XmlElement(name = "QuantityOnOrder")
    protected String quantityOnOrder;
    @XmlElement(name = "QuantityOnSalesOrder")
    protected String quantityOnSalesOrder;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;
    @XmlElement(name = "ItemInventoryAssemblyLine")
    protected List<ItemInventoryAssemblyLine> itemInventoryAssemblyLine;
    @XmlElement(name = "DataExtRet")
    protected List<DataExtRet> dataExtRet;

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
     * Gets the value of the timeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCreated(String value) {
        this.timeCreated = value;
    }

    /**
     * Gets the value of the timeModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeModified() {
        return timeModified;
    }

    /**
     * Sets the value of the timeModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeModified(String value) {
        this.timeModified = value;
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
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the barCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCodeValue() {
        return barCodeValue;
    }

    /**
     * Sets the value of the barCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCodeValue(String value) {
        this.barCodeValue = value;
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
     * Gets the value of the sublevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSublevel() {
        return sublevel;
    }

    /**
     * Sets the value of the sublevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSublevel(BigInteger value) {
        this.sublevel = value;
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
     * Gets the value of the buildPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildPoint() {
        return buildPoint;
    }

    /**
     * Sets the value of the buildPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildPoint(String value) {
        this.buildPoint = value;
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

    /**
     * Gets the value of the quantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnHand(String value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the averageCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAverageCost() {
        return averageCost;
    }

    /**
     * Sets the value of the averageCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageCost(String value) {
        this.averageCost = value;
    }

    /**
     * Gets the value of the quantityOnOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnOrder() {
        return quantityOnOrder;
    }

    /**
     * Sets the value of the quantityOnOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnOrder(String value) {
        this.quantityOnOrder = value;
    }

    /**
     * Gets the value of the quantityOnSalesOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnSalesOrder() {
        return quantityOnSalesOrder;
    }

    /**
     * Sets the value of the quantityOnSalesOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnSalesOrder(String value) {
        this.quantityOnSalesOrder = value;
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

    /**
     * Gets the value of the itemInventoryAssemblyLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInventoryAssemblyLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInventoryAssemblyLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInventoryAssemblyLine }
     * 
     * 
     */
    public List<ItemInventoryAssemblyLine> getItemInventoryAssemblyLine() {
        if (itemInventoryAssemblyLine == null) {
            itemInventoryAssemblyLine = new ArrayList<ItemInventoryAssemblyLine>();
        }
        return this.itemInventoryAssemblyLine;
    }

    /**
     * Gets the value of the dataExtRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataExtRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataExtRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataExtRet }
     * 
     * 
     */
    public List<DataExtRet> getDataExtRet() {
        if (dataExtRet == null) {
            dataExtRet = new ArrayList<DataExtRet>();
        }
        return this.dataExtRet;
    }

}
