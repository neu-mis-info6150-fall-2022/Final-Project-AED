/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ManagementCompany;

import Application.Utils.AppSystem;
import Application.Utils.Helper;
import Business.ContractApplication.ContractApplication;
import UserInterface.Main.WorkAreaContPanel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import java.io.File;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author ankitlall
 */
public class ManagementCompanyContractForm extends javax.swing.JPanel implements ItemListener {
    
    public WorkAreaContPanel workAreaPanel;
    
    private String newFilePath;
    private ArrayList<String> filePaths;
    private ArrayList<String> features;
    private ArrayList<String> utilities;
    private String city;
    private String state;
    private String community;
    
    private Boolean isValid;

    /**
     * Creates new form ManagementCompanyContractForm
     */
    public ManagementCompanyContractForm(WorkAreaContPanel workAreaPanel) {
        this.workAreaPanel = workAreaPanel;
        filePaths = new ArrayList<String>();
        features = new ArrayList<String>();
        utilities= new ArrayList<String>();
        setBounds(0, 0, 810, 750);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        aptNumField = new javax.swing.JTextField();
        propNameField = new javax.swing.JTextField();
        streetField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        addImage = new javax.swing.JButton();
        typeField = new javax.swing.JTextField();
        roomCountField = new javax.swing.JTextField();
        bathCountField = new javax.swing.JTextField();
        sqftField = new javax.swing.JTextField();
        featuresTextField = new javax.swing.JTextField();
        addFeature = new javax.swing.JButton();
        utilitiesTextField = new javax.swing.JTextField();
        addUtilities = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        fileName = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        commField = new javax.swing.JTextField();
        aptNumErr = new javax.swing.JLabel();
        propNumErr = new javax.swing.JLabel();
        streetErr = new javax.swing.JLabel();
        commErr = new javax.swing.JLabel();
        cityErr = new javax.swing.JLabel();
        stateErr = new javax.swing.JLabel();
        imageErr = new javax.swing.JLabel();
        aptTypeErr = new javax.swing.JLabel();
        roomCountErr = new javax.swing.JLabel();
        bathCountErr = new javax.swing.JLabel();
        sqftErr = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(810, 700));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Contract Form");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1040, 700));
        jScrollPane1.setSize(new java.awt.Dimension(1040, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Apartment Number:");

        jLabel3.setText("Property Name:");

        jLabel4.setText("Date:");

        jLabel5.setText("Address:");

        jLabel6.setText("Street:");

        jLabel7.setText("Community:");

        jLabel8.setText("City:");

        jLabel9.setText("State:");

        jLabel10.setText("Apt Type:");

        jLabel11.setText("Property images:");

        jLabel12.setText("Room Count:");

        jLabel13.setText("Bathroom Count:");

        jLabel14.setText("Features:");

        jLabel15.setText("Sqft:");

        jLabel16.setText("Availability:");

        jLabel17.setText("Utilities Included:");

        aptNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aptNumFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Choose File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addImage.setText("Add");
        addImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageActionPerformed(evt);
            }
        });

        addFeature.setText("Add");
        addFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFeatureActionPerformed(evt);
            }
        });

        addUtilities.setText("Add");
        addUtilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUtilitiesActionPerformed(evt);
            }
        });

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        fileName.setText("No File Selected");

        commField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commFieldActionPerformed(evt);
            }
        });

        sqftErr.setText("jLabel18");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addFeature))
                            .addComponent(bathCountField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomCountField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(fileName, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(addImage)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageErr)
                            .addComponent(aptTypeErr)
                            .addComponent(roomCountErr)
                            .addComponent(bathCountErr))
                        .addGap(215, 215, 215))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(utilitiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(addUtilities))
                            .addComponent(featuresTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityField)
                            .addComponent(commField)
                            .addComponent(streetField)
                            .addComponent(propNameField)
                            .addComponent(aptNumField)
                            .addComponent(stateField)
                            .addComponent(sqftField))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aptNumErr, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(propNumErr)
                            .addComponent(streetErr)
                            .addComponent(commErr)
                            .addComponent(cityErr)
                            .addComponent(stateErr)
                            .addComponent(sqftErr))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aptNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aptNumErr))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(propNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(propNumErr))))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streetErr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(commField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commErr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityErr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(stateErr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton1)
                    .addComponent(addImage)
                    .addComponent(fileName)
                    .addComponent(imageErr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aptTypeErr)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roomCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roomCountErr)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(bathCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bathCountErr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(featuresTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addFeature)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(sqftField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sqftErr))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(utilitiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addUtilities))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(saveButton))
                .addGap(87, 87, 87))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        SwingUtilities.invokeLater(() -> AppSystem.workAreaPanel.setRightPanel(new ApplicationsListingMgtComp()));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
