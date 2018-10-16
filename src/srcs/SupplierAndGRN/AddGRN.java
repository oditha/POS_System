package srcs.SupplierAndGRN;

import ORM.Brands;
import ORM.CashBook;
import ORM.Grn;
import ORM.Grnitem;
import ORM.Grnpayments;
import ORM.Item;
import ORM.ItemPrices;
import ORM.ItemSereal;
import ORM.Stock;
import ORM.Supplier;
import com.alee.laf.WebLookAndFeel;

import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import exClass.SeriealHolder;
import exClass.dateForm;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AddGRN extends javax.swing.JFrame {

    Map<String, Integer> sup = new HashMap();
    Map<String, Integer> bra = new HashMap();
    Map<String, Integer> itm = new HashMap();
    Map<String, String> itmNames = new HashMap();
    public static Set<SeriealHolder> hashset = new HashSet();
    public static Map<String, HashSet> itmSerial = new HashMap();
    public static String pID;
    public static String pName;
    String path = null;

    public AddGRN() {
        initComponents();
        TxtDate.setText(dateForm.setdate());
//        loadSup();
        loadBrands();
        ComboToTXT();
        ComboToTXT2();
        tableAlign();
        jTable1.setComponentPopupMenu(jPopupMenu1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        comboSupllier = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBillNO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGrossPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboPrice = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNetPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQTY = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGRNTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comboPaymentType = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtPaid = new javax.swing.JTextField();
        TxtDate = new com.alee.extended.date.WebDateField();
        comboItemName = new javax.swing.JComboBox<>();
        comboBrands = new javax.swing.JComboBox<>();
        txtUnit = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jMenuItem3.setText("Delete Selected");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setText("Delete All");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        jMenuItem1.setText("View Serial No");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add GRN |  | JRTraders");

        jLabel1.setText("Select Supplyer");

        comboSupllier.setEditable(true);

        jLabel2.setText("Select Brand");

        jLabel3.setText("GRN DATE");

        jLabel4.setText("Item Name");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Cost", "QTY", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btnSave.setText("Save GRN");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel6.setText("Bill No");

        jLabel7.setText("Cost");

        txtGrossPrice.setEditable(false);

        jLabel5.setText("Price Variation");

        comboPrice.setToolTipText("Press TAB after select Price");
        comboPrice.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboPricePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel8.setText("Nett Price");

        txtNetPrice.setEditable(false);

        jLabel10.setText("Quantity");

        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });
        txtQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQTYKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQTYKeyReleased(evt);
            }
        });

        jLabel11.setText("GRN Total");

        txtGRNTotal.setEditable(false);

        jLabel12.setText("Payment Type");

        comboPaymentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit" }));
        comboPaymentType.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboPaymentTypePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel13.setText("Paid Amount");

        txtPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaidKeyTyped(evt);
            }
        });

        TxtDate.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        TxtDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtDateMouseClicked(evt);
            }
        });

        comboItemName.setEditable(true);
        comboItemName.setToolTipText("Press Enter after select Item");
        comboItemName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboItemNamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboItemNameActionPerformed(evt);
            }
        });
        comboItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboItemNameKeyReleased(evt);
            }
        });

        comboBrands.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboBrands.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboBrandsPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBrandsActionPerformed(evt);
            }
        });

        txtUnit.setEditable(false);

        jLabel14.setText("Unit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtGRNTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGrossPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(comboItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboPrice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUnit)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBillNO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 172, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboSupllier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboBrands, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboItemName)
                                        .addComponent(comboPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNetPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGrossPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUnit)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBillNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGRNTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPaid)
                            .addComponent(comboPaymentType))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Double paid = 0.0;

        if (txtPaid.getText().isEmpty()) {
            paid = 0.0;
        } else {
            paid = Double.parseDouble(txtPaid.getText());
        }

        if (!(comboSupllier.getSelectedItem().equals("Select") && txtBillNO.getText().isEmpty() && TxtDate.getText().isEmpty())) {

            try {
                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();

                Supplier supplier = new Supplier();
                supplier.setIdSupplier(sup.get(comboSupllier.getSelectedItem().toString().split(" - ")[0]));

                Grn grn = new Grn();
                grn.setGrnno(txtBillNO.getText());
                grn.setGrndate(TxtDate.getText());
                grn.setNettTotal(Double.parseDouble(txtGRNTotal.getText()));
                grn.setSupplier(supplier);
                grn.setPhoto(path);
                grn.setIsActive("Active");

                openSession.save(grn);

                for (int i = 0; i < jTable1.getRowCount(); i++) {

                    Item item = new Item();
                    item.setIdItem(itm.get(jTable1.getValueAt(i, 0).toString()));

                    Grnitem grnitem = new Grnitem();
                    grnitem.setGrn(grn);
                    grnitem.setQty(Integer.parseInt(Decimal_Formats.Qty(Double.parseDouble(jTable1.getValueAt(i, 3).toString()))));
                    grnitem.setGrossPrice(Double.parseDouble(jTable1.getValueAt(i, 2).toString()));
                    grnitem.setTotal(Double.parseDouble(jTable1.getValueAt(i, 4).toString()));
                    grnitem.setItem(item);

                    openSession.save(grnitem);

                    try {
                        HashSet get = itmSerial.get(jTable1.getValueAt(i, 0).toString());
                        Iterator iterator = get.iterator();
                        while (iterator.hasNext()) {
                            SeriealHolder next = (SeriealHolder) iterator.next();
                            ItemSereal itemSereal = new ItemSereal();

                            itemSereal.setSerealNo(next.getSerial());
                            itemSereal.setIsActive("Active");
                            itemSereal.setSupplier(supplier);
                            itemSereal.setGrn(grn);
                            itemSereal.setItem(item);
                            itemSereal.setStatus("Unsold");

                            openSession.save(itemSereal);

                        }
                    } catch (Exception e) {
                    }

                    Criteria createCriteria = openSession.createCriteria(Stock.class);
                    createCriteria.createAlias("item", "i");
                    createCriteria.add(Restrictions.eq("i.idItem", itm.get(jTable1.getValueAt(i, 0).toString())));
                    Stock stk = (Stock) createCriteria.uniqueResult();
                    stk.setQty(stk.getQty() + Double.parseDouble(jTable1.getValueAt(i, 3).toString()));

                    openSession.update(stk);

                }

                Grnpayments grnpayments = new Grnpayments();
                grnpayments.setSupplier(supplier);
                grnpayments.setGrn(grn);
                grnpayments.setPaymentDate(TxtDate.getText());
                grnpayments.setAmount(paid);
                grnpayments.setPaymentType(comboPaymentType.getSelectedItem().toString());
                grnpayments.setIsActive("Active");

                openSession.save(grnpayments);

                CashBook cb = new CashBook();
                cb.setCredit(0.00);
                cb.setDebit(paid);
                cb.setCbdate(TxtDate.getText());
                cb.setDescriotion("Payment for supplier GRN " + txtBillNO.getText());
                openSession.save(cb);

                beginTransaction.commit();

                openSession.close();

                NotificationPopup.save();

                comboSupllier.setSelectedIndex(0);
                txtBillNO.setText(null);
                comboBrands.setSelectedIndex(0);
                comboItemName.removeAllItems();
                comboPrice.removeAllItems();
                txtGRNTotal.setText(null);
                txtPaid.setText(null);
                comboSupllier.grabFocus();
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                itmSerial.clear();

            } catch (Exception ex) {
                Logger.getLogger(AddGRN.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void TxtDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtDateMouseClicked


    }//GEN-LAST:event_TxtDateMouseClicked

    private void comboBrandsPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboBrandsPopupMenuWillBecomeInvisible
//        if (comboBrands.getSelectedIndex() != 0) {
//
//            loadItemCode(bra.get(comboBrands.getSelectedItem().toString()));
//            loadItemNames(bra.get(comboBrands.getSelectedItem().toString()));
//
//        }
    }//GEN-LAST:event_comboBrandsPopupMenuWillBecomeInvisible

    private void comboItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboItemNameActionPerformed

    }//GEN-LAST:event_comboItemNameActionPerformed

    private void comboItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboItemNameKeyReleased


    }//GEN-LAST:event_comboItemNameKeyReleased

    private void comboItemNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboItemNamePopupMenuWillBecomeInvisible


    }//GEN-LAST:event_comboItemNamePopupMenuWillBecomeInvisible

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYActionPerformed

    private void txtQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyReleased

        boolean flag = false;
        int row = 0;
        if (evt.getKeyCode() == 10) {

//            int rowCount = jTable1.getRowCount();
//            for (int i = 0; i < rowCount; i++) {
//
//                String toString = jTable1.getValueAt(i, 0).toString();
//
//                if (toString.equals(comboItemCode.getSelectedItem().toString())) {
//
//                    flag = true;
//                    row = i;
//                }
//
//            }
//            if (flag) {
//
//                jTable1.setValueAt(Double.parseDouble(txtQTY.getText()) + Double.parseDouble(jTable1.getValueAt(row, 3).toString()), row, 3);
//                jTable1.setValueAt((Double.parseDouble(jTable1.getValueAt(row, 3).toString())) * Double.parseDouble(txtGrossPrice.getText()), row, 4);
//
//            } else {
            try {
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.addRow(new Object[]{
                    comboItemName.getSelectedItem().toString().split(" - ")[1],
                    comboItemName.getSelectedItem().toString().split(" - ")[0],
                    txtGrossPrice.getText(),
                    txtQTY.getText(),
                    Decimal_Formats.Price(Double.parseDouble(txtGrossPrice.getText()) * Double.parseDouble(txtQTY.getText()))

                });
            } catch (Exception e) {
            }
//            }

            setGrnTotal();

            comboBrands.grabFocus();
            comboItemName.setSelectedIndex(-1);
//            comboItemCode.setSelectedIndex(-1);
            comboPrice.setSelectedIndex(-1);
            txtGrossPrice.setText(null);
            txtQTY.setText(null);
            txtNetPrice.setText(null);

        }

    }//GEN-LAST:event_txtQTYKeyReleased

    private void txtQTYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyTyped

        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }

    }//GEN-LAST:event_txtQTYKeyTyped

    private void comboPricePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboPricePopupMenuWillBecomeInvisible

        try {
            if (!comboPrice.getSelectedItem().equals("Select")) {

                txtGrossPrice.setText(comboPrice.getSelectedItem().toString().split(" - ")[0]);
                txtNetPrice.setText(comboPrice.getSelectedItem().toString().split(" - ")[1]);
                txtQTY.grabFocus();
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_comboPricePopupMenuWillBecomeInvisible

    private void comboBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBrandsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBrandsActionPerformed

    private void comboPaymentTypePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboPaymentTypePopupMenuWillBecomeInvisible

        if (comboPaymentType.getSelectedIndex() == 1) {

            txtPaid.setText("0.00");

        }

    }//GEN-LAST:event_comboPaymentTypePopupMenuWillBecomeInvisible

    private void txtPaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidKeyTyped
        char c = evt.getKeyChar();

        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_PERIOD) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

            evt.consume();

        }
    }//GEN-LAST:event_txtPaidKeyTyped

    private void txtPaidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidKeyReleased

        try {
            double grntot = Double.parseDouble(txtGRNTotal.getText());
            double paid = Double.parseDouble(txtPaid.getText());
            if (paid > grntot) {

                int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Paid amout Greater than GRN total. Do you want to continue?",
                        "Payment Error", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (showConfirmDialog != 0) {

                    txtPaid.setText(null);
                    txtPaid.grabFocus();

                }

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtPaidKeyReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        int button = evt.getButton();
        if (button == 3) {

            jPopupMenu1.show();

        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.removeRow(jTable1.getSelectedRow());

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        try {

            pID = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            pName = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();

            new ViewGRNSerials().setVisible(true);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGRN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.extended.date.WebDateField TxtDate;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboBrands;
    public static javax.swing.JComboBox<String> comboItemName;
    private javax.swing.JComboBox<String> comboPaymentType;
    private javax.swing.JComboBox<String> comboPrice;
    public static javax.swing.JComboBox<String> comboSupllier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBillNO;
    private javax.swing.JTextField txtGRNTotal;
    private javax.swing.JTextField txtGrossPrice;
    private javax.swing.JTextField txtNetPrice;
    private javax.swing.JTextField txtPaid;
    public static javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables

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

//    private void loadItemCode(int idBrand) {
//
//        Session openSession = PoolManager.getSessionFactory().openSession();
//        Criteria createCriteria = openSession.createCriteria(Item.class);
//        createCriteria.add(Restrictions.eq("isActive", "Active"));
//        createCriteria.createAlias("brands", "b");
//        createCriteria.add(Restrictions.eq("b.idBrands", idBrand));
//        List<Item> list = createCriteria.list();
//        comboItemCode.removeAllItems();
//        for (Item item : list) {
//
//            comboItemCode.addItem(item.getItemCode());
//            itm.put(item.getItemCode(), item.getIdItem());
//
//        }
//
//        comboItemCode.setSelectedIndex(-1);
//        openSession.close();
//    }
    private void loadItemNames(int idBrand) {
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Item.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            createCriteria.createAlias("brands", "b");
            createCriteria.add(Restrictions.eq("b.idBrands", idBrand));
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

    private void loadBrands() {

        Session openSession = PoolManager.getSessionFactory().openSession();
        Criteria createCriteria = openSession.createCriteria(Brands.class);
        createCriteria.add(Restrictions.eq("isActive", "Active"));
        List<Brands> list = createCriteria.list();

        for (Brands brands : list) {

            comboBrands.addItem(brands.getBrandName());
            bra.put(brands.getBrandName(), brands.getIdBrands());
        }

        openSession.close();

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

                comboPrice.addItem(Decimal_Formats.Price(itemPrices.getGrossPrice()) + " - " + Decimal_Formats.Price(itemPrices.getNettPrice()));

                if (list.size() == 1) {

                    comboPrice.setSelectedIndex(1);
                    txtGrossPrice.setText(Decimal_Formats.Price(itemPrices.getGrossPrice()));
                    txtNetPrice.setText(Decimal_Formats.Price(itemPrices.getNettPrice()));
                    txtQTY.grabFocus();

                } else {

                    txtGrossPrice.setText(null);
                    txtNetPrice.setText(null);
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

        txtGRNTotal.setText("" + Decimal_Formats.Price(tot));
    }

    public void comboFilter(String enteredText) {
        List<String> filterArray = new ArrayList<String>();

        String str1 = "";

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Item.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            createCriteria.createAlias("brands", "b");
            createCriteria.add(Restrictions.eq("b.idBrands", bra.get(comboBrands.getSelectedItem().toString())));
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
                                Session sess = PoolManager.getSessionFactory().openSession();
                                Criteria cr = sess.createCriteria(Item.class);
                                cr.add(Restrictions.eq("itemCode", comboItemName.getSelectedItem().toString().split(" - ")[1]));
                                try {
                                    Item uniqueResult = (Item) cr.uniqueResult();

                                    txtUnit.setText(uniqueResult.getUnit());
                                } catch (Exception e) {
                                }

                                sess.close();

                                loadPriceVariation();

                            } catch (Exception e) {
                                e.printStackTrace();
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
