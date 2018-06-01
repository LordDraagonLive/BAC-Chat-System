
package com.bac.models;

/**
 *
 * @author Buddhi Adhikari 16280809
 */
public class Users {
    
    /**
     * This class concrete class for Users used in the application
     * this class provides re-usability
     */
    private String loginId;
    private String nickname;
    private String password;
    private String comfirmPassword;

    /**
     * Constructor for Users class
     * @param loginId User's ID
     * @param nickname User's Nickname
     * @param password User's Password
     * @param comfirmPassword Confirmation password
     * as parameters and sets them
     */
    public Users(String loginId, String nickname, String password, String comfirmPassword) {
        this.loginId = loginId;
        this.nickname = nickname;
        this.password = password;
        this.comfirmPassword = comfirmPassword;
    }

    /**
     * Below are getters and setters of the 'Users' Class
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

    public String getComfirmPassword() {
        return comfirmPassword;
    }

    public void setComfirmPassword(String comfirmPassword) {
        this.comfirmPassword = comfirmPassword;
    }
    
}
