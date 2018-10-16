package srcs.CustomersAndInvoice;

import ORM.CashBook;
import ORM.Customers;
import ORM.Invoice;
import ORM.InvoiceHasCustomers;
import ORM.InvoicePayments;
import com.alee.laf.WebLookAndFeel;
import exClass.DB;
import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import exClass.dateForm;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import srcs.Login;

public class AddCusInvoicePayments extends javax.swing.JFrame {

    Map<String, Integer> cust = new HashMap();

    public AddCusInvoicePayments() {
        initComponents();
        ComboToTXT2();
        tableAlign();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtCurBalance = new javax.swing.JTextField();
        comboCustomer = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddPayments = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Invoice Payments | JRTraders");

        jLabel3.setText("Select Customer");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtCurBalance.setEditable(false);
        txtCurBalance.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtCurBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCurBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurBalanceActionPerformed(evt);
            }
        });

        comboCustomer.setEditable(true);
        comboCustomer.setToolTipText("Press Enter after choose");
        comboCustomer.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboCustomerPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        tblAddPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Invoice NO", "Invoice Date", "Invoice Total", "Total Paid", "Outstanding", "Paid Amount"
            }
        ));
        tblAddPayments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAddPaymentsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblAddPayments);
        if (tblAddPayments.getColumnModel().getColumnCount() > 0) {
            tblAddPayments.getColumnModel().getColumn(0).setMinWidth(0);
            tblAddPayments.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblAddPayments.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel1.setText("Current Balance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCurBalance)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurBalance))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboCustomerPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboCustomerPopupMenuWillBecomeInvisible


    }//GEN-LAST:event_comboCustomerPopupMenuWillBecomeInvisible

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        for (int i = 0; i < tblAddPayments.getRowCount(); i++) {
            System.out.println(i);
            if (tblAddPayments.getValueAt(i, 6) != null) {

                try {
                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction = openSession.beginTransaction();

                    Invoice Inv = new Invoice();
                    Inv.setIdInvoice(Integer.parseInt(tblAddPayments.getValueAt(i, 0).toString()));

                    Customers customer = new Customers();
                    customer.setIdCustomers(cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1]));

                    InvoicePayments invpay = new InvoicePayments();
                    invpay.setPaymentDate(dateForm.currentdate());
                    invpay.setAmount(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    invpay.setPaymentType("Cash");
                    invpay.setCustomers(customer);
                    invpay.setIsActive("Active");
                    invpay.setInvoice(Inv);
                    openSession.save(invpay);

                    CashBook cashBook = new CashBook();
                    cashBook.setDebit(0.00);
                    cashBook.setCredit(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    cashBook.setCbdate(dateForm.currentdate());
                    cashBook.setDescriotion("Payment for Invoice " + tblAddPayments.getValueAt(i, 1).toString());

                    openSession.save(cashBook);
                    beginTransaction.commit();
                    openSession.close();
                    System.out.println("Payment ID"+ invpay.getIdInvoicePayment() );
//                    InputStream Rp = getClass().getResourceAsStream("/JReports/CusPaymentRecipt.jrxml");
//                    JasperReport jr = JasperCompileManager.compileReport(Rp);
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("IdInvPayment", invpay.getIdInvoicePayment());

                    JasperPrint jp = JasperFillManager.fillReport(Login.jrCusPayment, map, DB.getCon());
//                    JasperViewer.viewReport(jp);
                    JasperPrintManager.printReport(jp, true);
                    
                    NotificationPopup.save();

                    comboCustomer.setSelectedIndex(-1);

                    txtCurBalance.setText(null);
                    DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
                    dtm.setRowCount(0);
                    comboCustomer.grabFocus();

                } catch (Exception e) {
                    e.printStackTrace();

                }

            }

        }

//        if (!txtPaidAmo.getText().isEmpty()) {
//
//            try {
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Transaction beginTransaction = openSession.beginTransaction();
//
//                Supplier supplier = new Supplier();
//                supplier.setIdSupplier(sup.get(comboSup.getSelectedItem().toString().split(" - ")[0]));
//
//                Grnpayments grn = new Grnpayments();
//                grn.setPaymentDate(dateForm.currentdate());
//                grn.setAmount(Double.parseDouble(txtPaidAmo.getText()));
//                grn.setPaymentType(comboType.getSelectedItem().toString());
//                grn.setSupplier(supplier);
//                grn.setIsActive("Active");
//
//                openSession.save(grn);
//
//                CashBook cashBook = new CashBook();
//                cashBook.setCredit(0.00);
//                cashBook.setDebit(Double.parseDouble(txtPaidAmo.getText()));
//                cashBook.setCbdate(dateForm.currentdate());
//
//                openSession.save(cashBook);
//
//                beginTransaction.commit();
//                openSession.close();
//
//                NotificationPopup.save();
//
//                comboSup.setSelectedIndex(0);
//                comboType.setSelectedIndex(0);
//                txtCurBalance.setText(null);
//                txtPaidAmo.setText(null);
//
//                comboSup.grabFocus();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//
//        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblAddPaymentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAddPaymentsKeyReleased

        if (evt.getKeyCode() == 10) {
            try {
                int row = tblAddPayments.getSelectedRow();
                String Value = tblAddPayments.getValueAt(row, 3).toString();

                tblAddPayments.editCellAt(tblAddPayments.getSelectedRow() + 1, 6);
                tblAddPayments.setSurrendersFocusOnKeystroke(true);
                tblAddPayments.getEditorComponent().requestFocus();
                tblAddPayments.setRowSelectionInterval(tblAddPayments.getSelectedRow() + 1, tblAddPayments.getSelectedRow() + 1);

            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_tblAddPaymentsKeyReleased

    private void txtCurBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurBalanceActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCusInvoicePayments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblAddPayments;
    private javax.swing.JTextField txtCurBalance;
    // End of variables declaration//GEN-END:variables

    private void loadTableV2() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(InvoiceHasCustomers.class);
            createCriteria.createAlias("customers", "c");
            createCriteria.add(Restrictions.eq("c.idCustomers", cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1])));
            List<InvoiceHasCustomers> list = createCriteria.list();
            DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
            dtm.setRowCount(0);
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
                        cusin.getInvoice().getIdInvoice(),
                        cusin.getInvoice().getInvoiceNo(),
                        cusin.getInvoice().getInvoiceDate(),
                        Decimal_Formats.Price(cusin.getInvoice().getNettTotal()),
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
        tblAddPayments.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tblAddPayments.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

    public void comboFilter2(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            if (enteredText.matches("\\d+")) {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customers.class);
                    createCriteria.add(Restrictions.like("customersContactNo", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isActive", "Active"));
                    List<Customers> list = createCriteria.list();

                    for (Customers customers : list) {
                        str1 = customers.getCustomerscolName() + " - " + customers.getCustomersContactNo();
                        filterArray.add(str1);
                        cust.put(customers.getCustomersContactNo(), customers.getIdCustomers());
                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customers.class);
                    createCriteria.add(Restrictions.like("customerscolName", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isActive", "Active"));
                    List<Customers> list = createCriteria.list();

                    for (Customers customers : list) {

                        str1 = customers.getCustomerscolName() + " - " + customers.getCustomersContactNo();
                        filterArray.add(str1);
                        cust.put(customers.getCustomersContactNo(), customers.getIdCustomers());

                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboCustomer.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboCustomer.setSelectedItem(enteredText);
            comboCustomer.showPopup();
        } else {
            comboCustomer.hidePopup();
        }

    }

    private void ComboToTXT2() {
        final JTextField textfield0 = (JTextField) comboCustomer.getEditor().getEditorComponent();
        textfield0.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            settotal();

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter2(textfield0.getText());

                        }

                    }
                });

            }
        });
    }

    private void settotal() {
        double invtotal = 0;
        double paidtot = 0;

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Customers.class);
            createCriteria.add(Restrictions.eq("idCustomers", cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1])));
            Customers uniqueResult = (Customers) createCriteria.uniqueResult();

            Iterator iterator = uniqueResult.getInvoiceHasCustomerses().iterator();

            while (iterator.hasNext()) {

                InvoiceHasCustomers invhascus = (InvoiceHasCustomers) iterator.next();

                invtotal += invhascus.getInvoice().getNettTotal();

            }

            Iterator iterator1 = uniqueResult.getInvoicePaymentses().iterator();
            while (iterator1.hasNext()) {

                InvoicePayments next = (InvoicePayments) iterator1.next();
                if (next.getIsActive().equals("Active")) {
                    paidtot += next.getAmount();

                }

            }
            txtCurBalance.setText(Decimal_Formats.Price(invtotal - paidtot) + "");
            openSession.close();
            loadTableV2();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
