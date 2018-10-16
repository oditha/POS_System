package ReportsODK;

import ORM.Customers;
import ORM.Invoice;
import ORM.InvoiceHasCustomers;
import ORM.InvoiceItem;
import ORM.ItemSereal;
import ORM.ItemSerealHasInvoiceItem;
import ORM.Stock;
import ORM.SupplierInvoiceItemHasItemSereal;
import static ReportsODK.ViewSerialData.serial;
import com.alee.laf.WebLookAndFeel;
import exClass.DB;
import exClass.Decimal_Formats;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.awt.print.PrinterException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import srcs.Login;

public class ViewInvoice4Serial extends javax.swing.JFrame {

    Map<String, Integer> sup = new HashMap();
    public static Map<String, Integer> INV = new HashMap();
    public static Map<String, String> GRNPIC = new HashMap();
    public static String InvoiceNO;

    public ViewInvoice4Serial() {
        initComponents();
        loadTBL();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jMenuItem1.setText("View Item");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem3.setText("Delete Selected");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem2.setText("Reprint Invoice");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem4.setText("Export Invoice");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        jMenuItem5.setText("Print All");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Invoice | JRTraders");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Invoice Date", "Invoice Total", "Discount", "Nett Total", "ID"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(5).setMinWidth(0);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        InvoiceNO = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        new ViewInvoiceItem().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        int showConfirmDialog = JOptionPane.showConfirmDialog(this, "This will delete all data related to this Invoice");

        if (showConfirmDialog == 0) {

            try {

                Integer get = INV.get(jTable1.getValueAt(jTable1.getSelectedRow(), 0));

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Invoice.class);
                createCriteria.add(Restrictions.eq("idInvoice", get));
                Invoice uniqueResult = (Invoice) createCriteria.uniqueResult();

                uniqueResult.setIsActive("DeActive");
                openSession.update(uniqueResult);

                Iterator iterator = uniqueResult.getInvoiceItems().iterator();
                while (iterator.hasNext()) {

                    InvoiceItem next = (InvoiceItem) iterator.next();
                    Integer idItem = next.getItem().getIdItem();
                    Criteria cc = openSession.createCriteria(Stock.class);
                    cc.createAlias("item", "i");
                    cc.add(Restrictions.eq("i.idItem", idItem));
                    Stock st = (Stock) cc.uniqueResult();
                    st.setQty(st.getQty() + next.getQty());
                    openSession.update(st);

                    Iterator it = next.getItemSerealHasInvoiceItems().iterator();
                    while (it.hasNext()) {
                        ItemSerealHasInvoiceItem next1 = (ItemSerealHasInvoiceItem) it.next();
                        Integer idItemSereal = next1.getItemSereal().getIdItemSereal();

                        Criteria ccc = openSession.createCriteria(ItemSereal.class);
                        ccc.add(Restrictions.eq("idItemSereal", idItemSereal));
                        ItemSereal s = (ItemSereal) ccc.uniqueResult();
                        s.setStatus("Unsold");

                        openSession.update(s);

                    }

                }

                openSession.beginTransaction().commit();
                openSession.close();
                NotificationPopup.Delete();
                loadAll();
            } catch (Exception e) {

                e.printStackTrace();

            }

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        boolean FLAG = false;

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cc = openSession.createCriteria(Invoice.class);
            cc.add(Restrictions.eq("invoiceNo", jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
            Invoice uniqueResult = (Invoice) cc.uniqueResult();
            if (uniqueResult != null) {

                Set invoiceItems = uniqueResult.getInvoiceItems();
                Iterator iterator = invoiceItems.iterator();
                while (iterator.hasNext()) {
                    InvoiceItem next = (InvoiceItem) iterator.next();
                    Iterator iterator1 = next.getItemSerealHasInvoiceItems().iterator();
                    while (iterator1.hasNext()) {
                        ItemSerealHasInvoiceItem next1 = (ItemSerealHasInvoiceItem) iterator1.next();

                        FLAG = true;

                    }
                }

            }

            System.out.println(FLAG);

        } catch (Exception e) {
        }

        if (FLAG) {

            try {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("InvoiceNO", jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                System.out.println(map);
                JasperPrint jp = JasperFillManager.fillReport(Login.jrCusInvoiceWithSerial, map, DB.getCon());
//                JasperViewer.viewReport(jp);
                JasperPrintManager.printReport(jp, true);
            } catch (Exception ex) {
                Logger.getLogger(ViewInvoice4Serial.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("InvoiceNO", jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                System.out.println(map);
                JasperPrint jp = JasperFillManager.fillReport(Login.jrCusInvoice, map, DB.getCon());
//                JasperViewer.viewReport(jp);
                JasperPrintManager.printReport(jp, true);
            } catch (Exception ex) {
                Logger.getLogger(ViewInvoice4Serial.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

        if (evt.getButton() == 3) {

            jPopupMenu1.show();

        }

    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        try {
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ViewInvoice4Serial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        boolean FLAG = false;

        try {

            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria cc = openSession.createCriteria(Invoice.class);
            cc.add(Restrictions.eq("invoiceNo", jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
            Invoice uniqueResult = (Invoice) cc.uniqueResult();
            if (uniqueResult != null) {

                Set invoiceItems = uniqueResult.getInvoiceItems();
                Iterator iterator = invoiceItems.iterator();
                while (iterator.hasNext()) {
                    InvoiceItem next = (InvoiceItem) iterator.next();
                    Iterator iterator1 = next.getItemSerealHasInvoiceItems().iterator();
                    while (iterator1.hasNext()) {
                        ItemSerealHasInvoiceItem next1 = (ItemSerealHasInvoiceItem) iterator1.next();

                        FLAG = true;

                    }
                }

            }

            System.out.println(FLAG);

        } catch (Exception e) {
        }

        if (FLAG) {

            String valueAt = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            try {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("InvoiceNO", jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                JasperPrint jasperPrint = JasperFillManager.fillReport(Login.jrCusInvoiceWithSerial, map, DB.getCon());

                JRXlsxExporter exporter = new JRXlsxExporter();
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
                File outputFile = new File("C:/InvoiceExport/" + valueAt + ".xlsx");
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputFile));
                SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration();
                configuration.setDetectCellType(true);//Set configuration as you like it!!
                configuration.setCollapseRowSpan(false);
                exporter.setConfiguration(configuration);
                exporter.exportReport();

                JOptionPane.showMessageDialog(null, "Invoice Export Sucess");

            } catch (Exception e) {

                e.printStackTrace();
            }

        } else {
            String valueAt = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            try {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("InvoiceNO", jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                JasperPrint jasperPrint = JasperFillManager.fillReport(Login.jrCusInvoice, map, DB.getCon());

                JRXlsxExporter exporter = new JRXlsxExporter();
                exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
                File outputFile = new File("C:/InvoiceExport/" + valueAt + ".xlsx");
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputFile));
                SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration();
                configuration.setDetectCellType(true);//Set configuration as you like it!!
                configuration.setCollapseRowSpan(false);
                exporter.setConfiguration(configuration);
                exporter.exportReport();

                JOptionPane.showMessageDialog(null, "Invoice Export Sucess");

            } catch (Exception e) {

                e.printStackTrace();
            }

        }


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInvoice4Serial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void loadSup() {

    }

    private void tableAlign() {

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

    }

    private void loadAll() {
        try {
            Session openSession = PoolManager.getSessionFactory().openSession();
            Criteria createCriteria = openSession.createCriteria(Invoice.class);
            createCriteria.add(Restrictions.eq("isActive", "Active"));
            List<Invoice> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            for (Invoice inv : list) {
                String Price = null;

                try {

                    Price = Decimal_Formats.Price(inv.getDiscount());

                } catch (Exception ex) {

                }
                INV.put(inv.getInvoiceNo(), inv.getIdInvoice());
//                        GRNPIC.put(inv.getGrnno(), inv.getPhoto());
                String customerscolName = null;
                Iterator iterator = inv.getInvoiceHasCustomerses().iterator();
                while (iterator.hasNext()) {
                    InvoiceHasCustomers next = (InvoiceHasCustomers) iterator.next();
                    customerscolName = next.getCustomers().getCustomerscolName();
                }
                dtm.addRow(new Object[]{
                    inv.getInvoiceNo(),
                    inv.getInvoiceDate(),
                    Decimal_Formats.Price(inv.getSubTotal()),
                    Price,
                    Decimal_Formats.Price(inv.getNettTotal()),
                    customerscolName,
                    inv.getIdInvoice()

                });

            }

            openSession.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    private void loadTBL() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        int id;

        Session sess = PoolManager.getSessionFactory().openSession();
        Criteria cr = sess.createCriteria(ItemSereal.class);
        cr.add(Restrictions.eq("serealNo", serial));

        ItemSereal uniqueResult = (ItemSereal) cr.uniqueResult();
        String invoiceNo;
        String invoiceDate;
        String Invoicesubtotal;
        String invoiceDiscount;
        String invoiceNettotal;

        if (uniqueResult != null) {

            id = uniqueResult.getIdItemSereal();
            
           

            Iterator it = uniqueResult.getItemSerealHasInvoiceItems().iterator();
            Iterator it2=uniqueResult.getSupplierInvoiceItemHasItemSereals().iterator();

            while (it.hasNext()) {

                ItemSerealHasInvoiceItem next = (ItemSerealHasInvoiceItem) it.next();

                if (next.getItemSereal().getIdItemSereal() == id) {

                    // System.out.println(next.getInvoiceItem().getInvoice().getInvoiceNo());
//                    sout  
//                   // System.out.println(next.getInvoiceItem().getInvoice().getInvoiceNo());
                    Vector v = new Vector();
                    v.add(next.getInvoiceItem().getInvoice().getInvoiceNo());
                    v.add(next.getInvoiceItem().getInvoice().getInvoiceDate());
                    v.add(next.getInvoiceItem().getInvoice().getSubTotal());
                    v.add(next.getInvoiceItem().getInvoice().getDiscount());
                    v.add(next.getInvoiceItem().getInvoice().getNettTotal());
                    dtm.addRow(v);

                }

            }
            
            
            while (it2.hasNext()) {
                SupplierInvoiceItemHasItemSereal next = (SupplierInvoiceItemHasItemSereal) it2.next();
                
                
                if (next.getItemSereal().getIdItemSereal()==id) {
                    
                      Vector v = new Vector();
                    v.add(next.getSupplierInvoiceItem().getSupplierInvoice().getInvoiceNo());
                    v.add(next.getSupplierInvoiceItem().getSupplierInvoice().getInvoiceDate());
                    v.add(next.getSupplierInvoiceItem().getSupplierInvoice().getSubTotal());
                    v.add(next.getSupplierInvoiceItem().getSupplierInvoice().getDiscount());
                    v.add(next.getSupplierInvoiceItem().getSupplierInvoice().getNettTotal());
                    dtm.addRow(v);
                    
                    
                }
                
                
            }

        }else{
       

       
        
        
        
        }

    }

}
