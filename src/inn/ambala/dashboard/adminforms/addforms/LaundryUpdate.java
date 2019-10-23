/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn.ambala.dashboard.adminforms.addforms;

import inn.ambala.admin.model.LaundryModel;
import inn.ambala.dashboard.adminforms.Laundry;
import inn.ambala.databaseconnection.admin.LaundryCrud;
import inn.ambala.resources.Resources;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author REZA
 */
public class LaundryUpdate extends javax.swing.JFrame {

    LaundryModel laundryModel = null;
    /**
     * Creates new form LaundryUpdate
     */
    public LaundryUpdate() {
        initComponents();
        initExtraComponents();
    }
    
    public LaundryUpdate(LaundryModel laundryModel) {
        initComponents();
        initExtraComponents();
        this.laundryModel = laundryModel;
        laundryCodeTF.setText("" + laundryModel.getLaundryCode());
        laundryTypeTF.setText(laundryModel.getLaundryType());
        clothTypeTF.setText(laundryModel.getClothType());
        priceTF.setText(""+ laundryModel.getPrice());
    }

    private void initExtraComponents() {
        ImageIcon key = new ImageIcon(Resources.getPath() + "icon-01.jpg");
        Image image = key.getImage();
        setIconImage(image);
        setTitle("Ambala Inn");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void updateButtonPressed() {

        if (laundryCodeTF.getText().equals("") || laundryTypeTF.getText().equals("") || clothTypeTF.getText().equals("") || priceTF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill up this form carefully");
        } else {
            int result = 0;
            int oldLaundryCode = laundryModel.getLaundryCode();

            int laundryId = 0;
            try{
                int laundryCode = Integer.valueOf(laundryCodeTF.getText());
                String laundryType = laundryTypeTF.getText();
                String clothType = clothTypeTF.getText();
                int price = Integer.valueOf(priceTF.getText());

                LaundryModel newLaundry = new LaundryModel(laundryId, laundryCode, laundryType, clothType, price);
                result = LaundryCrud.updateLaundry(newLaundry, oldLaundryCode);

                Laundry.refreshTable();
                dispose();
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Not Successfully Updated");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Digits Only on Laundry Code and Price");
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

        laundryLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        laundryCodeTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clothTypeTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        laundryTypeTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        laundryLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        laundryLabel.setText("Laundry");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Laundry Code :");

        laundryCodeTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        laundryCodeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laundryCodeTFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Cloth Type :");

        clothTypeTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        clothTypeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothTypeTFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Price :");

        priceTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(59, 180, 74));
        updateButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Laundry Type :");

        laundryTypeTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        laundryTypeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laundryTypeTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clothTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(laundryLabel)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 19, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(laundryCodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(laundryTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(laundryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laundryCodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laundryTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clothTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateButtonPressed();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed
        updateButtonPressed();
    }//GEN-LAST:event_priceTFActionPerformed

    private void clothTypeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothTypeTFActionPerformed
        updateButtonPressed();
    }//GEN-LAST:event_clothTypeTFActionPerformed

    private void laundryTypeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laundryTypeTFActionPerformed
        updateButtonPressed();
    }//GEN-LAST:event_laundryTypeTFActionPerformed

    private void laundryCodeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laundryCodeTFActionPerformed
        updateButtonPressed();
    }//GEN-LAST:event_laundryCodeTFActionPerformed

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
            java.util.logging.Logger.getLogger(LaundryUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaundryUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaundryUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaundryUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaundryUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clothTypeTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField laundryCodeTF;
    private javax.swing.JLabel laundryLabel;
    private javax.swing.JTextField laundryTypeTF;
    private javax.swing.JTextField priceTF;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
