package srcs;

import ORM.CashBook;
import ORM.Customers;
import ORM.CustomersHasInvoiceReturn;
import ORM.Grn;
import ORM.Grnitem;
import ORM.Invoice;
import ORM.InvoiceItem;
import ORM.InvoicePayments;
import ORM.InvoiceReturn;
import ORM.Item;
import ORM.Stock;
import ORM.Supplier;
import ORM.SupplierReturn;
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
import static srcs.SupplierAndGRN.AddGRN.comboItemName;

public class GRNReturnSupplier extends javax.swing.JFrame {

    HashMap<String, Integer> invid = new HashMap();
    HashMap<String, Integer> ItmId = new HashMap();
    HashMap<String, Integer> Itm = new HashMap();

    public int getGRNID;
    public int getItemID;
    public int getGRNItemID;
    public int getSupID;
    public double UnitPrice;

    public GRNReturnSupplier() {
        initComponents();
        TxtStartDate.setText(dateForm.currentdate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtGRNNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtStartDate = new com.alee.extended.date.WebDateField();
        txtQty = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        comboItemName = new javax.swing.JComboBox<String>();
        comboTerm = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtunit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GRN Return |  | JRTraders");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("GRN No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        txtGRNNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGRNNoKeyReleased(evt);
            }
        });
        jPanel1.add(txtGRNNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 170, -1));

        jLabel2.setText("Select Item");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 260, -1));

        jLabel3.setText("Date from");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 120, -1));

        TxtStartDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtStartDateMouseClicked(evt);
            }
        });
        jPanel1.add(TxtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 170, 30));
        jPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 170, -1));

        btnSave.setText("Add Return");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 100, -1));

        comboItemName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboItemName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboItemNamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboItemNameActionPerformed(evt);
            }
        });
        jPanel1.add(comboItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 370, -1));

        comboTerm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash Back", "Exchange" }));
        jPanel1.add(comboTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 170, -1));

        jLabel6.setText("Description");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel7.setText("Term");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 370, 90));

        jLabel8.setText("Return Qty");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel9.setText("Unit");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        jPanel1.add(txtunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtStartDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtStartDateMouseClicked

    }//GEN-LAST:event_TxtStartDateMouseClicked

    private void txtGRNNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGRNNoKeyReleased

        try {

            String text = txtGRNNo.getText();

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Grn.class);

            //createCriteria.add(Restrictions.eq("grnno", text));

            Criterion id = Restrictions.eq("grnno", text);
            Criterion active1 = Restrictions.like("isActive", "Active");
            LogicalExpression andExp1 = Restrictions.and(id, active1);
            createCriteria.add(andExp1);

            Grn inv = (Grn) createCriteria.uniqueResult();

            invid.put(inv.getGrnno(), inv.getIdGrn());
            Iterator iterator = inv.getGrnitems().iterator();
            comboItemName.removeAllItems();
            ItmId.clear();
            Itm.clear();
            while (iterator.hasNext()) {

                Grnitem next = (Grnitem) iterator.next();
                comboItemName.addItem(next.getItem().getItemCode() + " - " + next.getItem().getIitemName());
                //ItmId.put(next.getItem().getItemCode() + " - " + next.getItem().getIitemName(), next.getIdInvoiceItem());
                //Itm.put(next.getItem().getItemCode() + " - " + next.getItem().getIitemName(), next.getItem().getIdItem());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtGRNNoKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {

            if ((!txtGRNNo.getText().isEmpty() || !txtQty.getText().isEmpty())) {

                String text = txtGRNNo.getText();

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Grn.class);
                createCriteria.add(Restrictions.eq("grnno", text));
                Grn inv = (Grn) createCriteria.uniqueResult();

                List<Grn> list = createCriteria.list();

                for (Grn grn : list) {
                    getGRNID = grn.getIdGrn();
                    getSupID = grn.getSupplier().getIdSupplier();
                    //System.out.println(getCusID);
                }

                //////////////////////////////////////////////////////////////////////////////////////
                String[] getItemCode = comboItemName.getSelectedItem().toString().split(" ");
                String s = getItemCode[0];
                //System.out.println(s);
                Session openSession1 = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria1 = openSession1.createCriteria(Item.class);
                createCriteria1.add(Restrictions.eq("itemCode", s));
                Item item = (Item) createCriteria1.uniqueResult();

                List<Item> list1 = createCriteria1.list();

                for (Item item1 : list1) {
                    getItemID = item1.getIdItem();
                    //System.out.println(getItemID);
                }

                //////////////////////////////////////////////////////////////////////////////////////
                Session openSession2 = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria2 = openSession.createCriteria(Grnitem.class);
                createCriteria2.createAlias("item", "i");
                createCriteria2.add(Restrictions.eq("i.idItem", getItemID));
                Grnitem grnItem = (Grnitem) createCriteria2.uniqueResult();

                List<Grnitem> list2 = createCriteria2.list();

                for (Grnitem grnitem : list2) {
                    getGRNItemID = grnitem.getIdGrnitem();
                    //System.out.println(getGRNItemID);
                    UnitPrice = grnItem.getGrossPrice();
                }

                /////////////////////////////////////////////////////////////////////////////////
                Session openSession4 = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession4.beginTransaction();

                SupplierReturn SupReturn = new SupplierReturn();

                Grnitem GRNItem = new Grnitem();
                GRNItem.setIdGrnitem(getGRNItemID);

                Supplier sup = new Supplier();
                sup.setIdSupplier(getSupID);

                SupReturn.setRetuenDate(TxtStartDate.getText());
                SupReturn.setSupplier(sup);
                SupReturn.setReturnQty(txtQty.getText());
                SupReturn.setGrnitem(GRNItem);
                SupReturn.setIsActive("Active");
                SupReturn.setTerm(comboTerm.getSelectedItem().toString());
                SupReturn.setDescription(txtDescription.getText());

                openSession4.save(SupReturn);
                beginTransaction.commit();

                openSession.close();
                openSession1.close();
                openSession2.close();
                openSession4.close();

                Session openSession5 = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction1 = openSession5.beginTransaction();
                Criteria c = openSession5.createCriteria(Stock.class);
                c.createAlias("item", "s");
                c.add(Restrictions.eq("s.idItem", getItemID));
                Stock ur = (Stock) c.uniqueResult();
                System.out.println(ur.getQty());

                ur.setQty(ur.getQty() - Double.parseDouble(txtQty.getText()));

                openSession5.update(ur);

                beginTransaction1.commit();
                openSession5.close();

//                if (comboTerm.getSelectedItem().equals("Cash Back")) {
//
//                    Session openSession6 = PoolManager.getSessionFactory().openSession();
//                    Transaction beginTransaction2 = openSession6.beginTransaction();
//
//                    CashBook cashBook = new CashBook();
//                    cashBook.setCbdate(TxtStartDate.getText());
//                    cashBook.setCredit(0.00);
//                    cashBook.setDebit(UnitPrice * Double.parseDouble(txtQty.getText()));
//                    cashBook.setDescriotion("Supplier Return GRN Cash Back");
//
//                    openSession6.save(cashBook);
//                    beginTransaction2.commit();
//                    openSession6.close();
//
//                }
                NotificationPopup.save();

                txtGRNNo.setText("");
                txtQty.setText("");
                txtGRNNo.grabFocus();
                comboItemName.removeAllItems();
                txtDescription.setText("");

            } else {
                NotificationPopup.fillFeilds();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboItemNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboItemNamePopupMenuWillBecomeInvisible
       
         Session sess = PoolManager.getSessionFactory().openSession();
                                Criteria cr = sess.createCriteria(Item.class);
                                cr.add(Restrictions.eq("itemCode", comboItemName.getSelectedItem().toString().split(" - ")[0]));
                                Item uniqueResult = (Item) cr.uniqueResult();
                                
                                txtunit.setText(uniqueResult.getUnit());
                                
                                
                                sess.close();
        
        
         
        
        
        
        
        
    }//GEN-LAST:event_comboItemNamePopupMenuWillBecomeInvisible

    private void comboItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboItemNameActionPerformed
        // TODO add your handling code here:Z
    }//GEN-LAST:event_comboItemNameActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GRNReturnSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.alee.extended.date.WebDateField TxtStartDate;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboItemName;
    private javax.swing.JComboBox<String> comboTerm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtGRNNo;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtunit;
    // End of variables declaration//GEN-END:variables
}
