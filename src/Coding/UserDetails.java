package Coding;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public final class UserDetails extends javax.swing.JFrame {

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    String uid = "u1";

    public UserDetails() {
        initComponents();

    }

    public UserDetails(String userid) {

        uid = userid;
        initComponents();
        dbConnection();
        FirstRecord();
        Tableusers();

    }

    public static void dbConnection() {
        try {
            con = ConnectionManager.getConnection();
            stmt = con.createStatement();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error!!" + e);
        }
    }

    public void Unable() {

        if (!uid.equals(txtsearch.getText())) {
            btndelete.setEnabled(true);
            btnupdate.setEnabled(false);
        } else {
            btndelete.setEnabled(false);
             btnupdate.setEnabled(true);
        }
    }

    public void FirstRecord() {

        try {
            String strsql3;

            strsql3 = "Select User_ID,User_Name,User_Address,User_Email from user where User_ID='" + uid + "'";

            ResultSet rs1 = stmt.executeQuery(strsql3);

            rs1.next();
            txtuserid.setText(rs1.getString("User_ID"));
            txtusername.setText(rs1.getString("User_Name"));
            txtaddress.setText(rs1.getString("User_Address"));
            txtemail.setText(rs1.getString("User_Email"));
        } catch (SQLException ex) {

        }
    }

    public void Tableusers() {
        try {

            String tblsql = "Select User_ID,User_Name,User_Address,User_Email from user";
            rs = stmt.executeQuery(tblsql);
            tbluser.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbluser = new javax.swing.JTable();
        btnback = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        txtlogid = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("User Details");
        setBackground(javax.swing.UIManager.getDefaults().getColor("TextArea.selectionBackground"));
        setName("frmmanage"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("User ID       :");

        txtuserid.setEditable(false);
        txtuserid.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("User Name :");

        txtusername.setEditable(false);
        txtusername.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Address      :");

        txtaddress.setEditable(false);
        txtaddress.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtemail.setEditable(false);
        txtemail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel8.setText("Email          :");

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
                        .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtaddress))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuserid, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(txtusername))))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 253, -1, -1));

        jPanel2.setOpaque(false);

        btnupdate.setBackground(java.awt.SystemColor.activeCaption);
        btnupdate.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setToolTipText("Update");
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setBackground(java.awt.SystemColor.activeCaption);
        btndelete.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.setToolTipText("Delete");
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndelete.setEnabled(false);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnnew.setBackground(java.awt.SystemColor.activeCaption);
        btnnew.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btnnew.setText("New User");
        btnnew.setToolTipText("New User");
        btnnew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnnew, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 390, 90));
        jPanel2.getAccessibleContext().setAccessibleName("");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        jScrollPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("nbProgressBar.Foreground"));
        jScrollPane1.setOpaque(false);

        tbluser.setAutoCreateRowSorter(true);
        tbluser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbluser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "User_ID", "User_Name", "Contact_No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbluser.setAlignmentX(50.0F);
        tbluser.setAlignmentY(50.0F);
        tbluser.setEnabled(false);
        tbluser.setGridColor(new java.awt.Color(0, 0, 0));
        tbluser.setOpaque(false);
        tbluser.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbluser.setSelectionForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jScrollPane1.setViewportView(tbluser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 690, 108));

        btnback.setBackground(javax.swing.UIManager.getDefaults().getColor("Table.selectionBackground"));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setText("Back");
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setText("User Details :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, -1, -1));

        btnsearch.setBackground(java.awt.SystemColor.textHighlight);
        btnsearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(0, 0, 255));
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1494067890_search.png"))); // NOI18N
        btnsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 56, -1));

        txtsearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(255, 0, 0));
        txtsearch.setText("User ID");
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 114, -1));

        txtlogid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtlogid.setText("U1");
        getContentPane().add(txtlogid, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 40, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MTAyNHg3Njg,14811486_14707124.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed

        try {
            Unable();
            
            String search1 = txtsearch.getText();

            String str;

            str = "Select User_ID,User_Name,User_Address,User_Email from user Where User_ID='" + search1 + "'";

            rs = stmt.executeQuery(str);

            rs.next();
            txtuserid.setText(rs.getString("User_ID"));
            txtusername.setText(rs.getString("User_Name"));
            txtaddress.setText(rs.getString("User_Address"));
            txtemail.setText(rs.getString("User_Email"));

        } catch (SQLException ex) {
            btndelete.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Invalid User ID !!!\n\n");

        }


    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        new Home(uid).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnbackActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String updateid = txtuserid.getText();
        this.setVisible(false);
        new UpdateUser(uid, updateid).setVisible(true);

    }//GEN-LAST:event_btnupdateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtlogid.setText(uid);
        txtsearch.setText(uid);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed

        new NewUser(uid).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnnewActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {

            String delsql = "Delete from user where User_ID='" + txtuserid.getText() + "'";
            if (JOptionPane.showConfirmDialog(null, "Are you want to Delete " + txtuserid.getText() + " ?", "Delete",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                stmt.executeUpdate(delsql);
                JOptionPane.showMessageDialog(null, "Successfully Deleted!!!\n\n");
                this.setVisible(false);
                new UserDetails(uid).setVisible(true);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to Delete!!!\n\n");
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Unable();
                String search1 = txtsearch.getText();

                String str;

                str = "Select User_ID,User_Name,User_Address,User_Email from user Where User_ID='" + search1 + "'";

                rs = stmt.executeQuery(str);

                rs.next();
                txtuserid.setText(rs.getString("User_ID"));
                txtusername.setText(rs.getString("User_Name"));
                txtaddress.setText(rs.getString("User_Address"));
                txtemail.setText(rs.getString("User_Email"));

            } catch (SQLException ex) {
                btndelete.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Invalid User ID !!!\n\n");

            }

        }
    }//GEN-LAST:event_txtsearchKeyPressed

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserDetails().setVisible(true);

            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbluser;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JLabel txtlogid;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
