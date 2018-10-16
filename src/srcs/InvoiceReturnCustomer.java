package srcs;

import ORM.CashBook;
import ORM.Customers;
import ORM.CustomersHasInvoiceReturn;
import ORM.Invoice;
import ORM.InvoiceItem;
import ORM.InvoicePayments;
import ORM.InvoiceReturn;
import ORM.Item;
import ORM.Stock;
import static Reports.ViewSuppUdaya.s01;
import com.alee.laf.WebLookAndFeel;
import exClass.NotificationPopup;
import exClass.PoolManager;
import exClass.dateForm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class InvoiceReturnCustomer extends javax.swing.JFrame {

    HashMap<String, Integer> invid = new HashMap();
    HashMap<String, Integer> ItmId = new HashMap();
    HashMap<String, Integer> Itm = new HashMap();

    public int getInvoID;
    public int getItemID;
    public int getInvoItemID;
    public int getCusID;
    public double UnitPrice;

    public InvoiceReturnCustomer() {
        initComponents();
        TxtStartDate.setText(dateForm.currentdate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInvoiceNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtStartDate = new com.alee.extended.date.WebDateField();
        txtQty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        INV = new javax.swing.JLabel();
        comboItem = new javax.swing.JComboBox<String>();
        comboCondition = new javax.swing.JComboBox<String>();
        comboTerm = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Invoice Return |  Bit Win Computers");

        jPanel1.setToolTipText("Invoice Return | JRTraders");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Invoice No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        txtInvoiceNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInvoiceNoKeyReleased(evt);
            }
        });
        jPanel1.add(txtInvoiceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 130, -1));

        jLabel2.setText("Select Item");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 260, -1));

        jLabel3.setText("Date from");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 120, -1));

        TxtStartDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtStartDateMouseClicked(evt);
            }
        });
        jPanel1.add(TxtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 170, 30));
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 170, -1));

        jLabel4.setText("Condition");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel5.setText("Item Serial");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));
        jPanel1.add(txtSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 170, -1));

        btnSave.setText("Add Return");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 100, -1));

        INV.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        INV.setText("INV-");
        jPanel1.add(INV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 30));

        comboItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 370, -1));

        comboCondition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Damage", "Non-Damage" }));
        jPanel1.add(comboCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 170, -1));

        comboTerm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash Back", "Exchange" }));
        jPanel1.add(comboTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 170, -1));

        jLabel6.setText("Return Qty");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel7.setText("Term");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtStartDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtStartDateMouseClicked

    }//GEN-LAST:event_TxtStartDateMouseClicked

    private void txtInvoiceNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInvoiceNoKeyReleased

        try {

            String text = "INV-" + txtInvoiceNo.getText();

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Invoice.class);

            //createCriteria.add(Restrictions.eq("invoiceNo", text));

            Criterion id = Restrictions.eq("invoiceNo", text);
            Criterion active1 = Restrictions.like("isActive", "Active");
            LogicalExpression andExp1 = Restrictions.and(id, active1);
            createCriteria.add(andExp1);

            Invoice inv = (Invoice) createCriteria.uniqueResult();

            invid.put(inv.getInvoiceNo(), inv.getIdInvoice());
            Iterator iterator = inv.getInvoiceItems().iterator();
            comboItem.removeAllItems();
            ItmId.clear();
            Itm.clear();
            while (iterator.hasNext()) {

                InvoiceItem next = (InvoiceItem) iterator.next();
                comboItem.addItem(next.getItem().getItemCode() + " - " + next.getItem().getIitemName());
                ItmId.put(next.getItem().getItemCode() + " - " + next.getItem().getIitemName(), next.getIdInvoiceItem());
                Itm.put(next.getItem().getItemCode() + " - " + next.getItem().getIitemName(), next.getItem().getIdItem());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtInvoiceNoKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {

            if ((!txtInvoiceNo.getText().isEmpty() || !txtQty.getText().isEmpty())) {

                String text = "INV-" + txtInvoiceNo.getText();

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Invoice.class);
                createCriteria.add(Restrictions.eq("invoiceNo", text));
                Invoice inv = (Invoice) createCriteria.uniqueResult();

                List<Invoice> list = createCriteria.list();

                for (Invoice invoice : list) {
                    getInvoID = invoice.getIdInvoice();

                    //System.out.println(getInvoID);
                }

                //////////////////////////////////////////////////////////////////////////////////////
                String[] getItemCode = comboItem.getSelectedItem().toString().split(" ");
                String s = getItemCode[0];
                //System.out.println(s);
                Session openSession1 = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria1 = openSession1.createCriteria(Item.class);
                createCriteria1.add(Restrictions.eq("itemCode", s));
                Item item = (Item) createCriteria1.uniqueResult();

                List<Item> list1 = createCriteria1.list();

                for (Item item1 : list1) {
                    getItemID = item1.getIdItem();

                }

                //////////////////////////////////////////////////////////////////////////////////////
                Session openSession2 = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria2 = openSession.createCriteria(InvoiceItem.class);
                //createCriteria2.createAlias("item", "i");
                createCriteria2.add(Restrictions.eq("idInvoiceItem", getItemID));
                InvoiceItem invItem = (InvoiceItem) createCriteria2.uniqueResult();

                List<InvoiceItem> list2 = createCriteria2.list();

                for (InvoiceItem invoiceItem : list2) {
                    getInvoItemID = invoiceItem.getIdInvoiceItem();
                    //System.out.println(getInvoItemID);
                    UnitPrice = invoiceItem.getUnitPrice();
                }

                /////////////////////////////////////////////////////////////////////////////////
                Session openSession3 = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria3 = openSession3.createCriteria(InvoicePayments.class);
                createCriteria3.createAlias("invoice", "in");
                createCriteria3.add(Restrictions.eq("in.idInvoice", getInvoID));
                //InvoicePayments ip = (InvoicePayments) createCriteria3.uniqueResult();

                List<InvoicePayments> list3 = createCriteria3.list();

                for (InvoicePayments invoicePayments : list3) {
                    getCusID = invoicePayments.getCustomers().getIdCustomers();
                    System.out.println(getCusID);
                }

                /////////////////////////////////////////////////////////////////////////////////
                Session openSession4 = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession4.beginTransaction();

                InvoiceReturn invoiceReturn = new InvoiceReturn();

                Invoice invoice = new Invoice();
                //invoice.setIdInvoice(invid.get("INV-" + txtInvoiceNo.getText()));
                invoice.setIdInvoice(getInvoID);

                InvoiceItem invoiceItem = new InvoiceItem();
                //invoiceItem.setIdInvoiceItem(ItmId.get(comboItem.getSelectedItem().toString()));
                invoiceItem.setIdInvoiceItem(getInvoItemID);

                invoiceReturn.setInvoice(invoice);
                invoiceReturn.setInvoiceItem(invoiceItem);
                invoiceReturn.setRetuenDate(TxtStartDate.getText());
                invoiceReturn.setItemSerial(txtSerial.getText());
                invoiceReturn.setReturnQty(Double.parseDouble(txtQty.getText()));
                invoiceReturn.setTerm(comboTerm.getSelectedItem().toString());
                invoiceReturn.setItemCondition(comboCondition.getSelectedItem().toString());

                Customers customers = new Customers();
                customers.setIdCustomers(getCusID);

                CustomersHasInvoiceReturn chi = new CustomersHasInvoiceReturn();
                chi.setInvoiceReturn(invoiceReturn);
                chi.setCustomers(customers);

                openSession4.save(invoiceReturn);
                openSession4.save(chi);
                beginTransaction.commit();

                openSession.close();
                openSession1.close();
                openSession2.close();
                openSession3.close();
                openSession4.close();

                if (comboCondition.getSelectedItem().equals("Non-Damage")) {
                    Session openSession5 = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction1 = openSession5.beginTransaction();
                    Criteria c = openSession5.createCriteria(Stock.class);
                    c.createAlias("item", "s");
                    c.add(Restrictions.eq("s.idItem", getItemID));
                    Stock ur = (Stock) c.uniqueResult();
                    System.out.println(ur.getQty());

                    ur.setQty(ur.getQty() + Double.parseDouble(txtQty.getText()));

                    openSession5.update(ur);

                    beginTransaction1.commit();
                    openSession5.close();
                }

                if (comboTerm.getSelectedItem().equals("Cash Back")) {

                    Session openSession6 = PoolManager.getSessionFactory().openSession();
                    Transaction beginTransaction2 = openSession6.beginTransaction();

                    CashBook cashBook = new CashBook();
                    cashBook.setCbdate(TxtStartDate.getText());
                    cashBook.setCredit(0.00);
                    cashBook.setDebit(UnitPrice * Double.parseDouble(txtQty.getText()));
                    cashBook.setDescriotion("Customer Return Invoice Cash Back");

                    openSession6.save(cashBook);
                    beginTransaction2.commit();
                    openSession6.close();

                }
                NotificationPopup.save();

                txtInvoiceNo.setText("");
                txtQty.setText("");
                txtSerial.setText("");
                txtInvoiceNo.grabFocus();
                comboItem.removeAllItems();

            } else {
                NotificationPopup.fillFeilds();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceReturnCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel INV;
    public static com.alee.extended.date.WebDateField TxtStartDate;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboCondition;
    private javax.swing.JComboBox<String> comboItem;
    private javax.swing.JComboBox<String> comboTerm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtInvoiceNo;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSerial;
    // End of variables declaration//GEN-END:variables
}
