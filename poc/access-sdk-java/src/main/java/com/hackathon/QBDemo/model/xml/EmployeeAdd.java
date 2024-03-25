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
 *         &lt;element ref="{}Name" minOccurs="0"/>
 *         &lt;element ref="{}IsActive" minOccurs="0"/>
 *         &lt;group ref="{}PersonName"/>
 *         &lt;element name="JobTitle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="41"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}SupervisorRef" minOccurs="0"/>
 *         &lt;element name="Department" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="31"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}TargetBonus" minOccurs="0"/>
 *         &lt;element ref="{}EmployeeAddress" minOccurs="0"/>
 *         &lt;element name="PrintAs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="41"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Phone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Mobile" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Pager" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PagerPIN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AltPhone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Fax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SSN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Email" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="1023"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}AdditionalContactRef" maxOccurs="8" minOccurs="0"/>
 *         &lt;element ref="{}EmergencyContacts" minOccurs="0"/>
 *         &lt;element ref="{}EmployeeType" minOccurs="0"/>
 *         &lt;element ref="{}PartOrFullTime" minOccurs="0"/>
 *         &lt;element ref="{}Exempt" minOccurs="0"/>
 *         &lt;element ref="{}KeyEmployee" minOccurs="0"/>
 *         &lt;element ref="{}Gender" minOccurs="0"/>
 *         &lt;element ref="{}HiredDate" minOccurs="0"/>
 *         &lt;element ref="{}OriginalHireDate" minOccurs="0"/>
 *         &lt;element ref="{}AdjustedServiceDate" minOccurs="0"/>
 *         &lt;element ref="{}ReleasedDate" minOccurs="0"/>
 *         &lt;element ref="{}BirthDate" minOccurs="0"/>
 *         &lt;element ref="{}USCitizen" minOccurs="0"/>
 *         &lt;element ref="{}Ethnicity" minOccurs="0"/>
 *         &lt;element ref="{}Disabled" minOccurs="0"/>
 *         &lt;element name="DisabilityDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}OnFile" minOccurs="0"/>
 *         &lt;element ref="{}WorkAuthExpireDate" minOccurs="0"/>
 *         &lt;element ref="{}USVeteran" minOccurs="0"/>
 *         &lt;element ref="{}MilitaryStatus" minOccurs="0"/>
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
 *         &lt;element ref="{}AdditionalNotes" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}BillingRateRef" minOccurs="0"/>
 *         &lt;element ref="{}EmployeePayrollInfo" minOccurs="0"/>
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
    "isActive",
    "salutation",
    "firstName",
    "middleName",
    "lastName",
    "suffix",
    "jobTitle",
    "supervisorRef",
    "department",
    "description",
    "targetBonus",
    "employeeAddress",
    "printAs",
    "phone",
    "mobile",
    "pager",
    "pagerPIN",
    "altPhone",
    "fax",
    "ssn",
    "email",
    "additionalContactRef",
    "emergencyContacts",
    "employeeType",
    "partOrFullTime",
    "exempt",
    "keyEmployee",
    "gender",
    "hiredDate",
    "originalHireDate",
    "adjustedServiceDate",
    "releasedDate",
    "birthDate",
    "usCitizen",
    "ethnicity",
    "disabled",
    "disabilityDesc",
    "onFile",
    "workAuthExpireDate",
    "usVeteran",
    "militaryStatus",
    "accountNumber",
    "notes",
    "additionalNotes",
    "billingRateRef",
    "employeePayrollInfo",
    "externalGUID"
})
@XmlRootElement(name = "EmployeeAdd")
public class EmployeeAdd {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IsActive")
    protected String isActive;
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
    @XmlElement(name = "SupervisorRef")
    protected SupervisorRef supervisorRef;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "TargetBonus")
    protected String targetBonus;
    @XmlElement(name = "EmployeeAddress")
    protected EmployeeAddress employeeAddress;
    @XmlElement(name = "PrintAs")
    protected String printAs;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Pager")
    protected String pager;
    @XmlElement(name = "PagerPIN")
    protected String pagerPIN;
    @XmlElement(name = "AltPhone")
    protected String altPhone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "AdditionalContactRef")
    protected List<AdditionalContactRef> additionalContactRef;
    @XmlElement(name = "EmergencyContacts")
    protected EmergencyContacts emergencyContacts;
    @XmlElement(name = "EmployeeType", defaultValue = "Regular")
    protected String employeeType;
    @XmlElement(name = "PartOrFullTime")
    protected String partOrFullTime;
    @XmlElement(name = "Exempt")
    protected String exempt;
    @XmlElement(name = "KeyEmployee")
    protected String keyEmployee;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "HiredDate")
    protected String hiredDate;
    @XmlElement(name = "OriginalHireDate")
    protected String originalHireDate;
    @XmlElement(name = "AdjustedServiceDate")
    protected String adjustedServiceDate;
    @XmlElement(name = "ReleasedDate")
    protected String releasedDate;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "USCitizen")
    protected String usCitizen;
    @XmlElement(name = "Ethnicity")
    protected String ethnicity;
    @XmlElement(name = "Disabled")
    protected String disabled;
    @XmlElement(name = "DisabilityDesc")
    protected String disabilityDesc;
    @XmlElement(name = "OnFile")
    protected String onFile;
    @XmlElement(name = "WorkAuthExpireDate")
    protected String workAuthExpireDate;
    @XmlElement(name = "USVeteran")
    protected String usVeteran;
    @XmlElement(name = "MilitaryStatus")
    protected String militaryStatus;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "AdditionalNotes")
    protected List<AdditionalNotes> additionalNotes;
    @XmlElement(name = "BillingRateRef")
    protected BillingRateRef billingRateRef;
    @XmlElement(name = "EmployeePayrollInfo")
    protected EmployeePayrollInfo employeePayrollInfo;
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
     * Gets the value of the supervisorRef property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisorRef }
     *     
     */
    public SupervisorRef getSupervisorRef() {
        return supervisorRef;
    }

    /**
     * Sets the value of the supervisorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisorRef }
     *     
     */
    public void setSupervisorRef(SupervisorRef value) {
        this.supervisorRef = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the targetBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetBonus() {
        return targetBonus;
    }

    /**
     * Sets the value of the targetBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetBonus(String value) {
        this.targetBonus = value;
    }

    /**
     * Gets the value of the employeeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeAddress }
     *     
     */
    public EmployeeAddress getEmployeeAddress() {
        return employeeAddress;
    }

    /**
     * Sets the value of the employeeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeAddress }
     *     
     */
    public void setEmployeeAddress(EmployeeAddress value) {
        this.employeeAddress = value;
    }

    /**
     * Gets the value of the printAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintAs() {
        return printAs;
    }

    /**
     * Sets the value of the printAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintAs(String value) {
        this.printAs = value;
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
     * Gets the value of the pagerPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerPIN() {
        return pagerPIN;
    }

    /**
     * Sets the value of the pagerPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerPIN(String value) {
        this.pagerPIN = value;
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
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
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
     * Gets the value of the emergencyContacts property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyContacts }
     *     
     */
    public EmergencyContacts getEmergencyContacts() {
        return emergencyContacts;
    }

    /**
     * Sets the value of the emergencyContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyContacts }
     *     
     */
    public void setEmergencyContacts(EmergencyContacts value) {
        this.emergencyContacts = value;
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeType(String value) {
        this.employeeType = value;
    }

    /**
     * Gets the value of the partOrFullTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOrFullTime() {
        return partOrFullTime;
    }

    /**
     * Sets the value of the partOrFullTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOrFullTime(String value) {
        this.partOrFullTime = value;
    }

    /**
     * Gets the value of the exempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExempt() {
        return exempt;
    }

    /**
     * Sets the value of the exempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExempt(String value) {
        this.exempt = value;
    }

    /**
     * Gets the value of the keyEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyEmployee() {
        return keyEmployee;
    }

    /**
     * Sets the value of the keyEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyEmployee(String value) {
        this.keyEmployee = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the hiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredDate() {
        return hiredDate;
    }

    /**
     * Sets the value of the hiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredDate(String value) {
        this.hiredDate = value;
    }

    /**
     * Gets the value of the originalHireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalHireDate() {
        return originalHireDate;
    }

    /**
     * Sets the value of the originalHireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalHireDate(String value) {
        this.originalHireDate = value;
    }

    /**
     * Gets the value of the adjustedServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedServiceDate() {
        return adjustedServiceDate;
    }

    /**
     * Sets the value of the adjustedServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedServiceDate(String value) {
        this.adjustedServiceDate = value;
    }

    /**
     * Gets the value of the releasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleasedDate() {
        return releasedDate;
    }

    /**
     * Sets the value of the releasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleasedDate(String value) {
        this.releasedDate = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the usCitizen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSCitizen() {
        return usCitizen;
    }

    /**
     * Sets the value of the usCitizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSCitizen(String value) {
        this.usCitizen = value;
    }

    /**
     * Gets the value of the ethnicity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicity() {
        return ethnicity;
    }

    /**
     * Sets the value of the ethnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicity(String value) {
        this.ethnicity = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabled(String value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the disabilityDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityDesc() {
        return disabilityDesc;
    }

    /**
     * Sets the value of the disabilityDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityDesc(String value) {
        this.disabilityDesc = value;
    }

    /**
     * Gets the value of the onFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnFile() {
        return onFile;
    }

    /**
     * Sets the value of the onFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnFile(String value) {
        this.onFile = value;
    }

    /**
     * Gets the value of the workAuthExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkAuthExpireDate() {
        return workAuthExpireDate;
    }

    /**
     * Sets the value of the workAuthExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkAuthExpireDate(String value) {
        this.workAuthExpireDate = value;
    }

    /**
     * Gets the value of the usVeteran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSVeteran() {
        return usVeteran;
    }

    /**
     * Sets the value of the usVeteran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSVeteran(String value) {
        this.usVeteran = value;
    }

    /**
     * Gets the value of the militaryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryStatus() {
        return militaryStatus;
    }

    /**
     * Sets the value of the militaryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryStatus(String value) {
        this.militaryStatus = value;
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
     * Gets the value of the additionalNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalNotes }
     * 
     * 
     */
    public List<AdditionalNotes> getAdditionalNotes() {
        if (additionalNotes == null) {
            additionalNotes = new ArrayList<AdditionalNotes>();
        }
        return this.additionalNotes;
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
     * Gets the value of the employeePayrollInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeePayrollInfo }
     *     
     */
    public EmployeePayrollInfo getEmployeePayrollInfo() {
        return employeePayrollInfo;
    }

    /**
     * Sets the value of the employeePayrollInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeePayrollInfo }
     *     
     */
    public void setEmployeePayrollInfo(EmployeePayrollInfo value) {
        this.employeePayrollInfo = value;
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
