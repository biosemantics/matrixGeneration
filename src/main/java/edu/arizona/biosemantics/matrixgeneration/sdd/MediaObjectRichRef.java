//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.17 at 07:34:43 PM EDT 
//


package edu.arizona.biosemantics.matrixgeneration.sdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * MediaObjectRef plus optional role and language attributes
 * 
 * <p>Java class for MediaObjectRichRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaObjectRichRef">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rs.tdwg.org/UBIF/2006/}AbstractLocalRef">
 *       &lt;attribute name="role" type="{http://rs.tdwg.org/UBIF/2006/}MediaRepresentationRoleEnum" default="UnknownMediaRole" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaObjectRichRef")
public class MediaObjectRichRef
    extends AbstractLocalRef
{

    @XmlAttribute
    protected QName role;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getRole() {
        if (role == null) {
            return new QName("http://rs.tdwg.org/UBIF/2006/", "UnknownMediaRole", "");
        } else {
            return role;
        }
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setRole(QName value) {
        this.role = value;
    }

}
