package srcs.CustomersAndInvoice;

import ORM.CashBook;
import ORM.Customers;
import ORM.Invoice;
import ORM.InvoiceHasCustomers;
import ORM.InvoiceItem;
import ORM.InvoicePayments;
import ORM.Item;
import ORM.ItemPrices;
import ORM.ItemSereal;
import ORM.ItemSerealHasInvoiceItem;
import ORM.Stock;
import ReportsODK.ViewInvoice;
import com.alee.laf.WebLookAndFeel;
import com.lowagie.text.pdf.parser.Vector;
import exClass.DB;
import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import exClass.PriceHolder;
import exClass.SupInvoiceHolder;
import exClass.dateForm;
import java.awt.GraphicsEnvironment;
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
import srcs.Login;

public class AddInvoicesV2 extends javax.swing.JFrame {

    public static Map<String, Integer> cus = new HashMap<String, Integer>();

    static Map<String, Integer> itm = new HashMap();
    Map<String, String> itmNames = new HashMap();
    public static Map<String, Integer> cust = new HashMap();
    Map<String, Integer> Serieal = new HashMap();
    static ArrayList<SupInvoiceHolder> al = new ArrayList();

    public static Map<String, ArrayList> itemprice = new HashMap<String, ArrayList>();

    static boolean maximized = true;

    public AddInvoicesV2() {
        initComponents();
        txtGrnDate.setText(dateForm.setdate());
        txtSerial.grabFocus();
        loadInvNo();
        txtSerial.setEditable(true);
        txtSerial.setEnabled(true);
        maximizeWindow();
        ComboToTXT2();
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.setRowHeight(30);
        tableAlign();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        txtGrnDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtInvoiceNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        comboCustomer = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jMenuItem1.setText("Delete Selected");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Delete All");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem4.setText("View Serial numbers");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Invoice | JRTraders");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        txtGrnDate.setEditable(false);
        txtGrnDate.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        txtGrnDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGrnDateKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("INVOICE DATE");

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemID", "Item Name", "Unit Price", "QTY", "Unit", "Total", "MinPrice", "avbSTK"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(6).setMinWidth(0);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(7).setMinWidth(0);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        btnSave.setText("Print Invoice");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnSaveKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel6.setText("Invoice No");

