
package com.bac.chatservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createThread complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createThread">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threadTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creator_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createThread", propOrder = {
    "threadTitle",
    "creatorId"
})
public class CreateThread {

    protected String threadTitle;
    @XmlElement(name = "creator_Id")
    protected String creatorId;

    /**
     * Gets the value of the threadTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadTitle() {
        return threadTitle;
    }

    /**
     * Sets the value of the threadTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadTitle(String value) {
        this.threadTitle = value;
    }

    /**
     * Gets the value of the creatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * Sets the value of the creatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorId(String value) {
        this.creatorId = value;
    }

}
