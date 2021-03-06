/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcs.ItemAndStock;

import exClass.Decimal_Formats;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oditha
 */
public class AddPriceVariations extends javax.swing.JFrame {

    /**
     * Creates new form AddPriceVariations
     */
    public AddPriceVariations() {
        initComponents();
        txtGrossPrice.grabFocus();
        try {
            txtItemCode.setText(AddItems.txtItemCode.getText());
            
        } catch (Exception e) {
        }
        
      //  System.out.println(new AddItems().txtItemName.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGrossPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNettPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMinPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboSup = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        comboSeller = new javax.swing.JComboBox<String>();
        txtSupWarrenty = new javax.swing.JTextField();
        txtSelelrWarrenty = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Price Variation | JRTraders");
        setAlwaysOnTop(true);

        jLabel3.setText("Item Code");

        txtItemCode.setEditable(false);
        txtItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemCodeActionPerformed(evt);
            }
        });

        jLabel4.setText("Cost");

        txtGrossPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGrossPriceFocusLost(evt);
            }
        });
        txtGrossPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGrossPriceKeyTyped(evt);
            }
        });

        jLabel5.setText("Nett Price");

        txtNettPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNettPriceFocusLost(evt);
            }
        });
        txtNettPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNettPriceKeyTyped(evt);
            }
        });

        jLabel6.setText("Min Price");

        txtMinPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMinPriceFocusLost(evt);
            }
        });
        txtMinPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinPriceKeyTyped(evt);
            }
        });

        jLabel1.setText("Supplier Warranty");

        comboSup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Warranty", "Months", "Years" }));
        comboSup.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboSupPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupActionPerformed(evt);
            }
        });

        jLabel2.setText("Seller Warranty");

        comboSeller.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Warranty", "Months", "Years" }));
        comboSeller.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboSellerPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        txtSupWarrenty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSupWarrentyFocusLost(evt);
            }
        });
        txtSupWarrenty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupWarrentyActionPerformed(evt);
            }
        });

        txtSelelrWarrenty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSelelrWarrentyFocusLost(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtGrossPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(165, 165, 165)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtNettPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtSupWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtSelelrWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMinPrice)
                            .addComponent(comboSup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboSeller, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtGrossPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNettPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSupWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSelelrWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemCodeActionPerformed

    private void txtSupWarrentyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupWarrentyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupWarrentyActionPerformed

    private void comboSupPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSupPopupMenuWillBecomeInvisible

//        if (comboSup.getSelectedIndex() == 0) {
//
//            txtSupWarrenty.setText("No Warranty");
//
//        } else {
//
//            txtSupWarrenty.setText(null);
//
//        }


    }//GEN-LAST:event_comboSupPopupMenuWillBecomeInvisible

    private void comboSellerPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSellerPopupMenuWillBecomeInvisible

//        if (comboSeller.getSelectedIndex() == 0) {
//
//            txtSelelrWarrenty.setText("No Warranty");
//
//        } else {
//
//            txtSelelrWarrenty.setText(null);
//
//        }

    }//GEN-LAST:event_comboSellerPopupMenuWillBecomeInvisible

    private void txtGrossPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGrossPriceFocusLost
//        txtNettPrice.grabFocus();
    }//GEN-LAST:event_txtGrossPriceFocusLost

    private void txtNettPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNettPriceFocusLost
//        txtMinPrice.grabFocus();
    }//GEN-LAST:event_txtNettPriceFocusLost

    private void txtMinPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinPriceFocusLost
//        txtSupWarrenty.grabFocus();
    }//GEN-LAST:event_txtMinPriceFocusLost

    private void txtSupWarrentyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSupWarrentyFocusLost
//        txtSelelrWarrenty.grabFocus();
    }//GEN-LAST:event_txtSupWarrentyFocusLost

    private void txtSelelrWarrentyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSelelrWarrentyFocusLost

//        btnSave.grabFocus();

    }//GEN-LAST:event_txtSelelrWarrentyFocusLost

    private void txtGrossPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrossPriceKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtGrossPriceKeyTyped

    private void txtNettPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNettPriceKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtNettPriceKeyTyped

    private void txtMinPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinPriceKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtMinPriceKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            //  System.out.println(new AddItems().txtItemName.getText());
        DefaultTableModel dtm = (DefaultTableModel) AddItems.jTable1.getModel();
        dtm.addRow(new Object[]{txtItemCode.getText(),
            Decimal_Formats.Price(Double.parseDouble(txtGrossPrice.getText())),
            Decimal_Formats.Price(Double.parseDouble(txtNettPrice.getText())),
            Decimal_Formats.Price(Double.parseDouble(txtMinPrice.getText())),
            txtSupWarrenty.getText() + " " + comboSup.getSelectedItem().toString(),
            txtSelelrWarrenty.getText() + " " + comboSeller.getSelectedItem().toString()

        });

        this.dispose();

        } catch (Exception e) {

        e.printStackTrace();
        
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSupActionPerformed

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
            java.util.logging.Logger.getLogger(AddPriceVariations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPriceVariations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPriceVariations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPriceVariations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPriceVariations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboSeller;
    private javax.swing.JComboBox<String> comboSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtGrossPrice;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtMinPrice;
    private javax.swing.JTextField txtNettPrice;
    private javax.swing.JTextField txtSelelrWarrenty;
    private javax.swing.JTextField txtSupWarrenty;
    // End of variables declaration//GEN-END:variables

}
