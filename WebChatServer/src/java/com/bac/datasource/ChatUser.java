
package com.bac.datasource;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Buddhi Adhikari 16280809
 */
@Entity
@Table(name = "CHAT_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChatUser.findAll", query = "SELECT c FROM ChatUser c"),
    @NamedQuery(name = "ChatUser.findByLoginId", query = "SELECT c FROM ChatUser c WHERE c.loginId = :loginId"),
    @NamedQuery(name = "ChatUser.findByNickname", query = "SELECT c FROM ChatUser c WHERE c.nickname = :nickname"),
    @NamedQuery(name = "ChatUser.findByPassword", query = "SELECT c FROM ChatUser c WHERE c.password = :password")})
public class ChatUser implements Serializable {

    /**
     * Below variables will be mapped to a table in the database
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LOGIN_ID")
    private String loginId;
    @Size(max = 50)
    @Column(name = "NICKNAME")
    private String nickname;
    @Size(max = 50)
    @Column(name = "PASSWORD")
    private String password;

    /**
     * The default constructor
     */
    public ChatUser() {
    }

    /**
     * This constructor takes
     * @param loginId User's ID
     * @param nickname User's nickname
     * @param password User's password
     * as parameters
     */
    public ChatUser(String loginId, String nickname, String password) {
        this.loginId = loginId;
        this.nickname = nickname;
        this.password = password;
    }
    
    /**
     * this constructor takes
     * @param loginId User's ID
     * as a parameter
     */
    public ChatUser(String loginId) {
        this.loginId = loginId;
    }

    /**
     * Below are all the getters and setters
     * 
     */
    
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * hashcode() method
     * not used in the program
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginId != null ? loginId.hashCode() : 0);
        return hash;
    }

    /**
     * Not Used in the program
     * @param object ChatUser instance
     * @return boolean true/false
     */
    @Override
    public boolean equals(Object object) {
        //not used in this scenario 
        if (!(object instanceof ChatUser)) {
            return false;
        }
        ChatUser other = (ChatUser) object;
        if ((this.loginId == null && other.loginId != null) || (this.loginId != null && !this.loginId.equals(other.loginId))) {
            return false;
        }
        return true;
    }
    
    /**
     * Not used
     * @return 
     * the toString() method which can be overridden
     */

    @Override
    public String toString() {
        return "com.bac.datasource.ChatUser[ loginId=" + loginId + " ]";
    }
    
}
