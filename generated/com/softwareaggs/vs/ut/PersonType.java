//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.11 at 10:09:34 PM EST 
//


package com.softwareaggs.vs.ut;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://niem.gov/niem/structures/2.0}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonBirthDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonNationalityText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}PersonSex" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "personBirthDate",
    "personName",
    "personNationalityText",
    "personSex"
})
public class PersonType
    extends ComplexObjectType
{

    @XmlElement(name = "PersonBirthDate", nillable = true)
    protected List<DateType> personBirthDate;
    @XmlElement(name = "PersonName", nillable = true)
    protected List<PersonNameType> personName;
    @XmlElement(name = "PersonNationalityText", nillable = true)
    protected List<TextType> personNationalityText;
    @XmlElementRef(name = "PersonSex", namespace = "http://niem.gov/niem/niem-core/2.0", type = JAXBElement.class)
    protected List<JAXBElement<?>> personSex;

    /**
     * Gets the value of the personBirthDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personBirthDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonBirthDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateType }
     * 
     * 
     */
    public List<DateType> getPersonBirthDate() {
        if (personBirthDate == null) {
            personBirthDate = new ArrayList<DateType>();
        }
        return this.personBirthDate;
    }

    /**
     * Gets the value of the personName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameType }
     * 
     * 
     */
    public List<PersonNameType> getPersonName() {
        if (personName == null) {
            personName = new ArrayList<PersonNameType>();
        }
        return this.personName;
    }

    /**
     * Gets the value of the personNationalityText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personNationalityText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonNationalityText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getPersonNationalityText() {
        if (personNationalityText == null) {
            personNationalityText = new ArrayList<TextType>();
        }
        return this.personNationalityText;
    }

    /**
     * Gets the value of the personSex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personSex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonSex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link SEXCodeType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPersonSex() {
        if (personSex == null) {
            personSex = new ArrayList<JAXBElement<?>>();
        }
        return this.personSex;
    }

}
