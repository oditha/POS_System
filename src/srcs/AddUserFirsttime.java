package srcs;

import ORM.Users;
import com.alee.laf.WebLookAndFeel;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.awt.Color;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddUserFirsttime extends javax.swing.JFrame {
    
    boolean FLAG_TXT_VALIDATE = false;
    public static int getUserID;
    public static String getPassword;
    
    public AddUserFirsttime() {
        initComponents();
        lablePassword.setVisible(false);
        loadUser();
        txtNic.grabFocus();
        
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
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lablePassword = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add user first Time | JRTraders");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("NIC");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 72, 128, -1));
        jPanel1.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 66, 280, -1));

        jLabel10.setText("Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 156, -1, -1));

        jLabel11.setText("User Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 208, -1, -1));

        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 258, -1, -1));

        jLabel12.setText("Re-Enter Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 308, -1, -1));

        txtRePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRePasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 306, 280, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 254, 280, -1));
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 202, 280, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 150, 280, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 90, -1));
        jPanel1.add(lablePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 120, 30));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 103, 280, -1));

        jLabel14.setText("Email");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 107, 118, 25));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Add Admin before loging");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            
            if (btnSave.getText().equals("Save")) {
                
                if (txtNic.getText().isEmpty() && txtName.getText().isEmpty() && txtUserName.getText().isEmpty() && txtPassword.getText().isEmpty() && txtRePassword.getText().isEmpty()  && email.getText().isEmpty() ) {
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
                        u.setUserType("ADMIN");

//                        u.setEmail(email.getText());
                        u.setIsActive("Active");
                        
                        openSession.save(u);
                        beginTransaction.commit();
                        openSession.close();
                        NotificationPopup.save();
                        clearTXT();
                        loadUser();
                        dispose();
                        
                    } else {
                        lablePassword.setVisible(true);
                        lablePassword.setText("Incorrect Password");
                        lablePassword.setForeground(Color.RED);
                    }
                    
                }
                

                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtRePasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRePasswordKeyReleased
        if (txtPassword.getText().equals(txtRePassword.getText())   ) {
            lablePassword.setVisible(true);
            lablePassword.setText("Correct Password");
            lablePassword.setForeground(Color.GREEN);
        } else  {
            
            if (txtPassword.getText().length()==txtRePassword.getText().length()) {
                 lablePassword.setVisible(true);
            lablePassword.setText("Incorrect Password");
            lablePassword.setForeground(Color.RED);
            }
           
        }
    }//GEN-LAST:event_txtRePasswordKeyReleased
    
    public static void main(String args[]) {
        
        WebLookAndFeel.install();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUserFirsttime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lablePassword;
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
//        comboUserType.setSelectedIndex(0);

    }
    
    private void loadUser() {
//        try {
//
//            Session openSession = PoolManager.getSessionFactory().openSession();
//            Criteria createCriteria = openSession.createCriteria(Users.class);
//            createCriteria.add(Restrictions.like("isActive", "Active"));
//
//            List<Users> list = createCriteria.list();
//
//            DefaultTableModel dtm = (DefaultTableModel) tableUser.getModel();
//            dtm.setRowCount(0);
//
//            for (Users users : list) {
//                dtm.addRow(new Object[]{users.getIdtable1(), users.getNic(), users.getName(), users.getUserName(), users.getUserType(), users.getPassword()});
//            }
//            openSession.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    
}
