package Reports;

import ORM.Grnpayments;
import ORM.Supplier;
import ORM.SupplierInvoicePayments;
import static Reports.SupPaymentHistory.tableSupGRN;
import static Reports.ViewCustomersUdaya.s0;
import srcs.*;
import com.alee.laf.WebLookAndFeel;
import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewSuppUdaya extends javax.swing.JFrame {

    public static String a;
    public static String a1;
    public static String a2;
    public static String a3;
    public static String a4;
    public static String a5;
    public static String a6;
    public static String a7;
    public static String a8;

    public static Integer s01;

    public ViewSuppUdaya() {
        initComponents();
        loadSupp();
        tableSupplier.setComponentPopupMenu(jPopupMenu1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSupplier = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        jMenuItem3.setText("Edit...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setText("Delete");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Suppliers | JRTraders");

        tableSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Suplier ID", "Name", "Contact 1", "Contact 2", "Email", "Add1", "Add2", "City"
            }
        ));
        tableSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableSupplierMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableSupplier);
        if (tableSupplier.getColumnModel().getColumnCount() > 0) {
            tableSupplier.getColumnModel().getColumn(0).setMinWidth(0);
            tableSupplier.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableSupplier.getColumnModel().getColumn(0).setMaxWidth(0);
            tableSupplier.getColumnModel().getColumn(1).setMinWidth(100);
            tableSupplier.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableSupplier.getColumnModel().getColumn(1).setMaxWidth(100);
            tableSupplier.getColumnModel().getColumn(2).setMinWidth(300);
            tableSupplier.getColumnModel().getColumn(2).setPreferredWidth(300);
            tableSupplier.getColumnModel().getColumn(2).setMaxWidth(300);
            tableSupplier.getColumnModel().getColumn(6).setMinWidth(0);
            tableSupplier.getColumnModel().getColumn(6).setPreferredWidth(0);
            tableSupplier.getColumnModel().getColumn(6).setMaxWidth(0);
            tableSupplier.getColumnModel().getColumn(7).setMinWidth(0);
            tableSupplier.getColumnModel().getColumn(7).setPreferredWidth(0);
            tableSupplier.getColumnModel().getColumn(7).setMaxWidth(0);
            tableSupplier.getColumnModel().getColumn(8).setMinWidth(0);
            tableSupplier.getColumnModel().getColumn(8).setPreferredWidth(0);
            tableSupplier.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        jLabel1.setText("Type ID or Name");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {
            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {
                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Supplier.class);
                //createCriteria.add(Restrictions.like("supplierCode", txtSearch.getText() + "%"));

                Criterion code = Restrictions.like("supplierCode", "%" + txtSearch.getText() + "%");
                Criterion active = Restrictions.like("isActive", "Active");
                LogicalExpression andExp = Restrictions.and(code, active);
                createCriteria.add(andExp);

                List<Supplier> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableSupplier.getModel();
                dtm.setRowCount(0);

                for (Supplier supplier : list) {

                    dtm.addRow(new Object[]{supplier.getIdSupplier(), supplier.getSupplierCode(), supplier.getSupplierName(), supplier.getSupplierContactNo1(), supplier.getSupplierContactNo2(), supplier.getSupplierEmail()});

                }

            } else {
                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Supplier.class);
                //createCriteria.add(Restrictions.like("supplierName", txtSearch.getText() + "%"));

                Criterion supname = Restrictions.like("supplierName", "%" + txtSearch.getText() + "%");
                Criterion active = Restrictions.like("isActive", "Active");
                LogicalExpression andExp = Restrictions.and(supname, active);
                createCriteria.add(andExp);

                List<Supplier> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableSupplier.getModel();
                dtm.setRowCount(0);

                for (Supplier supplier : list) {

                    dtm.addRow(new Object[]{supplier.getIdSupplier(), supplier.getSupplierCode(), supplier.getSupplierName(), supplier.getSupplierContactNo1(), supplier.getSupplierContactNo2(), supplier.getSupplierEmail()});

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            int x = tableSupplier.getSelectedRow();
            a = (tableSupplier.getModel().getValueAt(x, 0).toString());
            a1 = (tableSupplier.getModel().getValueAt(x, 1).toString());
            a2 = (tableSupplier.getModel().getValueAt(x, 2).toString());
            a3 = (tableSupplier.getModel().getValueAt(x, 3).toString());
            a4 = (tableSupplier.getModel().getValueAt(x, 4).toString());
            a5 = (tableSupplier.getModel().getValueAt(x, 5).toString());
            a6 = (tableSupplier.getModel().getValueAt(x, 6).toString());
            a7 = (tableSupplier.getModel().getValueAt(x, 7).toString());
            a8 = (tableSupplier.getModel().getValueAt(x, 8).toString());

            EditSupplyer editSupplyer = new EditSupplyer();
            editSupplyer.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Delete?",
                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (showConfirmDialog == 0) {

                int x = tableSupplier.getSelectedRow();
                String supCode = (tableSupplier.getValueAt(x, 0).toString());

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(Supplier.class);

                createCriteria.add(Restrictions.eq("idSupplier", Integer.parseInt(supCode)));

                Supplier supplier = (Supplier) createCriteria.uniqueResult();

                supplier.setIsActive("Deactive");

                openSession.update(supplier);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.save();

                loadSupp();

            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void tableSupplierMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSupplierMouseReleased

        if (evt.getButton() == 3) {
            jPopupMenu1.show();
        }

    }//GEN-LAST:event_tableSupplierMouseReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSuppUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tableSupplier;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static void loadSupp() {
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(Supplier.class);

            createCriteria.add(Restrictions.like("isActive", "Active"));

            List<Supplier> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tableSupplier.getModel();
            dtm.setRowCount(0);

            for (Supplier supplier : list) {

                dtm.addRow(new Object[]{supplier.getIdSupplier(), supplier.getSupplierCode(), supplier.getSupplierName(), supplier.getSupplierContactNo1(), supplier.getSupplierContactNo2(), supplier.getSupplierEmail(), supplier.getSupplierAddress1(), supplier.getSupplierAddress2(), supplier.getSupplierCity()});

            }
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
