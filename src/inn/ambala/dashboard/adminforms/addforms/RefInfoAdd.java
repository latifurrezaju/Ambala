/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn.ambala.dashboard.adminforms.addforms;

import inn.ambala.admin.model.ReferenceInfoModel;
import inn.ambala.admin.model.RoomDetailsModel;
import inn.ambala.dashboard.adminforms.RefInfo;
import inn.ambala.dashboard.adminforms.RoomDetails;
import inn.ambala.databaseconnection.admin.ReferenceInfoCrud;
import inn.ambala.databaseconnection.admin.RoomDetailsCrud;
import inn.ambala.resources.Resources;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author REZA
 */
public class RefInfoAdd extends javax.swing.JFrame {

    /**
     * Creates new form RefInfoAdd
     */
    public RefInfoAdd() {
        initComponents();
        initExtraComponents();
    }
    
    private void initExtraComponents(){
        ImageIcon key = new ImageIcon(Resources.getPath() + "icon-01.jpg");
        Image image = key.getImage();
        setIconImage(image);
        setTitle("Ambala Inn");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private void createButtonPressed() {
        if (codeTF.getText().equals("") || nameTF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill up this form carefully");
        } else {
            int referenceId = 0; // database auto increment will handle it
            try{
                int referenceCode = Integer.valueOf(codeTF.getText());
                String name = nameTF.getText();
                String address = addressTF.getText();
                String email = emailTF.getText();
                String phone = phoneTF.getText();
                String mobile = mobileTF.getText();

                ReferenceInfoCrud.addReference(new ReferenceInfoModel(referenceId, referenceCode, name, address, email, phone, mobile));
                RefInfo.refreshTable();
                dispose();

                JOptionPane.showMessageDialog(null, "Reference Added Successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Digits Only on Code");
            }
        }

    }

    private void createAnotherButtonPressed() {
        if (codeTF.getText().equals("") || nameTF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill up this form carefully");
        } else {
            int referenceId = 0; // database auto increment will handle it
            try{
                int referenceCode = Integer.valueOf(codeTF.getText());
                String name = nameTF.getText();
                String address = addressTF.getText();
                String email = emailTF.getText();
                String phone = phoneTF.getText();
                String mobile = mobileTF.getText();

                ReferenceInfoCrud.addReference(new ReferenceInfoModel(referenceId, referenceCode, name, address, email, phone, mobile));

                codeTF.setText("");
                nameTF.setText("");
                addressTF.setText("");
                emailTF.setText("");
                phoneTF.setText("");
                mobileTF.setText("");

                RefInfo.refreshTable();

                JOptionPane.showMessageDialog(null, "Reference Added Successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Digits Only on Code");
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refInfoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codeTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        mobileTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        createAnotherButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        refInfoLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        refInfoLabel.setText("Reference Information");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Phone :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Mobile :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Email :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Address :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Name :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Code :");

        codeTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        codeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTFActionPerformed(evt);
            }
        });

        nameTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        addressTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        addressTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTFActionPerformed(evt);
            }
        });

        emailTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        mobileTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        mobileTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileTFActionPerformed(evt);
            }
        });

        phoneTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        phoneTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTFActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(59, 180, 74));
        createButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        createAnotherButton.setBackground(new java.awt.Color(236, 0, 138));
        createAnotherButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        createAnotherButton.setForeground(new java.awt.Color(255, 255, 255));
        createAnotherButton.setText("Create & Another");
        createAnotherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAnotherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createAnotherButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(mobileTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(codeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refInfoLabel)
                            .addGap(91, 91, 91))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAnotherButton)
                    .addComponent(createButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTFActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_codeTFActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_nameTFActionPerformed

    private void addressTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTFActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_addressTFActionPerformed

    private void createAnotherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAnotherButtonActionPerformed
        createAnotherButtonPressed();
    }//GEN-LAST:event_createAnotherButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_createButtonActionPerformed

    private void phoneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTFActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_phoneTFActionPerformed

    private void mobileTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileTFActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_mobileTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_emailTFActionPerformed

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
            java.util.logging.Logger.getLogger(RefInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RefInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RefInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RefInfoAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RefInfoAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField codeTF;
    private javax.swing.JButton createAnotherButton;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mobileTF;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JLabel refInfoLabel;
    // End of variables declaration//GEN-END:variables
}
