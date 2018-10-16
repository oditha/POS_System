package Reports;

import ORM.Customers;
import ORM.InvoicePayments;
import srcs.*;
import com.alee.laf.WebLookAndFeel;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewCustomersUdaya extends javax.swing.JFrame {

    public static String s;
    public static String s1;
    public static String s2;
    public static String s3;

    public static String s0;

    public ViewCustomersUdaya() {
        initComponents();
        loadCustom();
        tableCustomer.setComponentPopupMenu(jPopupMenu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        jMenuItem1.setText("Edit...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItem1);

        jMenuItem2.setText("View Invoice Payment");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItem2);

        jMenuItem3.setText("Delete");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Customers | JRTraders");

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "NIC", "Name", "Address", "Contact No"
            }
        ));
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableCustomerMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);
        if (tableCustomer.getColumnModel().getColumnCount() > 0) {
            tableCustomer.getColumnModel().getColumn(0).setMinWidth(0);
            tableCustomer.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableCustomer.getColumnModel().getColumn(0).setMaxWidth(0);
            tableCustomer.getColumnModel().getColumn(2).setMinWidth(350);
            tableCustomer.getColumnModel().getColumn(2).setPreferredWidth(350);
            tableCustomer.getColumnModel().getColumn(2).setMaxWidth(350);
        }

        jLabel1.setText("Type NIC or Name");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {

            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Customers.class);
                //createCriteria.add(Restrictions.like("customersNic", txtSearch.getText() + "%"));

                Criterion nic = Restrictions.like("customersNic", "%" + txtSearch.getText() + "%");
                Criterion active = Restrictions.like("isActive", "Active");
                LogicalExpression andExp = Restrictions.and(nic, active);
                createCriteria.add(andExp);

                List<Customers> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
                dtm.setRowCount(0);
                for (Customers customers : list) {

                    dtm.addRow(new Object[]{customers.getIdCustomers(), customers.getCustomersNic(), customers.getCustomerscolName(), customers.getCustomersAddress1() + "," + customers.getCustomersAddress2() + "," + customers.getCustomersCity(), customers.getCustomersContactNo()});

                }

            } else {

                Session openSession = PoolManager.getSessionFactory().openSession();

                Criteria createCriteria = openSession.createCriteria(Customers.class);
                //createCriteria.add(Restrictions.like("customerscolName", txtSearch.getText() + "%"));

                Criterion cusname = Restrictions.like("customerscolName", "%" + txtSearch.getText() + "%");
                Criterion active = Restrictions.like("isActive", "Active");
                LogicalExpression andExp = Restrictions.and(cusname, active);
                createCriteria.add(andExp);

                List<Customers> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
                dtm.setRowCount(0);
                for (Customers customers : list) {

                    dtm.addRow(new Object[]{customers.getIdCustomers(), customers.getCustomersNic(), customers.getCustomerscolName(), customers.getCustomersAddress1() + "," + customers.getCustomersAddress2() + "," + customers.getCustomersCity(), customers.getCustomersContactNo()});

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked

    }//GEN-LAST:event_tableCustomerMouseClicked

    private void tableCustomerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseReleased

        if (evt.getButton() == 3) {
            jPopupMenu.show();
        }

    }//GEN-LAST:event_tableCustomerMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int x = tableCustomer.getSelectedRow();
        s = (tableCustomer.getModel().getValueAt(x, 1).toString());
        s1 = (tableCustomer.getModel().getValueAt(x, 2).toString());
        s2 = (tableCustomer.getModel().getValueAt(x, 3).toString());
        s3 = (tableCustomer.getModel().getValueAt(x, 4).toString());

        EditCustomers ed = new EditCustomers();
        ed.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        DecimalFormat decimalFormat = new DecimalFormat(".00");
        int x = tableCustomer.getSelectedRow();
        s0 = (tableCustomer.getModel().getValueAt(x, 0).toString());

        int s01 = Integer.parseInt(s0);

        CusInvoicePayment cusInvoicePayment = new CusInvoicePayment();

        DefaultTableModel dtm = (DefaultTableModel) cusInvoicePayment.tableCusInvoice.getModel();
        dtm.setRowCount(0);

        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(InvoicePayments.class);
        cr.createAlias("customers", "s");
        cr.add(Restrictions.eq("s.idCustomers", s01));

        List<InvoicePayments> l = cr.list();

        for (InvoicePayments ip : l) {
            dtm.addRow(new Object[]{ip.getInvoice().getInvoiceNo(), ip.getPaymentDate(), ip.getPaymentType(), decimalFormat.format(ip.getAmount())});

        }

        cusInvoicePayment.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to Delete?",
                    "", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (showConfirmDialog == 0) {

                int x = tableCustomer.getSelectedRow();
                String supCode = (tableCustomer.getModel().getValueAt(x, 0).toString());

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(Customers.class);

                createCriteria.add(Restrictions.eq("idCustomers", Integer.parseInt(supCode)));

                Customers supplier = (Customers) createCriteria.uniqueResult();

                supplier.setIsActive("Deactive");

                openSession.update(supplier);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.save();

                loadCustom();

            } else {

                //do NO Code
                
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomersUdaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static void loadCustom() {

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(Customers.class);

            createCriteria.add(Restrictions.like("isActive", "Active"));

            List<Customers> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
            dtm.setRowCount(0);
            for (Customers customers : list) {

                dtm.addRow(new Object[]{customers.getIdCustomers(), customers.getCustomersNic(), customers.getCustomerscolName(), customers.getCustomersAddress1() + "," + customers.getCustomersAddress2() + "," + customers.getCustomersCity(), customers.getCustomersContactNo()});

            }
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
