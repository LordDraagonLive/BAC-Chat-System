/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bac;

import com.bac.models.Users;

/**
 *
 * @author BAC DARLING
 */
public class UserClient {
    
    private Users user;

    public UserClient(Users user) {
       this.user = user;
        
    }
    
    
    //web service references
//    public String register(String loginId, String nickname, String password, String comfirmPassword) {
//        com.bac.UserService_Service service = new com.bac.UserService_Service();
//        com.bac.UserService port = service.getUserServicePort();
//        return port.register(loginId, nickname, password, comfirmPassword);
//    }

//    public String register(java.lang.String loginId, java.lang.String nickname, java.lang.String password, java.lang.String comfirmPassword) {
//        com.bac.UserService_Service service = new com.bac.UserService_Service();
//        com.bac.UserService port = service.getUserServicePort();
//        return port.register(loginId, nickname, password, comfirmPassword);
//    }
    
    
    
}
