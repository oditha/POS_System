package srcs.SupplierAndGRN;


import ORM.CashBook;
import ORM.Customers;
import ORM.Invoice;
import ORM.InvoiceItem;
import ORM.InvoicePayments;
import ORM.Item;
import ORM.ItemPrices;
import ORM.ItemSereal;
import ORM.Stock;
import ORM.Supplier;
import ORM.SupplierInvoice;
import ORM.SupplierInvoiceItem;
import ORM.SupplierInvoicePayments;
import com.alee.laf.WebLookAndFeel;
import exClass.AutoCompletion;
import exClass.Decimal_Formats;
import exClass.PoolManager;
import exClass.dateForm;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import static srcs.SupplierAndGRN.AddGRN.comboItemName;

public class AddSupInvoices_BAK extends javax.swing.JFrame {

    public static Map<String, Integer> cus = new HashMap<String, Integer>();

    Map<String, Integer> itm = new HashMap();
    Map<String, String> itmNames = new HashMap();
    Map<String, Integer> sup = new HashMap();

    public AddSupInvoices_BAK() {
        initComponents();
        txtGrnDate.setText(dateForm.setdate());
        loadInvNo();
        ComboToTXT();
        loadSup();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGrnDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtInvoiceNo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtQTY = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPaid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtItemDiscount = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNetTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboItemName = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        comboPrice = new javax.swing.JComboBox<String>();
        txtSerial = new javax.swing.JTextField();
        comboSupllier = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier Invoice | JRTraders");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGrnDate.setEditable(false);
        getContentPane().add(txtGrnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, -1));

