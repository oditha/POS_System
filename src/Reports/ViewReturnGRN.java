package Reports;

import ORM.Supplier;
import ORM.SupplierReturn;
import com.alee.laf.WebLookAndFeel;
import exClass.PoolManager;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewReturnGRN extends javax.swing.JFrame {

    public int getSupID;

    public ViewReturnGRN() {
        initComponents();
        loadTables();

        TxtFromDate.setEnabled(false);
        TxtToDate.setEnabled(false);

        //jTable1.setComponentPopupMenu(jPopupMenu1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        TxtToDate = new com.alee.extended.date.WebDateField();
        jLabel1 = new javax.swing.JLabel();
        TxtFromDate = new com.alee.extended.date.WebDateField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnFilter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("Delete");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View GRN Return | JRTraders");

        TxtToDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtToDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtToDateMouseClicked(evt);
            }
        });

        jLabel1.setText("To");

        TxtFromDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtFromDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtFromDateMouseClicked(evt);
            }
        });

        jCheckBox1.setText("Filter By Date");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        jLabel2.setText("From");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "GRN No", "Item Code", "Item Name", "Return Date", "Return QTY"
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
            jTable1.getColumnModel().getColumn(3).setMinWidth(500);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(500);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(500);
        }

        jLabel3.setText("Type Supplier Name");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(TxtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(29, 29, 29)
                                                .addComponent(TxtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jScrollPane1))))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2))
                            .addComponent(TxtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(TxtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnFilter)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        DecimalFormat decimalFormat = new DecimalFormat("00");
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(SupplierReturn.class);

            //createCriteria.add(Restrictions.between("retuenDate", TxtFromDate.getText(), TxtToDate.getText()));
            Criterion name = Restrictions.between("retuenDate", TxtFromDate.getText(), TxtToDate.getText());
            Criterion active = Restrictions.like("isActive", "Active");
            LogicalExpression andExp = Restrictions.and(name, active);
            createCriteria.add(andExp);

            List<SupplierReturn> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (SupplierReturn sr : list) {
                dtm.addRow(new Object[]{sr.getIdSupplierReturn(), sr.getGrnitem().getGrn().getGrnno(), sr.getGrnitem().getItem().getItemCode(), sr.getGrnitem().getItem().getIitemName(), sr.getRetuenDate(), sr.getReturnQty()});
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
            TxtFromDate.setDate(null);
            TxtToDate.setDate(null);
            loadTables();
        } else {
            TxtFromDate.setEnabled(false);
            TxtToDate.setEnabled(false);
            TxtFromDate.setDate(null);
            TxtToDate.setDate(null);
            loadTables();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (!(jTextField1.getText().isEmpty())) {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria c = openSession.createCriteria(Supplier.class);

                //c.add(Restrictions.like("supplierName", jTextField1.getText() + "%"));
                Criterion name = Restrictions.like("supplierName", jTextField1.getText() + "%");
                Criterion active = Restrictions.like("isActive", "Active");
                LogicalExpression andExp = Restrictions.and(name, active);
                c.add(andExp);

                Supplier supplier = (Supplier) c.uniqueResult();
                //Supplier supplier = new Supplier();

                Iterator iterator = supplier.getSupplierReturns().iterator();

                while (iterator.hasNext()) {
                    SupplierReturn next = (SupplierReturn) iterator.next();
                    dtm.addRow(new Object[]{next.getIdSupplierReturn(), next.getGrnitem().getGrn().getGrnno(), next.getGrnitem().getItem().getItemCode(), next.getGrnitem().getItem().getIitemName(), next.getRetuenDate(), next.getReturnQty()});

                }

//                List<Supplier> list=c.list();
//                for (Supplier supp : list) {
//                    getSupID=supp.getIdSupplier();
//                    System.out.println(getSupID);
//                }
//                Criteria c1 = openSession.createCriteria(SupplierReturn.class);
//                c1.add(Restrictions.eq("idSupplier", getSupID));
//                
//                List<SupplierReturn> list1=c1.list();
//                
//                for (SupplierReturn supplierReturn : list1) {
//                    dtm.addRow(new Object[]{supplierReturn.getGrnitem().getGrn().getGrnno(), supplierReturn.getGrnitem().getItem().getItemCode(), supplierReturn.getGrnitem().getItem().getIitemName(), supplierReturn.getRetuenDate(), supplierReturn.getReturnQty()});
//                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            loadTables();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        try {
//
//            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Delete?",
//                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
//                Criteria createCriteria = openSession.createCriteria(SupplierReturn.class);
//
//                createCriteria.add(Restrictions.eq("idSupplierReturn", Integer.parseInt(supCode)));
//
//                SupplierReturn supplier = (SupplierReturn) createCriteria.uniqueResult();
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
//
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
                new ViewReturnGRN().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadTables() {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(SupplierReturn.class);

            createCriteria.add(Restrictions.like("isActive", "Active"));

            List<SupplierReturn> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (SupplierReturn sr : list) {
                //dtm.addRow(new Object[]{ir.getGrnitem().getInvoiceNo(), ir.getInvoiceItem().getItem().getItemCode(), ir.getInvoiceItem().getItem().getIitemName(), ir.getRetuenDate(), decimalFormat.format(ir.getReturnQty()), ir.getItemCondition()});
                dtm.addRow(new Object[]{sr.getIdSupplierReturn(), sr.getGrnitem().getGrn().getGrnno(), sr.getGrnitem().getItem().getItemCode(), sr.getGrnitem().getItem().getIitemName(), sr.getRetuenDate(), sr.getReturnQty()});
            }

            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
