/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class UpdateStudent extends javax.swing.JFrame {

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static ResultSet rs1;
    String uid = "u1";
    String path = "D:\\Project\\Rad\\Student And Teacher Management System\\src\\Icons\\admin-icon.png";
    String stid;
    String dofb;
    String dadd;

    public UpdateStudent() {
        initComponents();
    }

    public UpdateStudent(String uid, String stid) {
        initComponents();
        this.uid = uid;
        this.stid = stid;
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

            strsql3 = "Select *  from student where Student_ID='" + stid + "'";

            rs = stmt.executeQuery(strsql3);

            rs.next();
            txtstudentid.setText(rs.getNString(1));
            txtname.setText(rs.getNString(2));
            dateadmission.setDate(rs.getDate(3));
            datedob.setDate(rs.getDate(4));
            txtage.setText(rs.getString(5));
            txtaddress.setText(rs.getString(6));
            txtcontact.setText(rs.getString(7));
            path = rs.getString(8);
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
        jLabel4 = new javax.swing.JLabel();
        txtupdateid = new javax.swing.JTextField();
        txtlogid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnbrowse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtstudentid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        txtpath = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        datedob = new com.toedter.calendar.JDateChooser();
        dateadmission = new com.toedter.calendar.JDateChooser();
        lblphoto = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Update Student");
        setResizable(false);
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
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 60, 60));

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
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 60, 60));

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
        getContentPane().add(txtlogid, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 40, 20));

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setOpaque(false);

        btnbrowse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbrowse.setText("Browse");
        btnbrowse.setBorder(btnback.getBorder());
        btnbrowse.setBorderPainted(false);
        btnbrowse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("Student ID          :");

        txtstudentid.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Student Name    :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Admission Date  :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setText("Date Of Birth      :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setText("Age                    :");

        txtage.setEditable(false);
        txtage.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel11.setText("Address              :");

        txtaddress.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setText("Contact No         :");

        txtcontact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactActionPerformed(evt);
            }
        });

        txtpath.setEditable(false);
        txtpath.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel7.setText("Photo ID             :");

        datedob.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datedobPropertyChange(evt);
            }
        });

        dateadmission.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateadmissionPropertyChange(evt);
            }
        });

        lblphoto.setBackground(new java.awt.Color(255, 255, 255));
        lblphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/admin-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtaddress)
                                .addComponent(txtage)
                                .addComponent(txtcontact, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(datedob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateadmission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpath, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btnbrowse)
                .addGap(18, 18, 18)
                .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(dateadmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(datedob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbrowse)
                    .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 480, 550));

        btnback.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.selectionBackground"));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setText("Back");
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MTAyNHg3Njg,14811486_14707124.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            if (txtstudentid.getText().equals("") || txtname.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Add required Details!!");
            } else {
                
                LocalDate ld1 = LocalDate.parse(dadd);
                LocalDate ld2 = LocalDate.parse(dofb);

                if (ld2.isBefore(ld1)){
                
                String newsql = "Update student SET `Student_ID`=?,`Student_Name`=?,`Student_AdmissionDate`=?,`Student_DateOfBirth`=?,`Age`=?,"
                        + "`Student_Address`=?,`Student_ContactNo`=?,`Student_PhotoID`=? "
                        + "where Student_ID='" + stid + "' ";
                PreparedStatement pst;
                pst = con.prepareStatement(newsql);

                pst.setString(1, txtstudentid.getText());
                pst.setString(2, txtname.getText());
                pst.setString(3, dadd);
                pst.setString(4, dofb);
                pst.setString(5, txtage.getText());
                pst.setString(6, txtaddress.getText());
                pst.setString(7, txtcontact.getText());
                pst.setString(8, path);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Successfully Added!!");

                this.setVisible(false);
                new StudentDetails(uid).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Check the Date Again!!!");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Acces Denied!!Student_ID or Photo is existing"+ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Acces Denied!!\nContact System Admin!!\n" + ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtstudentid.setText("");
        txtname.setText("");
        dateadmission.setDate(null);
        datedob.setDate(null);
        txtage.setText("");
        txtaddress.setText("");
        txtcontact.setText("");
        txtpath.setText("");
        lblphoto.setIcon(null);
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtupdateidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtupdateidActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtlogid.setText(uid);
        txtupdateid.setText(stid);
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

    private void txtcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactActionPerformed

    private void datedobPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datedobPropertyChange
        try {

            //  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            dofb = String.format("%1$tY-%1$tm-%1$td", datedob.getDate());
            //dadd = (Date) sdf.parse(add);

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
            String doby = sdf1.format(datedob.getDate());
            SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
            String dobm = sdf2.format(datedob.getDate());
            SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
            String dobd = sdf3.format(datedob.getDate());

            LocalDate birthdate = LocalDate.of(Integer.parseInt(doby), Integer.parseInt(dobm), Integer.parseInt(dobd));
            LocalDate now = LocalDate.now();
            Period p = Period.between(birthdate, now);
            
            txtage.setText(Integer.toString(p.getYears()) + " Years," + Integer.toString(p.getMonths()) + " Months," + Integer.toString(p.getDays()) + " Days");
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_datedobPropertyChange

    private void dateadmissionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateadmissionPropertyChange
        try {

            dadd = String.format("%1$tY-%1$tm-%1$td", dateadmission.getDate());

        } catch (Exception ex) {

        }
    }//GEN-LAST:event_dateadmissionPropertyChange

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        new StudentDetails(uid).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsave;
    private com.toedter.calendar.JDateChooser dateadmission;
    private com.toedter.calendar.JDateChooser datedob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JLabel txtlogid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpath;
    private javax.swing.JTextField txtstudentid;
    private javax.swing.JTextField txtupdateid;
    // End of variables declaration//GEN-END:variables
}