        txtInvoiceNo.setEditable(false);
        txtInvoiceNo.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        txtInvoiceNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInvoiceNoKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel11.setForeground(java.awt.Color.green);
        jLabel11.setText("Invoice Total");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(1, 1, 1));
        txtTotal.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        txtTotal.setForeground(java.awt.Color.green);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel8.setText("Barcode");

        txtSerial.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        txtSerial.setToolTipText("Press Enter To Search");
        txtSerial.setEnabled(false);
        txtSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialActionPerformed(evt);
            }
        });
        txtSerial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerialKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerialKeyReleased(evt);
            }
        });

        comboCustomer.setEditable(true);
        comboCustomer.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        comboCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        comboCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboCustomerKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("Select Customer");

        jButton1.setText("Add New Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Keyboard Shortcuts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("F1 - New Invoice");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("F2 - New Customer");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("F4 - Enter Barcode");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel7.setText("F3 - Select Customer");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel9.setText("F5 - Make Payment");

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel10.setText("F10 - Select Item");

        jLabel12.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel12.setText("F11 - Edit Price");

        jLabel13.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel13.setText("F12 - Edit QTY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtGrnDate)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtInvoiceNo)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 486, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(comboCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGrnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        loadCashPay();


    }//GEN-LAST:event_btnSaveActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

        int button = evt.getButton();
        if (button == 3) {

            jPopupMenu1.show();

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AddCustomersQuick().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        int r = jTable1.getSelectedRow();
        String itemcode = (String) jTable1.getValueAt(r, 0);
        String itemName = (String) jTable1.getValueAt(r, 1);

        ViewInvoiceSerials viewInvoiceSerials = new ViewInvoiceSerials();

        DefaultTableModel dtm = (DefaultTableModel) viewInvoiceSerials.jTable1.getModel();
        dtm.setRowCount(0);

        Iterator<SupInvoiceHolder> iterator = al.iterator();

        while (iterator.hasNext()) {

            SupInvoiceHolder next = iterator.next();

            if (next.getProduct().equals(itemcode)) {

                java.util.Vector v = new java.util.Vector();

                v.add(itemName);
                v.add(next.getSerial());
                dtm.addRow(v);
                viewInvoiceSerials.productName.setText(itemName);
                viewInvoiceSerials.setVisible(true);
            }

        }


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void txtSerialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialKeyReleased

        try {

            if (evt.getKeyCode() == 10) {

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();

                    Criteria createCriteria = openSession.createCriteria(Item.class);
                    createCriteria.add(Restrictions.eq("itemCode", txtSerial.getText()));
                    List<Item> list = createCriteria.list();

                    if (list.size() > 1) {

                        ViewBarcordItem viewBarcordItem = new ViewBarcordItem();
                        DefaultTableModel dtm = (DefaultTableModel) viewBarcordItem.jTable1.getModel();
                        dtm.setRowCount(0);

                        double price = 0.00;
                        String priceN = "0.00";
                        double minprice = 0.00;
                        String minpriceN = "0.00";
                        for (Item item : list) {
                            Set<ItemPrices> itemPriceses = item.getItemPriceses();

                            if (itemPriceses.size() == 1) {

                                Iterator<ItemPrices> iterator = itemPriceses.iterator();
                                while (iterator.hasNext()) {
                                    ItemPrices next = iterator.next();
                                    price = next.getNettPrice();

                                    priceN = "" + Decimal_Formats.Price(price);
                                    minprice = next.getMinPrice();
                                    minpriceN = "" + minprice;
                                }

                            } else {

                                System.out.println("Inthe ELSE");

                                priceN = "VARIATION";
                                minpriceN = "VARIATION";
                                ArrayList<PriceHolder> priceHolderList = new ArrayList<PriceHolder>();
                                Iterator<ItemPrices> iterator = itemPriceses.iterator();
                                while (iterator.hasNext()) {

                                    ItemPrices next = iterator.next();

                                    PriceHolder priceHolder = new PriceHolder();
                                    priceHolder.setUnitPrice(next.getNettPrice());
                                    priceHolder.setMinPrice(next.getMinPrice());
                                    System.out.println("in the iterator");
                                    priceHolderList.add(priceHolder);
                                    System.out.println(priceHolderList);

                                }
                                System.out.println("Put to hashmap");
                                itemprice.put(item.getIdItem().toString(), priceHolderList);
                                System.out.println(itemprice);
                            }

                            String string = "";
                            Iterator iterator = item.getStocks().iterator();
                            while (iterator.hasNext()) {
                                Stock next = (Stock) iterator.next();
                                string = next.getQty() + "";

                            }

                            dtm.addRow(new Object[]{
                                item.getIdItem(),
                                item.getIitemName(),
                                priceN,
                                item.getUnit(),
                                minpriceN,
                                string

                            });

                        }

                        viewBarcordItem.jTable1.setRowSelectionInterval(0, 0);
                        viewBarcordItem.setVisible(true);

                    } else {

                        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                        double price = 0.00;
                        double minPrice = 0.00;

                        for (Item item : list) {
                            Set<ItemPrices> itemPriceses = item.getItemPriceses();

                            if (itemPriceses.size() == 1) {

                                Iterator<ItemPrices> iterator = itemPriceses.iterator();
                                while (iterator.hasNext()) {

                                    ItemPrices next = iterator.next();
                                    price = next.getNettPrice();
                                    minPrice = next.getMinPrice();

                                }

                                String string = "";
                                Iterator it = item.getStocks().iterator();
                                while (it.hasNext()) {
                                    Stock next = (Stock) it.next();
                                    string = next.getQty() + "";

                                }

                                dtm.addRow(new Object[]{
                                    item.getIdItem(),
                                    item.getIitemName(),
                                    Decimal_Formats.Price(price),
                                    1,
                                    item.getUnit(),
                                    Decimal_Formats.Price(price),
                                    minPrice,
                                    string

                                });

                                setGrnTotal();
                                txtSerial.setText(null);
                                txtSerial.grabFocus();

                            } else {

                                ViewPrice viewPrice = new ViewPrice();
                                DefaultTableModel dtmP = (DefaultTableModel) viewPrice.jTable1.getModel();
                                dtmP.setRowCount(0);
                                Iterator<ItemPrices> iterator = itemPriceses.iterator();
                                String stock = null;
                                while (iterator.hasNext()) {

                                    ItemPrices next = iterator.next();

                                    Iterator<Stock> iterator1 = next.getItem().getStocks().iterator();
                                    while (iterator1.hasNext()) {
                                        Stock next1 = iterator1.next();
                                        stock = next1.getQty() + "";
                                    }
                                    dtmP.addRow(new Object[]{
                                        next.getItem().getIdItem(),
                                        next.getItem().getIitemName(),
                                        next.getNettPrice(),
                                        next.getItem().getUnit(),
                                        next.getMinPrice(),
                                        stock

                                    });

                                }
                                viewPrice.jTable1.setRowSelectionInterval(0, 0);
                                viewPrice.setVisible(true);
                            }

                        }

                    }

                    openSession.close();

                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else if (evt.getKeyCode() == 121) {

                jTable1.grabFocus();
                jTable1.setRowSelectionInterval(0, 0);

            } else if (evt.getKeyCode() == 112) {

                int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Your unsaved data will be lost. are you sure to continue?");

                if (showConfirmDialog == 0) {

                    dispose();
                    new AddInvoicesV2().setVisible(true);

                }
            } else if (evt.getKeyCode() == 114) {

                comboCustomer.grabFocus();

            } else if (evt.getKeyCode() == 113) {

                new AddCustomersQuick().setVisible(true);

            } else if (evt.getKeyCode() == 115) {

                txtSerial.grabFocus();

            } else if (evt.getKeyCode() == 116) {

                if (!(txtTotal.getText().isEmpty() || comboCustomer.getSelectedIndex() == -1)) {

                    loadCashPay();

                } else {

                    JOptionPane.showMessageDialog(this, "Add items or select customer");

                }

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtSerialKeyReleased

    private void txtSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialActionPerformed

    private void txtSerialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialKeyTyped

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

        if (evt.getKeyCode() == 122) {

//            JOptionPane.showMessageDialog(null, jTable1.getSelectedColumn());
            jTable1.editCellAt(jTable1.getSelectedRow(), 2);
            jTable1.setSurrendersFocusOnKeystroke(true);
            jTable1.getEditorComponent().requestFocus();

        } else if (evt.getKeyCode() == 120) {

            DefaultTableModel td = (DefaultTableModel) jTable1.getModel();
            td.removeRow(jTable1.getSelectedRow());

        } else if (evt.getKeyCode() == 123) {

//            JOptionPane.showMessageDialog(null, jTable1.getSelectedColumn());
            jTable1.editCellAt(jTable1.getSelectedRow(), 3);
            jTable1.setSurrendersFocusOnKeystroke(true);
            jTable1.getEditorComponent().requestFocus();
//            jTable1.setRowSelectionInterval(jTable1.getSelectedRow(), jTable1.getSelectedRow());

        }


    }//GEN-LAST:event_jTable1KeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.getKeyCode() == 121) {

            jTable1.grabFocus();
            jTable1.setRowSelectionInterval(0, 0);

        } else if (evt.getKeyCode() == 112) {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Your unsaved data will be lost. are you sure to continue?");

            if (showConfirmDialog == 0) {

                dispose();
                new AddInvoicesV2().setVisible(true);

            }
        } else if (evt.getKeyCode() == 114) {

            comboCustomer.grabFocus();

        } else if (evt.getKeyCode() == 113) {

            new AddCustomersQuick().setVisible(true);

        } else if (evt.getKeyCode() == 115) {

            txtSerial.grabFocus();

        } else if (evt.getKeyCode() == 116) {

            if (!(txtTotal.getText().isEmpty() || comboCustomer.getSelectedIndex() == -1)) {

                loadCashPay();

            } else {

                JOptionPane.showMessageDialog(this, "Add items or select customer");

            }

        }


    }//GEN-LAST:event_formKeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

        if (evt.getKeyCode() == 10) {

            System.out.println(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + " " + jTable1.getValueAt(jTable1.getSelectedRow(), 2) + " " + jTable1.getValueAt(jTable1.getSelectedRow(), 3));
            double unitprice = 0;
            double QTY = 0;

            double MinUnitPrice = Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
            double MaxQTY = Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());

            try {

                unitprice = Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());

            } catch (Exception e) {

//                JOptionPane.showMessageDialog(null, enter)
            }
            try {

                QTY = Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());

            } catch (Exception e) {
            }

            if (unitprice < MinUnitPrice) {

                JOptionPane.showMessageDialog(null, "The price you entered greater than the minimum price.");
                jTable1.editCellAt(jTable1.getSelectedRow(), 2);
                jTable1.setSurrendersFocusOnKeystroke(true);
                jTable1.getEditorComponent().requestFocus();

            } else if (QTY > MaxQTY) {

                JOptionPane.showMessageDialog(null, "The quantity you entered greater than available stock.");
                jTable1.editCellAt(jTable1.getSelectedRow(), 3);
                jTable1.setSurrendersFocusOnKeystroke(true);
                jTable1.getEditorComponent().requestFocus();

            } else {

                jTable1.setValueAt(Decimal_Formats.Price(unitprice * QTY), jTable1.getSelectedRow(), 5);
                setGrnTotal();
            }

        } else if (evt.getKeyCode() == 112) {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Your unsaved data will be lost. are you sure to continue?");

            if (showConfirmDialog == 0) {

                dispose();
                new AddInvoicesV2().setVisible(true);

            }
        } else if (evt.getKeyCode() == 114) {

            comboCustomer.grabFocus();

        } else if (evt.getKeyCode() == 113) {

            new AddCustomersQuick().setVisible(true);

        } else if (evt.getKeyCode() == 115) {

            txtSerial.grabFocus();

        } else if (evt.getKeyCode() == 116) {

            if (!(txtTotal.getText().isEmpty() || comboCustomer.getSelectedIndex() == -1)) {

                loadCashPay();

            } else {

                JOptionPane.showMessageDialog(this, "Add items or select customer");

            }

        }


    }//GEN-LAST:event_jTable1KeyReleased

    private void comboCustomerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboCustomerKeyReleased
        if (evt.getKeyCode() == 112) {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Your unsaved data will be lost. are you sure to continue?");

            if (showConfirmDialog == 0) {

                dispose();
                new AddInvoicesV2().setVisible(true);

            }

        } else if (evt.getKeyCode() == 114) {

            comboCustomer.grabFocus();

        } else if (evt.getKeyCode() == 113) {

            new AddCustomersQuick().setVisible(true);

        } else if (evt.getKeyCode() == 115) {

            txtSerial.grabFocus();

        }
    }//GEN-LAST:event_comboCustomerKeyReleased

    private void txtGrnDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrnDateKeyReleased
        if (evt.getKeyCode() == 112) {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Your unsaved data will be lost. are you sure to continue?");

            if (showConfirmDialog == 0) {

                dispose();
                new AddInvoicesV2().setVisible(true);

            }
        } else if (evt.getKeyCode() == 114) {

            comboCustomer.grabFocus();

        } else if (evt.getKeyCode() == 113) {

            new AddCustomersQuick().setVisible(true);

        } else if (evt.getKeyCode() == 115) {

            txtSerial.grabFocus();

        } else if (evt.getKeyCode() == 116) {

            if (!(txtTotal.getText().isEmpty() || comboCustomer.getSelectedIndex() == -1)) {

                loadCashPay();

            } else {

                JOptionPane.showMessageDialog(this, "Add items or select customer");

            }

        }
    }//GEN-LAST:event_txtGrnDateKeyReleased

    private void txtInvoiceNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInvoiceNoKeyReleased
        if (evt.getKeyCode() == 112) {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Your unsaved data will be lost. are you sure to continue?");

            if (showConfirmDialog == 0) {

                dispose();
                new AddInvoicesV2().setVisible(true);

            }
        } else if (evt.getKeyCode() == 114) {

            comboCustomer.grabFocus();

        } else if (evt.getKeyCode() == 113) {

            new AddCustomersQuick().setVisible(true);

        } else if (evt.getKeyCode() == 115) {

            txtSerial.grabFocus();

        } else if (evt.getKeyCode() == 116) {

            if (!(txtTotal.getText().isEmpty() || comboCustomer.getSelectedIndex() == -1)) {

                loadCashPay();

            } else {

                JOptionPane.showMessageDialog(this, "Add items or select customer");

            }

        }
    }//GEN-LAST:event_txtInvoiceNoKeyReleased

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        if (evt.getKeyCode() == 112) {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Your unsaved data will be lost. are you sure to continue?");

            if (showConfirmDialog == 0) {

                dispose();
                new AddInvoicesV2().setVisible(true);

            }
        } else if (evt.getKeyCode() == 114) {

            comboCustomer.grabFocus();

        } else if (evt.getKeyCode() == 113) {

            new AddCustomersQuick().setVisible(true);

        } else if (evt.getKeyCode() == 115) {

            txtSerial.grabFocus();

        } else if (evt.getKeyCode() == 116) {

            if (!(txtTotal.getText().isEmpty() || comboCustomer.getSelectedIndex() == -1)) {

                loadCashPay();

            } else {

                JOptionPane.showMessageDialog(this, "Add items or select customer");

            }

        }
    }//GEN-LAST:event_jButton1KeyReleased

    private void txtTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyReleased
        if (evt.getKeyCode() == 112) {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Your unsaved data will be lost. are you sure to continue?");

            if (showConfirmDialog == 0) {

                dispose();
                new AddInvoicesV2().setVisible(true);

            }
        } else if (evt.getKeyCode() == 114) {

            comboCustomer.grabFocus();

        } else if (evt.getKeyCode() == 113) {

            new AddCustomersQuick().setVisible(true);

        } else if (evt.getKeyCode() == 115) {

            txtSerial.grabFocus();

        } else if (evt.getKeyCode() == 116) {

            if (!(txtTotal.getText().isEmpty() || comboCustomer.getSelectedIndex() == -1)) {

                loadCashPay();

            } else {

                JOptionPane.showMessageDialog(this, "Add items or select customer");

            }

        }
    }//GEN-LAST:event_txtTotalKeyReleased

    private void btnSaveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyReleased
        if (evt.getKeyCode() == 112) {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Your unsaved data will be lost. are you sure to continue?");

            if (showConfirmDialog == 0) {

                dispose();
                new AddInvoicesV2().setVisible(true);

            }
        } else if (evt.getKeyCode() == 114) {

            comboCustomer.grabFocus();

        } else if (evt.getKeyCode() == 113) {

            new AddCustomersQuick().setVisible(true);

        } else if (evt.getKeyCode() == 115) {

            txtSerial.grabFocus();

        } else if (evt.getKeyCode() == 116) {

            if (!(txtTotal.getText().isEmpty() || comboCustomer.getSelectedIndex() == -1)) {

                loadCashPay();

            } else {

                JOptionPane.showMessageDialog(this, "Add items or select customer");

            }

        }
    }//GEN-LAST:event_btnSaveKeyReleased

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInvoicesV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    public static javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private static javax.swing.JTextField txtGrnDate;
    private static javax.swing.JTextField txtInvoiceNo;
    public static javax.swing.JTextField txtSerial;
    private static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    static private void loadInvNo() {

        Session openSession = PoolManager.getSessionFactory().openSession();
        Criteria createCriteria = openSession.createCriteria(Invoice.class);
        createCriteria.setProjection(Projections.rowCount());
        List list = createCriteria.list();
        String InvNo = Decimal_Formats.InvNo(Integer.parseInt(list.get(0).toString()) + 1);
        txtInvoiceNo.setText("INV-" + InvNo);
        openSession.close();

    }

    public static void setGrnTotal() {

        double tot = 0;

        for (int i = 0; i < jTable1.getRowCount(); i++) {

            tot += Double.parseDouble(jTable1.getValueAt(i, 5).toString());

        }

        txtTotal.setText("" + Decimal_Formats.Price(tot));

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

    public void comboFilter2(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        System.out.println("In The method");

        try {

            if (enteredText.matches("\\d+")) {
                System.out.println("Search By contact");

                try {

                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customers.class);
                    createCriteria.add(Restrictions.like("customersContactNo", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isActive", "Active"));
                    List<Customers> list = createCriteria.list();

                    for (Customers customers : list) {
                        System.out.println("Customer List pno");
                        str1 = customers.getCustomerscolName() + " - " + customers.getCustomersContactNo();
                        filterArray.add(str1);
                        cust.put(customers.getCustomersContactNo(), customers.getIdCustomers());
                    }
                    
//                    openSession.close();
                } catch (Exception e) {

                    e.printStackTrace();

                }

            } else {

                try {
                    System.out.println("Search By Name");
                    Session openSession = PoolManager.getSessionFactory().openSession();
                    Criteria createCriteria = openSession.createCriteria(Customers.class);
                    createCriteria.add(Restrictions.like("customerscolName", "%" + enteredText + "%"));
                    createCriteria.add(Restrictions.eq("isActive", "Active"));
                    List<Customers> list = createCriteria.list();

                    for (Customers customers : list) {
                        System.out.println("List By name");
                        str1 = customers.getCustomerscolName() + " - " + customers.getCustomersContactNo();
                        filterArray.add(str1);
                        cust.put(customers.getCustomersContactNo(), customers.getIdCustomers());

                    }
//                    openSession.close();
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

                        } else if (!(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getKeyCode() == KeyEvent.VK_DOWN || ke.getKeyCode() == KeyEvent.VK_UP)) {

                            comboFilter2(textfield0.getText());
                            System.out.println("Start Search");

                        }

                    }
                });

            }
        });
    }

    private void maximizeWindow() {

        if (maximized) {

            AddInvoicesV2.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            AddInvoicesV2.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }

    }

    public static void SaveInDB() {

        if (true) {

            try {
                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();

                Invoice invoice = new Invoice();

                invoice.setInvoiceNo(txtInvoiceNo.getText());
                invoice.setInvoiceDate(txtGrnDate.getText());

                invoice.setSubTotal(Double.parseDouble(txtTotal.getText()));
                try {
                    invoice.setDiscount(Double.parseDouble(CashPayments.txtDiscount.getText()));
                } catch (Exception e) {

                    invoice.setDiscount(0.00);
                }

                invoice.setNettTotal(Double.parseDouble(CashPayments.txtGrandTotal.getText()));

                try {
                    invoice.setPaid(Double.parseDouble(CashPayments.txtCashGiven.getText()));
                } catch (Exception e) {
                    invoice.setPaid(0.00);
                }

                try {
                    invoice.setBalance(Double.parseDouble(CashPayments.txtBalance.getText()));
                } catch (Exception e) {
                    invoice.setBalance(Double.parseDouble(CashPayments.txtGrandTotal.getText()));
                }

                invoice.setIsActive("Active");
                invoice.setCreatedBy(Login.Uname);

                openSession.save(invoice);

                Customers customer = new Customers();
                customer.setIdCustomers(cust.get(comboCustomer.getSelectedItem().toString().split(" - ")[1]));
                InvoiceHasCustomers ihc = new InvoiceHasCustomers();
                ihc.setCustomers(customer);
                ihc.setInvoice(invoice);
                openSession.save(ihc);

                for (int i = 0; i < jTable1.getRowCount(); i++) {

                    Item item = new Item();
                    item.setIdItem(Integer.parseInt(jTable1.getValueAt(i, 0).toString()));

                    InvoiceItem invoiceItem = new InvoiceItem();
                    invoiceItem.setInvoice(invoice);
                    invoiceItem.setItem(item);
                    invoiceItem.setQty(Integer.parseInt(Decimal_Formats.Qty(Double.parseDouble(jTable1.getValueAt(i, 3).toString()))));
                    invoiceItem.setUnitPrice(Double.parseDouble(jTable1.getValueAt(i, 2).toString()));
                    invoiceItem.setNettTotalItm(Double.parseDouble(jTable1.getValueAt(i, 5).toString()));
                    invoiceItem.setWarranry("N/A");
                    invoiceItem.setIsActive("Active");

                    openSession.save(invoiceItem);

                    Criteria createCriteria = openSession.createCriteria(Stock.class);
                    createCriteria.createAlias("item", "i");
                    createCriteria.add(Restrictions.eq("i.idItem", Integer.parseInt(jTable1.getValueAt(i, 0).toString())));
                    Stock stk = (Stock) createCriteria.uniqueResult();
                    stk.setQty(stk.getQty() - Double.parseDouble(jTable1.getValueAt(i, 3).toString()));

                    openSession.update(stk);

                }

                InvoicePayments ip = new InvoicePayments();
                ip.setCustomers(customer);
                ip.setInvoice(invoice);

                if (Double.parseDouble(CashPayments.txtGrandTotal.getText()) <= Double.parseDouble(CashPayments.txtCashGiven.getText())) {

                    ip.setAmount(Double.parseDouble(CashPayments.txtGrandTotal.getText()));

                } else {

                    ip.setAmount(Double.parseDouble(CashPayments.txtCashGiven.getText()));

                }

                ip.setPaymentDate(txtGrnDate.getText());
                ip.setPaymentType("Cash");
                ip.setIsActive("Active");

                openSession.save(ip);

                CashBook cb = new CashBook();
                cb.setDebit(0.00);
                if (Double.parseDouble(CashPayments.txtGrandTotal.getText()) <= Double.parseDouble(CashPayments.txtCashGiven.getText())) {

                    cb.setCredit(Double.parseDouble(CashPayments.txtGrandTotal.getText()));

                } else {

                    cb.setCredit(Double.parseDouble(CashPayments.txtCashGiven.getText()));

                }
                cb.setCbdate(txtGrnDate.getText());
                cb.setDescriotion("Payment for Invoice " + txtInvoiceNo.getText());
                openSession.save(cb);
                beginTransaction.commit();
                openSession.close();

                comboCustomer.setSelectedIndex(0);

                txtTotal.setText(null);

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                al.clear();
                NotificationPopup.save();

                System.out.println(txtInvoiceNo.getText());

                try {
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("InvoiceNo", txtInvoiceNo.getText());
                    System.out.println(map);
                    //  JasperPrint jp = JasperFillManager.fillReport(Login.jrCusInvoiceWithSerial, map, DB.getCon());
                    JasperPrint jp = JasperFillManager.fillReport(Login.JRtraders, map, DB.getCon());

                     JasperViewer.viewReport(jp);
                    JasperPrintManager.printReport(jp, true);
                } catch (Exception ex) {
                    Logger.getLogger(ViewInvoice.class.getName()).log(Level.SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(null, "Invoice Saved Succuessfully");
                
                
                
                loadInvNo();

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

    }

    private void loadCashPay() {
        CashPayments cashPayments = new CashPayments();
        cashPayments.txtTotal.setText(txtTotal.getText());
        cashPayments.txtDiscount.setText("0.00");
        cashPayments.txtGrandTotal.setText(txtTotal.getText());
        cashPayments.setVisible(true);
    }

}
