/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding;

import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateSubject extends javax.swing.JFrame {

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static ResultSet rs1;
    String uid = "u1";
    String sid;
    String tid;

    public UpdateSubject() {
        initComponents();
    }

    public UpdateSubject(String uid, String sid) {
        initComponents();
        this.uid = uid;
        this.sid = sid;
        dbConnection();
        //setCombo();
        UpdateDetails();
    }

    public static void dbConnection() {
        try {
            con = ConnectionManager.getConnection();
            stmt = con.createStatement();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error!!" + e);
        }
    }

    public void setCombo() {
        String selsql = "Select Teacher_ID from teacher_details";
        try {
            rs = stmt.executeQuery(selsql);
            
            while (rs.next()) {
                cmbteacherid.addItem(rs.getString("Teacher_ID"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void UpdateDetails() {

        try {
            String strsql3;

            strsql3 = "Select *  from subject where Subject_ID='" + sid + "'";

            rs = stmt.executeQuery(strsql3);

            rs.next();
            txtsubid.setText(rs.getString("Subject_ID"));
            txtsubname.setText(rs.getString("Subject_Name"));
            txtgrade.setText(rs.getString("Grade"));
            cmbteacherid.addItem(rs.getString("Teacher_ID"));
            setCombo();

        } catch (SQLException ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtupdateid = new javax.swing.JTextField();
        txtlogid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtsubid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtsubname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtgrade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbteacherid = new javax.swing.JComboBox();
        txtteachername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Update Subject");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save-icon.png"))); // NOI18N
        btnsave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnsave.setBorderPainted(false);
        btnsave.setContentAreaFilled(false);
        btnsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 72, 60, 60));

        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pan-icon.png"))); // NOI18N
        btnclear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnclear.setBorderPainted(false);
        btnclear.setContentAreaFilled(false);
        btnclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 150, 60, 60));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setText("Back");
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Update   :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 41, -1, -1));

        txtupdateid.setEditable(false);
        txtupdateid.setBackground(new java.awt.Color(255, 255, 255));
        txtupdateid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtupdateid.setForeground(new java.awt.Color(0, 0, 255));
        txtupdateid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtupdateid.setBorder(null);
        txtupdateid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateidActionPerformed(evt);
            }
        });
        getContentPane().add(txtupdateid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 50, 25));

        txtlogid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtlogid.setText("U1");
        getContentPane().add(txtlogid, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 11, 40, 20));

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("Subject ID       :");

        txtsubid.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Subject Name :");

        txtsubname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Grade              :");

        txtgrade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setText("Teacher ID      :");

        cmbteacherid.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        cmbteacherid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbteacheridActionPerformed(evt);
            }
        });
        cmbteacherid.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbteacheridPropertyChange(evt);
            }
        });

        txtteachername.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbteacherid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtteachername, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtgrade))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsubid, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(txtsubname))))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtsubid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsubname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbteacherid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtteachername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MTAyNHg3Njg,14811486_14707124.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            if (txtsubid.getText().equals("") || txtsubname.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Add required Details!!");
            } else {
                String newsql = "Update subject SET Subject_ID ='" + txtsubid.getText() + "', Subject_Name='" + txtsubname.getText() + "',Grade='" + txtgrade.getText() + "',Teacher_ID='" + tid + "' where Subject_ID='" + sid + "' ";
                stmt.executeUpdate(newsql);
                JOptionPane.showMessageDialog(null, "Successfully Added!!");

                this.setVisible(false);
                new SubjectDetails(uid).setVisible(true);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Acces Denied!!Subject_ID is existing");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Acces Denied!!\nContact System Admin!!\n" + ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtsubid.setText("");
        txtsubname.setText("");
        txtgrade.setText("");
        txtteachername.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new SubjectDetails(uid).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void txtupdateidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupdateidActionPerformed

    private void cmbteacheridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbteacheridActionPerformed
        tid = cmbteacherid.getSelectedItem().toString();
        txtteachername.setText(tid);
        
            String sid = "Select Teacher_Name from teacher_details where Teacher_ID=?";
            try {
                PreparedStatement pst;
                pst = con.prepareStatement(sid);

                pst.setString(1, tid);
                ResultSet rs1 = pst.executeQuery();
                while (rs1.next()) {
                    txtteachername.setText(rs1.getString("Teacher_Name"));
                }

            } catch (SQLException ex) {
            }
        
    }//GEN-LAST:event_cmbteacheridActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtlogid.setText(uid);
        txtupdateid.setText(sid);
    }//GEN-LAST:event_formWindowOpened

    private void cmbteacheridPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbteacheridPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbteacheridPropertyChange

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
            java.util.logging.Logger.getLogger(UpdateSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateSubject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox cmbteacherid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtgrade;
    private javax.swing.JLabel txtlogid;
    private javax.swing.JTextField txtsubid;
    private javax.swing.JTextField txtsubname;
    private javax.swing.JTextField txtteachername;
    private javax.swing.JTextField txtupdateid;
    // End of variables declaration//GEN-END:variables
}
