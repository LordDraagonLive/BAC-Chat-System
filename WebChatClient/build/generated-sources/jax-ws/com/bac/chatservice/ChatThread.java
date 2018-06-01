
package com.bac.chatservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chatThread complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chatThread">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lasteditTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="threadId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "chatThread", propOrder = {
    "creatorId",
    "lasteditTime",
    "threadId",
    "threadTitle"
})
public class ChatThread {

    protected String creatorId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lasteditTime;
    protected Integer threadId;
    protected String threadTitle;

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

    /**
     * Gets the value of the lasteditTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLasteditTime() {
        return lasteditTime;
    }

    /**
     * Sets the value of the lasteditTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLasteditTime(XMLGregorianCalendar value) {
        this.lasteditTime = value;
    }

    /**
     * Gets the value of the threadId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreadId() {
        return threadId;
    }

    /**
     * Sets the value of the threadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreadId(Integer value) {
        this.threadId = value;
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
