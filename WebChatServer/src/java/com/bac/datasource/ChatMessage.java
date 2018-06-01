
package com.bac.datasource;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Buddhi Adhikari 16280809
 */
@Entity
@Table(name = "CHAT_MESSAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChatMessage.findAll", query = "SELECT c FROM ChatMessage c"),
    @NamedQuery(name = "ChatMessage.findByMessageId", query = "SELECT c FROM ChatMessage c WHERE c.messageId = :messageId"),
    @NamedQuery(name = "ChatMessage.findByMessage", query = "SELECT c FROM ChatMessage c WHERE c.message = :message"),
    @NamedQuery(name = "ChatMessage.findByCreatedatetime", query = "SELECT c FROM ChatMessage c WHERE c.createdatetime = :createdatetime"),
    @NamedQuery(name = "ChatMessage.findByCreatorId", query = "SELECT c FROM ChatMessage c WHERE c.creatorId = :creatorId"),
    @NamedQuery(name = "ChatMessage.findByThreadId", query = "SELECT c FROM ChatMessage c WHERE c.threadId = :threadId")})
public class ChatMessage implements Serializable {

    /**
     * The variables which will be mapped to the database
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MESSAGE_ID")
    private Integer messageId;
    @Size(max = 500)
    @Column(name = "MESSAGE")
    private String message;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATEDATETIME")
    /**
     * converts to TimeStamp type
     * Whenever this class is called the current time is updated with
     * the database using "new Date()"
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdatetime = new Date();
    @Size(max = 50)
    @Column(name = "CREATOR_ID")
    private String creatorId;
    @Column(name = "THREAD_ID")
    private Integer threadId;

    /**
     * The default constructor
     */
    public ChatMessage() {
    }

    /**
     * Auto gen constructor
     * @param messageId 
     * 
     */
    public ChatMessage(Integer messageId) {
        this.messageId = messageId;
    }
    /**
     * This constructor is used to get user data and pass it to db
     * @param message user's message
     * @param creatorID ID of the user who created the message
     * @param threadID ID of the thread where it was created
     */
    public ChatMessage(String message, String creatorID, int threadID) {
        this.message = message;
        this.creatorId = creatorID;
        this.threadId=threadID;
    }

    /**
     * 
     * Below are getters and setters
     */
    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    /**
     * 
     * hashCode() method, can be overridden for customised purposes
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messageId != null ? messageId.hashCode() : 0);
        return hash;
    }

    /**
     * Takes obj as a input and returns a boolean
     * @param object takes a ChatMessage instance
     * @return if the objs are equal
     */
    @Override
    public boolean equals(Object object) {
        //equals method
        if (!(object instanceof ChatMessage)) {
            return false;
        }
        ChatMessage other = (ChatMessage) object;
        if ((this.messageId == null && other.messageId != null) || (this.messageId != null && !this.messageId.equals(other.messageId))) {
            return false;
        }
        return true;
    }

    /**
     * the toString() method
     * can be overridden
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "com.bac.datasource.ChatMessage[ messageId=" + messageId + " ]";
    }
    
}
