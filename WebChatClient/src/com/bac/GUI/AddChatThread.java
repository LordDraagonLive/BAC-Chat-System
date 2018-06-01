
package com.bac.GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Buddhi Adhikari 16280809
 */
public class AddChatThread extends javax.swing.JFrame {

    //the loggin ID of the user who is currently logged
    String loggedUser;

    /**
     * Creates new form AddChatThread
     */
    public AddChatThread() {
        initComponents();
        //not allowing user to change sreen size
        setResizable(false);

    }

    /**
     * Constructor which takes 
     * @param loggedUser ID of the user who is logged
     * as a parameter
     */
    AddChatThread(String loggedUser) {
        initComponents();
        this.loggedUser = loggedUser;
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        threadTitleTxt = new javax.swing.JTextField();
        creatorIdTxt = new javax.swing.JTextField();
        createThreadBtn = new javax.swing.JButton();
        goBackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Chat Threads");

        jLabel2.setText("Thread Title");

        jLabel3.setText("Created by");

        threadTitleTxt.setText("Enter Name...");

        createThreadBtn.setText("Create Thread");
        createThreadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createThreadBtnActionPerformed(evt);
            }
        });

        goBackBtn.setText("Go Back");
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(creatorIdTxt)
                            .addComponent(threadTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(createThreadBtn)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(threadTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(creatorIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createThreadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * function: will create a new thread in the database and will update 
     * the server and the clients
     * Server methods used: findDuplicateThreads(), createThread()
     */
    private void createThreadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createThreadBtnActionPerformed
        
        String ThreadTitle = threadTitleTxt.getText();
        String creatorId = creatorIdTxt.getText();
        
        if(ThreadTitle.equals("Enter Name...")||creatorId.equals("Your Login ID...")||ThreadTitle.equals("")||creatorId.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please don't leave the fields blank");
        }else{
            
            String duplicateMsg = findDuplicateThreads(ThreadTitle);
            if(duplicateMsg.contains("Passed")){
                
                String resMsg =createThread(ThreadTitle,creatorId);
                JOptionPane.showMessageDialog(rootPane, resMsg);

                if(resMsg.contains("success")){
                    new ChatsList(loggedUser).setVisible(true);
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, duplicateMsg);
                
            }
        }     
         
    }//GEN-LAST:event_createThreadBtnActionPerformed

    /**
     * 
     * Will allow the user to close the current window
     * and move to the chat list page
     */
    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        
        new ChatsList(loggedUser).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_goBackBtnActionPerformed

    /**
     * 
     * Updates the creator ID text field with the current user's login ID
     * 
     */
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       
        creatorIdTxt.setText(loggedUser);
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the cmd line args
     * here lies the main method
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
            java.util.logging.Logger.getLogger(AddChatThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddChatThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddChatThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddChatThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddChatThread().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createThreadBtn;
    private javax.swing.JTextField creatorIdTxt;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField threadTitleTxt;
    // End of variables declaration//GEN-END:variables

    /**
     * The createThread() method from the server
     * which takes
     * @param threadTitle
     * @param creatorId
     * as parameters and 
     * @return a string message
     */
    private static String createThread(java.lang.String threadTitle, java.lang.String creatorId) {
        com.bac.chatservice.ChatService_Service service = new com.bac.chatservice.ChatService_Service();
        com.bac.chatservice.ChatService port = service.getChatServicePort();
        return port.createThread(threadTitle, creatorId);
    }

    /**
     * findDuplicateThreads() method from the server
     * @param threadTitle Title of the thread
     * as a parameter and
     * @return String message
     */
    private static String findDuplicateThreads(java.lang.String threadTitle) {
        com.bac.chatservice.ChatService_Service service = new com.bac.chatservice.ChatService_Service();
        com.bac.chatservice.ChatService port = service.getChatServicePort();
        return port.findDuplicateThreads(threadTitle);
    }
}
