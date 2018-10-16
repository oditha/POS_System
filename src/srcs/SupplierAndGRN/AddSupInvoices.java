package srcs.SupplierAndGRN;

import ORM.CashBook;
import ORM.Item;
import ORM.ItemPrices;
import ORM.ItemSereal;
import ORM.Stock;
import ORM.Supplier;
import ORM.SupplierInvoice;
import ORM.SupplierInvoiceItem;
import ORM.SupplierInvoiceItemHasItemSereal;
import ORM.SupplierInvoicePayments;
import ReportsODK.ViewInvoice;
import com.alee.laf.WebLookAndFeel;
import exClass.DB;
import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import exClass.SupInvoiceHolder;
import exClass.dateForm;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import srcs.CustomersAndInvoice.ViewInvoiceSerials;
import srcs.Login;

public class AddSupInvoices extends javax.swing.JFrame {

    public static Map<String, Integer> cus = new HashMap<String, Integer>();

    Map<String, Integer> itm = new HashMap();
    Map<String, String> itmNames = new HashMap();
    Map<String, Integer> sup = new HashMap();
    Map<String, Integer> Serieal = new HashMap();
    ArrayList<SupInvoiceHolder> al = new ArrayList();

    public AddSupInvoices() {
        initComponents();
        txtGrnDate.setText(dateForm.setdate());
        comboSupllier.grabFocus();
        loadInvNo();
        ComboToTXT();
        ComboToTXT2();
//        loadSup();
        tableAlign();
        jTable1.setComponentPopupMenu(popup);
//           Toolkit tk = Toolkit.getDefaultToolkit();
//        int xsize=(int) tk.getScreenSize().getWidth();
//        int ysize=(int) tk.getScreenSize().getHeight();
//        this.setSize(xsize, ysize);
        txtItemDiscount.setVisible(false);
        jLabel15.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        txtGrnDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtInvoiceNo = new javax.swing.JTextField();
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
        btnSave1 = new javax.swing.JButton();

        jMenuItem1.setText("Delete Selected");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        popup.add(jMenuItem1);

        jMenuItem2.setText("Delete Selected");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        popup.add(jMenuItem2);

        jMenuItem3.setText("ViewSerials");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        popup.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier Invoice | JRTraders");

        txtGrnDate.setEditable(false);

        jLabel3.setText("GRN DATE");

        jLabel4.setText("Item Name");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Warranty", "Unit Price", "QTY", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
        }

        btnSave.setText("Print Invoice");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel6.setText("Invoice No");

        txtInvoiceNo.setEditable(false);

