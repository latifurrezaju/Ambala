/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn.ambala.dashboard.adminforms.addforms;

import inn.ambala.admin.model.RoomDetailsModel;
import inn.ambala.dashboard.AdminDashboard;
import inn.ambala.dashboard.adminforms.RoomDetails;
import inn.ambala.databaseconnection.admin.RoomDetailsCrud;
import inn.ambala.resources.Resources;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author REZA
 */
public class RoomDetailsAdd extends javax.swing.JFrame {

    /**
     * Creates new form RoomDetailsAdd
     */
    public RoomDetailsAdd() {
        initComponents();
        initExtraComponents();
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

    private void createButtonPressed() {
        if (roomTypeTF.getText().equals("") || airconditionTF.getText().equals("") || roomNoTF.getText().equals("") || floorNoTF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill up this form carefully");
        } else {
            int roomId = 0; // database auto increment will handle it
            try{
                int roomNo = Integer.valueOf(roomNoTF.getText());
                int floorNo = Integer.valueOf(floorNoTF.getText());
                String roomType = roomTypeTF.getText();
                String aircondition = airconditionTF.getText();
                String status = "CheckedOut";
                RoomDetailsCrud.addRoom(new RoomDetailsModel(roomId, roomNo, floorNo, roomType, aircondition, status));
                RoomDetails.refreshTable();
                dispose();

                JOptionPane.showMessageDialog(null, "Room Added Successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Digits Only Room Number");
            }
        }

    }

    private void createAnotherButtonPressed() {
        if (roomTypeTF.getText().equals("") || airconditionTF.getText().equals("") || roomNoTF.getText().equals("") || floorNoTF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill up this form carefully");
        } else {
            int roomId = 0; // database auto increment will handle it
            try{
                int roomNo = Integer.valueOf(roomNoTF.getText());
                int floorNo = Integer.valueOf(floorNoTF.getText());
                String roomType = roomTypeTF.getText();
                String aircondition = airconditionTF.getText();
                String status = "CheckedOut";
                RoomDetailsCrud.addRoom(new RoomDetailsModel(roomId, roomNo, floorNo, roomType, aircondition,status));

                roomNoTF.setText("");
                floorNoTF.setText("");
                roomTypeTF.setText("");
                airconditionTF.setText("");

                RoomDetails.refreshTable();

                JOptionPane.showMessageDialog(null, "Room Added Successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Digits Only Room Number");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roomTypeTF = new javax.swing.JTextField();
        roomNoTF = new javax.swing.JTextField();
        airconditionTF = new javax.swing.JTextField();
        floorNoTF = new javax.swing.JTextField();
        createAnotherButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Room Details");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Aircondition :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Room Type :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Floor No. :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Room No. :");

        roomTypeTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        roomTypeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeTFActionPerformed(evt);
            }
        });

        roomNoTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        roomNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNoTFActionPerformed(evt);
            }
        });

        airconditionTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        airconditionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airconditionTFActionPerformed(evt);
            }
        });

        floorNoTF.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        floorNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorNoTFActionPerformed(evt);
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

        createButton.setBackground(new java.awt.Color(59, 180, 74));
        createButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roomNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(airconditionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(floorNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createAnotherButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(floorNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airconditionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAnotherButton)
                    .addComponent(createButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAnotherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAnotherButtonActionPerformed
        createAnotherButtonPressed();
    }//GEN-LAST:event_createAnotherButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_createButtonActionPerformed

    private void airconditionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airconditionTFActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_airconditionTFActionPerformed

    private void roomTypeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeTFActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_roomTypeTFActionPerformed

    private void floorNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorNoTFActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_floorNoTFActionPerformed

    private void roomNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNoTFActionPerformed
        createButtonPressed();
    }//GEN-LAST:event_roomNoTFActionPerformed

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
            java.util.logging.Logger.getLogger(RoomDetailsAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomDetailsAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomDetailsAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomDetailsAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomDetailsAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airconditionTF;
    private javax.swing.JButton createAnotherButton;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField floorNoTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField roomNoTF;
    private javax.swing.JTextField roomTypeTF;
    // End of variables declaration//GEN-END:variables
}
