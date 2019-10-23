/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inn.ambala.dashboard.adminforms;

import static inn.ambala.dashboard.adminforms.RoomDetails.refreshTable;
import inn.ambala.databaseconnection.admin.RoomDetailsCrud;
import inn.ambala.databaseconnection.users.UserAccessCrud;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author REZA
 */
public class UserAccess extends javax.swing.JPanel {

    private static DefaultTableModel model = null;
    /**
     * Creates new form UserAccess
     */
    public UserAccess() {
        initComponents();
        initExtraComponents();
        dataTable.setRowHeight(dataTable.getRowHeight()*3);
        dataTable.setDefaultRenderer(String.class, new TableCellRenderer() {
            
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    private void initExtraComponents() {
        model = (DefaultTableModel) dataTable.getModel();
        refreshTable();
    }

    public void refreshTable() {
        new UserAccessCrud(model).showAllUsers();
        totalLabel.setText("Total Users : " + model.getRowCount());
    }
    
    private void grantedButtonPressed(){
        int result = 0;
        int rowNo = dataTable.getSelectedRow();
        if (rowNo != -1) {
            String userName = dataTable.getModel().getValueAt(rowNo, 0).toString();
            int option = JOptionPane.showConfirmDialog(null, "Grant this User?", "Permission", JOptionPane.YES_NO_OPTION);
            if (option == 0) {
                String permission = "granted";
                result = UserAccessCrud.permitUser(userName, permission);

                refreshTable();
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Granted Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Not Successfully Granted");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "For Granted Select Any Row");
        }

        refreshTable();
    }
    
    private void deniedButtonPressed(){
        int result = 0;
        int rowNo = dataTable.getSelectedRow();
        if (rowNo != -1) {
            String userName = dataTable.getModel().getValueAt(rowNo, 0).toString();
            int option = JOptionPane.showConfirmDialog(null, "Denied User?", "Denied", JOptionPane.YES_NO_OPTION);
            if (option == 0) {
                String permission = "denied";
                result = UserAccessCrud.permitUser(userName, permission);

                refreshTable();
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Denied Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Not Successfully Denied");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "For Denied Select Any Row");
        }

        refreshTable();
    }
    
    private void removeButtonPressed(){
        int result = 0;
        int rowNo = dataTable.getSelectedRow();
        if (rowNo != -1) {
            String userName = dataTable.getModel().getValueAt(rowNo, 0).toString();
            int option = JOptionPane.showConfirmDialog(null, "Do You Really Want to Remove?", "Delete", JOptionPane.YES_NO_OPTION);
            if (option == 0) {
                result = UserAccessCrud.deleteUser(userName);

                refreshTable();
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Removed Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Not Successfully Removed");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "For Remove Select Any Row");
        }

        refreshTable();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        grantedButton = new javax.swing.JButton();
        deniedButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        userAccessLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Email", "Department", "Permission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(dataTable);

        grantedButton.setBackground(new java.awt.Color(59, 180, 74));
        grantedButton.setForeground(new java.awt.Color(255, 255, 255));
        grantedButton.setText("Granted");
        grantedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grantedButtonActionPerformed(evt);
            }
        });

        deniedButton.setBackground(new java.awt.Color(236, 0, 138));
        deniedButton.setForeground(new java.awt.Color(255, 255, 255));
        deniedButton.setText("Denied");
        deniedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deniedButtonActionPerformed(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(255, 0, 0));
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        userAccessLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        userAccessLabel.setText("User Access");

        totalLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        totalLabel.setText("Total User : 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(removeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deniedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grantedButton))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(userAccessLabel)
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(totalLabel)
                        .addGap(313, 313, 313))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(userAccessLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grantedButton)
                    .addComponent(deniedButton)
                    .addComponent(removeButton)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void grantedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grantedButtonActionPerformed
        grantedButtonPressed();
    }//GEN-LAST:event_grantedButtonActionPerformed

    private void deniedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deniedButtonActionPerformed
        deniedButtonPressed();
    }//GEN-LAST:event_deniedButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        removeButtonPressed();
    }//GEN-LAST:event_removeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JButton deniedButton;
    private javax.swing.JButton grantedButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel userAccessLabel;
    // End of variables declaration//GEN-END:variables
}