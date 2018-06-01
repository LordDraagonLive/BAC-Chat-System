
package com.bac.GUI;

import com.bac.chatservice.ChatMessage;
import java.util.List;
import java.util.Objects;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Buddhi Adhikari 1628080
 */
public class EditThread extends javax.swing.JFrame {

    //the loggin ID of the user who is currently logged
    String loggedUser;
    //the thread ID of the selected thread
    Integer threadId;
    //thread title of the selected thread
    String threadTitle;
    //List MODEL
    DefaultListModel<String> dm;
    

    /**
     * Creates new form EditThread
     */
    public EditThread() {
        initComponents();
        setResizable(false);
    }

    /**
     * Constructor of EditThread
     * @param loggedUser Logged user ID
     * @param threadId Current Thread ID
     * @param threadTitle Current Thread Title
     * as parameters
     */
    public EditThread(String loggedUser, Integer threadId, String threadTitle) {
        this.loggedUser = loggedUser;
        this.threadId = threadId;
        this.threadTitle = threadTitle;
        initComponents();
        setResizable(false);
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageList = new javax.swing.JList<>();
        addBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BAC Edit Chat Thread");

        jScrollPane1.setViewportView(messageList);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Displays a Input Dialog box and 
     * asks the user to enter a message
     * and then validates the message.
     * Additionally, this will update the
     * Messages and Threads tables in db
     * @param evt 
     */
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
    
        //message var
        String message;
        
        //getting the user's message
        try{
            //asking user the message for the chat
            message=JOptionPane.showInputDialog(rootPane,"Enter your message here!","",JOptionPane.PLAIN_MESSAGE);           
       
            //checking if message is empty or was cancel was pressed
            if(message.isEmpty()|| JOptionPane.CANCEL_OPTION!=2){
                JOptionPane.showMessageDialog(rootPane, "Message not sent");
            }else{
                //sending the message to the server
                String creationResult = createMessage(message, loggedUser, threadId);
                
                //updating the thread itself
                String updateThreadMsg = updateChatThread(threadId, loggedUser,threadTitle);
                
                //checking if failed during the server communication
                if(creationResult.contains("Failed")|| updateThreadMsg.contains("Failed")){
                    JOptionPane.showMessageDialog(rootPane, "Message not sent");
                }else{
//                    JOptionPane.showMessageDialog(rootPane, message);
                }
            }
       
        }catch(NullPointerException ex){
            //if null pointer exception occurs this will get called
            JOptionPane.showMessageDialog(rootPane, "Message not sent");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    /**
     * 
     * When window is focused the message
     * list is refreshed
     */
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        //displays all the messages in the selected thread
        displayMsgsList();
    }//GEN-LAST:event_formWindowGainedFocus

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        //create new thread page
        new ChatsList(loggedUser).setVisible(true);
        //close current window
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditThread().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> messageList;
    // End of variables declaration//GEN-END:variables

    /**
     * displayMsgsList() method from the server
     * @return the list of chats in the thread
     * function: gets all the chat messages from the server
     */
    private void displayMsgsList(){
     
        dm = new DefaultListModel<>();
        List<ChatMessage> chatThreadMsgs=chatsInThread();
        
        for(ChatMessage cM:chatThreadMsgs){
            
            if(Objects.equals(cM.getThreadId(), threadId)){
                //formatting  using a string builder for user friendly UI
                StringBuilder builder = new StringBuilder();

                builder.append("<html><pre>");
                //adding a paddding and formating the string
                builder.append(String.format("%-15s %-20s %s", cM.getMessage(), timeFormaterChat(cM.getCreatedatetime()), 
                        cM.getCreatorId()));
                builder.append("</pre></html>");

                //adding the string builder var to the DefaultListModel var
                dm.addElement(builder.toString());
            }
       }
        messageList.setModel(dm);
        //this will select a item from the list by default
        messageList.setSelectedIndex(0);
        
    }
    
    /**
     * getTime() method
     * @param getTime as XMLGregorianCalendar
     * @return a formatted string of the given time
     */
    private String timeFormaterChat(XMLGregorianCalendar getTime){
        return getTime.getDay()+"/"+getTime.getMonth()+"/"+getTime.getYear()+" "+getTime.getHour()+":"+getTime.getMinute();
    }
    
    /**
     * createMessage() method
     * @param message User's message
     * @param creatorID User's ID
     * @param threadID Thread's ID
     * as parameters and
     * @return a string as the server message
     */
    private static String createMessage(java.lang.String message, java.lang.String creatorID, int threadID) {
        com.bac.chatservice.ChatService_Service service = new com.bac.chatservice.ChatService_Service();
        com.bac.chatservice.ChatService port = service.getChatServicePort();
        return port.createMessage(message, creatorID, threadID);
    }

    /**
     * chatsInThread() method gets a list
     * of all the ChatMessages in the server
     * @return a list of ChatMessage objects
     */
    private static java.util.List<com.bac.chatservice.ChatMessage> chatsInThread() {
        com.bac.chatservice.ChatService_Service service = new com.bac.chatservice.ChatService_Service();
        com.bac.chatservice.ChatService port = service.getChatServicePort();
        return port.chatsInThread();
    }

    /**
     * updateChatThread() method updates the
     * server with the new data
     * @param threadID Thread ID
     * @param creatorID User's ID
     * @param threadTitle Thread Title
     * as parameters and 
     * @return a server message as String
     */
    private static String updateChatThread(java.lang.Integer threadID, java.lang.String creatorID, java.lang.String threadTitle) {
        com.bac.chatservice.ChatService_Service service = new com.bac.chatservice.ChatService_Service();
        com.bac.chatservice.ChatService port = service.getChatServicePort();
        return port.updateChatThread(threadID, creatorID, threadTitle);
    }
}
