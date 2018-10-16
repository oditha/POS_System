package Reports;

import ORM.Item;
import ORM.ItemPrices;
import static Reports.ViewItemUdaya.i;
import srcs.*;
import com.alee.laf.WebLookAndFeel;
import exClass.Decimal_Formats;
import exClass.PoolManager;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ViewItemPrice extends javax.swing.JFrame {

    public static int a;
    public static String ss;
    public static int getID;

    public ViewItemPrice() {
        initComponents();
        loadPrice();
        tableDecor();

        tablePrice.setComponentPopupMenu(jPopupMenu1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePrice = new javax.swing.JTable();

        jMenuItem1.setText("Edit Price");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Add New");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Delete");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Item Price | JRTraders");

        jPanel1.setToolTipText("");

        tablePrice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PriceID", "ItemId", "Item Code", "Item Name", "Unit", "Cost", "Net Price", "Min Price", "Supplier Warrenty", "Seller Warrenty"
            }
        ));
        tablePrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablePriceMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablePrice);
        if (tablePrice.getColumnModel().getColumnCount() > 0) {
            tablePrice.getColumnModel().getColumn(0).setMinWidth(0);
            tablePrice.getColumnModel().getColumn(0).setPreferredWidth(0);
            tablePrice.getColumnModel().getColumn(0).setMaxWidth(0);
            tablePrice.getColumnModel().getColumn(1).setMinWidth(0);
            tablePrice.getColumnModel().getColumn(1).setPreferredWidth(0);
            tablePrice.getColumnModel().getColumn(1).setMaxWidth(0);
            tablePrice.getColumnModel().getColumn(3).setMinWidth(400);
            tablePrice.getColumnModel().getColumn(3).setPreferredWidth(400);
            tablePrice.getColumnModel().getColumn(3).setMaxWidth(400);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(50, 50, 50))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      
        int x = tablePrice.getSelectedRow();
        String ss = (tablePrice.getModel().getValueAt(x, 0).toString());

        a = Integer.parseInt(ss);

        EditPrice editPrice = new EditPrice();
        editPrice.IDItem = Integer.parseInt(ss);

        editPrice.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tablePriceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePriceMouseReleased
        if (evt.getButton() == 3) {
            jPopupMenu1.show();
        }
    }//GEN-LAST:event_tablePriceMouseReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        int x = tablePrice.getSelectedRow();
        ss = (tablePrice.getModel().getValueAt(x, 2).toString());
        String sss = (tablePrice.getModel().getValueAt(x, 1).toString());

        getID = Integer.parseInt(sss);

        //a = Integer.parseInt(ss);
        AddPrice addprice = new AddPrice();
        addprice.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {

            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want delete price variation", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (showConfirmDialog == 0) {

                int x = tablePrice.getSelectedRow();
                String s = (tablePrice.getModel().getValueAt(x, 0).toString());

                int y = Integer.parseInt(s);

                Session openSession = PoolManager.getSessionFactory().openSession();
                Transaction beginTransaction = openSession.beginTransaction();
                Criteria createCriteria = openSession.createCriteria(ItemPrices.class);
                createCriteria.add(Restrictions.eq("idItemPrices", y));
                ItemPrices ip = (ItemPrices) createCriteria.uniqueResult();

                openSession.delete(ip);
                beginTransaction.commit();

                DefaultTableModel dtm = (DefaultTableModel) tablePrice.getModel();
                dtm.removeRow(x);

            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewItemPrice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablePrice;
    // End of variables declaration//GEN-END:variables

    public static void loadPrice() {
        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();
            Criteria createCriteria = openSession.createCriteria(ItemPrices.class);
            createCriteria.createAlias("item", "it");
            createCriteria.add(Restrictions.eq("it.idItem", i));

            List<ItemPrices> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tablePrice.getModel();
            dtm.setRowCount(0);
            for (ItemPrices ip : list) {
                dtm.addRow(new Object[]{ip.getItem().getIdItem(), ip.getItem().getIdItem(), ip.getItem().getItemCode(), ip.getItem().getIitemName(),ip.getItem().getUnit(), Decimal_Formats.Price(ip.getGrossPrice()), Decimal_Formats.Price(ip.getNettPrice()), Decimal_Formats.Price(ip.getMinPrice()), ip.getSupWarrenty(), ip.getSelelrWarrenty()});

            }

            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tableDecor() {

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        tablePrice.getColumnModel().getColumn(4).setCellRenderer(dtcr);
        tablePrice.getColumnModel().getColumn(5).setCellRenderer(dtcr);
        tablePrice.getColumnModel().getColumn(6).setCellRenderer(dtcr);

    }
}
