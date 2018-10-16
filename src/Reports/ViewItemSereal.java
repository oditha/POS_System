
package Reports;

import ORM.Item;
import ORM.ItemSereal;
import static Reports.ViewItemUdaya.i;
import srcs.*;
import com.alee.laf.WebLookAndFeel;
import exClass.PoolManager;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class ViewItemSereal extends javax.swing.JFrame {


    public ViewItemSereal() {
        initComponents();
        loadPrice();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePrice = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Item Serial | JRTraders");
        setPreferredSize(new java.awt.Dimension(830, 480));

        tablePrice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Serial No", "Status", "Supplier"
            }
        ));
        jScrollPane1.setViewportView(tablePrice);
        if (tablePrice.getColumnModel().getColumnCount() > 0) {
            tablePrice.getColumnModel().getColumn(1).setMinWidth(400);
            tablePrice.getColumnModel().getColumn(1).setPreferredWidth(400);
            tablePrice.getColumnModel().getColumn(1).setMaxWidth(400);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
        WebLookAndFeel.install();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewItemSereal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablePrice;
    // End of variables declaration//GEN-END:variables

    private void loadPrice() {
        try {
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();
            Criteria createCriteria = openSession.createCriteria(ItemSereal.class);
            createCriteria.createAlias("item", "it");
            createCriteria.add(Restrictions.eq("it.idItem", i));
            List<ItemSereal> list = createCriteria.list();
            
            DefaultTableModel dtm = (DefaultTableModel) tablePrice.getModel();
            dtm.setRowCount(0);
            for (ItemSereal is : list) {
                dtm.addRow(new Object[]{is.getItem().getItemCode(),is.getItem().getIitemName(),is.getSerealNo(),is.getSupplier().getSupplierName()});
                
            }
            
            openSession.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
