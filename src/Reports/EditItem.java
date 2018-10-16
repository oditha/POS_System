/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import ORM.Brands;
import ORM.Catogory;
import ORM.Item;
import static Reports.ViewItemUdaya.iditem;
import static Reports.ViewItemUdaya.loadItem;
import static Reports.ViewItemUdaya.tableItem;
import com.alee.laf.WebLookAndFeel;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author arshak
 */
public class EditItem extends javax.swing.JFrame {

    /**
     * Creates new form EditItem
     */
    public EditItem() {
        initComponents();
        loadcatagory();
        loadBrands();
        Loaditemss();
    }
    int catagoryid;
    int brandid;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ItemName = new javax.swing.JTextField();
        catagory = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        brand = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Item | JR Traders");
        setAlwaysOnTop(true);
        setUndecorated(true);

        jLabel3.setText("Item Name");

        jLabel1.setText("Description");

        catagory.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                catagoryPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        catagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoryActionPerformed(evt);
            }
        });

        jLabel2.setText("Brand");

        brand.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                brandPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Description);

        jLabel4.setText("Catagory");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(145, 145, 145))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(162, 162, 162))
                    .addComponent(brand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(catagory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ItemName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(132, 132, 132))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catagory, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brand, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void catagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoryActionPerformed

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cr = openSession.createCriteria(Catogory.class);
            cr.add(Restrictions.eq("catogoryName", catagory.getSelectedItem().toString()));

            Catogory uniqueResult = (Catogory) cr.uniqueResult();

            if (uniqueResult != null) {

                catagoryid = uniqueResult.getIdCatogory();

            }

        } catch (Exception e) {
            e.printStackTrace();

        }


    }//GEN-LAST:event_catagoryActionPerformed

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cr = openSession.createCriteria(Brands.class);
            cr.add(Restrictions.eq("brandName", brand.getSelectedItem().toString()));

            Brands uniqueResult = (Brands) cr.uniqueResult();

            if (uniqueResult != null) {

                brandid = uniqueResult.getIdBrands();
                //System.out.println(brandid);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_brandActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria cr = openSession.createCriteria(Item.class);
            Transaction tr = openSession.beginTransaction();

            cr.add(Restrictions.eq("idItem", iditem));

            Catogory catogory = new Catogory();
            catogory.setIdCatogory(catagoryid);
            Brands brands = new Brands();
            brands.setIdBrands(brandid);

            Item item = (Item) cr.uniqueResult();
            item.setIitemName(ItemName.getText().toUpperCase());
            item.setCatogory(catogory);
            item.setBrands(brands);
            item.setDescriotion(Description.getText());

            openSession.update(item);
            tr.commit();
            NotificationPopup.save();
            openSession.close();

            this.dispose();


        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.dispose();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void catagoryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_catagoryPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_catagoryPopupMenuWillBecomeInvisible

    private void brandPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_brandPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_brandPopupMenuWillBecomeInvisible

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        WebLookAndFeel.install();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Description;
    private javax.swing.JTextField ItemName;
    private javax.swing.JComboBox<String> brand;
    private javax.swing.JComboBox<String> catagory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void loadcatagory() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cr = openSession.createCriteria(Catogory.class);

            cr.add(Restrictions.eq("isActive", "Active"));

            List<Catogory> list = cr.list();

            for (Catogory catogory : list) {

                catagory.addItem(catogory.getCatogoryName());

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private void loadBrands() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cr = openSession.createCriteria(Brands.class);
            cr.add(Restrictions.eq("isActive", "Active"));

            List<Brands> list = cr.list();

            for (Brands brands : list) {

                brand.addItem(brands.getBrandName());

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    private void Loaditemss() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cr = openSession.createCriteria(Item.class);
            cr.add(Restrictions.eq("idItem", iditem));

            Item uniqueResult = (Item) cr.uniqueResult();
            //System.out.println(new ViewItemUdaya().itemcode);

            if (uniqueResult != null) {
                ItemName.setText(uniqueResult.getIitemName());
                catagory.setSelectedItem(uniqueResult.getCatogory().getCatogoryName());
                brand.setSelectedItem(uniqueResult.getBrands().getBrandName());
                Description.setText(uniqueResult.getDescriotion());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}