package srcs.SupplierAndGRN;

import ORM.CashBook;
import ORM.Supplier;
import ORM.SupplierInvoice;
import ORM.SupplierInvoicePayments;
import com.alee.laf.WebLookAndFeel;
import exClass.DB;
import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import exClass.dateForm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import srcs.Login;

public class AddSupInvoicePayments extends javax.swing.JFrame {

    Map<String, Integer> sup = new HashMap();

    public AddSupInvoicePayments() {
        initComponents();
        loadSup();
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
        comboSup = new javax.swing.JComboBox<>();
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
        setTitle("Supplier Invoice Payments | Bit Win Computers");

        jLabel3.setText("Select Supplyer");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtCurBalance.setEditable(false);
        txtCurBalance.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtCurBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurBalanceActionPerformed(evt);
            }
        });

        comboSup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
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
                            .addComponent(comboSup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(comboSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void comboSupPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboSupPopupMenuWillBecomeInvisible

        double grntot = 0;
        double paidtot = 0;

        if (comboSup.getSelectedIndex() != 0) {

            try {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Supplier.class);
                createCriteria.add(Restrictions.eq("idSupplier", sup.get(comboSup.getSelectedItem().toString().split(" - ")[0])));
                Supplier uniqueResult = (Supplier) createCriteria.uniqueResult();

                Iterator iterator = uniqueResult.getSupplierInvoices().iterator();

                while (iterator.hasNext()) {

                    SupplierInvoice grn = (SupplierInvoice) iterator.next();
                    if (grn.getIsActive().equals("Active")) {
                        grntot += grn.getNettTotal();

                    }

                }

                Iterator iterator1 = uniqueResult.getSupplierInvoicePaymentses().iterator();
                while (iterator1.hasNext()) {

                    SupplierInvoicePayments next = (SupplierInvoicePayments) iterator1.next();
                    if (next.getIsActive().equals("Active")) {
                        paidtot += next.getAmount();

                    }

                }
                txtCurBalance.setText(Decimal_Formats.Price(grntot - paidtot) + "");
                openSession.close();
                loadTable();
            } catch (Exception e) {

                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_comboSupPopupMenuWillBecomeInvisible

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        for (int i = 0; i < tblAddPayments.getRowCount(); i++) {
            System.out.println(i);
            if (tblAddPayments.getValueAt(i, 6) != null) {

                try {
                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction = openSession.beginTransaction();

                    SupplierInvoice supInv = new SupplierInvoice();
                    supInv.setIdInvoice(Integer.parseInt(tblAddPayments.getValueAt(i, 0).toString()));

                    Supplier supplier = new Supplier();
                    supplier.setIdSupplier(sup.get(comboSup.getSelectedItem().toString().split(" - ")[0]));

                    SupplierInvoicePayments grn = new SupplierInvoicePayments();
                    grn.setPaymentDate(dateForm.currentdate());
                    grn.setAmount(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    grn.setPaymentType("Cash");
                    grn.setSupplier(supplier);
                    grn.setIsActive("Active");
                    grn.setSupplierInvoice(supInv);
                    openSession.save(grn);

                    CashBook cashBook = new CashBook();
                    cashBook.setDebit(0.00);
                    cashBook.setCredit(Double.parseDouble(tblAddPayments.getValueAt(i, 6).toString()));
                    cashBook.setCbdate(dateForm.currentdate());
                    cashBook.setDescriotion("Payment for supplier Invoice " + tblAddPayments.getValueAt(i, 1).toString());
                    openSession.save(cashBook);

                    beginTransaction.commit();
                    openSession.close();

//                    InputStream Rp = getClass().getResourceAsStream("/JReports/CusPaymentRecipt.jrxml");
//                    JasperReport jr = JasperCompileManager.compileReport(Rp);
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("IdInvPayment", grn.getIdInvoicePayment());

                    JasperPrint jp = JasperFillManager.fillReport(Login.jrSupPayment, map, DB.getCon());
//                    JasperViewer.viewReport(jp);
                    JasperPrintManager.printReport(jp, true);

                    NotificationPopup.save();

                    comboSup.setSelectedIndex(0);
//                    comboType.setSelectedIndex(0);
                    txtCurBalance.setText(null);
                    DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
                    dtm.setRowCount(0);
                    comboSup.grabFocus();

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
                new AddSupInvoicePayments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblAddPayments;
    private javax.swing.JTextField txtCurBalance;
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
            Criteria createCriteria = openSession.createCriteria(SupplierInvoice.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            createCriteria.createAlias("supplier", "s");
            createCriteria.add(Restrictions.eq("s.idSupplier", sup.get(comboSup.getSelectedItem().toString().split(" - ")[0])));
            List<SupplierInvoice> list = createCriteria.list();
            DefaultTableModel dtm = (DefaultTableModel) tblAddPayments.getModel();
            dtm.setRowCount(0);
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
                        suppay.getIdInvoice(),
                        suppay.getInvoiceNo(),
                        suppay.getInvoiceDate(),
                        Decimal_Formats.Price(suppay.getNettTotal()),
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

}
