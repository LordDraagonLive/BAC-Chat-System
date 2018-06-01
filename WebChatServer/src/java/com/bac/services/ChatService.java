
package com.bac.services;

import com.bac.datasource.ChatMessage;
import com.bac.datasource.ChatThread;
import com.bac.datasource.service.ChatMessageFacadeREST;
import com.bac.datasource.service.ChatThreadFacadeREST;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Buddhi Adhikari 16280809
 */
@WebService(serviceName = "ChatService")
public class ChatService {

    //Enterprise JavaBean Anotation 
    //creating ChatMessageFacadeREST and ChatThreadFacadeREST var
    @EJB
    private ChatMessageFacadeREST chatMessageFacadeREST;

    @EJB
    private ChatThreadFacadeREST chatThreadFacadeREST;


    /**
     * Web service operation: createThread
     * @params: thread Title: String, creator ID: String
     * returns: If creation success then return "Thread creation success!" else
     *          return "Thread Creation Failed"
     * Function: This will create a new chat thread and add it to the db as well
     */
    @WebMethod(operationName = "createThread")
    public String createThread(@WebParam(name = "threadTitle") String threadTitle, @WebParam(name = "creator_Id") String creator_Id) {
        
        try{
            chatThreadFacadeREST.create(new ChatThread(threadTitle,creator_Id));
            return "Thread creation success!";
        }catch(Exception e){
            return "Thread Creation Failed";
        }

        
    }

    /**
     * Web service operation: findDuplicateThreads
     * @params: Thread Title: String
     * returns: If there are no errors then return "Passed" else return the applicable
     *          error
     * Function: Finds any duplicate threads in the thread list
     */
    @WebMethod(operationName = "findDuplicateThreads")
    public String findDuplicateThreads(@WebParam(name = "ThreadTitle") String ThreadTitle) {
        
        Integer count = 0;
        try{
            List<ChatThread> dbChatThread = chatThreadFacadeREST.findAll();
            
            for (ChatThread temp : dbChatThread) {
                if(temp.getThreadTitle().equals(ThreadTitle)){
                    count++;
                    return "Theres another thread with the same name. Try a different name";
                }
            }
            
            if(count==0){
                return "Passed";
            }
            
        }catch(Exception e){
//            System.err.println(e);
            return "Unexpected error occured";
        }
        return "Failed";
    }

    /**
     * Web service operation: chatThreadList
     * returns: List of ChatThreads
     * Function: Will get the collective list of all the chat threads in the db and
     *          return them
     */
    @WebMethod(operationName = "chatThreadList")
    public List<ChatThread> chatThreadList() throws NullPointerException{
        
            List<ChatThread> chatList = chatThreadFacadeREST.findAll();
            return chatList;
    }

    /**
     * Web service operation: createMessage
     * @params: message String, creator ID: String, thread ID: int
     * returns: If success "Message sent success" else "Message sent failed"
     * Function: Creates a new chat message in the specified thread
     */
    @WebMethod(operationName = "createMessage")
    public String createMessage(@WebParam(name = "message") String message, @WebParam(name = "creatorID") String creatorID, @WebParam(name = "threadID") int threadID) {
        
        try{
            chatMessageFacadeREST.create(new ChatMessage(message, creatorID, threadID));
            return "Message sent success";
        }catch(Exception ex){
            return "Message sent failed";
        }
        
    }

    /**
     * Web service operation: chatsInThread
     * returns: List of ChatMessages
     * function: Retrieves all the chat messages from the db
     */
    @WebMethod(operationName = "chatsInThread")
    public List<ChatMessage> chatsInThread() throws NullPointerException{
        
        List<ChatMessage> chatMessages =chatMessageFacadeREST.findAll();
        
        return chatMessages;
    }

    /**
     * Web service operation: updateChatThread
     * @params: thread ID: Integer, creator ID: String, thread title: String
     * returns: If edit success then return "Success" else failed message
     * function: Updates the ChatThread with the params (Automatically updates time)
     */
    @WebMethod(operationName = "updateChatThread")
    public String updateChatThread(@WebParam(name = "threadID") Integer threadID, @WebParam(name = "creatorID") String creatorID, @WebParam(name = "threadTitle") String threadTitle) {
        try{
            chatThreadFacadeREST.edit(threadID, new ChatThread(threadID,creatorID,threadTitle));
            return "Success";
        }catch(Exception ex){
            
            return "Failed when updating the chat thread";
        }
        
        
    }

}