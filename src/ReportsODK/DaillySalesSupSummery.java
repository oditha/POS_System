package ReportsODK;

import ORM.ItemPrices;
import ORM.SupplierInvoice;
import ORM.SupplierInvoiceItem;
import static ReportsODK.DaillySalesSummery.TxtStartDate;
import static ReportsODK.DaillySalesSummery.comboType;
import static ReportsODK.DaillySalesSummery.txtEndDate;
import com.alee.laf.WebLookAndFeel;
import exClass.Decimal_Formats;
import exClass.PoolManager;
import java.awt.print.PrinterException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DaillySalesSupSummery extends javax.swing.JFrame {

    public DaillySalesSupSummery() {
        initComponents();
        loadData();
        tableAlign();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtProfit = new javax.swing.JTextField();
        txtInvoice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTotalProfit = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier Sales Summery | JRTraders");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Brand", "Sold QTY", "GrossTotal", "Net Total", "Profit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jLabel13.setText("Profit");

        txtProfit.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtProfit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtInvoice.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtInvoice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel14.setText("Invoice Total");

        jLabel15.setText("Total Item Cost");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Profit"));

        txtTotalProfit.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtTotalProfit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotalProfit, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTotalProfit)
                .addContainerGap())
        );

        txtCost.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtCost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(65, 65, 65))
                            .addComponent(txtCost))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(79, 79, 79))
                            .addComponent(txtInvoice))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(120, 120, 120))
                            .addComponent(txtProfit))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCost)
                            .addComponent(jButton1))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(txtInvoice)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(txtProfit)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(DaillySalesSupSummery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaillySalesSupSummery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtInvoice;
    private javax.swing.JTextField txtProfit;
    private javax.swing.JTextField txtTotalProfit;
    // End of variables declaration//GEN-END:variables

    private void loadData() {

        if (comboType.getSelectedIndex() == 0) {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(SupplierInvoice.class);
            createCriteria.add(Restrictions.eq("invoiceDate", TxtStartDate.getText()));
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            List<SupplierInvoice> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (SupplierInvoice invoice : list) {

                Iterator iterator = invoice.getSupplierInvoiceItems().iterator();
                while (iterator.hasNext()) {

                    SupplierInvoiceItem ii = (SupplierInvoiceItem) iterator.next();

                    String itemCode = ii.getItem().getItemCode();
                    String iitemName = ii.getItem().getIitemName();
                    String brandName = ii.getItem().getBrands().getBrandName();
                    Integer qty = ii.getQty();
                    Double nettTotal = ii.getNettTotalItm();
                    Iterator it = ii.getItem().getItemPriceses().iterator();
                    double grossprice = 0.00;
                    while (it.hasNext()) {

                        ItemPrices next = (ItemPrices) it.next();
                        grossprice = next.getGrossPrice();

                    }

                    grossprice = grossprice * qty;

                    double profit = nettTotal - grossprice;

                    dtm.addRow(new Object[]{
                        itemCode,
                        iitemName,
                        brandName,
                        qty,
                        Decimal_Formats.Price(grossprice),
                        Decimal_Formats.Price(nettTotal),
                        Decimal_Formats.Price(profit)

                    });

                }

            }

            double grosstot = 0;
            double nettot = 0;
            double progit = 0;

            for (int i = 0; i < jTable1.getRowCount(); i++) {

                grosstot += Double.parseDouble(jTable1.getValueAt(i, 4).toString());
                nettot += Double.parseDouble(jTable1.getValueAt(i, 5).toString());
                progit += Double.parseDouble(jTable1.getValueAt(i, 6).toString());

            }

            txtProfit.setText(Decimal_Formats.Price(progit) + "");
            txtInvoice.setText(Decimal_Formats.Price(nettot) + "");
            txtCost.setText(Decimal_Formats.Price(grosstot) + "");
            txtTotalProfit.setText(Decimal_Formats.Price(progit + Double.parseDouble(DaillySalesSummery.txtProfit.getText())));

        } else {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(SupplierInvoice.class);
            createCriteria.add(Restrictions.between("invoiceDate", TxtStartDate.getText(), txtEndDate.getText()));
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            List<SupplierInvoice> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (SupplierInvoice invoice : list) {

                Iterator iterator = invoice.getSupplierInvoiceItems().iterator();
                while (iterator.hasNext()) {

                    SupplierInvoiceItem ii = (SupplierInvoiceItem) iterator.next();

                    String itemCode = ii.getItem().getItemCode();
                    String iitemName = ii.getItem().getIitemName();
                    String brandName = ii.getItem().getBrands().getBrandName();
                    Integer qty = ii.getQty();
                    Double nettTotal = ii.getNettTotalItm();
                    Iterator it = ii.getItem().getItemPriceses().iterator();
                    double grossprice = 0.00;
                    while (it.hasNext()) {

                        ItemPrices next = (ItemPrices) it.next();
                        grossprice = next.getGrossPrice();

                    }

                    grossprice = grossprice * qty;

                    double profit = nettTotal - grossprice;

                    dtm.addRow(new Object[]{
                        itemCode,
                        iitemName,
                        brandName,
                        qty,
                        Decimal_Formats.Price(grossprice),
                        Decimal_Formats.Price(nettTotal),
                        Decimal_Formats.Price(profit)

                    });

                }

            }

            double grosstot = 0;
            double nettot = 0;
            double progit = 0;

            for (int i = 0; i < jTable1.getRowCount(); i++) {

                grosstot += Double.parseDouble(jTable1.getValueAt(i, 4).toString());
                nettot += Double.parseDouble(jTable1.getValueAt(i, 5).toString());
                progit += Double.parseDouble(jTable1.getValueAt(i, 6).toString());

            }

            txtProfit.setText(Decimal_Formats.Price(progit) + "");
            txtInvoice.setText(Decimal_Formats.Price(nettot) + "");
            txtCost.setText(Decimal_Formats.Price(grosstot) + "");
            txtTotalProfit.setText(Decimal_Formats.Price(progit + Double.parseDouble(DaillySalesSummery.txtProfit.getText())));

        }

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);

    }

}
