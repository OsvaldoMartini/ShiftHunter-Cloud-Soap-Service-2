//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 10:56:31 AM GMT+01:00 
//


package ch.corner.service.conveniencecard.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.corner.service.conveniencecard.common.BasicRequest;


/**
 * <p>Java class for getDecodedPF20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDecodedPF20">
 *   &lt;complexContent>
 *     &lt;extension base="{http://common.conveniencecard.service.corner.ch}basicRequest">
 *       &lt;sequence>
 *         &lt;element name="keyTab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDecodedPF20", propOrder = {
    "keyTab"
})
public class GetDecodedPF20
    extends BasicRequest
{

    @XmlElement(required = true)
    protected String keyTab;

    /**
     * Gets the value of the keyTab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyTab() {
        return keyTab;
    }

    /**
     * Sets the value of the keyTab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyTab(String value) {
        this.keyTab = value;
    }

}
