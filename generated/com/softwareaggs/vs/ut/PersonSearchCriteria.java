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
 *         &lt;element ref="{http://niem.gov/niem/domains/screening/2.0}VisaNumberID" minOccurs="0"/>
 *         &lt;element ref="{http://uscis.gov/uscis/xsd/services/verification/2.0/verification}VisaFoilNumber" minOccurs="0"/>
 *         &lt;element ref="{http://uscis.gov/uscis/xsd/services/verification/2.0/verification}SevisID" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PassportNumberIdentification" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/domains/immigration/2.0}CitizenshipCertificateIdentification" minOccurs="0"/>
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
    "visaNumberID",
    "visaFoilNumber",
    "sevisID",
    "passportNumberIdentification",
    "citizenshipCertificateIdentification"
})
@XmlRootElement(name = "PersonSearchCriteria", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification")
public class PersonSearchCriteria {

    @XmlElement(name = "Person", nillable = true)
    protected PersonType person;
    @XmlElement(name = "PersonSSNIdentification", nillable = true)
    protected IdentificationType personSSNIdentification;
    @XmlElement(name = "AlienNumber", namespace = "http://niem.gov/niem/domains/immigration/2.0", nillable = true)
    protected IdentificationType alienNumber;
    @XmlElement(name = "VisaNumberID", namespace = "http://niem.gov/niem/domains/screening/2.0", nillable = true)
    protected String visaNumberID;
    @XmlElement(name = "VisaFoilNumber", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification")
    protected String visaFoilNumber;
    @XmlElement(name = "SevisID", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification")
    protected IdentificationType sevisID;
    @XmlElement(name = "PassportNumberIdentification", nillable = true)
    protected IdentificationType passportNumberIdentification;
    @XmlElement(name = "CitizenshipCertificateIdentification", namespace = "http://niem.gov/niem/domains/immigration/2.0", nillable = true)
    protected IdentificationType citizenshipCertificateIdentification;

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
     * Gets the value of the visaNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumberID() {
        return visaNumberID;
    }

    /**
     * Sets the value of the visaNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumberID(String value) {
        this.visaNumberID = value;
    }

    /**
     * Gets the value of the visaFoilNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaFoilNumber() {
        return visaFoilNumber;
    }

    /**
     * Sets the value of the visaFoilNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaFoilNumber(String value) {
        this.visaFoilNumber = value;
    }

    /**
     * Gets the value of the sevisID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getSevisID() {
        return sevisID;
    }

    /**
     * Sets the value of the sevisID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setSevisID(IdentificationType value) {
        this.sevisID = value;
    }

    /**
     * Gets the value of the passportNumberIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getPassportNumberIdentification() {
        return passportNumberIdentification;
    }

    /**
     * Sets the value of the passportNumberIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setPassportNumberIdentification(IdentificationType value) {
        this.passportNumberIdentification = value;
    }

    /**
     * Gets the value of the citizenshipCertificateIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getCitizenshipCertificateIdentification() {
        return citizenshipCertificateIdentification;
    }

    /**
     * Sets the value of the citizenshipCertificateIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setCitizenshipCertificateIdentification(IdentificationType value) {
        this.citizenshipCertificateIdentification = value;
    }

}
