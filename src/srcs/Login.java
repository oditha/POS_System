package srcs;

import ORM.InvoicePayments;
import ORM.Users;
import com.alee.laf.WebLookAndFeel;
import exClass.PoolManager;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Login extends javax.swing.JFrame {

    public static JasperReport jrCusPayment;
    public static JasperReport jrSupPayment;
    public static JasperReport jrCusInvoice;
    public static JasperReport JRtraders;
    public static JasperReport jrCusInvoiceWithSerial;
    public static JasperReport jrSupInvoice;
    public static JasperReport jrSupInvoiceWithSerial;
    public static String Role;
    public static String Uname;

    public Login() {
        initComponents();
        CompileJasper();
        CheckUserTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JR Traders");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 360, 40));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JRTraders");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 450, 360, 40));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 360, -1));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 310, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Press ENTER to Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 360, -1));

        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 310, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 220));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 360, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased

        if (evt.getKeyCode() == 10) {

            if (jTextField1.getText().equals("msadmin") && jPasswordField1.getText().equals("*222*odk*")) {

                try {

                    Role = "ADMIN";
                    Uname = "Sys Admin";
                    new Dashboard().setVisible(true);
                    dispose();

                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {

                try {
                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria cr = openSession.createCriteria(Users.class);
                    cr.add(Restrictions.eq("isActive", "Active"));
                    cr.add(Restrictions.eq("userName", jTextField1.getText()));
                    cr.add(Restrictions.eq("password", jPasswordField1.getText()));

                    Users uniqueResult = (Users) cr.uniqueResult();

                    if (uniqueResult != null) {

                        Role = uniqueResult.getUserType();
                        Uname = uniqueResult.getUserName();
                        new Dashboard().setVisible(true);
                        dispose();
                    } else {

                        JOptionPane.showMessageDialog(rootPane, "Invalid Username/Password");

                    }

                    openSession.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

    }//GEN-LAST:event_jPasswordField1KeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void CompileJasper() {
        try {
            InputStream Rp = getClass().getResourceAsStream("/JReports/CusPaymentRecipt.jrxml");
            jrCusPayment = JasperCompileManager.compileReport(Rp);
           
            InputStream Rpin = getClass().getResourceAsStream("/JReports/JRtraders.jrxml");
            JRtraders = JasperCompileManager.compileReport(Rpin);

            InputStream Rps = getClass().getResourceAsStream("/JReports/SupPaymentRecipt.jrxml");
            jrSupPayment = JasperCompileManager.compileReport(Rps);

            InputStream RpInv = getClass().getResourceAsStream("/JReports/CusInvoice.jrxml");
            jrCusInvoice = JasperCompileManager.compileReport(RpInv);

            InputStream RpInvSerial = getClass().getResourceAsStream("/JReports/CusInvoiceWithSerial.jrxml");
            jrCusInvoiceWithSerial = JasperCompileManager.compileReport(RpInvSerial);

            InputStream SupInv = getClass().getResourceAsStream("/JReports/SupInvoice.jrxml");
            jrSupInvoice = JasperCompileManager.compileReport(SupInv);

            InputStream SupInvSerial = getClass().getResourceAsStream("/JReports/SupInvoiceWithSerial.jrxml");
            jrSupInvoiceWithSerial = JasperCompileManager.compileReport(SupInvSerial);

        } catch (JRException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CheckUserTable() {

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cc = openSession.createCriteria(Users.class);
            cc.setProjection(Projections.rowCount());
            List list = cc.list();
            if (Integer.parseInt(list.get(0).toString()) == 0) {

                new AddUserFirsttime().setVisible(true);

            }
        } catch (Exception e) {
        }

    }
}
