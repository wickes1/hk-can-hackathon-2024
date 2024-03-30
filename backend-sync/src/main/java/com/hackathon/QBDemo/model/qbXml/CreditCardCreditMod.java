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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;group ref="{}TxnCoreMod"/>
 *         &lt;element ref="{}AccountRef" minOccurs="0"/>
 *         &lt;element ref="{}PayeeEntityRef" minOccurs="0"/>
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element name="RefNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsTaxIncluded" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}ExchangeRate" minOccurs="0"/>
 *         &lt;element ref="{}ClearExpenseLines" minOccurs="0"/>
 *         &lt;element ref="{}ExpenseLineMod" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ClearItemLines" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}ItemLineMod"/>
 *           &lt;element ref="{}ItemGroupLineMod"/>
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
    "txnID",
    "editSequence",
    "accountRef",
    "payeeEntityRef",
    "txnDate",
    "refNumber",
    "memo",
    "isTaxIncluded",
    "salesTaxCodeRef",
    "exchangeRate",
    "clearExpenseLines",
    "expenseLineMod",
    "clearItemLines",
    "itemLineModOrItemGroupLineMod"
})
@XmlRootElement(name = "CreditCardCreditMod")
public class CreditCardCreditMod {

    @XmlElement(name = "TxnID", required = true)
    protected String txnID;
    @XmlElement(name = "EditSequence", required = true)
    protected String editSequence;
    @XmlElement(name = "AccountRef")
    protected AccountRef accountRef;
    @XmlElement(name = "PayeeEntityRef")
    protected PayeeEntityRef payeeEntityRef;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "IsTaxIncluded")
    protected String isTaxIncluded;
    @XmlElement(name = "SalesTaxCodeRef")
    protected SalesTaxCodeRef salesTaxCodeRef;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "ClearExpenseLines")
    protected String clearExpenseLines;
    @XmlElement(name = "ExpenseLineMod")
    protected List<ExpenseLineMod> expenseLineMod;
    @XmlElement(name = "ClearItemLines")
    protected String clearItemLines;
    @XmlElements({
        @XmlElement(name = "ItemLineMod", type = ItemLineMod.class),
        @XmlElement(name = "ItemGroupLineMod", type = ItemGroupLineMod.class)
    })
    protected List<Object> itemLineModOrItemGroupLineMod;

    /**
     * Gets the value of the txnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnID() {
        return txnID;
    }

    /**
     * Sets the value of the txnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnID(String value) {
        this.txnID = value;
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

    /**
     * Gets the value of the payeeEntityRef property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeEntityRef }
     *     
     */
    public PayeeEntityRef getPayeeEntityRef() {
        return payeeEntityRef;
    }

    /**
     * Sets the value of the payeeEntityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeEntityRef }
     *     
     */
    public void setPayeeEntityRef(PayeeEntityRef value) {
        this.payeeEntityRef = value;
    }

    /**
     * Gets the value of the txnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDate(String value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNumber(String value) {
        this.refNumber = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
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
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the clearExpenseLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearExpenseLines() {
        return clearExpenseLines;
    }

    /**
     * Sets the value of the clearExpenseLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearExpenseLines(String value) {
        this.clearExpenseLines = value;
    }

    /**
     * Gets the value of the expenseLineMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenseLineMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenseLineMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseLineMod }
     * 
     * 
     */
    public List<ExpenseLineMod> getExpenseLineMod() {
        if (expenseLineMod == null) {
            expenseLineMod = new ArrayList<ExpenseLineMod>();
        }
        return this.expenseLineMod;
    }

    /**
     * Gets the value of the clearItemLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearItemLines() {
        return clearItemLines;
    }

    /**
     * Sets the value of the clearItemLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearItemLines(String value) {
        this.clearItemLines = value;
    }

    /**
     * Gets the value of the itemLineModOrItemGroupLineMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemLineModOrItemGroupLineMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemLineModOrItemGroupLineMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLineMod }
     * {@link ItemGroupLineMod }
     * 
     * 
     */
    public List<Object> getItemLineModOrItemGroupLineMod() {
        if (itemLineModOrItemGroupLineMod == null) {
            itemLineModOrItemGroupLineMod = new ArrayList<Object>();
        }
        return this.itemLineModOrItemGroupLineMod;
    }

}
