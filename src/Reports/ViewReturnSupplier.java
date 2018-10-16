package Reports;

import ORM.Supplier;
import ORM.SupplierInvoiceReturn;
import ORM.SupplierInvoiceReturnHasSupplier;
import com.alee.laf.WebLookAndFeel;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewReturnSupplier extends javax.swing.JFrame {

    public ViewReturnSupplier() {
        initComponents();
        loadTables();
        TxtFromDate.setEnabled(false);
        TxtToDate.setEnabled(false);

       // jTable1.setComponentPopupMenu(jPopupMenu1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnFilter = new javax.swing.JButton();
        TxtToDate = new com.alee.extended.date.WebDateField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtFromDate = new com.alee.extended.date.WebDateField();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("Delete");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Supplier Return | JRTraders");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Invoice No", "Item Code", "Item Name", "Return Date", "Return QTY", "Item Condition"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(3).setMinWidth(400);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(400);
        }

        jLabel3.setText("Type Supplier Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        TxtToDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtToDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtToDateMouseClicked(evt);
            }
        });

        jCheckBox1.setText("Filter By Date");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("From");

        jLabel1.setText("To");

        TxtFromDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtFromDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtFromDateMouseClicked(evt);
            }
        });

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtFromDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtToDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jCheckBox1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(TxtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFilter))))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        DecimalFormat decimalFormat = new DecimalFormat("00");
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(SupplierInvoiceReturn.class);

            //createCriteria.add(Restrictions.between("retuenDate", TxtFromDate.getText(), TxtToDate.getText()));
            Criterion name = Restrictions.between("retuenDate", TxtFromDate.getText(), TxtToDate.getText());
            Criterion active = Restrictions.like("isActive", "Active");
            LogicalExpression andExp = Restrictions.and(name, active);
            createCriteria.add(andExp);

            List<SupplierInvoiceReturn> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (SupplierInvoiceReturn ir : list) {
                dtm.addRow(new Object[]{ir.getIdInvoiceReturn(), ir.getSupplierInvoice().getInvoiceNo(), ir.getSupplierInvoiceItem().getItem().getItemCode(), ir.getSupplierInvoiceItem().getItem().getIitemName(), ir.getRetuenDate(), decimalFormat.format(ir.getReturnQty()), ir.getItemCondition()});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void TxtToDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtToDateMouseClicked

    }//GEN-LAST:event_TxtToDateMouseClicked

    private void TxtFromDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtFromDateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFromDateMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            TxtFromDate.setEnabled(true);
            TxtToDate.setEnabled(true);
            loadTables();
        } else {
            TxtFromDate.setEnabled(false);
            TxtToDate.setEnabled(false);
            loadTables();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        if (!(jTextField1.getText().isEmpty())) {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Supplier.class);

                //createCriteria.add(Restrictions.like("supplierName", "%" + jTextField1.getText() + "%"));
                Criterion code = Restrictions.like("supplierName", "%" + jTextField1.getText() + "%");
                Criterion active = Restrictions.like("isActive", "Active");
                LogicalExpression andExp = Restrictions.and(code, active);
                createCriteria.add(andExp);

                Supplier supplier = (Supplier) createCriteria.uniqueResult();
                Iterator iterator = supplier.getSupplierInvoiceReturnHasSuppliers().iterator();

                while (iterator.hasNext()) {
                    SupplierInvoiceReturnHasSupplier next = (SupplierInvoiceReturnHasSupplier) iterator.next();
                    dtm.addRow(new Object[]{next.getSupplierInvoiceReturn().getIdInvoiceReturn(), next.getSupplierInvoiceReturn().getSupplierInvoice().getInvoiceNo(), next.getSupplierInvoiceReturn().getSupplierInvoiceItem().getItem().getItemCode(), next.getSupplierInvoiceReturn().getSupplierInvoiceItem().getItem().getIitemName(), next.getSupplierInvoiceReturn().getRetuenDate(), next.getSupplierInvoiceReturn().getReturnQty(), next.getSupplierInvoiceReturn().getItemCondition()});
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            loadTables();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        try {
//
//            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want delete?", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//
//            if (showConfirmDialog == 0) {
//
//                int x = jTable1.getSelectedRow();
//                String supCode = (jTable1.getValueAt(x, 0).toString());
//
//                Session openSession = PoolManager.getSessionFactory().openSession();
//
//                Transaction beginTransaction = openSession.beginTransaction();
//
//                Criteria createCriteria = openSession.createCriteria(SupplierInvoiceReturn.class);
//
//                createCriteria.add(Restrictions.eq("idInvoiceReturn", Integer.parseInt(supCode)));
//
//                SupplierInvoiceReturn supplier = (SupplierInvoiceReturn) createCriteria.uniqueResult();
//
//                supplier.setIsActive("Deactive");
//
//                openSession.update(supplier);
//                beginTransaction.commit();
//                openSession.close();
//                NotificationPopup.Delete();
//
//                loadTables();
//
//            } else {
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
//        if (evt.getButton() == 3) {
//            jPopupMenu1.show();
//        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ViewStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReturnSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.alee.extended.date.WebDateField TxtFromDate;
    public static com.alee.extended.date.WebDateField TxtToDate;
    private javax.swing.JButton btnFilter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadTables() {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(SupplierInvoiceReturn.class);

            createCriteria.add(Restrictions.like("isActive", "Active"));

            List<SupplierInvoiceReturn> list = createCriteria.list();

            System.out.println(list);

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (SupplierInvoiceReturn ir : list) {
                dtm.addRow(new Object[]{ir.getIdInvoiceReturn(), ir.getSupplierInvoice().getInvoiceNo(), ir.getSupplierInvoiceItem().getItem().getItemCode(), ir.getSupplierInvoiceItem().getItem().getIitemName(), ir.getRetuenDate(), decimalFormat.format(ir.getReturnQty()), ir.getItemCondition()});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
