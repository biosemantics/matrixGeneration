//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.17 at 07:34:43 PM EDT 
//


package sdd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Language/audience specific object representation for human consumers, using free-form text labels, descriptions, images, etc.
 * 
 * <p>Java class for Representation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Representation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rs.tdwg.org/UBIF/2006/}Alt">
 *       &lt;group ref="{http://rs.tdwg.org/UBIF/2006/}RepresentationGroup" maxOccurs="unbounded" minOccurs="0"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Representation", propOrder = {
    "representationGroup"
})
@XmlSeeAlso({
    RepresentationReqrd.class
})
public class Representation
    extends Alt
{

    @XmlElements({
        @XmlElement(name = "MediaObject", type = MediaObjectRichRef.class),
        @XmlElement(name = "Label", type = LabelText.class),
        @XmlElement(name = "Detail", type = DetailText.class)
    })
    protected List<Object> representationGroup;

    /**
     * Gets the value of the representationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the representationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepresentationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaObjectRichRef }
     * {@link LabelText }
     * {@link DetailText }
     * 
     * 
     */
    public List<Object> getRepresentationGroup() {
        if (representationGroup == null) {
            representationGroup = new ArrayList<Object>();
        }
        return this.representationGroup;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rep [");
		if (representationGroup != null)
			builder.append(representationGroup.toString());
		builder.append("]");
		return builder.toString();
	}

}
