//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.11 at 10:09:34 PM EST 
//


package com.softwareaggs.vs.ut;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="ProcessID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EngineName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RestartedFromCheckPoint" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TrackingInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "ProcessContext", namespace = "http://uscis.gov/uscis/xsd/services/exceptions/0.1")
public class ProcessContext {

    @XmlValue
    protected java.lang.String value;
    @XmlAttribute(name = "ProcessID")
    protected BigInteger processID;
    @XmlAttribute(name = "ProjectName")
    protected java.lang.String projectName;
    @XmlAttribute(name = "EngineName")
    protected java.lang.String engineName;
    @XmlAttribute(name = "RestartedFromCheckPoint")
    protected Boolean restartedFromCheckPoint;
    @XmlAttribute(name = "TrackingInfo")
    protected java.lang.String trackingInfo;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    /**
     * Gets the value of the processID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProcessID() {
        return processID;
    }

    /**
     * Sets the value of the processID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProcessID(BigInteger value) {
        this.processID = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setProjectName(java.lang.String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the engineName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEngineName() {
        return engineName;
    }

    /**
     * Sets the value of the engineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEngineName(java.lang.String value) {
        this.engineName = value;
    }

    /**
     * Gets the value of the restartedFromCheckPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestartedFromCheckPoint() {
        return restartedFromCheckPoint;
    }

    /**
     * Sets the value of the restartedFromCheckPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestartedFromCheckPoint(Boolean value) {
        this.restartedFromCheckPoint = value;
    }

    /**
     * Gets the value of the trackingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTrackingInfo() {
        return trackingInfo;
    }

    /**
     * Sets the value of the trackingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTrackingInfo(java.lang.String value) {
        this.trackingInfo = value;
    }

}
