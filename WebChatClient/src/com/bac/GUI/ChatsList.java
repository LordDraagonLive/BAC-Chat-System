
package com.bac.GUI;

import com.bac.chatservice.ChatThread;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Buddhi Adhikari 16280809
 */
public class ChatsList extends javax.swing.JFrame {
    //the loggin ID of the user who is currently logged
    String loggedUser;
    //List MODEL
    DefaultListModel<String> dm;
    
    /**
     * Creates new form ChatsList
     */
    public ChatsList() {
        initComponents();
        setResizable(false);

    }

    /**
     * 
     * @param username takes the username of the
     * logged user
     */
    public ChatsList(String username) {
        loggedUser=username;
        initComponents();
        setResizable(false);
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        chatList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        newChatBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jScrollPane1.setViewportView(chatList);

        jLabel1.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BAC Select Chat");

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        newChatBtn.setText("New Chat");
        newChatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newChatBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Last Edited");

        jLabel3.setText("Title");

        jLabel4.setText("By");

        logoutBtn.setText("Log Out");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(67, 67, 67)
                            .addComponent(jLabel4)
                            .addGap(29, 29, 29)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(newChatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(newChatBtn)
                    .addComponent(logoutBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Creates a new instance of
     * the AddChatThread page and 
     * dispose the current page
     */
    private void newChatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newChatBtnActionPerformed
        
            //create new thread page
            new AddChatThread(loggedUser).setVisible(true);
            //closes the current window
            this.dispose();
            
    }//GEN-LAST:event_newChatBtnActionPerformed

    /**
     * 
     * Gets the selected value from
     * the Jlist and pass it to a new
     * instance of EditThread page 
     * and closing the current page
     */
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        //getting the selected item from the list of threads
        String selectedListItem = chatList.getSelectedValue();
        
        //new chatthread list from the server
        List<ChatThread> chatThreadListVal=chatThreadList();
        //looping each chat thread
        for(ChatThread cT:chatThreadListVal){
            //get chat thread if equals to the selectedListItem
            if(selectedListItem.contains(cT.getThreadTitle())){
                JOptionPane.showMessageDialog(rootPane, "Editing "+cT.getThreadTitle()+" Thread");
                
                //create new thread page
                new EditThread(loggedUser,cT.getThreadId(),cT.getThreadTitle()).setVisible(true);
                //closes the current window
                this.dispose();
                //break the loop if not it will interfere with the result
                break;
            }
        }
     
    }//GEN-LAST:event_editBtnActionPerformed

    /**
     * refreshes the list every time the window is opened
     * 
     */
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        addToList();
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * Logs out current user 
     * and opens a new instance 
     * of the Login page
     * @param evt 
     */
    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
       //open login page
        new Login().setVisible(true);
        //close the current window
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    /**
     * Here lies the main method
     * @param args the cmd line args
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
            java.util.logging.Logger.getLogger(ChatsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatsList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> chatList;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton newChatBtn;
    // End of variables declaration//GEN-END:variables


    /**
     * Function: adds the chat thread list items from the db to
     * the jList component and formats it for user friendly UI
     */
    private void addToList(){
        //initializing the DefaultListModel var
        dm = new DefaultListModel<>();
        List<ChatThread> chatThreadListVal=chatThreadList();
        
        for(ChatThread cT:chatThreadListVal){
            StringBuilder builder = new StringBuilder();
            
            builder.append("<html><pre>");
            //adding a paddding and formating the string
            builder.append(String.format("%-15s %-20s %s", cT.getThreadTitle(), timeFormaterChat(cT.getLasteditTime()), cT.getCreatorId()));
            builder.append("</pre></html>");

            //adding the string builder to the DefaultListModel var
            dm.addElement(builder.toString());
            
       }
        // adds our DefaultListModel to the Jlist instance 
        chatList.setModel(dm);
        //this will select a item from the list by default
        chatList.setSelectedIndex(0);
        
    }

    /**
     * chatThreadList() method from the server
     * @return A list of ChatThreads
     * function: gets all the chat threads from the server
     */
    private static java.util.List<com.bac.chatservice.ChatThread> chatThreadList() {
        com.bac.chatservice.ChatService_Service service = new com.bac.chatservice.ChatService_Service();
        com.bac.chatservice.ChatService port = service.getChatServicePort();
        return port.chatThreadList();
    }
    
    /**
     * getTime() method
     * @param getTime as XMLGregorianCalendar
     * @return a formatted string of the given time
     */
    private String timeFormaterChat(XMLGregorianCalendar getTime){
        
        return getTime.getDay()+"/"+getTime.getMonth()+"/"+getTime.getYear()+" "+getTime.getHour()+":"+getTime.getMinute();
    }
   
}