        jLabel3.setText("GRN DATE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel4.setText("Item Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Unit Price", "QTY", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 940, 200));

        btnSave.setText("Save Invoice");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 130, 40));

        jLabel6.setText("Invoice No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        txtInvoiceNo.setEditable(false);
        getContentPane().add(txtInvoiceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 190, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 900, 20));

        jLabel10.setText("Quantity");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, -1));

        txtQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQTYKeyReleased(evt);
            }
        });
        getContentPane().add(txtQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 190, -1));

        jLabel11.setText("Invoice Total");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 150, -1));

        jLabel12.setText("Paid Amount");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        txtPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaidKeyReleased(evt);
            }
        });
        getContentPane().add(txtPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 150, -1));

        jLabel14.setText("Unit Price");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        txtUnitPrice.setEditable(false);
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 190, -1));

        jLabel15.setText("Item Discount");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        txtItemDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemDiscountActionPerformed(evt);
            }
        });
        getContentPane().add(txtItemDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 190, -1));

        jLabel16.setText("Discount");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscountKeyReleased(evt);
            }
        });
        getContentPane().add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 150, 30));

        jLabel17.setText("Net Total");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        txtNetTotal.setEditable(false);
        txtNetTotal.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        getContentPane().add(txtNetTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 150, -1));

        jLabel8.setText("Item Serial");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        comboItemName.setEditable(true);
        comboItemName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboItemNamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(comboItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 400, -1));

        jLabel5.setText("Price Variation");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        comboPrice.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboPricePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(comboPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 190, -1));

        txtSerial.setText("NA");
        txtSerial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerialKeyReleased(evt);
            }
        });
        getContentPane().add(txtSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 190, -1));

        comboSupllier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        getContentPane().add(comboSupllier, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 340, -1));

        jLabel1.setText("Select Supplyer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (!txtNetTotal.getText().isEmpty()) {

            try {
                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();

                Supplier supllier = new Supplier();
                supllier.setIdSupplier(sup.get(comboSupllier.getSelectedItem().toString().split(" - ")[0]));

                SupplierInvoice invoice = new SupplierInvoice();

                invoice.setInvoiceNo(txtInvoiceNo.getText());
                invoice.setInvoiceDate(txtGrnDate.getText());
                invoice.setSupplier(supllier);
                invoice.setSubTotal(Double.parseDouble(txtTotal.getText()));
                try {
                    invoice.setDiscount(Double.parseDouble(txtDiscount.getText()));
                } catch (Exception e) {
                }
                invoice.setNettTotal(Double.parseDouble(txtNetTotal.getText()));
                invoice.setIsActive("Active");
                invoice.setCreatedBy("ADMIN");

                openSession.save(invoice);

                for (int i = 0; i < jTable1.getRowCount(); i++) {

                    Item item = new Item();
                    item.setIdItem(itm.get(jTable1.getValueAt(i, 0)));

                    SupplierInvoiceItem invoiceItem = new SupplierInvoiceItem();
                    invoiceItem.setSupplierInvoice(invoice);
                    invoiceItem.setItem(item);
                    invoiceItem.setQty(Integer.parseInt(jTable1.getValueAt(i, 4).toString()));
                    invoiceItem.setUnitPrice(Double.parseDouble(jTable1.getValueAt(i, 3).toString()));
                    invoiceItem.setNettTotalItm(Double.parseDouble(jTable1.getValueAt(i, 5).toString()));

                    invoiceItem.setIsActive("Active");

                    openSession.save(invoiceItem);

                    Criteria createCriteria = openSession.createCriteria(Stock.class);
                    createCriteria.createAlias("item", "i");
                    createCriteria.add(Restrictions.eq("i.idItem", itm.get(jTable1.getValueAt(i, 0).toString())));
                    Stock stk = (Stock) createCriteria.uniqueResult();
                    stk.setQty(stk.getQty() - Double.parseDouble(jTable1.getValueAt(i, 4).toString()));

                    openSession.update(stk);

                }

                SupplierInvoicePayments ip = new SupplierInvoicePayments();
                ip.setSupplier(supllier);
                ip.setAmount(Double.parseDouble(txtPaid.getText()));
                ip.setPaymentDate(txtGrnDate.getText());
                ip.setIsActive("Active");

                openSession.save(ip);

                CashBook cb = new CashBook();
                cb.setDebit(0.00);
                cb.setCredit(Double.parseDouble(txtPaid.getText()));
                cb.setCbdate(txtGrnDate.getText());

                openSession.save(cb);
                beginTransaction.commit();
                openSession.close();

                loadInvNo();
//                jLabel7.setText("Customer Name");

                comboItemName.setSelectedIndex(-1);
//                comboSerial.setSelectedIndex(-1);
                comboPrice.setSelectedIndex(-1);

                txtNetTotal.setText(null);
                txtTotal.setText(null);
                txtPaid.setText(null);
                txtDiscount.setText(null);

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtItemDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemDiscountActionPerformed

    private void comboPricePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboPricePopupMenuWillBecomeInvisible

        if (!comboPrice.getSelectedItem().equals("Select")) {

            txtUnitPrice.setText(comboPrice.getSelectedItem().toString());
            txtQTY.grabFocus();
        }
    }//GEN-LAST:event_comboPricePopupMenuWillBecomeInvisible

    private void comboItemNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboItemNamePopupMenuWillBecomeInvisible


    }//GEN-LAST:event_comboItemNamePopupMenuWillBecomeInvisible

    private void txtQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyReleased

        if (evt.getKeyCode() == 10) {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

            double unitprice = Double.parseDouble(txtUnitPrice.getText());
            double QTY = Double.parseDouble(txtQTY.getText());

            if (txtItemDiscount.getText().isEmpty()) {

                dtm.addRow(new Object[]{
                    comboItemName.getSelectedItem().toString().split(" - ")[1],
                    comboItemName.getSelectedItem().toString().split(" - ")[0],
                    unitprice,
                    txtQTY.getText(),
                    unitprice * QTY

                });

            } else {

                double Discount = Double.parseDouble(txtItemDiscount.getText());
                dtm.addRow(new Object[]{
                    comboItemName.getSelectedItem().toString().split(" - ")[1],
                    comboItemName.getSelectedItem().toString().split(" - ")[0],
                    unitprice - Discount,
                    txtQTY.getText(),
                    (unitprice - Discount) * QTY

                });

            }

            setGrnTotal();

            comboItemName.setSelectedIndex(-1);
//            comboSerial.setSelectedIndex(-1);
            comboPrice.setSelectedIndex(-1);

            txtUnitPrice.setText(null);
            txtQTY.setText(null);
            txtItemDiscount.setText(null);
        }

    }//GEN-LAST:event_txtQTYKeyReleased

    private void txtDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyReleased

        try {

            double disco = Double.parseDouble(txtDiscount.getText());
            double tot = Double.parseDouble(txtTotal.getText());

            double net = tot - disco;

            txtNetTotal.setText(net + "");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtDiscountKeyReleased

    private void txtPaidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidKeyReleased


    }//GEN-LAST:event_txtPaidKeyReleased

    private void txtQTYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYKeyTyped

    private void txtSerialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialKeyReleased

        try {

            if (evt.getKeyCode() == 10) {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria cc = openSession.createCriteria(ItemSereal.class);
                    cc.add(Restrictions.eq("serealNo", txtSerial.getText()));
                    ItemSereal uniqueResult = (ItemSereal) cc.uniqueResult();

                    comboItemName.removeAllItems();
                    String name = uniqueResult.getItem().getIitemName();
                    String itemCode = uniqueResult.getItem().getItemCode();
                    itm.put(itemCode, uniqueResult.getItem().getIdItem());
                    comboItemName.addItem(name+" - "+itemCode);
                    loadPriceVariationV2(itemCode);

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtSerialKeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupInvoices_BAK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboItemName;
    private javax.swing.JComboBox<String> comboPrice;
    private javax.swing.JComboBox<String> comboSupllier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtGrnDate;
    private javax.swing.JTextField txtInvoiceNo;
    private javax.swing.JTextField txtItemDiscount;
    private javax.swing.JTextField txtNetTotal;
    private javax.swing.JTextField txtPaid;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtSerial;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables



    private void loadInvNo() {

        Session openSession = PoolManager.getSessionFactory().openSession();
        Criteria createCriteria = openSession.createCriteria(SupplierInvoice.class);
        createCriteria.setProjection(Projections.rowCount());
        List list = createCriteria.list();
        String InvNo = Decimal_Formats.InvNo(Integer.parseInt(list.get(0).toString()) + 1);
        txtInvoiceNo.setText("INV-" + InvNo);

    }

    private void loadItemNames() {
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Item.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            List<Item> list = createCriteria.list();
            comboItemName.removeAllItems();
            for (Item item : list) {

                comboItemName.addItem(item.getIitemName() + " - " + item.getItemCode());
                itm.put(item.getItemCode(), item.getIdItem());
                itmNames.put(item.getItemCode(), item.getIitemName() + " - " + item.getItemCode());

            }

            comboItemName.setSelectedIndex(-1);
            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    private void loadSerial(int id) {

//        Session openSession = PoolManager.getSessionFactory().openSession();
//        Criteria createCriteria = openSession.createCriteria(ItemSereal.class);
//        createCriteria.createAlias("item", "i");
//        createCriteria.add(Restrictions.eq("i.idItem", id));
//        createCriteria.add(Restrictions.eq("isActive", "Active"));
//
//        List<ItemSereal> list = createCriteria.list();
//
//        comboSerial.removeAllItems();
//
//        for (ItemSereal itemSereal : list) {
//
//            comboSerial.addItem(itemSereal.getSerealNo());
//
//        }
    }

    private void loadPriceVariation() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(ItemPrices.class);
            createCriteria.createAlias("item", "i");
            createCriteria.add(Restrictions.eq("i.idItem", itm.get(comboItemName.getSelectedItem().toString().split(" - ")[1])));
            List<ItemPrices> list = createCriteria.list();
            comboPrice.removeAllItems();
            comboPrice.addItem("Select");
            for (ItemPrices itemPrices : list) {

                comboPrice.addItem(Decimal_Formats.Price(itemPrices.getNettPrice()));

                if (list.size() == 1) {

                    comboPrice.setSelectedIndex(1);

                    txtUnitPrice.setText(Decimal_Formats.Price(itemPrices.getNettPrice()));
                    txtQTY.grabFocus();

                } else {

                    txtUnitPrice.setText(null);
                    comboPrice.grabFocus();
                }
            }

            openSession.close();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    private void loadPriceVariationV2(String code) {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(ItemPrices.class);
            createCriteria.createAlias("item", "i");
            createCriteria.add(Restrictions.eq("i.idItem", itm.get(code)));
            List<ItemPrices> list = createCriteria.list();
            comboPrice.removeAllItems();
            comboPrice.addItem("Select");
            for (ItemPrices itemPrices : list) {

                comboPrice.addItem(Decimal_Formats.Price(itemPrices.getNettPrice()));

                if (list.size() == 1) {

                    comboPrice.setSelectedIndex(1);

                    txtUnitPrice.setText(Decimal_Formats.Price(itemPrices.getNettPrice()));
                    txtQTY.grabFocus();

                } else {

                    txtUnitPrice.setText(null);
                    comboPrice.grabFocus();
                }
            }

            openSession.close();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    
    

    private void setGrnTotal() {

        double tot = 0;

        for (int i = 0; i < jTable1.getRowCount(); i++) {

            tot += Double.parseDouble(jTable1.getValueAt(i, 4).toString());

        }

        txtTotal.setText("" + Decimal_Formats.Price(tot));
        txtNetTotal.setText("" + Decimal_Formats.Price(tot));
    }

    private void loadSup() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Supplier.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            List<Supplier> list = createCriteria.list();
            for (Supplier supplier : list) {

                comboSupllier.addItem(supplier.getSupplierCode() + " - " + supplier.getSupplierName());
                sup.put(supplier.getSupplierCode(), supplier.getIdSupplier());

            }
            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public void comboFilter(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Item.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            createCriteria.add(Restrictions.like("iitemName", "%" + enteredText + "%"));
            List<Item> list = createCriteria.list();
            comboItemName.removeAllItems();
            for (Item item : list) {

                str1 = item.getIitemName() + " - " + item.getItemCode();
                filterArray.add(str1);
                itm.put(item.getItemCode(), item.getIdItem());
                itmNames.put(item.getItemCode(), item.getIitemName() + " - " + item.getItemCode());

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboItemName.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboItemName.setSelectedItem(enteredText);
            comboItemName.showPopup();
        } else {
            comboItemName.hidePopup();
        }
    }

    private void ComboToTXT() {
        final JTextField textfield = (JTextField) comboItemName.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            try {
//                                comboItemCode.setSelectedItem(comboItemName.getSelectedItem().toString().split(" - ")[1]);
                                loadPriceVariation();

                            } catch (Exception e) {
                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter(textfield.getText());

                        }

                    }
                });

            }
        });
    }

}
