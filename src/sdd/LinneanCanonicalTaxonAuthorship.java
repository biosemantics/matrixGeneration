//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.17 at 07:34:43 PM EDT 
//


package sdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Canonical citation (authorship of a taxon) includes only the authorship of the lowest ranking epitheton (to also include the authorship of the species for infraspecific taxa is not uncommon, but not recommended by the codes).
 * 
 * <p>Java class for LinneanCanonicalTaxonAuthorship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinneanCanonicalTaxonAuthorship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Simple" type="{http://rs.tdwg.org/UBIF/2006/}LongString" minOccurs="0"/>
 *         &lt;element name="BaseCitation" type="{http://rs.tdwg.org/UBIF/2006/}TaxonAuthorshipCitation" minOccurs="0"/>
 *         &lt;element name="BaseCitationBracketed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CombinationCitation" type="{http://rs.tdwg.org/UBIF/2006/}TaxonAuthorshipCitation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinneanCanonicalTaxonAuthorship", propOrder = {
    "simple",
    "baseCitation",
    "baseCitationBracketed",
    "combinationCitation"
})
public class LinneanCanonicalTaxonAuthorship {

    @XmlElement(name = "Simple")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String simple;
    @XmlElement(name = "BaseCitation")
    protected TaxonAuthorshipCitation baseCitation;
    @XmlElement(name = "BaseCitationBracketed")
    protected Boolean baseCitationBracketed;
    @XmlElement(name = "CombinationCitation")
    protected TaxonAuthorshipCitation combinationCitation;

    /**
     * Gets the value of the simple property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimple() {
        return simple;
    }

    /**
     * Sets the value of the simple property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimple(String value) {
        this.simple = value;
    }

    /**
     * Gets the value of the baseCitation property.
     * 
     * @return
     *     possible object is
     *     {@link TaxonAuthorshipCitation }
     *     
     */
    public TaxonAuthorshipCitation getBaseCitation() {
        return baseCitation;
    }

    /**
     * Sets the value of the baseCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxonAuthorshipCitation }
     *     
     */
    public void setBaseCitation(TaxonAuthorshipCitation value) {
        this.baseCitation = value;
    }

    /**
     * Gets the value of the baseCitationBracketed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaseCitationBracketed() {
        return baseCitationBracketed;
    }

    /**
     * Sets the value of the baseCitationBracketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaseCitationBracketed(Boolean value) {
        this.baseCitationBracketed = value;
    }

    /**
     * Gets the value of the combinationCitation property.
     * 
     * @return
     *     possible object is
     *     {@link TaxonAuthorshipCitation }
     *     
     */
    public TaxonAuthorshipCitation getCombinationCitation() {
        return combinationCitation;
    }

    /**
     * Sets the value of the combinationCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxonAuthorshipCitation }
     *     
     */
    public void setCombinationCitation(TaxonAuthorshipCitation value) {
        this.combinationCitation = value;
    }

}
