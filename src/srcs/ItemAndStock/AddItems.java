package srcs.ItemAndStock;

import ORM.Brands;
import ORM.Catogory;
import ORM.Item;
import ORM.ItemPrices;
import ORM.Stock;
import com.alee.laf.WebLookAndFeel;
import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class AddItems extends javax.swing.JFrame {

    Map<String, Integer> cat = new HashMap();
    Map<String, Integer> bra = new HashMap();

    public AddItems() {
        initComponents();
        LoadCombo();
        tableAlign();
        jTable1.setComponentPopupMenu(jPopupMenu1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        comboCatogory = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboBrand = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnResetItem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddPrice = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboUnit = new javax.swing.JComboBox<>();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Item  | Bit Win Computers");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Select Catogory");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 134, -1));

        txtItemCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtItemCodeFocusLost(evt);
            }
        });
        getContentPane().add(txtItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 43, 180, -1));

        comboCatogory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboCatogory.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboCatogoryPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(comboCatogory, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 43, 207, -1));

        jLabel2.setText("Select Brand");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 94, -1, -1));

        comboBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboBrand.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboBrandPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(comboBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 112, 207, -1));

        jLabel3.setText("Item Code");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 20, 106, -1));

        jLabel4.setText("Item Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        txtItemName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtItemNameFocusLost(evt);
            }
        });
        txtItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 470, -1));

        jLabel5.setText("Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 70, -1));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescription);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 98, 240, 60));

        btnResetItem.setText("Reset Item");
        btnResetItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetItemActionPerformed(evt);
            }
        });
        getContentPane().add(btnResetItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 479, 166, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Cost", "Nett Price", "Min Price", "Supplier Warrenty", "Seller Warrenty"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 181, 910, 280));

        btnAddPrice.setText("Add Price Variation");
        btnAddPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPriceActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 166, 27));

        btnSave.setText("Save Item");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 479, 158, 30));

        jLabel6.setText("Select Unit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        comboUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pcs", "L", "KG", "M" }));
        comboUnit.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboUnitPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(comboUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 178, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetItemActionPerformed
        ClearFeilds();
    }//GEN-LAST:event_btnResetItemActionPerformed

    private void btnAddPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPriceActionPerformed

        if (!(txtItemCode.getText().isEmpty() && txtItemName.getText().isEmpty())) {
            new AddPriceVariations().setVisible(true);
        }

    }//GEN-LAST:event_btnAddPriceActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (jTable1.getRowCount() > 0) {

            try {
                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();

                Catogory catogory = new Catogory();
                catogory.setIdCatogory(cat.get(comboCatogory.getSelectedItem().toString().split(" - ")[0]));

                Brands brands = new Brands();
                brands.setIdBrands(bra.get(comboBrand.getSelectedItem().toString()));

                Item item = new Item();
                item.setItemCode(txtItemCode.getText());
                item.setIitemName(comboBrand.getSelectedItem().toString()+" "+txtItemName.getText().toUpperCase());
                item.setCatogory(catogory);
                item.setBrands(brands);
                item.setDescriotion(txtDescription.getText());
                item.setIsActive("Active");
                item.setUnit(comboUnit.getSelectedItem().toString());

                openSession.save(item);

                Stock stock = new Stock();
                stock.setItem(item);
                stock.setQty(0.00);
                
                openSession.save(stock);
                
                for (int i = 0; i < jTable1.getRowCount(); i++) {

                    ItemPrices itemPrices = new ItemPrices();
                    itemPrices.setItem(item);
                    itemPrices.setGrossPrice(Double.parseDouble(jTable1.getValueAt(i, 1).toString()));
                    itemPrices.setNettPrice(Double.parseDouble(jTable1.getValueAt(i, 2).toString()));
                    itemPrices.setMinPrice(Double.parseDouble(jTable1.getValueAt(i, 3).toString()));
                    itemPrices.setSupWarrenty(jTable1.getValueAt(i, 4).toString());
                    itemPrices.setSelelrWarrenty(jTable1.getValueAt(i, 5).toString());

                    openSession.save(itemPrices);

                }
                
                beginTransaction.commit();
                openSession.close();
                
                NotificationPopup.save();
                ClearFeilds();
                        

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboCatogoryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboCatogoryPopupMenuWillBecomeInvisible

//        if (!comboCatogory.getSelectedItem().toString().equals("Select")) {
//
//            String PreFix = comboCatogory.getSelectedItem().toString().split(" - ")[0];
//
//            try {
//
//                Session openSession = PoolManager.getSessionFactory().openSession();
//                Criteria createCriteria = openSession.createCriteria(Item.class);
//                createCriteria.createAlias("catogory", "c");
//                createCriteria.add(Restrictions.eq("c.idCatogory", cat.get(PreFix)));
//                createCriteria.setProjection(Projections.rowCount());
//                List list = createCriteria.list();
//
//                String Item_Code = Decimal_Formats.Item_Code(Integer.parseInt(list.get(0).toString()) + 1);
//
//                txtItemCode.setText(PreFix + "-" + Item_Code);
//
//                comboBrand.grabFocus();
//
//            } catch (Exception e) {
//
//                e.printStackTrace();
//
//            }
//
//        }

    }//GEN-LAST:event_comboCatogoryPopupMenuWillBecomeInvisible

    private void txtItemCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemCodeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemCodeFocusLost

    private void txtItemNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtItemNameFocusLost
        txtDescription.grabFocus();
    }//GEN-LAST:event_txtItemNameFocusLost

    private void txtDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusLost
        btnAddPrice.grabFocus();
    }//GEN-LAST:event_txtDescriptionFocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        
        if (evt.getButton()==3) {
            
            jPopupMenu1.show();
        }
        
    }//GEN-LAST:event_jTable1MouseReleased

    private void comboBrandPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboBrandPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBrandPopupMenuWillBecomeInvisible

    private void txtItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyReleased
        
        try {
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cc = openSession.createCriteria(Item.class);
            cc.add(Restrictions.eq("iitemName", comboBrand.getSelectedItem().toString()+" "+txtItemName.getText()));
            Item uniqueResult = (Item) cc.uniqueResult();
            if (uniqueResult != null) {
                
                JOptionPane.showMessageDialog(this, "This item alredy saved in Item list. See at View Item");
                txtItemName.grabFocus();
                txtItemName.setText(null);
            }
            
            
        } catch (Exception e) {
        
            e.printStackTrace();
        
        }
        
    }//GEN-LAST:event_txtItemNameKeyReleased

    private void comboUnitPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboUnitPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUnitPopupMenuWillBecomeInvisible

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPrice;
    private javax.swing.JButton btnResetItem;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboBrand;
    private javax.swing.JComboBox<String> comboCatogory;
    private javax.swing.JComboBox<String> comboUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtDescription;
    public static javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    // End of variables declaration//GEN-END:variables

    private void LoadCombo() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Catogory.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            List<Catogory> list = createCriteria.list();

            for (Catogory catogory : list) {

                comboCatogory.addItem(catogory.getCatogoryCode() + " - " + catogory.getCatogoryName());
                cat.put(catogory.getCatogoryCode(), catogory.getIdCatogory());

            }

            Criteria cc = openSession.createCriteria(Brands.class);
            cc.add(Restrictions.eq("isActive", "Active"));
            List<Brands> list1 = cc.list();
            for (Brands brands : list1) {

                comboBrand.addItem(brands.getBrandName());

                bra.put(brands.getBrandName(), brands.getIdBrands());

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void ClearFeilds() {
//        Component[] cp = addi.getComponents();
//        for (Component c : cp) {
//
//            if (c instanceof JTextField) {
//
//                ((JTextField) c).setText(null);
//
//            }
//
//        }

        comboBrand.setSelectedIndex(0);
        comboCatogory.setSelectedIndex(0);
        comboCatogory.grabFocus();
        txtDescription.setText(null);
        txtItemCode.setText(null);
        txtItemName.setText(null);
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

    }
    
     private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }
}
