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
 *         &lt;element ref="{}ListID" minOccurs="0"/>
 *         &lt;element ref="{}TimeCreated" minOccurs="0"/>
 *         &lt;element ref="{}TimeModified" minOccurs="0"/>
 *         &lt;element name="EditSequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element ref="{}ItemInventoryAssemblyRef"/>
 *           &lt;element ref="{}ItemInventoryRef"/>
 *         &lt;/choice>
 *         &lt;element ref="{}InventorySiteRef" minOccurs="0"/>
 *         &lt;element ref="{}InventorySiteLocationRef" minOccurs="0"/>
 *         &lt;element ref="{}ReorderLevel" minOccurs="0"/>
 *         &lt;element ref="{}QuantityOnHand" minOccurs="0"/>
 *         &lt;element ref="{}QuantityOnPurchaseOrders" minOccurs="0"/>
 *         &lt;element ref="{}QuantityOnSalesOrders" minOccurs="0"/>
 *         &lt;element ref="{}QuantityToBeBuiltByPendingBuildTxns" minOccurs="0"/>
 *         &lt;element ref="{}QuantityRequiredByPendingBuildTxns" minOccurs="0"/>
 *         &lt;element ref="{}QuantityOnPendingTransfers" minOccurs="0"/>
 *         &lt;element ref="{}AssemblyBuildPoint" minOccurs="0"/>
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
    "itemInventoryAssemblyRef",
    "itemInventoryRef",
    "inventorySiteRef",
    "inventorySiteLocationRef",
    "reorderLevel",
    "quantityOnHand",
    "quantityOnPurchaseOrders",
    "quantityOnSalesOrders",
    "quantityToBeBuiltByPendingBuildTxns",
    "quantityRequiredByPendingBuildTxns",
    "quantityOnPendingTransfers",
    "assemblyBuildPoint"
})
@XmlRootElement(name = "ItemSitesRet")
public class ItemSitesRet {

    @XmlElement(name = "ListID")
    protected String listID;
    @XmlElement(name = "TimeCreated")
    protected String timeCreated;
    @XmlElement(name = "TimeModified")
    protected String timeModified;
    @XmlElement(name = "EditSequence")
    protected String editSequence;
    @XmlElement(name = "ItemInventoryAssemblyRef")
    protected ItemInventoryAssemblyRef itemInventoryAssemblyRef;
    @XmlElement(name = "ItemInventoryRef")
    protected ItemInventoryRef itemInventoryRef;
    @XmlElement(name = "InventorySiteRef")
    protected InventorySiteRef inventorySiteRef;
    @XmlElement(name = "InventorySiteLocationRef")
    protected InventorySiteLocationRef inventorySiteLocationRef;
    @XmlElement(name = "ReorderLevel")
    protected String reorderLevel;
    @XmlElement(name = "QuantityOnHand")
    protected String quantityOnHand;
    @XmlElement(name = "QuantityOnPurchaseOrders")
    protected String quantityOnPurchaseOrders;
    @XmlElement(name = "QuantityOnSalesOrders")
    protected String quantityOnSalesOrders;
    @XmlElement(name = "QuantityToBeBuiltByPendingBuildTxns")
    protected String quantityToBeBuiltByPendingBuildTxns;
    @XmlElement(name = "QuantityRequiredByPendingBuildTxns")
    protected String quantityRequiredByPendingBuildTxns;
    @XmlElement(name = "QuantityOnPendingTransfers")
    protected String quantityOnPendingTransfers;
    @XmlElement(name = "AssemblyBuildPoint")
    protected String assemblyBuildPoint;

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
     * Gets the value of the itemInventoryAssemblyRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInventoryAssemblyRef }
     *     
     */
    public ItemInventoryAssemblyRef getItemInventoryAssemblyRef() {
        return itemInventoryAssemblyRef;
    }

    /**
     * Sets the value of the itemInventoryAssemblyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInventoryAssemblyRef }
     *     
     */
    public void setItemInventoryAssemblyRef(ItemInventoryAssemblyRef value) {
        this.itemInventoryAssemblyRef = value;
    }

    /**
     * Gets the value of the itemInventoryRef property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInventoryRef }
     *     
     */
    public ItemInventoryRef getItemInventoryRef() {
        return itemInventoryRef;
    }

    /**
     * Sets the value of the itemInventoryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInventoryRef }
     *     
     */
    public void setItemInventoryRef(ItemInventoryRef value) {
        this.itemInventoryRef = value;
    }

    /**
     * Gets the value of the inventorySiteRef property.
     * 
     * @return
     *     possible object is
     *     {@link InventorySiteRef }
     *     
     */
    public InventorySiteRef getInventorySiteRef() {
        return inventorySiteRef;
    }

    /**
     * Sets the value of the inventorySiteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventorySiteRef }
     *     
     */
    public void setInventorySiteRef(InventorySiteRef value) {
        this.inventorySiteRef = value;
    }

    /**
     * Gets the value of the inventorySiteLocationRef property.
     * 
     * @return
     *     possible object is
     *     {@link InventorySiteLocationRef }
     *     
     */
    public InventorySiteLocationRef getInventorySiteLocationRef() {
        return inventorySiteLocationRef;
    }

    /**
     * Sets the value of the inventorySiteLocationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventorySiteLocationRef }
     *     
     */
    public void setInventorySiteLocationRef(InventorySiteLocationRef value) {
        this.inventorySiteLocationRef = value;
    }

    /**
     * Gets the value of the reorderLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReorderLevel() {
        return reorderLevel;
    }

    /**
     * Sets the value of the reorderLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReorderLevel(String value) {
        this.reorderLevel = value;
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
     * Gets the value of the quantityOnPurchaseOrders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnPurchaseOrders() {
        return quantityOnPurchaseOrders;
    }

    /**
     * Sets the value of the quantityOnPurchaseOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnPurchaseOrders(String value) {
        this.quantityOnPurchaseOrders = value;
    }

    /**
     * Gets the value of the quantityOnSalesOrders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnSalesOrders() {
        return quantityOnSalesOrders;
    }

    /**
     * Sets the value of the quantityOnSalesOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnSalesOrders(String value) {
        this.quantityOnSalesOrders = value;
    }

    /**
     * Gets the value of the quantityToBeBuiltByPendingBuildTxns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityToBeBuiltByPendingBuildTxns() {
        return quantityToBeBuiltByPendingBuildTxns;
    }

    /**
     * Sets the value of the quantityToBeBuiltByPendingBuildTxns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityToBeBuiltByPendingBuildTxns(String value) {
        this.quantityToBeBuiltByPendingBuildTxns = value;
    }

    /**
     * Gets the value of the quantityRequiredByPendingBuildTxns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityRequiredByPendingBuildTxns() {
        return quantityRequiredByPendingBuildTxns;
    }

    /**
     * Sets the value of the quantityRequiredByPendingBuildTxns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityRequiredByPendingBuildTxns(String value) {
        this.quantityRequiredByPendingBuildTxns = value;
    }

    /**
     * Gets the value of the quantityOnPendingTransfers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnPendingTransfers() {
        return quantityOnPendingTransfers;
    }

    /**
     * Sets the value of the quantityOnPendingTransfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnPendingTransfers(String value) {
        this.quantityOnPendingTransfers = value;
    }

    /**
     * Gets the value of the assemblyBuildPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyBuildPoint() {
        return assemblyBuildPoint;
    }

    /**
     * Sets the value of the assemblyBuildPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyBuildPoint(String value) {
        this.assemblyBuildPoint = value;
    }

}
