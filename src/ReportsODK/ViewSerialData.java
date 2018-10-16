package ReportsODK;

import ORM.Grn;
import ORM.Grnitem;
import ORM.InvoiceItem;
import ORM.ItemSereal;
import ORM.ItemSerealHasInvoiceItem;
import com.alee.laf.WebLookAndFeel;
import exClass.Decimal_Formats;
import exClass.PoolManager;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import srcs.Dashboard;
import static srcs.Dashboard.Serial;

public class ViewSerialData extends javax.swing.JFrame {

    public ViewSerialData() {
        initComponents();
        loadData();
        jTable1.setComponentPopupMenu(jPopupMenu1);

    }
    public static String grnno;
    public static String serial;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jMenuItem1.setText("View GRN");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("View Invoice");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Serial Records | JRTraders");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Item Code", "Item Name", "Brand", "Catogory", "Supplier", "GRN Date", "GRN No", "Cost", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        if (evt.getButton()==3) {
           jPopupMenu1.show();
            
            
        }
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        
        int r=jTable1.getSelectedRow();
        
        grnno=(String) jTable1.getValueAt(r, 7);
       // DefaultTableModel dtm=(DefaultTableModel) new ViewGRN().jTable1.getModel();
       // dtm.setRowCount(0);
        ViewGRNwithserialNo viewGRNwithserialNo = new ViewGRNwithserialNo();
        viewGRNwithserialNo.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        int r=jTable1.getSelectedRow();
        
       
        
        
        String status=(String) jTable1.getValueAt(r, 9);
        
        
        if (!status.equals("SOLD")) {
            JOptionPane.showMessageDialog(rootPane, "Item Still Available");
        }else{
         serial=(String) jTable1.getValueAt(r, 0);
        new ViewInvoice4Serial().setVisible(true);
        
        
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSerialData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void loadData() {

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cc = openSession.createCriteria(ItemSereal.class);
            cc.add(Restrictions.eq("idItemSereal", Dashboard.Serial));
            ItemSereal ur = (ItemSereal) cc.uniqueResult();
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            Double Price = 0.00;

            Iterator iterator = ur.getGrn().getGrnitems().iterator();
            while (iterator.hasNext()) {
                Grnitem next = (Grnitem) iterator.next();
                Price = next.getGrossPrice();
            }
            if (ur != null) {

                dtm.addRow(new Object[]{
                    ur.getSerealNo(),
                    ur.getItem().getItemCode(),
                    ur.getItem().getIitemName(),
                    ur.getItem().getBrands().getBrandName(),
                    ur.getItem().getCatogory().getCatogoryName(),
                    ur.getGrn().getSupplier().getSupplierName(),
                    ur.getGrn().getGrndate(),
                    ur.getGrn().getGrnno(),
                    Decimal_Formats.Price(Price),
                    ur.getStatus()

                });

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