        jLabel10.setText("Quantity");

        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });
        txtQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQTYKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQTYKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYKeyTyped(evt);
            }
        });

        jLabel11.setText("Invoice Total");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N

        jLabel12.setText("Paid Amount");

        txtPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaidKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaidKeyReleased(evt);
            }
        });

        jLabel14.setText("Unit Price");

        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });

        jLabel15.setText("Item Discount");

        txtItemDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemDiscountActionPerformed(evt);
            }
        });
        txtItemDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtItemDiscountKeyTyped(evt);
            }
        });

        jLabel16.setText("Discount");

        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscountKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscountKeyReleased(evt);
            }
        });

        jLabel17.setText("Net Total");

        txtNetTotal.setEditable(false);
        txtNetTotal.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtNetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNetTotalActionPerformed(evt);
            }
        });

        jLabel8.setText("Item Serial");

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

        jLabel5.setText("Price Variation");

        comboPrice.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboPricePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        txtSerial.setToolTipText("Press Enter To Search");
        txtSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialActionPerformed(evt);
            }
        });
        txtSerial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerialKeyReleased(evt);
            }
        });

        comboSupllier.setEditable(true);

        jLabel1.setText("Select Supplyer");

        btnSave1.setText("Save Invoice");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(189, 189, 189)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(comboItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtItemDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtGrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(190, 190, 190)
                                        .addComponent(jLabel6)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(comboSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 283, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPaid)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel1)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtItemDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(6, 6, 6)
                        .addComponent(txtNetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
Double discount=0.0;
          
        
        
        
        if (!txtNetTotal.getText().isEmpty()) {
            
            
            
            if (txtDiscount.getText().isEmpty()) {
                discount=0.0;
            }else{
            
            discount=Double.parseDouble(txtDiscount.getText());
            
            
            
            }
            
            

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
                    invoice.setDiscount(discount);
                } catch (Exception e) {
                }
                invoice.setNettTotal(Double.parseDouble(txtNetTotal.getText()));
                invoice.setIsActive("Active");
                invoice.setCreatedBy(Login.Uname);

                openSession.save(invoice);

                for (int i = 0; i < jTable1.getRowCount(); i++) {

                    Item item = new Item();
                    item.setIdItem(itm.get(jTable1.getValueAt(i, 0).toString()));

                    SupplierInvoiceItem invoiceItem = new SupplierInvoiceItem();
                    invoiceItem.setSupplierInvoice(invoice);
                    invoiceItem.setItem(item);
                    invoiceItem.setQty(Integer.parseInt(Decimal_Formats.Qty(Double.parseDouble(jTable1.getValueAt(i, 4).toString()))));
                    invoiceItem.setUnitPrice(Double.parseDouble(jTable1.getValueAt(i, 3).toString()));
                    invoiceItem.setNettTotalItm(Double.parseDouble(jTable1.getValueAt(i, 5).toString()));
                    invoiceItem.setWarranry(jTable1.getValueAt(i, 2).toString());
                    invoiceItem.setIsActive("Active");

                    openSession.save(invoiceItem);

                    Iterator<SupInvoiceHolder> iterator = al.iterator();
                    while (iterator.hasNext()) {
                        SupInvoiceHolder next = iterator.next();
                        if (next.getProduct().equals(jTable1.getValueAt(i, 0).toString())) {
                            System.out.println(Serieal);
                            System.out.println(next.getProduct() + "-" + next.getSerial() + " " + Serieal.get(next.getSerial()));

                            ItemSereal itemSereal = new ItemSereal();
                            itemSereal.setIdItemSereal(Serieal.get(next.getSerial()));

                            SupplierInvoiceItemHasItemSereal supin = new SupplierInvoiceItemHasItemSereal();
                            supin.setItemSereal(itemSereal);
                            supin.setSupplierInvoiceItem(invoiceItem);

                            openSession.save(supin);

                            Criteria ccc = openSession.createCriteria(ItemSereal.class);
                            ccc.add(Restrictions.eq("idItemSereal", Serieal.get(next.getSerial())));
                            ItemSereal uniqueResult = (ItemSereal) ccc.uniqueResult();

                            if (uniqueResult != null) {

                                uniqueResult.setStatus("SOLD");
                                openSession.update(uniqueResult);

                            }

                        }

                    }

                    Criteria createCriteria = openSession.createCriteria(Stock.class);
                    createCriteria.createAlias("item", "i");
                    createCriteria.add(Restrictions.eq("i.idItem", itm.get(jTable1.getValueAt(i, 0).toString())));
                    Stock stk = (Stock) createCriteria.uniqueResult();
                    stk.setQty(stk.getQty() - Double.parseDouble(jTable1.getValueAt(i, 4).toString()));

                    openSession.update(stk);

                }

                SupplierInvoicePayments ip = new SupplierInvoicePayments();
                ip.setSupplier(supllier);
                ip.setSupplierInvoice(invoice);
                ip.setAmount(Double.parseDouble(txtPaid.getText()));
                ip.setPaymentDate(txtGrnDate.getText());
                ip.setPaymentType("Cash");
                ip.setIsActive("Active");

                openSession.save(ip);

                CashBook cb = new CashBook();
                cb.setDebit(0.00);
                cb.setCredit(Double.parseDouble(txtPaid.getText()));
                cb.setCbdate(txtGrnDate.getText());
                cb.setDescriotion("Payment for supplier Invoice " + txtInvoiceNo.getText());

                openSession.save(cb);
                beginTransaction.commit();
                openSession.close();

                NotificationPopup.save();
                
                boolean FLAG = false;

        try {

            Session openSession1 = PoolManager.getSessionFactory().openSession();
            Criteria cc = openSession1.createCriteria(SupplierInvoice.class);
            cc.add(Restrictions.eq("invoiceNo", txtInvoiceNo.getText()));
            SupplierInvoice uniqueResult = (SupplierInvoice) cc.uniqueResult();
            if (uniqueResult != null) {

                Set invoiceItems = uniqueResult.getSupplierInvoiceItems();
                Iterator iterator = invoiceItems.iterator();
                while (iterator.hasNext()) {
                    SupplierInvoiceItem next = (SupplierInvoiceItem) iterator.next();
                    Iterator iterator1 = next.getSupplierInvoiceItemHasItemSereals().iterator();
                    while (iterator1.hasNext()) {
                        SupplierInvoiceItemHasItemSereal next1 = (SupplierInvoiceItemHasItemSereal) iterator1.next();

                        FLAG = true;

                    }
                }

            }

            System.out.println(FLAG);

        } catch (Exception e) {
        }

        if (FLAG) {

            try {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("InvoiceNO", txtInvoiceNo.getText());
                System.out.println(map);
                JasperPrint jp = JasperFillManager.fillReport(Login.jrSupInvoiceWithSerial, map, DB.getCon());
//                JasperViewer.viewReport(jp);
                JasperPrintManager.printReport(jp, true);
            } catch (Exception ex) {
                Logger.getLogger(ViewInvoice.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("InvoiceNO", txtInvoiceNo.getText());
                System.out.println(map);
                JasperPrint jp = JasperFillManager.fillReport(Login.jrSupInvoice, map, DB.getCon());
//                JasperViewer.viewReport(jp);
                JasperPrintManager.printReport(jp, true);
            } catch (Exception ex) {
                Logger.getLogger(ViewInvoice.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
                
            } catch (Exception e) {

                e.printStackTrace();

            }

        }
                loadInvNo();
//                jLabel7.setText("Customer Name");

                comboItemName.setSelectedIndex(-1);
                comboSupllier.setSelectedIndex(0);
                comboPrice.setSelectedIndex(-1);

                txtNetTotal.setText(null);
                txtTotal.setText(null);
                txtPaid.setText(null);
                txtDiscount.setText(null);

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);

                al.clear();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtItemDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemDiscountActionPerformed

    }//GEN-LAST:event_txtItemDiscountActionPerformed

    private void comboPricePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboPricePopupMenuWillBecomeInvisible

        try {
            if (!comboPrice.getSelectedItem().equals("Select")) {

            txtUnitPrice.setText(comboPrice.getSelectedItem().toString().split(" - ")[0]);
            txtQTY.grabFocus();
        }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_comboPricePopupMenuWillBecomeInvisible

    private void comboItemNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboItemNamePopupMenuWillBecomeInvisible


    }//GEN-LAST:event_comboItemNamePopupMenuWillBecomeInvisible

    private void txtQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyReleased

        if (evt.getKeyCode() == 10) {

            boolean flag = true;

            double tblQty = 0.0;
            double tblAmount = 0.0;

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

            double unitprice = Double.parseDouble(txtUnitPrice.getText());
            double QTY = Double.parseDouble(txtQTY.getText());

            for (int i = 0; i < jTable1.getRowCount(); i++) {

                String itemCode = (String) jTable1.getValueAt(i, 0);

                if (itemCode.equals(comboItemName.getSelectedItem().toString().split(" - ")[1])) {

                    flag = false;

                    tblQty = Integer.parseInt(jTable1.getValueAt(i, 4).toString());
                    tblAmount = Double.parseDouble(jTable1.getValueAt(i, 5).toString());

                  //  if (!txtItemDiscount.getText().isEmpty()) {

//                        double Discount = Double.parseDouble(txtItemDiscount.getText());
//                        jTable1.setValueAt((tblQty + QTY), i, 4);
//                        jTable1.setValueAt((tblQty + QTY) * (unitprice - Discount), i, 5);
//                        jTable1.setValueAt((unitprice - Discount), i, 3);

                 //   } else {

                        jTable1.setValueAt(unitprice, i, 3);
                        jTable1.setValueAt((tblQty + QTY), i, 4);
                        jTable1.setValueAt((tblQty + QTY) * unitprice, i, 5);

//                    }

                    break;

                } else {

                    flag = true;

                }
            }

            if (flag == true) {

               // if (txtItemDiscount.getText().isEmpty()) {

                    dtm.addRow(new Object[]{
                        comboItemName.getSelectedItem().toString().split(" - ")[1],
                        comboItemName.getSelectedItem().toString().split(" - ")[0],
                        comboPrice.getSelectedItem().toString().split(" - ")[1],
                        unitprice,
                        txtQTY.getText(),
                        unitprice * QTY

                    });
//
//                } else {
//
//                    double Discount = Double.parseDouble(txtItemDiscount.getText());
//                    dtm.addRow(new Object[]{
//                        comboItemName.getSelectedItem().toString().split(" - ")[1],
//                        comboItemName.getSelectedItem().toString().split(" - ")[0],
//                        comboPrice.getSelectedItem().toString().split(" - ")[1],
//                        unitprice - Discount,
//                        txtQTY.getText(),
//                        (unitprice - Discount) * QTY
//
//                    });
//
//                }
//
            }
            System.out.println(flag);
            if (!txtSerial.getText().isEmpty()) {

                SupInvoiceHolder sih = new SupInvoiceHolder();
                sih.setProduct(comboItemName.getSelectedItem().toString().split(" - ")[1]);
                sih.setSerial(txtSerial.getText().toUpperCase());

                al.add(sih);

            }

            setGrnTotal();

            comboItemName.setSelectedIndex(-1);
//            comboSerial.setSelectedIndex(-1);
            comboPrice.setSelectedIndex(-1);

            txtUnitPrice.setText(null);
            txtQTY.setText(null);
            txtItemDiscount.setText(null);
            txtSerial.setText(null);
            txtSerial.grabFocus();
            ////////////////////////////////------------------------------

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

        try {
            double grntot = Double.parseDouble(txtNetTotal.getText());
            double paid = Double.parseDouble(txtPaid.getText());
            if (paid > grntot) {

                int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Paid amout Greater than Invoice total. Do you want to continue?",
                        "Payment Error", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (showConfirmDialog != 0) {

                    txtPaid.setText(null);
                    txtPaid.grabFocus();

                }

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtPaidKeyReleased

    private void txtQTYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtQTYKeyTyped

    private void txtSerialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialKeyReleased

        try {

            if (evt.getKeyCode() == 10) {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria cc = openSession.createCriteria(ItemSereal.class);
                    cc.add(Restrictions.eq("serealNo", txtSerial.getText()));
                    ItemSereal uniqueResult = (ItemSereal) cc.uniqueResult();

                    if (uniqueResult != null) {

                        if (uniqueResult.getStatus().equals("SOLD")) {

                            JOptionPane.showMessageDialog(null, "Item alredy Sold. Try new one", "Item not avaliable",
                                    JOptionPane.ERROR_MESSAGE);

                        } else if (uniqueResult.getStatus().equals("Return")) {

                            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "This item was returned by customer. Do you want to continue?",
                                    "Item Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if (showConfirmDialog == 0) {
                                comboItemName.removeAllItems();
                                String name = uniqueResult.getItem().getIitemName();
                                String itemCode = uniqueResult.getItem().getItemCode();
                                itm.put(itemCode, uniqueResult.getItem().getIdItem());
                                comboItemName.addItem(name + " - " + itemCode);
                                Serieal.put(uniqueResult.getSerealNo(), uniqueResult.getIdItemSereal());
                                loadPriceVariationV2(itemCode);
                                txtQTY.setText("1");

                            } else {

                                txtSerial.grabFocus();
                                txtSerial.setText(null);

                            }

                        } else if (uniqueResult.getStatus().equals("Supplier Return")) {

                            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "This item wait for return to Supplier. Do you want to continue?",
                                    "Item Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                            if (showConfirmDialog == 0) {
                                comboItemName.removeAllItems();
                                String name = uniqueResult.getItem().getIitemName();
                                String itemCode = uniqueResult.getItem().getItemCode();
                                itm.put(itemCode, uniqueResult.getItem().getIdItem());
                                comboItemName.addItem(name + " - " + itemCode);
                                Serieal.put(uniqueResult.getSerealNo(), uniqueResult.getIdItemSereal());
                                loadPriceVariationV2(itemCode);
                                txtQTY.setText("1");

                            } else {

                                txtSerial.grabFocus();
                                txtSerial.setText(null);

                            }

                        } else {

                            comboItemName.removeAllItems();
                            String name = uniqueResult.getItem().getIitemName();
                            String itemCode = uniqueResult.getItem().getItemCode();
                            itm.put(itemCode, uniqueResult.getItem().getIdItem());
                            comboItemName.addItem(name + " - " + itemCode);
                            Serieal.put(uniqueResult.getSerealNo(), uniqueResult.getIdItemSereal());
                            loadPriceVariationV2(itemCode);
                            txtQTY.setText("1");

                        }
                    }

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtSerialKeyReleased

    private void txtSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialActionPerformed

    private void txtNetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNetTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNetTotalActionPerformed

    private void txtItemDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemDiscountKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtItemDiscountKeyTyped

    private void txtDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtDiscountKeyTyped

    private void txtPaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtPaidKeyTyped

    private void txtQTYKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyPressed

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cc = openSession.createCriteria(Stock.class);
            cc.createAlias("item", "i");
            cc.add(Restrictions.eq("i.idItem", itm.get(comboItemName.getSelectedItem().toString().split(" - ")[1])));
            Stock uniqueResult = (Stock) cc.uniqueResult();
            if (uniqueResult != null) {

                if (uniqueResult.getQty() < Double.parseDouble(txtQTY.getText())) {

                    JOptionPane.showMessageDialog(null, "QTY you entered not avaliable on Stock.", "Stock Error", JOptionPane.ERROR_MESSAGE);
                    txtQTY.setText(null);
                    txtQTY.grabFocus();
                }

            }

            
        } catch (Exception e) {

        }


    }//GEN-LAST:event_txtQTYKeyPressed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int button = evt.getButton();
        System.out.println(button);
        
        if (button == 3) {

            popup.show();

            
        }
        

    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      
        
        
        
          int r=jTable1.getSelectedRow();
       String itemcode=(String) jTable1.getValueAt(r, 0);
       String itemName=(String) jTable1.getValueAt(r, 1);
        
        
        
        ViewInvoiceSerials viewInvoiceSerials = new ViewInvoiceSerials();
        
        
        DefaultTableModel dtm=(DefaultTableModel) viewInvoiceSerials.jTable1.getModel();
        dtm.setRowCount(0);
        
        Iterator<SupInvoiceHolder> iterator = al.iterator();
        
        while (iterator.hasNext()) {   
            
           SupInvoiceHolder next = iterator.next();
           
            if (next.getProduct().equals(itemcode)) {
                
                java.util.Vector v=new java.util.Vector();
                
                v.add(itemName);
                v.add(next.getSerial());
                dtm.addRow(v);
                viewInvoiceSerials.productName.setText(itemName);
                viewInvoiceSerials.setVisible(true);
            }
           
            
            
        }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
        
//        
//        try {
//               popup.show();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        




        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        Double discount=0.0;
          
        
        
        
        if (!txtNetTotal.getText().isEmpty()) {
            
            
            
            if (txtDiscount.getText().isEmpty()) {
                discount=0.0;
            }else{
            
            discount=Double.parseDouble(txtDiscount.getText());
            
            
            
            }
            
            

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
                    invoice.setDiscount(discount);
                } catch (Exception e) {
                }
                invoice.setNettTotal(Double.parseDouble(txtNetTotal.getText()));
                invoice.setIsActive("Active");
                invoice.setCreatedBy(Login.Uname);

                openSession.save(invoice);

                for (int i = 0; i < jTable1.getRowCount(); i++) {

                    Item item = new Item();
                    item.setIdItem(itm.get(jTable1.getValueAt(i, 0).toString()));

                    SupplierInvoiceItem invoiceItem = new SupplierInvoiceItem();
                    invoiceItem.setSupplierInvoice(invoice);
                    invoiceItem.setItem(item);
                    invoiceItem.setQty(Integer.parseInt(Decimal_Formats.Qty(Double.parseDouble(jTable1.getValueAt(i, 4).toString()))));
                    invoiceItem.setUnitPrice(Double.parseDouble(jTable1.getValueAt(i, 3).toString()));
                    invoiceItem.setNettTotalItm(Double.parseDouble(jTable1.getValueAt(i, 5).toString()));
                    invoiceItem.setWarranry(jTable1.getValueAt(i, 2).toString());
                    invoiceItem.setIsActive("Active");

                    openSession.save(invoiceItem);

                    Iterator<SupInvoiceHolder> iterator = al.iterator();
                    while (iterator.hasNext()) {
                        SupInvoiceHolder next = iterator.next();
                        if (next.getProduct().equals(jTable1.getValueAt(i, 0).toString())) {
                            System.out.println(Serieal);
                            System.out.println(next.getProduct() + "-" + next.getSerial() + " " + Serieal.get(next.getSerial()));

                            ItemSereal itemSereal = new ItemSereal();
                            itemSereal.setIdItemSereal(Serieal.get(next.getSerial()));

                            SupplierInvoiceItemHasItemSereal supin = new SupplierInvoiceItemHasItemSereal();
                            supin.setItemSereal(itemSereal);
                            supin.setSupplierInvoiceItem(invoiceItem);

                            openSession.save(supin);

                            Criteria ccc = openSession.createCriteria(ItemSereal.class);
                            ccc.add(Restrictions.eq("idItemSereal", Serieal.get(next.getSerial())));
                            ItemSereal uniqueResult = (ItemSereal) ccc.uniqueResult();

                            if (uniqueResult != null) {

                                uniqueResult.setStatus("SOLD");
                                openSession.update(uniqueResult);

                            }

                        }

                    }

                    Criteria createCriteria = openSession.createCriteria(Stock.class);
                    createCriteria.createAlias("item", "i");
                    createCriteria.add(Restrictions.eq("i.idItem", itm.get(jTable1.getValueAt(i, 0).toString())));
                    Stock stk = (Stock) createCriteria.uniqueResult();
                    stk.setQty(stk.getQty() - Double.parseDouble(jTable1.getValueAt(i, 4).toString()));

                    openSession.update(stk);

                }

                SupplierInvoicePayments ip = new SupplierInvoicePayments();
                ip.setSupplier(supllier);
                ip.setSupplierInvoice(invoice);
                ip.setAmount(Double.parseDouble(txtPaid.getText()));
                ip.setPaymentDate(txtGrnDate.getText());
                ip.setPaymentType("Cash");
                ip.setIsActive("Active");

                openSession.save(ip);

                CashBook cb = new CashBook();
                cb.setDebit(0.00);
                cb.setCredit(Double.parseDouble(txtPaid.getText()));
                cb.setCbdate(txtGrnDate.getText());
                cb.setDescriotion("Payment for supplier Invoice " + txtInvoiceNo.getText());

                openSession.save(cb);
                beginTransaction.commit();
                openSession.close();

                NotificationPopup.save();
                
                boolean FLAG = false;

        try {

            Session openSession1 = PoolManager.getSessionFactory().openSession();
            Criteria cc = openSession1.createCriteria(SupplierInvoice.class);
            cc.add(Restrictions.eq("invoiceNo", txtInvoiceNo.getText()));
            SupplierInvoice uniqueResult = (SupplierInvoice) cc.uniqueResult();
            if (uniqueResult != null) {

                Set invoiceItems = uniqueResult.getSupplierInvoiceItems();
                Iterator iterator = invoiceItems.iterator();
                while (iterator.hasNext()) {
                    SupplierInvoiceItem next = (SupplierInvoiceItem) iterator.next();
                    Iterator iterator1 = next.getSupplierInvoiceItemHasItemSereals().iterator();
                    while (iterator1.hasNext()) {
                        SupplierInvoiceItemHasItemSereal next1 = (SupplierInvoiceItemHasItemSereal) iterator1.next();

                        FLAG = true;

                    }
                }

            }

            System.out.println(FLAG);

        } catch (Exception e) {
        }

        if (FLAG) {

            try {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("InvoiceNO", txtInvoiceNo.getText());
                System.out.println(map);
                JasperPrint jp = JasperFillManager.fillReport(Login.jrSupInvoiceWithSerial, map, DB.getCon());
                JasperViewer.viewReport(jp,false);
//                JasperPrintManager.printReport(jp, true);
            } catch (Exception ex) {
                Logger.getLogger(ViewInvoice.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("InvoiceNO", txtInvoiceNo.getText());
                System.out.println(map);
                JasperPrint jp = JasperFillManager.fillReport(Login.jrSupInvoice, map, DB.getCon());
                JasperViewer.viewReport(jp,false);
//                JasperPrintManager.printReport(jp, true);
            } catch (Exception ex) {
                Logger.getLogger(ViewInvoice.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
                
            } catch (Exception e) {

                e.printStackTrace();

            }

        }
                loadInvNo();
//                jLabel7.setText("Customer Name");

                comboItemName.setSelectedIndex(-1);
                comboSupllier.setSelectedIndex(0);
                comboPrice.setSelectedIndex(-1);

                txtNetTotal.setText(null);
                txtTotal.setText(null);
                txtPaid.setText(null);
                txtDiscount.setText(null);

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);

                al.clear();
    }//GEN-LAST:event_btnSave1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupInvoices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPopupMenu popup;
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
        txtInvoiceNo.setText("SUPINV-" + InvNo);

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

                comboPrice.addItem(Decimal_Formats.Price(itemPrices.getNettPrice()) + " - " + itemPrices.getSupWarrenty());

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

                comboPrice.addItem(Decimal_Formats.Price(itemPrices.getNettPrice()) + " - " + itemPrices.getSupWarrenty());

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

            tot += Double.parseDouble(jTable1.getValueAt(i, 5).toString());

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

    public void comboFilter2(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Supplier.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
//            createCriteria.createAlias("brands", "b");
//            createCriteria.add(Restrictions.eq("b.idBrands", bra.get(comboBrands.getSelectedItem().toString())));
            createCriteria.add(Restrictions.like("supplierName", "%" + enteredText + "%"));
            List<Supplier> list = createCriteria.list();
            comboSupllier.removeAllItems();
            for (Supplier supplier : list) {

                str1 = supplier.getSupplierCode() + " - " + supplier.getSupplierName();
                sup.put(supplier.getSupplierCode(), supplier.getIdSupplier());
                filterArray.add(str1);
                

            }

        } catch (Exception ex) {
            System.out.println("error" + ex);
        }

        if (filterArray.size() > 0) {
            comboSupllier.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            comboSupllier.setSelectedItem(enteredText);
            comboSupllier.showPopup();
        } else {
            comboSupllier.hidePopup();
        }
    }

    private void ComboToTXT2() {
        final JTextField textfield = (JTextField) comboSupllier.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (ke.getKeyCode() == 10) {

                            try {
//                                comboItemCode.setSelectedItem(comboItemName.getSelectedItem().toString().split(" - ")[1]);
//                                loadPriceVariation();

                            } catch (Exception e) {
                            }

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter2(textfield.getText());

                        }

                    }
                });

            }
        });
    }
    
    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

}
