package srcs.CustomersAndInvoice;

import srcs.SupplierAndGRN.*;
import ORM.CashBook;
import ORM.Customers;
import ORM.Grn;
import ORM.Grnpayments;
import ORM.InvoiceHasCustomers;
import ORM.InvoicePayments;
import ORM.Supplier;
import ORM.SupplierInvoice;
import ORM.SupplierInvoicePayments;
import static ReportsODK.DaillySalesSummery.comboType;
import com.alee.laf.WebLookAndFeel;
import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import exClass.dateForm;
import java.awt.print.PrinterException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class CustomerOutstranding extends javax.swing.JFrame {

    Map<String, Integer> sup = new HashMap();

    public CustomerOutstranding() {
        initComponents();
        tblAddPayments.setComponentPopupMenu(jPopupMenu1);
        tableAlign();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboSup = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddPayments = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("View History");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Outstanding | JRTraders");

        jLabel3.setText("Select Type");

        comboSup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Customers Outstanding", "Supplier Outstadings" }));
        comboSup.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboSupPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSupActionPerformed(evt);
            }
        });

        tblAddPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Suplier / Customer Name", "Phone No", "Total Purchased", "Total Paid", "Outstanding", "idCustomer"
            }
        ));
        tblAddPayments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAddPaymentsMouseReleased(evt);
            }
        });
        tblAddPayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAddPaymentsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblAddPayments);
        if (tblAddPayments.getColumnModel().getColumnCount() > 0) {
            tblAddPayments.getColumnModel().getColumn(5).setMinWidth(0);
            tblAddPayments.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblAddPayments.getColumnModel().getColumn(5).setMaxWidth(0);
        }

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
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(387, 387, 387))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(195, 195, 195)
                                    .addComponent(jLabel4))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboSupPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSupPopupMenuWillBecomeInvisible

        DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
        dtm.setRowCount(0);

        if (comboSup.getSelectedIndex() == 1) {
            tblAddPayments.getColumnModel().getColumn(0).setHeaderValue("Customer Name");

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cr = openSession.createCriteria(Customers.class);
            cr.add(Restrictions.eq("isActive", "Active"));

            List<Customers> list = cr.list();

            for (Customers customers : list) {

                Double total = 0.0;
                Double paymenttotal = 0.0;
                Iterator it = customers.getInvoiceHasCustomerses().iterator();

                while (it.hasNext()) {
                    InvoiceHasCustomers next = (InvoiceHasCustomers) it.next();

                    if (next.getInvoice().getIsActive().equals("Active")) {

                        total += next.getInvoice().getNettTotal();

                    }

                }
                Iterator it2 = customers.getInvoicePaymentses().iterator();

                while (it2.hasNext()) {
                    InvoicePayments next = (InvoicePayments) it2.next();

                    if (next.getIsActive().equals("Active")) {

                        paymenttotal += next.getAmount();

                    }

                }

                if (total > paymenttotal) {

                    Vector v = new Vector();
                    v.add(customers.getCustomerscolName());
                    v.add(customers.getCustomersContactNo());
                    v.add(Decimal_Formats.Price(total));
                    v.add(Decimal_Formats.Price(paymenttotal));
                    v.add(Decimal_Formats.Price(total - paymenttotal));
                    v.add(customers.getIdCustomers());
                    dtm.addRow(v);

                }

            }
            
            openSession.close();
     
        
        } else if (comboSup.getSelectedIndex() == 2) {

            try {

                tblAddPayments.getColumnModel().getColumn(0).setHeaderValue("Supplier Name");

                Session sess = PoolManager.getSessionFactory().openSession();

                Criteria cr = sess.createCriteria(Supplier.class);
                cr.add(Restrictions.eq("isActive", "Active"));

                List<Supplier> list = cr.list();

                for (Supplier supplier : list) {

                    Iterator it = supplier.getGrns().iterator();

                    Double total = 0.0;
                    Double paymTotal = 0.0;

                    while (it.hasNext()) {

                        Grn next = (Grn) it.next();

                        if (next.getIsActive().equals("Active")) {

                            total += next.getNettTotal();

                        }

                    }

                    Iterator it2 = supplier.getGrnpaymentses().iterator();

                    while (it2.hasNext()) {
                        Grnpayments next = (Grnpayments) it2.next();

                        if (next.getIsActive().equals("Active")) {

                            paymTotal += next.getAmount();

                        }

                    }

                    if (total > paymTotal) {

                        Vector v = new Vector();
                        v.add(supplier.getSupplierName());
                        v.add(supplier.getSupplierContactNo1());
                        v.add(Decimal_Formats.Price(total));
                        v.add(Decimal_Formats.Price(paymTotal));
                        v.add(Decimal_Formats.Price(total - paymTotal));
                        v.add(supplier.getIdSupplier());
                        dtm.addRow(v);

                    }

                }
                 sess.close();
            } catch (Exception e) {

                e.printStackTrace();

            }

        }


    }//GEN-LAST:event_comboSupPopupMenuWillBecomeInvisible

    private void tblAddPaymentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddPaymentsKeyReleased


    }//GEN-LAST:event_tblAddPaymentsKeyReleased

    private void comboSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSupActionPerformed

    private void tblAddPaymentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddPaymentsMouseReleased

        int button = evt.getButton();
        System.out.println(button);

        if (button == 3) {

            jPopupMenu1.show();

        }


    }//GEN-LAST:event_tblAddPaymentsMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        OutstandingHistory outstandingHistory = new OutstandingHistory();

        DefaultTableModel dtm = (DefaultTableModel) outstandingHistory.jTable1.getModel();
        dtm.setRowCount(0);
        int r = tblAddPayments.getSelectedRow();
        int cusid = (int) tblAddPayments.getValueAt(r, 5);
        String supliername = (String) tblAddPayments.getValueAt(r, 0);
        String contact = (String) tblAddPayments.getValueAt(r, 1);
        System.out.println(cusid);

        if (comboSup.getSelectedIndex() == 1) {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(InvoiceHasCustomers.class);
            createCriteria.createAlias("customers", "c");
            createCriteria.add(Restrictions.eq("c.idCustomers", cusid));
            List<InvoiceHasCustomers> list = createCriteria.list();

            for (InvoiceHasCustomers cusin : list) {

                Double nettTotal = cusin.getInvoice().getNettTotal();
                Double amount = 0.00;
                Iterator iterator = cusin.getInvoice().getInvoicePaymentses().iterator();
                while (iterator.hasNext()) {
                    InvoicePayments gp = (InvoicePayments) iterator.next();

                    if (gp.getIsActive().equals("Active")) {

                        amount += gp.getAmount();
                    }

                }

                if (nettTotal > amount) {

                    dtm.addRow(new Object[]{
                        // cusin.getInvoice().getIdInvoice(),
                        cusin.getInvoice().getInvoiceNo(),
                        cusin.getInvoice().getInvoiceDate(),
                        Decimal_Formats.Price(cusin.getInvoice().getNettTotal()),
                        Decimal_Formats.Price(amount),
                        Decimal_Formats.Price(nettTotal - amount)

                    });

                    outstandingHistory.name.setText(supliername);
                    outstandingHistory.contact.setText(contact);

                    outstandingHistory.setVisible(true);
                }

            }

        } else if (comboSup.getSelectedIndex() == 2) {

            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(SupplierInvoice.class);
                createCriteria.add(Restrictions.eq("isActive", "Active"));
                createCriteria.createAlias("supplier", "s");
                createCriteria.add(Restrictions.eq("s.idSupplier", cusid));
                List<SupplierInvoice> list = createCriteria.list();

                for (SupplierInvoice suppay : list) {

                    Double nettTotal = suppay.getNettTotal();
                    Double amount = 0.00;
                    Iterator iterator = suppay.getSupplierInvoicePaymentses().iterator();
                    while (iterator.hasNext()) {
                        SupplierInvoicePayments gp = (SupplierInvoicePayments) iterator.next();

                        if (gp.getIsActive().equals("Active")) {

                            amount += gp.getAmount();
                        }

                    }

                    if (nettTotal > amount) {

                        dtm.addRow(new Object[]{
                            suppay.getInvoiceNo(),
                            suppay.getInvoiceDate(),
                            Decimal_Formats.Price(suppay.getNettTotal()),
                            Decimal_Formats.Price(amount),
                            Decimal_Formats.Price(nettTotal - amount)

                        });

                        outstandingHistory.name.setText(supliername);
                        outstandingHistory.contact.setText(contact);

                        outstandingHistory.setVisible(true);

                    }

                }

            } catch (Exception e) {

                e.printStackTrace();

            }

        } else if (comboSup.getSelectedIndex() == 3) {

            Session sess = PoolManager.getSessionFactory().openSession();
            Criteria cr = sess.createCriteria(Grn.class);
            cr.add(Restrictions.eq("isActive", "Active"));
            cr.createAlias("supplier", "s");
            cr.add(Restrictions.eq("s.idSupplier", cusid));
            System.out.println(cusid);
            List<Grn> list = cr.list();

            for (Grn grn : list) {

                Double net = grn.getNettTotal();
                Double amount = 0.00;
                Iterator it = grn.getGrnpaymentses().iterator();
                while (it.hasNext()) {
                    Grnpayments next = (Grnpayments) it.next();

                    if (next.getIsActive().equals("Active")) {
                        amount += next.getAmount();
                    }

                }

                if (net > amount) {

                    dtm.addRow(new Object[]{
                        grn.getGrnno(),
                        grn.getGrndate(),
                        Decimal_Formats.Price(grn.getNettTotal()),
                        Decimal_Formats.Price(amount),
                        Decimal_Formats.Price(net - amount)

                    });

                    outstandingHistory.name.setText(supliername);
                    outstandingHistory.contact.setText(contact);

                    outstandingHistory.setVisible(true);

                }

            }

        } else {

            dtm.setRowCount(0);

        }
        {

        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            tblAddPayments.print();
        } catch (PrinterException ex) {
            Logger.getLogger(CustomerOutstranding.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOutstranding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboSup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAddPayments;
    // End of variables declaration//GEN-END:variables

    private void loadSup() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Supplier.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            List<Supplier> list = createCriteria.list();
            for (Supplier supplier : list) {

                comboSup.addItem(supplier.getSupplierCode() + " - " + supplier.getSupplierName());
                sup.put(supplier.getSupplierCode(), supplier.getIdSupplier());

            }
            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void loadTable() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Grn.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            createCriteria.createAlias("supplier", "s");
            createCriteria.add(Restrictions.eq("s.idSupplier", sup.get(comboSup.getSelectedItem().toString().split(" - ")[0])));
            List<Grn> list = createCriteria.list();
            DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
            dtm.setRowCount(0);
            for (Grn grn : list) {

                Double nettTotal = grn.getNettTotal();
                Double amount = 0.00;
                Iterator iterator = grn.getGrnpaymentses().iterator();
                while (iterator.hasNext()) {
                    Grnpayments gp = (Grnpayments) iterator.next();

                    if (gp.getIsActive().equals("Active")) {

                        amount += gp.getAmount();
                    }

                }

                if (nettTotal > amount) {

                    dtm.addRow(new Object[]{
                        grn.getIdGrn(),
                        grn.getGrnno(),
                        grn.getGrndate(),
                        Decimal_Formats.Price(grn.getNettTotal()),
                        Decimal_Formats.Price(amount),
                        Decimal_Formats.Price(nettTotal - amount)

                    });

                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);

        tblAddPayments.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

}
