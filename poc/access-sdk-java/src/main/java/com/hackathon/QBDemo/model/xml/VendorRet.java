//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.xml;

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
 *               &lt;maxLength value="41"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}IsTaxAgency" minOccurs="0"/>
 *         &lt;element name="CompanyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="41"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;group ref="{}PersonName"/>
 *         &lt;element name="JobTitle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="41"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}VendorAddress" minOccurs="0"/>
 *         &lt;element ref="{}VendorAddressBlock" minOccurs="0"/>
 *         &lt;element ref="{}ShipAddress" minOccurs="0"/>
 *         &lt;group ref="{}CommInfo"/>
 *         &lt;element ref="{}AdditionalContactRef" maxOccurs="8" minOccurs="0"/>
 *         &lt;element ref="{}ContactsRet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NameOnCheck" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="41"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccountNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Notes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}AdditionalNotesRet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}VendorTypeRef" minOccurs="0"/>
 *         &lt;element ref="{}TermsRef" minOccurs="0"/>
 *         &lt;element ref="{}CreditLimit" minOccurs="0"/>
 *         &lt;element name="VendorTaxIdent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}IsVendorEligibleFor1099" minOccurs="0"/>
 *         &lt;element ref="{}Balance" minOccurs="0"/>
 *         &lt;element ref="{}BillingRateRef" minOccurs="0"/>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCodeRef" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxCountry" minOccurs="0"/>
 *         &lt;element ref="{}IsSalesTaxAgency" minOccurs="0"/>
 *         &lt;element ref="{}SalesTaxReturnRef" minOccurs="0"/>
 *         &lt;element name="TaxRegistrationNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}ReportingPeriod" minOccurs="0"/>
 *         &lt;element ref="{}IsTaxTrackedOnPurchases" minOccurs="0"/>
 *         &lt;element ref="{}TaxOnPurchasesAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}IsTaxTrackedOnSales" minOccurs="0"/>
 *         &lt;element ref="{}TaxOnSalesAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}IsTaxOnTax" minOccurs="0"/>
 *         &lt;element ref="{}PrefillAccountRef" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}CurrencyRef" minOccurs="0"/>
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
    "isActive",
    "classRef",
    "isTaxAgency",
    "companyName",
    "salutation",
    "firstName",
    "middleName",
    "lastName",
    "suffix",
    "jobTitle",
    "vendorAddress",
    "vendorAddressBlock",
    "shipAddress",
    "phone",
    "mobile",
    "pager",
    "altPhone",
    "fax",
    "email",
    "cc",
    "contact",
    "altContact",
    "additionalContactRef",
    "contactsRet",
    "nameOnCheck",
    "accountNumber",
    "notes",
    "additionalNotesRet",
    "vendorTypeRef",
    "termsRef",
    "creditLimit",
    "vendorTaxIdent",
    "isVendorEligibleFor1099",
    "balance",
    "billingRateRef",
    "externalGUID",
    "salesTaxCodeRef",
    "salesTaxCountry",
    "isSalesTaxAgency",
    "salesTaxReturnRef",
    "taxRegistrationNumber",
    "reportingPeriod",
    "isTaxTrackedOnPurchases",
    "taxOnPurchasesAccountRef",
    "isTaxTrackedOnSales",
    "taxOnSalesAccountRef",
    "isTaxOnTax",
    "prefillAccountRef",
    "currencyRef",
    "dataExtRet"
})
@XmlRootElement(name = "VendorRet")
public class VendorRet {

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
    @XmlElement(name = "IsActive")
    protected String isActive;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "IsTaxAgency")
    protected String isTaxAgency;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "Salutation")
    protected String salutation;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "VendorAddress")
    protected VendorAddress vendorAddress;
    @XmlElement(name = "VendorAddressBlock")
    protected VendorAddressBlock vendorAddressBlock;
    @XmlElement(name = "ShipAddress")
    protected ShipAddress shipAddress;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Pager")
    protected String pager;
    @XmlElement(name = "AltPhone")
    protected String altPhone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Cc")
    protected String cc;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "AltContact")
    protected String altContact;
    @XmlElement(name = "AdditionalContactRef")
    protected List<AdditionalContactRef> additionalContactRef;
    @XmlElement(name = "ContactsRet")
    protected List<ContactsRet> contactsRet;
    @XmlElement(name = "NameOnCheck")
    protected String nameOnCheck;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "AdditionalNotesRet")
    protected List<AdditionalNotesRet> additionalNotesRet;
    @XmlElement(name = "VendorTypeRef")
    protected VendorTypeRef vendorTypeRef;
    @XmlElement(name = "TermsRef")
    protected TermsRef termsRef;
    @XmlElement(name = "CreditLimit")
    protected String creditLimit;
    @XmlElement(name = "VendorTaxIdent")
    protected String vendorTaxIdent;
    @XmlElement(name = "IsVendorEligibleFor1099")
    protected String isVendorEligibleFor1099;
    @XmlElement(name = "Balance")
    protected String balance;
    @XmlElement(name = "BillingRateRef")
    protected BillingRateRef billingRateRef;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;
    @XmlElement(name = "SalesTaxCodeRef")
    protected SalesTaxCodeRef salesTaxCodeRef;
    @XmlElement(name = "SalesTaxCountry", defaultValue = "Canada")
    protected String salesTaxCountry;
    @XmlElement(name = "IsSalesTaxAgency")
    protected String isSalesTaxAgency;
    @XmlElement(name = "SalesTaxReturnRef")
    protected SalesTaxReturnRef salesTaxReturnRef;
    @XmlElement(name = "TaxRegistrationNumber")
    protected String taxRegistrationNumber;
    @XmlElement(name = "ReportingPeriod", defaultValue = "Quarterly")
    protected String reportingPeriod;
    @XmlElement(name = "IsTaxTrackedOnPurchases")
    protected String isTaxTrackedOnPurchases;
    @XmlElement(name = "TaxOnPurchasesAccountRef")
    protected TaxOnPurchasesAccountRef taxOnPurchasesAccountRef;
    @XmlElement(name = "IsTaxTrackedOnSales")
    protected String isTaxTrackedOnSales;
    @XmlElement(name = "TaxOnSalesAccountRef")
    protected TaxOnSalesAccountRef taxOnSalesAccountRef;
    @XmlElement(name = "IsTaxOnTax")
    protected String isTaxOnTax;
    @XmlElement(name = "PrefillAccountRef")
    protected List<PrefillAccountRef> prefillAccountRef;
    @XmlElement(name = "CurrencyRef")
    protected CurrencyRef currencyRef;
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
     * Gets the value of the isTaxAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTaxAgency() {
        return isTaxAgency;
    }

    /**
     * Sets the value of the isTaxAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTaxAgency(String value) {
        this.isTaxAgency = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the vendorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link VendorAddress }
     *     
     */
    public VendorAddress getVendorAddress() {
        return vendorAddress;
    }

    /**
     * Sets the value of the vendorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorAddress }
     *     
     */
    public void setVendorAddress(VendorAddress value) {
        this.vendorAddress = value;
    }

    /**
     * Gets the value of the vendorAddressBlock property.
     * 
     * @return
     *     possible object is
     *     {@link VendorAddressBlock }
     *     
     */
    public VendorAddressBlock getVendorAddressBlock() {
        return vendorAddressBlock;
    }

    /**
     * Sets the value of the vendorAddressBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorAddressBlock }
     *     
     */
    public void setVendorAddressBlock(VendorAddressBlock value) {
        this.vendorAddressBlock = value;
    }

    /**
     * Gets the value of the shipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShipAddress }
     *     
     */
    public ShipAddress getShipAddress() {
        return shipAddress;
    }

    /**
     * Sets the value of the shipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipAddress }
     *     
     */
    public void setShipAddress(ShipAddress value) {
        this.shipAddress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPager(String value) {
        this.pager = value;
    }

    /**
     * Gets the value of the altPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhone() {
        return altPhone;
    }

    /**
     * Sets the value of the altPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhone(String value) {
        this.altPhone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCc() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCc(String value) {
        this.cc = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the altContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltContact() {
        return altContact;
    }

    /**
     * Sets the value of the altContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltContact(String value) {
        this.altContact = value;
    }

    /**
     * Gets the value of the additionalContactRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalContactRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalContactRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalContactRef }
     * 
     * 
     */
    public List<AdditionalContactRef> getAdditionalContactRef() {
        if (additionalContactRef == null) {
            additionalContactRef = new ArrayList<AdditionalContactRef>();
        }
        return this.additionalContactRef;
    }

    /**
     * Gets the value of the contactsRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactsRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactsRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactsRet }
     * 
     * 
     */
    public List<ContactsRet> getContactsRet() {
        if (contactsRet == null) {
            contactsRet = new ArrayList<ContactsRet>();
        }
        return this.contactsRet;
    }

    /**
     * Gets the value of the nameOnCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCheck() {
        return nameOnCheck;
    }

    /**
     * Sets the value of the nameOnCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCheck(String value) {
        this.nameOnCheck = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the additionalNotesRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalNotesRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalNotesRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalNotesRet }
     * 
     * 
     */
    public List<AdditionalNotesRet> getAdditionalNotesRet() {
        if (additionalNotesRet == null) {
            additionalNotesRet = new ArrayList<AdditionalNotesRet>();
        }
        return this.additionalNotesRet;
    }

    /**
     * Gets the value of the vendorTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link VendorTypeRef }
     *     
     */
    public VendorTypeRef getVendorTypeRef() {
        return vendorTypeRef;
    }

    /**
     * Sets the value of the vendorTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorTypeRef }
     *     
     */
    public void setVendorTypeRef(VendorTypeRef value) {
        this.vendorTypeRef = value;
    }

    /**
     * Gets the value of the termsRef property.
     * 
     * @return
     *     possible object is
     *     {@link TermsRef }
     *     
     */
    public TermsRef getTermsRef() {
        return termsRef;
    }

    /**
     * Sets the value of the termsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsRef }
     *     
     */
    public void setTermsRef(TermsRef value) {
        this.termsRef = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the vendorTaxIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorTaxIdent() {
        return vendorTaxIdent;
    }

    /**
     * Sets the value of the vendorTaxIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorTaxIdent(String value) {
        this.vendorTaxIdent = value;
    }

    /**
     * Gets the value of the isVendorEligibleFor1099 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVendorEligibleFor1099() {
        return isVendorEligibleFor1099;
    }

    /**
     * Sets the value of the isVendorEligibleFor1099 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVendorEligibleFor1099(String value) {
        this.isVendorEligibleFor1099 = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the billingRateRef property.
     * 
     * @return
     *     possible object is
     *     {@link BillingRateRef }
     *     
     */
    public BillingRateRef getBillingRateRef() {
        return billingRateRef;
    }

    /**
     * Sets the value of the billingRateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingRateRef }
     *     
     */
    public void setBillingRateRef(BillingRateRef value) {
        this.billingRateRef = value;
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
     * Gets the value of the salesTaxCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxCountry() {
        return salesTaxCountry;
    }

    /**
     * Sets the value of the salesTaxCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTaxCountry(String value) {
        this.salesTaxCountry = value;
    }

    /**
     * Gets the value of the isSalesTaxAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSalesTaxAgency() {
        return isSalesTaxAgency;
    }

    /**
     * Sets the value of the isSalesTaxAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSalesTaxAgency(String value) {
        this.isSalesTaxAgency = value;
    }

    /**
     * Gets the value of the salesTaxReturnRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxReturnRef }
     *     
     */
    public SalesTaxReturnRef getSalesTaxReturnRef() {
        return salesTaxReturnRef;
    }

    /**
     * Sets the value of the salesTaxReturnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxReturnRef }
     *     
     */
    public void setSalesTaxReturnRef(SalesTaxReturnRef value) {
        this.salesTaxReturnRef = value;
    }

    /**
     * Gets the value of the taxRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    /**
     * Sets the value of the taxRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistrationNumber(String value) {
        this.taxRegistrationNumber = value;
    }

    /**
     * Gets the value of the reportingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Sets the value of the reportingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingPeriod(String value) {
        this.reportingPeriod = value;
    }

    /**
     * Gets the value of the isTaxTrackedOnPurchases property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTaxTrackedOnPurchases() {
        return isTaxTrackedOnPurchases;
    }

    /**
     * Sets the value of the isTaxTrackedOnPurchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTaxTrackedOnPurchases(String value) {
        this.isTaxTrackedOnPurchases = value;
    }

    /**
     * Gets the value of the taxOnPurchasesAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link TaxOnPurchasesAccountRef }
     *     
     */
    public TaxOnPurchasesAccountRef getTaxOnPurchasesAccountRef() {
        return taxOnPurchasesAccountRef;
    }

    /**
     * Sets the value of the taxOnPurchasesAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxOnPurchasesAccountRef }
     *     
     */
    public void setTaxOnPurchasesAccountRef(TaxOnPurchasesAccountRef value) {
        this.taxOnPurchasesAccountRef = value;
    }

    /**
     * Gets the value of the isTaxTrackedOnSales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTaxTrackedOnSales() {
        return isTaxTrackedOnSales;
    }

    /**
     * Sets the value of the isTaxTrackedOnSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTaxTrackedOnSales(String value) {
        this.isTaxTrackedOnSales = value;
    }

    /**
     * Gets the value of the taxOnSalesAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link TaxOnSalesAccountRef }
     *     
     */
    public TaxOnSalesAccountRef getTaxOnSalesAccountRef() {
        return taxOnSalesAccountRef;
    }

    /**
     * Sets the value of the taxOnSalesAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxOnSalesAccountRef }
     *     
     */
    public void setTaxOnSalesAccountRef(TaxOnSalesAccountRef value) {
        this.taxOnSalesAccountRef = value;
    }

    /**
     * Gets the value of the isTaxOnTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTaxOnTax() {
        return isTaxOnTax;
    }

    /**
     * Sets the value of the isTaxOnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTaxOnTax(String value) {
        this.isTaxOnTax = value;
    }

    /**
     * Gets the value of the prefillAccountRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefillAccountRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefillAccountRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefillAccountRef }
     * 
     * 
     */
    public List<PrefillAccountRef> getPrefillAccountRef() {
        if (prefillAccountRef == null) {
            prefillAccountRef = new ArrayList<PrefillAccountRef>();
        }
        return this.prefillAccountRef;
    }

    /**
     * Gets the value of the currencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRef }
     *     
     */
    public CurrencyRef getCurrencyRef() {
        return currencyRef;
    }

    /**
     * Sets the value of the currencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRef }
     *     
     */
    public void setCurrencyRef(CurrencyRef value) {
        this.currencyRef = value;
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
