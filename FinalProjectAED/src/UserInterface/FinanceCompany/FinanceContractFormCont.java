/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.FinanceCompany;

import UserInterface.UtilityCompanies.UtilityCompFormDetails;
import UserInterface.UtilityCompanies.UtilityContractForm;
import UserInterface.ManagementCompany.MgtCompFormDetails;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ankitlall
 */
public class FinanceContractFormCont extends javax.swing.JPanel {

    int appId;
    
    /**
     * Creates new form FinanceContractFormCont
     */
    public FinanceContractFormCont(int appId) {
        this.appId=appId;
        initComponents();
        populateCombobox();
        contentPanel.add(new FinanceCompForm(appId));
    }
    
    private void populateCombobox() {
        DefaultComboBoxModel<String> cmbModel = new DefaultComboBoxModel<>(getDropdownValues());
        formType.setModel(cmbModel);
        formType.setSelectedItem("Finance Company Form");
    }
    
    private String[] getDropdownValues() {
        return new String[] {"Management Company Form", "Electricity Company Form", "Water Company Form", "Gas Company Form", "Finance Company Form"};
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formType = new javax.swing.JComboBox<>();
        contentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBounds(new java.awt.Rectangle(0, 0, 810, 700));

        formType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        formType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contract Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(formType, 0, 135, Short.MAX_VALUE)
                .addGap(628, 628, 628))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(formType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formTypeActionPerformed
        // TODO add your handling code here:
        String selected = String.valueOf(formType.getSelectedItem());

        contentPanel.removeAll();

        switch(selected) {
            case "Management Company Form":
                contentPanel.add(new MgtCompFormDetails(appId));
                break;
            case "Electricity Company Form":
                contentPanel.add(new UtilityCompFormDetails(appId, "electricity"));
                break;
            case "Water Company Form":
                contentPanel.add(new UtilityCompFormDetails(appId, "water"));
                break;
            case "Gas Company Form":
                contentPanel.add(new UtilityCompFormDetails(appId, "gas"));
                break;
            case "Finance Company Form":
                contentPanel.add(new FinanceCompForm(appId));
                break;
        }

        contentPanel.revalidate();
        contentPanel.repaint();
    }//GEN-LAST:event_formTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JComboBox<String> formType;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}