/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class UpdateTeacher extends javax.swing.JFrame {

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static ResultSet rs1;
    String uid = "u1";
    String path="D:\\Project\\Rad\\Student And Teacher Management System\\src\\Icons\\admin-icon.png";
    String tid;

    public UpdateTeacher() {
        initComponents();
    }

    public UpdateTeacher(String uid, String tid) {
        initComponents();
        this.uid = uid;
        this.tid = tid;
        dbConnection();
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
      public void UpdateDetails() {

        try {
            String strsql3;

            strsql3 = "Select *  from teacher_details where Teacher_ID='" + tid + "'";

            rs = stmt.executeQuery(strsql3);

            rs.next();
            txtteacherid.setText(rs.getString("Teacher_ID"));
            txtname.setText(rs.getString("Teacher_Name"));
            txtaddress.setText(rs.getString("Teacher_Address"));
            txtcontact.setText(rs.getString("Teacher_ContactNo"));
            txtemail.setText(rs.getString("Teacher_Email"));
            path = rs.getString("Teacher_PhotoID");
            txtpath.setText(path);
            File f = new File(path);

            lblphoto.setIcon(new ImageIcon(ImageIO.read(f)));

        } catch (SQLException ex) {

        } catch (IOException ex) {

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
        jLabel6 = new javax.swing.JLabel();
        txtteacherid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnbrowse = new javax.swing.JButton();
        txtpath = new javax.swing.JTextField();
        lblphoto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Update Teacher");
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
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 121, 60, 60));

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
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 199, 60, 60));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setText("Back");
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 279, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Update   :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 60, -1, -1));

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
        getContentPane().add(txtupdateid, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 56, 50, 25));

        txtlogid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtlogid.setText("U1");
        getContentPane().add(txtlogid, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 23, 40, 20));

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setText("Teacher ID       :");

        txtteacherid.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Teacher Name :");

        txtname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Address            :");

        txtaddress.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtcontact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setText("Contact No       :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setText("E-mail              :");

        txtemail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setText("Photo ID          :");

        btnbrowse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbrowse.setText("Browse");
        btnbrowse.setBorderPainted(false);
        btnbrowse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });

        txtpath.setEditable(false);
        txtpath.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblphoto.setBackground(new java.awt.Color(255, 255, 255));
        lblphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/admin-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtteacherid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcontact)
                            .addComponent(txtaddress)
                            .addComponent(txtemail)
                            .addComponent(txtpath)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnbrowse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(322, 322, 322))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtteacherid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnbrowse)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 99, 440, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MTAyNHg3Njg,14811486_14707124.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            if (txtteacherid.getText().equals("") || txtname.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Add required Details!!");
            } else {
                String newsql = "Update teacher_details SET Teacher_ID =?, Teacher_Name=?,Teacher_Address=?,Teacher_ContactNo=?,Teacher_EMail=?,Teacher_PhotoID=? where Teacher_ID='" + tid + "' ";
                PreparedStatement pst;
                pst = con.prepareStatement(newsql);

                pst.setString(1, txtteacherid.getText());
                pst.setString(2, txtname.getText());
                pst.setString(3, txtaddress.getText());
                pst.setString(4, txtcontact.getText());
                pst.setString(5, txtemail.getText());
                pst.setString(6, path);
                pst.executeUpdate();

               // stmt.executeUpdate(newsql);
                JOptionPane.showMessageDialog(null, "Successfully Added!!");

                this.setVisible(false);
                new TeacherDetails(uid).setVisible(true);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Acces Denied!!Teacher_ID or E-mail/Photo is existing");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Acces Denied!!\nContact System Admin!!\n" + ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtteacherid.setText("");
        txtname.setText("");
        txtaddress.setText("");
        txtcontact.setText("");
        txtemail.setText("");
        txtpath.setText("");
        lblphoto.setIcon(null);
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new TeacherDetails(uid).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

    private void txtupdateidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupdateidActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtlogid.setText(uid);
        txtupdateid.setText(tid);
    }//GEN-LAST:event_formWindowOpened

    private void btnbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowseActionPerformed
        try {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                path = file.getAbsolutePath();
                txtpath.setText(path);
                lblphoto.setIcon(new ImageIcon(ImageIO.read(file)));
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + "Invalid file path!!");
        }
    }//GEN-LAST:event_btnbrowseActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JLabel txtlogid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpath;
    private javax.swing.JTextField txtteacherid;
    private javax.swing.JTextField txtupdateid;
    // End of variables declaration//GEN-END:variables
}
