
package com.bac.datasource;

import java.io.Serializable;
import java.sql.Timestamp;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Buddhi Adhikari 16280809
 * 
 */
@Entity
@Table(name = "CHAT_THREAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChatThread.findAll", query = "SELECT c FROM ChatThread c"),
    @NamedQuery(name = "ChatThread.findByThreadId", query = "SELECT c FROM ChatThread c WHERE c.threadId = :threadId"),
    @NamedQuery(name = "ChatThread.findByThreadTitle", query = "SELECT c FROM ChatThread c WHERE c.threadTitle = :threadTitle"),
    @NamedQuery(name = "ChatThread.findByCreatorId", query = "SELECT c FROM ChatThread c WHERE c.creatorId = :creatorId"),
    @NamedQuery(name = "ChatThread.findByLasteditTime", query = "SELECT c FROM ChatThread c WHERE c.lasteditTime = :lasteditTime")})
public class ChatThread implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "THREAD_ID")
    private Integer threadId;
    @Size(max = 100)
    @Column(name = "THREAD_TITLE")
    private String threadTitle;
    @Size(max = 50)
    @Column(name = "CREATOR_ID")
    private String creatorId;
    /**
     * converts to TimeStamp type
     * Whenever this class is called the current time is updated with
     * the database using "new Date()"
     */
    @Column(name = "LASTEDIT_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lasteditTime = new Date();

    /**
     * Default constructor
     */
    public ChatThread() {
    }

    /**
     * Constructor with
     * @param threadId ID of the thread
     */
    public ChatThread(Integer threadId) {
        this.threadId = threadId;
    }
    
//    public ChatThread(String threadTitle) {
//        this.threadTitle = threadTitle;
//    }
    
    /**
     * Constructor which takes
     * @param threadId Thread ID
     * @param creatorId User's ID who created the thread/message
     * @param threadTitle Title of the thread
     * as parameters
     */
    public ChatThread(Integer threadId, String creatorId, String threadTitle) {
        this.threadId = threadId;
        this.creatorId = creatorId;
        this.threadTitle=threadTitle;
        
    }
    
    /**
     * A constructor which takes
     * @param threadTitle Thread Title
     * @param creatorId User's ID who created the thread/message
     * as parameters
     */
    public ChatThread(String threadTitle, String creatorId) {
        this.threadTitle = threadTitle;
        this.creatorId = creatorId;
        
    }
     
    /**
     * A constructor which takes
     * @param creatorId User's ID who created the thread/message
     * as a parameter
     */
    public ChatThread(String creatorId) {
        this.creatorId = creatorId;
        
    }
    
    /**
     * Below are the getters and setters of the class 
     */
    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public String getThreadTitle() {
        return threadTitle;
    }

    public void setThreadTitle(String threadTitle) {
        this.threadTitle = threadTitle;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Date getLasteditTime() {
        return lasteditTime;
    }

    public void setLasteditTime(Date lasteditTime) {
        this.lasteditTime = lasteditTime;
    }

    /**
     * Hashcode method
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (threadId != null ? threadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        //not implemented to work
        if (!(object instanceof ChatThread)) {
            return false;
        }
        ChatThread other = (ChatThread) object;
        if ((this.threadId == null && other.threadId != null) || (this.threadId != null && !this.threadId.equals(other.threadId))) {
            return false;
        }
        return true;
    }

    /**
     * the toString() method
     * @return 
     * not implemented to work
     */
    @Override
    public String toString() {
        return "com.bac.datasource.ChatThread[ threadId=" + threadId + " ]";
    }
    
}
