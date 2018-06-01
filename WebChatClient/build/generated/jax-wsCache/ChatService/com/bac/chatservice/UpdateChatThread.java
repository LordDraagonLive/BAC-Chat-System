
package com.bac.chatservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateChatThread complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateChatThread">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threadID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="creatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateChatThread", propOrder = {
    "threadID",
    "creatorID",
    "threadTitle"
})
public class UpdateChatThread {

    protected Integer threadID;
    protected String creatorID;
    protected String threadTitle;

    /**
     * Gets the value of the threadID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreadID() {
        return threadID;
    }

    /**
     * Sets the value of the threadID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreadID(Integer value) {
        this.threadID = value;
    }

    /**
     * Gets the value of the creatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * Sets the value of the creatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

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

}