//        System.out.println(AppSystem.contractApplicationCatalog);
        int aptNUm = Integer.parseInt(aptNumField.getText());
        String propName = propNameField.getText();
        String street = streetField.getText();
        String city = cityField.getText();
        String community = commField.getText();
        String state = stateField.getText();
        String aptType = typeField.getText();
        int roomCount = Integer.parseInt(roomCountField.getText());
        int bathCount = Integer.parseInt(bathCountField.getText());
        Double sqft = Double.parseDouble(sqftField.getText());
        
        Date conDate = new Date();
        Date availability = new Date();
        
        ContractApplication contract = new ContractApplication(
                aptNUm, 
                propName, 
                conDate, 
                street, 
                community, 
                city, 
                state, 
                aptType, 
                roomCount, 
                bathCount,
                features,
                sqft,
                availability,
                utilities, 
                filePaths,
                "management company",
                0,
                0,
                0,
                "",
                "",
                0
        );
        
        AppSystem.contractApplicationCatalog.newContract(contract);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File imageFile = fileChooser.getSelectedFile();
        newFilePath = imageFile.getAbsolutePath();
        fileName.setText(imageFile.getName());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageActionPerformed
        // TODO add your handling code here:
        String filePath = Helper.copyFile(newFilePath);
        
        if(filePaths.contains(filePath)) {
            return;
        }
        
        filePaths.add(filePath);
        fileName.setText("");
    }//GEN-LAST:event_addImageActionPerformed

    private void addFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFeatureActionPerformed
        // TODO add your handling code here:
        if(filePaths.contains(featuresTextField.getText())) {
            return;
        }
        
        features.add(featuresTextField.getText());
        featuresTextField.setText("");
    }//GEN-LAST:event_addFeatureActionPerformed

    private void addUtilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUtilitiesActionPerformed
        // TODO add your handling code here:
        if(utilities.contains(utilitiesTextField.getText())) {
            return;
        }
        
        utilities.add(utilitiesTextField.getText());
        utilitiesTextField.setText("");
    }//GEN-LAST:event_addUtilitiesActionPerformed

    private void commFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commFieldActionPerformed

    private void aptNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aptNumFieldActionPerformed
        // TODO add your handling code here:
        System.out.println("hello");
    }//GEN-LAST:event_aptNumFieldActionPerformed

    	/**
	 * Start date comboboxes selection event
	 */
    @Override
    public void itemStateChanged(ItemEvent event) {
    	JComboBox combobox = (JComboBox) event.getSource();
    	
        if (event.getStateChange() == ItemEvent.SELECTED) {
           switch(combobox.getName()) {
                 case "monthSelect":
//                         updateDaysList();
                    break;
                 case "yearSelect":
//                         if((int) years.getSelectedItem() == LocalDate.now().getYear()) {    	  			
//                                 DefaultComboBoxModel<String> cmbModel = new DefaultComboBoxModel<>(Helper.getCurrentMonthsList());
//                                 months.setModel(cmbModel);
//                         }else {
//                                 DefaultComboBoxModel<String> cmbModel = new DefaultComboBoxModel<>(Helper.monthsList);
//                                 months.setModel(cmbModel);
//                         }
//                         updateDaysList();
                    break;
           }
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFeature;
    private javax.swing.JButton addImage;
    private javax.swing.JButton addUtilities;
    private javax.swing.JLabel aptNumErr;
    private javax.swing.JTextField aptNumField;
    private javax.swing.JLabel aptTypeErr;
    private javax.swing.JLabel bathCountErr;
    private javax.swing.JTextField bathCountField;
    private javax.swing.JLabel cityErr;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel commErr;
    private javax.swing.JTextField commField;
    private javax.swing.JTextField featuresTextField;
    private javax.swing.JLabel fileName;
    private javax.swing.JLabel imageErr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField propNameField;
    private javax.swing.JLabel propNumErr;
    private javax.swing.JLabel roomCountErr;
    private javax.swing.JTextField roomCountField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel sqftErr;
    private javax.swing.JTextField sqftField;
    private javax.swing.JLabel stateErr;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel streetErr;
    private javax.swing.JTextField streetField;
    private javax.swing.JTextField typeField;
    private javax.swing.JTextField utilitiesTextField;
    // End of variables declaration//GEN-END:variables
}
