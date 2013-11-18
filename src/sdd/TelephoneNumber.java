//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.17 at 07:34:43 PM EDT 
//


package sdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * Telephone, fax, etc. number
 * ATTR: number = should be provided in the ITU Recommendation E.164 international format ("+CountryCode AreaCode Number") (vCard:Tel.Number)
 * ATTR: devicetype = voice, fax, mobile, pager, modem (identical with vCard:Tel.Voice etc.; if several flags apply to a single phone number list the phone number multiple times!)
 * ATTR: usagenote = free-form text for constraints on use e. g. "weekdays only" or "home number" (partly: vCard:Tel.Home/Work flags)
 * ATTR: preferred = preferred number, may occur multiple times for different device types (vCard:Tel.Pref)
 * 
 * <p>Java class for TelephoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="number" use="required" type="{http://rs.tdwg.org/UBIF/2006/}ShortString" />
 *       &lt;attribute name="devicetype" type="{http://rs.tdwg.org/UBIF/2006/}TelephoneDeviceEnum" />
 *       &lt;attribute name="usagenote" type="{http://rs.tdwg.org/UBIF/2006/}ShortString" />
 *       &lt;attribute name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneNumber")
public class TelephoneNumber {

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String number;
    @XmlAttribute
    protected QName devicetype;
    @XmlAttribute
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String usagenote;
    @XmlAttribute
    protected Boolean preferred;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the devicetype property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getDevicetype() {
        return devicetype;
    }

    /**
     * Sets the value of the devicetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setDevicetype(QName value) {
        this.devicetype = value;
    }

    /**
     * Gets the value of the usagenote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsagenote() {
        return usagenote;
    }

    /**
     * Sets the value of the usagenote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsagenote(String value) {
        this.usagenote = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferred() {
        if (preferred == null) {
            return false;
        } else {
            return preferred;
        }
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferred(Boolean value) {
        this.preferred = value;
    }

}