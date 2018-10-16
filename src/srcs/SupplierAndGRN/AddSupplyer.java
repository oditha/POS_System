package srcs.SupplierAndGRN;

import ORM.Supplier;
import com.alee.laf.WebLookAndFeel;
import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JTextField;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

public class AddSupplyer extends javax.swing.JFrame {

    boolean FLAG_TXT_VALIDATE = false;

    public AddSupplyer() {
        initComponents();
        GenSupCode();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSupCode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSupName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContact1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtAddress2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSupEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContact2 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Supplier | JRTraders");

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Supplyer ID");
        Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 93, -1, -1));

        txtSupCode.setEditable(false);
        txtSupCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSupCodeFocusLost(evt);
            }
        });
        Panel.add(txtSupCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 115, 402, -1));

        jLabel4.setText("Supplier Name");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 93, -1, -1));

        txtSupName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSupNameFocusLost(evt);
            }
        });
        Panel.add(txtSupName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 115, 402, -1));

        jLabel8.setText("Contact Primary");
        Panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        txtContact1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContact1FocusLost(evt);
            }
        });
        txtContact1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContact1KeyTyped(evt);
            }
        });
        Panel.add(txtContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 402, -1));

        jLabel6.setText("Address Line 1");

        txtAddress1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddress1FocusLost(evt);
            }
        });

        jLabel7.setText("City");

        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 420, 150));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Address Line 2");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtAddress2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddress2FocusLost(evt);
            }
        });
        jPanel2.add(txtAddress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 402, -1));

        jLabel10.setText("Email");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel2.add(txtSupEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 402, -1));

        jLabel9.setText("Contact Secondary");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtContact2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContact2FocusLost(evt);
            }
        });
        txtContact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContact2ActionPerformed(evt);
            }
        });
        txtContact2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContact2KeyTyped(evt);
            }
        });
        jPanel2.add(txtContact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 402, -1));

        Panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 420, 210));

        btnSave.setText("Save Supplier");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        Panel.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 200, 30));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 180, -1));

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        validateTXT();
        if (FLAG_TXT_VALIDATE == false) {

            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();

                Supplier supplier = new Supplier();

                supplier.setSupplierCode(txtSupCode.getText());
                supplier.setSupplierName(txtSupName.getText());
                supplier.setSupplierAddress1(txtAddress1.getText());
                supplier.setSupplierAddress2(txtAddress2.getText());
                supplier.setSupplierCity(txtCity.getText());
                supplier.setSupplierContactNo1(txtContact1.getText());
                supplier.setSupplierContactNo2(txtContact2.getText());
                supplier.setSupplierEmail(txtSupEmail.getText());
                supplier.setIsActive("Active");

                openSession.save(supplier);
                beginTransaction.commit();
                openSession.close();

                NotificationPopup.save();
                ClearTXT();

            } catch (Exception e) {

                e.printStackTrace();

            }

        } else {

            NotificationPopup.fillFeilds();
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSupCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSupCodeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupCodeFocusLost

    private void txtSupNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSupNameFocusLost


    }//GEN-LAST:event_txtSupNameFocusLost

    private void txtAddress1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddress1FocusLost


    }//GEN-LAST:event_txtAddress1FocusLost

    private void txtAddress2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddress2FocusLost

    }//GEN-LAST:event_txtAddress2FocusLost

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost

    }//GEN-LAST:event_txtCityFocusLost

    private void txtContact1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContact1FocusLost

    }//GEN-LAST:event_txtContact1FocusLost

    private void txtContact2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContact2FocusLost

    }//GEN-LAST:event_txtContact2FocusLost

    private void txtContact1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact1KeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || txtContact1.getText().length() == 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txtContact1KeyTyped

    private void txtContact2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContact2KeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) || txtContact2.getText().length() == 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txtContact2KeyTyped

    private void txtContact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContact2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContact2ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupplyer().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtContact2;
    private javax.swing.JTextField txtSupCode;
    private javax.swing.JTextField txtSupEmail;
    private javax.swing.JTextField txtSupName;
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
       txtAddress1.setText(null);
       txtAddress2.setText(null);
       txtCity.setText(null);
       txtContact2.setText(null);
       txtSupEmail.setText(null);

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

            txtSupName.grabFocus();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
