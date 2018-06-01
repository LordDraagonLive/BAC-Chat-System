
package com.bac.services;

import com.bac.datasource.ChatUser;
import com.bac.datasource.service.ChatUserFacadeREST;
import java.sql.SQLException;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Buddhi Adhikari 16280809
 */
@WebService(serviceName = "UserService")
public class UserService {

    //Enterprise JavaBean notation
    @EJB
    //creating a ChatUserFacadeREST var
    private ChatUserFacadeREST chatUserFacadeREST;

    /**
     * Web service operation: 'register'
     * @params: login Id: String, nickname: String, password: String, confirm Password: String
     * returns: message: String
     * message: if user passwords doesn't match then returns "Passwords doesn't match". else "Registration successful!"
     *          if there's an duplicate exception then return "There is another account with the same ID!"
     */
    @WebMethod(operationName = "register")
    public String register(@WebParam(name = "loginId") String loginId, @WebParam(name = "nickname") String nickname, @WebParam(name = "password") String password, @WebParam(name = "comfirmPassword") String comfirmPassword){
        try{
            if(!password.equals(comfirmPassword)){
                return "Passwords doesn't match";
            }else{
                chatUserFacadeREST.create(new ChatUser(loginId, nickname, password));
                return "Registration succesful!";
            }
        }catch(Exception e){
            return "There is another account with the same ID!";
        }
        
    }

    /**
     * Web service operation: login
     * @params: login ID: String, password: String
     * returns: if passwords match then return "login success !"  else return "login failed !"
     *          if there's an null pointer exception then returns "User not found"
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "loginId") String loginId, @WebParam(name = "password") String password) {
        
        ChatUser foundUser;
        try{
            //finding if the user is in database
            foundUser = chatUserFacadeREST.find(loginId);
            
            //if user found then compare the passwords
            if (foundUser.getPassword().equals(password)) {
                return "login success !";
            } else {
                return "login failed !";
            }
        }catch(Exception e){
//            System.err.println(e);
            return "User not found";
        } 
    }    
}
