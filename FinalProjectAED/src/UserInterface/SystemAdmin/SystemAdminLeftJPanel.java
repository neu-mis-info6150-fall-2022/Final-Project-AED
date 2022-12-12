/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdmin;

import Application.Utils.AppSystem;
import UserInterface.Main.LoginView;
import UserInterface.SystemAdmin.NewCompaniesAddJPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class SystemAdminLeftJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminJPanel
     */
    public SystemAdminLeftJPanel() {
         setBounds(0, 0, 810, 700);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CompanyjButton = new javax.swing.JButton();
        LogoutjButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(810, 700));

        jButton1.setText("Admin Listing");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome");

        jLabel2.setText("Name");

        CompanyjButton.setText("Companies Listing");
        CompanyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyjButtonActionPerformed(evt);
            }
        });

        LogoutjButton.setText("Logout");
        LogoutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CompanyjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(630, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(CompanyjButton)
                .addGap(30, 30, 30)
                .addComponent(LogoutjButton)
                .addContainerGap(478, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CompanyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyjButtonActionPerformed
        // TODO add your handling code here:
        
        AppSystem.workAreaPanel.setRightPanel(new NewCompaniesAddJPanel());
        
    }//GEN-LAST:event_CompanyjButtonActionPerformed
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AppSystem.workAreaPanel.setRightPanel(new SystemAdminMgmtJPanel());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogoutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutjButtonActionPerformed
        // TODO add your handling code here:
        
        SwingUtilities.invokeLater(() -> AppSystem.appViewObj.setView(new LoginView())); 
        
    }//GEN-LAST:event_LogoutjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CompanyjButton;
    private javax.swing.JButton LogoutjButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}