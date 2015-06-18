//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.26 at 10:15:02 PM EST 
//


package com.softwareaggs.vs.ut;

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
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}Person" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonSSNIdentification" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/domains/immigration/2.0}AlienNumber" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/domains/immigration/2.0}AlienBirthCountryName" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/domains/immigration/2.0}AlienImmigrationStatus" minOccurs="0"/>
 *         &lt;element ref="{http://uscis.gov/uscis/xsd/services/verification/2.0/verification}AdmittedDate" minOccurs="0"/>
 *         &lt;element ref="{http://uscis.gov/uscis/xsd/services/verification/2.0/verification}NaturalizationVerification" minOccurs="0"/>
 *         &lt;element ref="{http://uscis.gov/uscis/xsd/services/verification/2.0/verification}PassportVerification" minOccurs="0"/>
 *         &lt;element ref="{http://uscis.gov/uscis/xsd/services/verification/2.0/verification}VisaVerification" minOccurs="0"/>
 *         &lt;element ref="{http://uscis.gov/uscis/xsd/services/verification/2.0/verification}AlienStudentVerification" minOccurs="0"/>
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
    "person",
    "personSSNIdentification",
    "alienNumber",
    "alienBirthCountryName",
    "alienImmigrationStatus",
    "admittedDate",
    "naturalizationVerification",
    "passportVerification",
    "visaVerification",
    "alienStudentVerification"
})
@XmlRootElement(name = "PersonSearchResult", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification")
public class PersonSearchResult {

    @XmlElement(name = "Person", nillable = true)
    protected PersonType person;
    @XmlElement(name = "PersonSSNIdentification", nillable = true)
    protected IdentificationType personSSNIdentification;
    @XmlElement(name = "AlienNumber", namespace = "http://niem.gov/niem/domains/immigration/2.0", nillable = true)
    protected IdentificationType alienNumber;
    @XmlElement(name = "AlienBirthCountryName", namespace = "http://niem.gov/niem/domains/immigration/2.0", nillable = true)
    protected TextType alienBirthCountryName;
    @XmlElement(name = "AlienImmigrationStatus", namespace = "http://niem.gov/niem/domains/immigration/2.0", nillable = true)
    protected ImmigrationStatusType alienImmigrationStatus;
    @XmlElement(name = "AdmittedDate", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification")
    protected DateType admittedDate;
    @XmlElement(name = "NaturalizationVerification", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification")
    protected NaturalizationVerification naturalizationVerification;
    @XmlElement(name = "PassportVerification", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification")
    protected PassportType passportVerification;
    @XmlElement(name = "VisaVerification", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification")
    protected VisaVerificationType visaVerification;
    @XmlElement(name = "AlienStudentVerification", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification")
    protected AlienStudentVerificationType alienStudentVerification;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

    /**
     * Gets the value of the personSSNIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getPersonSSNIdentification() {
        return personSSNIdentification;
    }

    /**
     * Sets the value of the personSSNIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setPersonSSNIdentification(IdentificationType value) {
        this.personSSNIdentification = value;
    }

    /**
     * Gets the value of the alienNumber property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getAlienNumber() {
        return alienNumber;
    }

    /**
     * Sets the value of the alienNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setAlienNumber(IdentificationType value) {
        this.alienNumber = value;
    }

    /**
     * Gets the value of the alienBirthCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAlienBirthCountryName() {
        return alienBirthCountryName;
    }

    /**
     * Sets the value of the alienBirthCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAlienBirthCountryName(TextType value) {
        this.alienBirthCountryName = value;
    }

    /**
     * Gets the value of the alienImmigrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ImmigrationStatusType }
     *     
     */
    public ImmigrationStatusType getAlienImmigrationStatus() {
        return alienImmigrationStatus;
    }

    /**
     * Sets the value of the alienImmigrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmigrationStatusType }
     *     
     */
    public void setAlienImmigrationStatus(ImmigrationStatusType value) {
        this.alienImmigrationStatus = value;
    }

    /**
     * Gets the value of the admittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getAdmittedDate() {
        return admittedDate;
    }

    /**
     * Sets the value of the admittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setAdmittedDate(DateType value) {
        this.admittedDate = value;
    }

    /**
     * Gets the value of the naturalizationVerification property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalizationVerification }
     *     
     */
    public NaturalizationVerification getNaturalizationVerification() {
        return naturalizationVerification;
    }

    /**
     * Sets the value of the naturalizationVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalizationVerification }
     *     
     */
    public void setNaturalizationVerification(NaturalizationVerification value) {
        this.naturalizationVerification = value;
    }

    /**
     * Gets the value of the passportVerification property.
     * 
     * @return
     *     possible object is
     *     {@link PassportType }
     *     
     */
    public PassportType getPassportVerification() {
        return passportVerification;
    }

    /**
     * Sets the value of the passportVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportType }
     *     
     */
    public void setPassportVerification(PassportType value) {
        this.passportVerification = value;
    }

    /**
     * Gets the value of the visaVerification property.
     * 
     * @return
     *     possible object is
     *     {@link VisaVerificationType }
     *     
     */
    public VisaVerificationType getVisaVerification() {
        return visaVerification;
    }

    /**
     * Sets the value of the visaVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaVerificationType }
     *     
     */
    public void setVisaVerification(VisaVerificationType value) {
        this.visaVerification = value;
    }

    /**
     * Gets the value of the alienStudentVerification property.
     * 
     * @return
     *     possible object is
     *     {@link AlienStudentVerificationType }
     *     
     */
    public AlienStudentVerificationType getAlienStudentVerification() {
        return alienStudentVerification;
    }

    /**
     * Sets the value of the alienStudentVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienStudentVerificationType }
     *     
     */
    public void setAlienStudentVerification(AlienStudentVerificationType value) {
        this.alienStudentVerification = value;
    }

}
