package Reports;

import ORM.Item;
import ORM.Stock;
import static Reports.ViewItemPrice.tablePrice;
import srcs.*;
import com.alee.laf.WebLookAndFeel;
import com.lowagie.text.pdf.PdfName;
import exClass.PoolManager;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ViewStock extends javax.swing.JFrame {
    
    static boolean maximized = true;
    private static final int QTY_COL = 3;
    
    public ViewStock() {
        initComponents();
        maximizeWindow();
        loadStock();
        //setColor();

//        tableStock.setAutoCreateRowSorter(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Stock | JRTraders");
        setMinimumSize(new java.awt.Dimension(830, 480));

        tableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Code", "Item Name", "QTY", "Unit", "Catagory", "Brand"
            }
        ));
        jScrollPane1.setViewportView(tableStock);
        if (tableStock.getColumnModel().getColumnCount() > 0) {
            tableStock.getColumnModel().getColumn(0).setMaxWidth(0);
            tableStock.getColumnModel().getColumn(2).setMinWidth(500);
            tableStock.getColumnModel().getColumn(2).setPreferredWidth(500);
            tableStock.getColumnModel().getColumn(2).setMaxWidth(500);
            tableStock.getColumnModel().getColumn(3).setMinWidth(100);
            tableStock.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableStock.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel1.setText("Search Here");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(txtSearch)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        Integer i;
        
        try {
            DecimalFormat decimalFormat = new DecimalFormat("00");
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Item.class);
            createCriteria.add(Restrictions.like("iitemName", "%" + txtSearch.getText() + "%"));
            List<Item> list = createCriteria.list();
            
            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
            dtm.setRowCount(0);
            
            for (Item item : list) {
                Vector v = new Vector();
                i = item.getIdItem();
                //dtm.addRow(new Object[]{item.getIdItem(),item.getItemCode(),item.getIitemName()});
                v.add(item.getIdItem());
                v.add(item.getItemCode());
                v.add(item.getIitemName());
                
                Criteria createCriteria1 = openSession.createCriteria(Stock.class);
                createCriteria1.createAlias("item", "i");
                createCriteria1.add(Restrictions.like("i.idItem", i));
                List<Stock> list1 = createCriteria1.list();
                
                for (Stock stock : list1) {
                    //dtm.addRow(new Object[]{stock.getQty()});
                    v.add(decimalFormat.format(stock.getQty()));
                    v.add(stock.getItem().getUnit());
                    
                }
                v.add(item.getCatogory().getCatogoryName());
                v.add(item.getBrands().getBrandName());
                
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            tableStock.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ViewStock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void main(String args[]) {
        
        WebLookAndFeel.install();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableStock;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void loadStock() {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        try {
            
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Stock.class);
            createCriteria.createAlias("item", "a");
            List<Stock> list = createCriteria.list();
            
            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
            dtm.setRowCount(0);
            
            for (Stock stock : list) {
                
                if (stock.getItem().getIsActive().equals("Active")) {
                    dtm.addRow(new Object[]{stock.getItem().getIdItem(), stock.getItem().getItemCode(), stock.getItem().getIitemName(), decimalFormat.format(stock.getQty()), stock.getItem().getUnit(), stock.getItem().getCatogory().getCatogoryName(), stock.getItem().getBrands().getBrandName()});
           
                }
                
                 }
            tableASC();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void maximizeWindow() {
        
        if (maximized) {
            
            ViewStock.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ViewStock.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {
            
            setExtendedState(JFrame.NORMAL);
            maximized = false;
            
        }
        
    }
    
    private void tableASC() {
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableStock.getModel());
        tableStock.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
        
        int columnIndexToSort = 4;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
        
        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }
    
    private void setColor() {
        try {

//            tableStock.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//                @Override
//                public DefaultTableCellRenderer getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
//                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
//
//                    String qty = (String) table.getModel().getValueAt(row, QTY_COL);
//                    int x = Integer.parseInt(qty);
//                    if (x <= 5 ) {
//                        setBackground(Color.yellow);
//                    } else {
//                        setBackground(Color.WHITE);
//
//                    }
//                    return this;
//
//                }
//
//            });
//            DefaultTableModel dtm = (DefaultTableModel) tableStock.getModel();
//
//            for (int i = 0; i < dtm.getRowCount(); i++) {
//                String qty = tableStock.getValueAt(i, 3).toString();
//                //System.out.println(qty);
//                int q = Integer.parseInt(qty);
//
//                if (q <= 5) {
//                    setBackground(Color.YELLOW);
//                } else {
//                    setBackground(Color.WHITE);
//                }
//
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
