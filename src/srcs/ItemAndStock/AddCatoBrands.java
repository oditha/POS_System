package srcs.ItemAndStock;

import ORM.Brands;
import ORM.Catogory;
import com.alee.extended.panel.CenterPanel;
import com.alee.laf.WebLookAndFeel;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class AddCatoBrands extends javax.swing.JFrame {

    public AddCatoBrands() {
        initComponents();
        txtCatID.grabFocus();
        LoadCato();
        loadBrands();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnAddCat = new javax.swing.JButton();
        btnAddBrands = new javax.swing.JButton();
        brnDeleteBrands = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBrands = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCato = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCatID = new javax.swing.JTextField();
        txtCatoName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Catogory / Brands | JRTraders");
        setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Add Brands");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setText("Add Catogory");

        btnRemove.setText("Remove Selected");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAddCat.setText("Add New");
        btnAddCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCatActionPerformed(evt);
            }
        });

        btnAddBrands.setText("Add New");
        btnAddBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBrandsActionPerformed(evt);
            }
        });

        brnDeleteBrands.setText("Remove Selected");
        brnDeleteBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnDeleteBrandsActionPerformed(evt);
            }
        });

        tblBrands.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brands"
            }
        ));
        jScrollPane3.setViewportView(tblBrands);

        tblCato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Catogoty"
            }
        ));
        jScrollPane4.setViewportView(tblCato);

        jLabel3.setText("Catogory Code");

        txtCatID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCatIDFocusLost(evt);
            }
        });
        txtCatID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCatIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCatIDKeyTyped(evt);
            }
        });

        jLabel4.setText("Catogory Name");

        jLabel6.setText("Brand Name");

        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });
        txtBrandName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBrandNameKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtCatID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtCatoName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brnDeleteBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtCatID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(txtCatoName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnAddCat)
                        .addGap(6, 6, 6)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnAddBrands)
                        .addGap(12, 12, 12)
                        .addComponent(brnDeleteBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        Session openSession = PoolManager.getSessionFactory().openSession();
        String code = tblCato.getValueAt(tblCato.getSelectedRow(), 0).toString().split(" - ")[0].toString();
        try {

            Transaction beginTransaction = openSession.beginTransaction();
            Criteria cc = openSession.createCriteria(Catogory.class);
            cc.add(Restrictions.eq("catogoryCode", code));
            Catogory uniqueResult = (Catogory) cc.uniqueResult();
            uniqueResult.setIsActive("DeActive");

            openSession.update(uniqueResult);
            beginTransaction.commit();
            NotificationPopup.Delete();
            openSession.close();
            LoadCato();
        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAddCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCatActionPerformed

        String catID = txtCatID.getText().toUpperCase();
        String CatoName = txtCatoName.getText().toUpperCase();

        if (catID != null && CatoName != null) {

            Session openSession = PoolManager.getSessionFactory().openSession();
            try {
                Transaction beginTransaction = openSession.beginTransaction();

                Catogory catogory = new Catogory();
                catogory.setCatogoryCode(catID);
                catogory.setCatogoryName(CatoName);
                catogory.setIsActive("Active");

                openSession.save(catogory);
                beginTransaction.commit();
                openSession.close();

                txtCatID.setText(null);
                txtCatoName.setText(null);
                
                LoadCato();
                NotificationPopup.save();
                openSession.close();

                txtCatID.setText(null);
                txtCatoName.setText(null);

                txtCatID.grabFocus();

            } catch (Exception e) {

            }

        }

    }//GEN-LAST:event_btnAddCatActionPerformed

    private void btnAddBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBrandsActionPerformed

        try {

            if (!txtBrandName.getText().isEmpty()) {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();

                Brands brands = new Brands();

                brands.setBrandName(txtBrandName.getText().toUpperCase());
                brands.setIsActive("Active");

                openSession.save(brands);
                beginTransaction.commit();
                NotificationPopup.save();
                openSession.close();
                loadBrands();
                txtBrandName.setText(null);
                txtBrandName.grabFocus();
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_btnAddBrandsActionPerformed

    private void brnDeleteBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnDeleteBrandsActionPerformed

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();

            Criteria cc = openSession.createCriteria(Brands.class);
            cc.add(Restrictions.eq("brandName", tblBrands.getValueAt(tblBrands.getSelectedRow(), 0)));
            Brands Brans = (Brands) cc.uniqueResult();

            Brans.setIsActive("DeActive");

            openSession.update(Brans);

            beginTransaction.commit();

            NotificationPopup.Delete();

            loadBrands();

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();
        }


    }//GEN-LAST:event_brnDeleteBrandsActionPerformed

    private void txtCatIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCatIDKeyTyped

        if (txtCatID.getText().length() == 4) {

            evt.consume();

        }

    }//GEN-LAST:event_txtCatIDKeyTyped

    private void txtCatIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCatIDKeyReleased

        try {

            String code = txtCatID.getText().toUpperCase();
            
            Session s = PoolManager.getSessionFactory().openSession();
            Criteria cc = s.createCriteria(Catogory.class);
            cc.add(Restrictions.eq("isActive", "Active"));
            cc.add(Restrictions.eq("catogoryCode", code));
            Catogory uniqueResult = (Catogory) cc.uniqueResult();
            
            if (uniqueResult!=null) {
             
                JOptionPane.showMessageDialog(null, "Catogory Code already used");
                txtCatID.setText(null);
                txtCatID.grabFocus();
            }
            
            s.close();
            
        } catch (Exception e) {

            e.printStackTrace();

        }


    }//GEN-LAST:event_txtCatIDKeyReleased

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtBrandNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandNameKeyReleased
        
        try {
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Brands.class);
            createCriteria.add(Restrictions.eq("brandName", txtBrandName.getText().toUpperCase()));
            Brands b = (Brands) createCriteria.uniqueResult();
            
            if (b!=null) {
                
                JOptionPane.showMessageDialog(null, "Brand name already used");
                txtBrandName.setText(null);
                txtBrandName.grabFocus();
                
                
            }
            openSession.close();
        } catch (Exception e) {
       
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_txtBrandNameKeyReleased

    private void txtCatIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCatIDFocusLost
        
        txtCatoName.grabFocus();
        
        
    }//GEN-LAST:event_txtCatIDFocusLost

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCatoBrands().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnDeleteBrands;
    private javax.swing.JButton btnAddBrands;
    private javax.swing.JButton btnAddCat;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblBrands;
    private javax.swing.JTable tblCato;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCatID;
    private javax.swing.JTextField txtCatoName;
    // End of variables declaration//GEN-END:variables

    private void LoadCato() {

            System.out.println("Open Method");
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(Catogory.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));

            List<Catogory> list = createCriteria.list();
            System.out.println(list.size());
            DefaultTableModel dtm = (DefaultTableModel) tblCato.getModel();
            dtm.setRowCount(0);
            for (Catogory catogory : list) {

            System.out.println("TEST LAOD00");
                dtm.addRow(new Object[]{catogory.getCatogoryCode() + " - " + catogory.getCatogoryName()});

            }
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadBrands() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cc = openSession.createCriteria(Brands.class);

            cc.add(Restrictions.eq("isActive", "Active"));

            List<Brands> list = cc.list();
            DefaultTableModel dtm = (DefaultTableModel) tblBrands.getModel();
            dtm.setRowCount(0);
            for (Brands brands : list) {

                dtm.addRow(new Object[]{brands.getBrandName()});

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
