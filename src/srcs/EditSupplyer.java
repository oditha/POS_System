package srcs;

import ORM.Supplier;
import Reports.ViewSuppUdaya;
import static Reports.ViewSuppUdaya.a;
import static Reports.ViewSuppUdaya.a1;
import static Reports.ViewSuppUdaya.a2;
import static Reports.ViewSuppUdaya.a3;
import static Reports.ViewSuppUdaya.a4;
import static Reports.ViewSuppUdaya.a5;
import static Reports.ViewSuppUdaya.a6;
import static Reports.ViewSuppUdaya.a7;
import static Reports.ViewSuppUdaya.a8;
import com.alee.laf.WebLookAndFeel;
import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.awt.Component;
import java.util.List;
import javax.swing.JTextField;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EditSupplyer extends javax.swing.JFrame {

    boolean FLAG_TXT_VALIDATE = false;

    public static int supID;

    public EditSupplyer() {
        initComponents();
        GenSupCode();
        loadSupp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSupCode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSupName = new javax.swing.JTextField();
        txtAddress2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContact1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContact2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSupEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Supplier | JRTraders");
        setAlwaysOnTop(true);

        jLabel3.setText("Supplyer ID");

        txtSupCode.setEditable(false);
        txtSupCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSupCodeFocusLost(evt);
            }
        });
        txtSupCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupCodeActionPerformed(evt);
            }
        });
        txtSupCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSupCodeKeyReleased(evt);
            }
        });

        jLabel4.setText("Supplier Name");

        txtSupName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSupNameFocusLost(evt);
            }
        });

        txtAddress2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddress2FocusLost(evt);
            }
        });

        jLabel5.setText("Address Line 2");

        txtAddress1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddress1FocusLost(evt);
            }
        });

        jLabel6.setText("Address Line 1");

        jLabel7.setText("City");

        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });

        jLabel8.setText("Contact Primary");

        txtContact1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContact1FocusLost(evt);
            }
        });

        jLabel9.setText("Contact Secondary");

        txtContact2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContact2FocusLost(evt);
            }
        });

        jLabel10.setText("Email");

        btnSave.setText("Update Supplier");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(txtAddress1)
                                .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(txtSupCode)
                                .addComponent(txtSupName, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(txtContact2)
                                .addComponent(txtSupEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(txtCity)
                                .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(79, 79, 79))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(5, 5, 5)
                        .addComponent(txtContact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5)
                        .addComponent(txtSupEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(txtSupCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(txtSupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(txtAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        validateTXT();
        if (txtSupName.getText().isEmpty() && txtContact1.getText().isEmpty()) {
            
            NotificationPopup.fillFeilds();
        } else {
            
            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();
                Criteria createCriteria = openSession.createCriteria(Supplier.class);
                createCriteria.add(Restrictions.eq("idSupplier", supID));
                Supplier supplier = (Supplier) createCriteria.uniqueResult();

                supplier.setSupplierCode(txtSupCode.getText());
                supplier.setSupplierName(txtSupName.getText());
                supplier.setSupplierAddress1(txtAddress1.getText());
                supplier.setSupplierAddress2(txtAddress2.getText());
                supplier.setSupplierCity(txtCity.getText());
                supplier.setSupplierContactNo1(txtContact1.getText());
                supplier.setSupplierContactNo2(txtContact2.getText());
                supplier.setSupplierEmail(txtSupEmail.getText());
                supplier.setIsActive("Active");

                openSession.update(supplier);
                beginTransaction.commit();
                openSession.close();

                NotificationPopup.save();
                ClearTXT();
                dispose();
                ViewSuppUdaya.loadSupp();
                
            } catch (Exception e) {

                e.printStackTrace();

            }

        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSupCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSupCodeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupCodeFocusLost

    private void txtSupNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSupNameFocusLost

        txtAddress1.grabFocus();

    }//GEN-LAST:event_txtSupNameFocusLost

    private void txtAddress1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddress1FocusLost

        txtAddress2.grabFocus();


    }//GEN-LAST:event_txtAddress1FocusLost

    private void txtAddress2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddress2FocusLost
        txtCity.grabFocus();
    }//GEN-LAST:event_txtAddress2FocusLost

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost
        txtContact1.grabFocus();
    }//GEN-LAST:event_txtCityFocusLost

    private void txtContact1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContact1FocusLost
        txtContact2.grabFocus();
    }//GEN-LAST:event_txtContact1FocusLost

    private void txtContact2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContact2FocusLost
        txtSupEmail.grabFocus();
    }//GEN-LAST:event_txtContact2FocusLost

    private void txtSupCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupCodeActionPerformed
       
    }//GEN-LAST:event_txtSupCodeActionPerformed

    private void txtSupCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSupCodeKeyReleased

    }//GEN-LAST:event_txtSupCodeKeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSupplyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField txtAddress1;
    public static javax.swing.JTextField txtAddress2;
    public static javax.swing.JTextField txtCity;
    public static javax.swing.JTextField txtContact1;
    public static javax.swing.JTextField txtContact2;
    public static javax.swing.JTextField txtSupCode;
    public static javax.swing.JTextField txtSupEmail;
    public static javax.swing.JTextField txtSupName;
    // End of variables declaration//GEN-END:variables

    private void validateTXT() {

        Component[] cp = Panel.getComponents();
        for (Component c : cp) {

            if (c instanceof JTextField) {

                if ((((JTextField) c).getText().isEmpty())) {

                    FLAG_TXT_VALIDATE = true;

                    break;

                } else {

                    FLAG_TXT_VALIDATE = false;

                }

            }

        }
    }

    private void ClearTXT() {

        Component[] cp = Panel.getComponents();
        for (Component c : cp) {

            if (c instanceof JTextField) {

                ((JTextField) c).setText(null);

            }

        }
        txtSupCode.setText("");
        txtSupName.grabFocus();
        GenSupCode();
    }

    private void GenSupCode() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Supplier.class);
            createCriteria.setProjection(Projections.rowCount());
            List list = createCriteria.list();

            String Sup_Code = Decimal_Formats.Sup_Code(Integer.parseInt(list.get(0).toString()) + 1);
            txtSupCode.setText("SUP" + Sup_Code);

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void loadSupp() {
        try {
            txtSupCode.setText(a1);
            txtSupName.setText(a2);
            txtContact1.setText(a3);
            txtContact2.setText(a4);
            txtSupEmail.setText(a5);
            txtAddress1.setText(a6);
            txtAddress2.setText(a7);
            txtCity.setText(a8);
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Supplier.class);
            createCriteria.add(Restrictions.like("supplierCode", a));
            Supplier supplier = (Supplier) createCriteria.uniqueResult();
            List<Supplier> list = createCriteria.list();
            
            for (Supplier supplier1 : list) {
                txtAddress1.setText(supplier.getSupplierAddress1());
                txtAddress2.setText(supplier.getSupplierAddress2());
                txtCity.setText(supplier.getSupplierCity());
            }
            openSession.close();
            
            supID = Integer.parseInt(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
