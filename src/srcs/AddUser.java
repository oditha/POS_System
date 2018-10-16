package srcs;

import ORM.Users;
import com.alee.laf.WebLookAndFeel;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import static srcs.ResetPassword.txtPasswordReset;

public class AddUser extends javax.swing.JFrame {

    boolean FLAG_TXT_VALIDATE = false;
    public static int getUserID;
    public static String getPassword;

    public AddUser() {
        initComponents();
        lablePassword.setVisible(false);
        loadUser();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNic = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboUserType = new javax.swing.JComboBox<>();
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lablePassword = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AddUser | JRTraders");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("NIC");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel1.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 280, -1));

        jLabel10.setText("Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel11.setText("User Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel12.setText("Re-Enter Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel8.setText("User Type");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        comboUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Owner", "Cashier", "Admin" }));
        jPanel1.add(comboUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 280, -1));

        txtRePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRePasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 268, 280, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 216, 280, -1));

        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 164, 280, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 112, 280, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 382, 90, -1));
        jPanel1.add(lablePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 120, 20));

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "NIC", "Name", "UserName", "User Type", "Password"
            }
        ));
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);
        if (tableUser.getColumnModel().getColumnCount() > 0) {
            tableUser.getColumnModel().getColumn(0).setMinWidth(0);
            tableUser.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableUser.getColumnModel().getColumn(0).setMaxWidth(0);
            tableUser.getColumnModel().getColumn(5).setMinWidth(0);
            tableUser.getColumnModel().getColumn(5).setPreferredWidth(0);
            tableUser.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 410, 280));

        btnReset.setText("Reset Password");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 382, 130, -1));

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 362, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {

            if (btnSave.getText().equals("Save")) {

                if (txtNic.getText().isEmpty() && txtName.getText().isEmpty() && txtUserName.getText().isEmpty() && txtPassword.getText().isEmpty() && txtRePassword.getText().isEmpty()) {
                    NotificationPopup.fillFeilds();
                } else {

                    if (txtPassword.getText().equals(txtRePassword.getText())) {
                        Session openSession = PoolManager.getSessionFactory().openSession();
                        Transaction beginTransaction = openSession.beginTransaction();

                        Users u = new Users();
                        u.setNic(txtNic.getText());
                        u.setName(txtName.getText());
                        u.setUserName(txtUserName.getText());
                        u.setPassword(txtPassword.getText());
                        u.setUserType(comboUserType.getSelectedItem().toString());
                        u.setIsActive("Active");

                        openSession.save(u);
                        beginTransaction.commit();
                        openSession.close();
                        NotificationPopup.save();
                        clearTXT();
                        loadUser();

                    } else {
                        lablePassword.setVisible(true);
                        lablePassword.setText("Incorrect Password");
                        lablePassword.setForeground(Color.RED);
                    }

                }

            } else if (btnSave.getText().equals("Update")) {

                if (txtNic.getText().isEmpty() && txtName.getText().isEmpty() && txtUserName.getText().isEmpty()) {
                    NotificationPopup.fillFeilds();
                } else {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction = openSession.beginTransaction();
                    Criteria createCriteria = openSession.createCriteria(Users.class);
                    System.out.println(getUserID);
                    createCriteria.add(Restrictions.eq("idtable1", getUserID));
                    Users user = (Users) createCriteria.uniqueResult();

                    user.setNic(txtNic.getText());
                    user.setName(txtName.getText());
                    user.setUserName(txtUserName.getText());
                    user.setUserType(comboUserType.getSelectedItem().toString());

                    openSession.update(user);
                    beginTransaction.commit();
                    openSession.close();
                    NotificationPopup.save();
                    clearTXT();

                    txtPassword.setEnabled(true);
                    txtRePassword.setEnabled(true);
                    btnSave.setText("Save");

                    loadUser();

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtRePasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRePasswordKeyReleased
        if (txtPassword.getText().equals(txtRePassword.getText())) {
            lablePassword.setVisible(true);
            lablePassword.setText("Correct Password");
            lablePassword.setForeground(Color.GREEN);
        } else {
            lablePassword.setVisible(true);
            lablePassword.setText("Incorrect Password");
            lablePassword.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtRePasswordKeyReleased

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        try {

            int x = tableUser.getSelectedRow();
            String s1 = tableUser.getValueAt(x, 0).toString();
            int i = Integer.parseInt(s1);
            getUserID = i;
            String s2 = tableUser.getValueAt(x, 1).toString();
            String s3 = tableUser.getValueAt(x, 2).toString();
            String s4 = tableUser.getValueAt(x, 3).toString();
            String s5 = tableUser.getValueAt(x, 4).toString();
            String s6 = tableUser.getValueAt(x, 5).toString();
            getPassword = s6;

            txtNic.setText(s2);
            txtName.setText(s3);
            txtUserName.setText(s4);
            comboUserType.setSelectedItem(s5);
            txtPassword.setText(s6);

            txtPassword.setEnabled(false);
            txtRePassword.setEnabled(false);

            btnSave.setText("Update");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableUserMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        if (btnSave.getText().equals("Update")) {
            ResetPassword rp = new ResetPassword();
            rp.setVisible(true);
            txtPasswordReset.setText(getPassword);
            clearTXT();
            btnSave.setText("Save");
        }


    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            
            if (!Login.Uname.equals(tableUser.getValueAt(tableUser.getSelectedRow(), 3).toString())) {
                
                
            
            
            int x = tableUser.getSelectedRow();
            String getID = (tableUser.getModel().getValueAt(x, 0).toString());

            int a = Integer.parseInt(getID);

            Session openSession = PoolManager.getSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();
            Criteria createCriteria = openSession.createCriteria(Users.class);
            createCriteria.add(Restrictions.eq("idtable1", a));
            Users user = (Users) createCriteria.uniqueResult();

            user.setIsActive("Deactive");

            openSession.update(user);
            beginTransaction.commit();
            openSession.close();
            NotificationPopup.save();
            loadUser();
            clearTXT();
            btnSave.setText("Save");
            txtPassword.setEnabled(true);
            txtRePassword.setEnabled(true);

            }else{
            
                JOptionPane.showMessageDialog(null, "You Cannot Delete your own account");
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
       
        
        try {
            
            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Users.class);
            
            cr.add(Restrictions.eq("userName", txtUserName.getText()));
            
            Users uniqueResult = (Users) cr.uniqueResult();
            
            
            if (uniqueResult!=null) {
             txtNic.setText(uniqueResult.getNic());
             txtName.setText(uniqueResult.getName());
             txtUserName.setText(uniqueResult.getUserName());
             txtPassword.setText(uniqueResult.getPassword());
             txtRePassword.setText(uniqueResult.getPassword());
             comboUserType.setSelectedItem(uniqueResult.getUserType());
             btnSave.setText("Update");
               
                
                
                
            }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_txtUserNameKeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboUserType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lablePassword;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void validateTXT() {

        if (txtNic.getText().isEmpty() && txtName.getText().isEmpty() && txtUserName.getText().isEmpty() && txtPassword.getText().isEmpty() && txtRePassword.getText().isEmpty()) {
            FLAG_TXT_VALIDATE = true;
        } else {
            FLAG_TXT_VALIDATE = false;
        }

    }

    private void clearTXT() {
        lablePassword.setVisible(false);
        txtName.setText("");
        txtNic.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        txtRePassword.setText("");
        comboUserType.setSelectedIndex(0);

    }

    private void loadUser() {
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Users.class);
            createCriteria.add(Restrictions.like("isActive", "Active"));

            List<Users> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tableUser.getModel();
            dtm.setRowCount(0);

            for (Users users : list) {
                dtm.addRow(new Object[]{users.getIdtable1(), users.getNic(), users.getName(), users.getUserName(), users.getUserType(), users.getPassword()});
            }
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
