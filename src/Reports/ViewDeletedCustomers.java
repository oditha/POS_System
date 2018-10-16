package Reports;

import ORM.Customers;
import com.alee.laf.WebLookAndFeel;
import exClass.NotificationPopup;
import exClass.PoolManager;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

public class ViewDeletedCustomers extends javax.swing.JFrame {

    public static String s;
    public static String s1;
    public static String s2;
    public static String s3;

    public static String s0;

    public ViewDeletedCustomers() {
        initComponents();
        loadCustom();
        tableCustomer.setComponentPopupMenu(jPopupMenu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();

        jMenuItem3.setText("Activate");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Customers | JRTraders");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search By ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 0, 12))); // NOI18N

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setText("Type NIC or Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtSearch))
                .addContainerGap())
        );

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "NIC", "Name", "Address", "Contact No"
            }
        ));
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableCustomerMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);
        if (tableCustomer.getColumnModel().getColumnCount() > 0) {
            tableCustomer.getColumnModel().getColumn(0).setMinWidth(0);
            tableCustomer.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableCustomer.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {

            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {

                Session openSession = PoolManager.getSessionFactory().openSession();
                Criteria createCriteria = openSession.createCriteria(Customers.class);
                //createCriteria.add(Restrictions.like("customersNic", txtSearch.getText() + "%"));

                Criterion nic = Restrictions.like("customersNic", "%" + txtSearch.getText() + "%");
                Criterion active = Restrictions.like("isActive", "Deactive");
                LogicalExpression andExp = Restrictions.and(nic, active);
                createCriteria.add(andExp);

                List<Customers> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
                dtm.setRowCount(0);
                for (Customers customers : list) {

                    dtm.addRow(new Object[]{customers.getIdCustomers(), customers.getCustomersNic(), customers.getCustomerscolName(), customers.getCustomersAddress1() + "," + customers.getCustomersAddress2() + "," + customers.getCustomersCity(), customers.getCustomersContactNo()});

                }

            } else {

                Session openSession = PoolManager.getSessionFactory().openSession();

                Criteria createCriteria = openSession.createCriteria(Customers.class);
                //createCriteria.add(Restrictions.like("customerscolName", txtSearch.getText() + "%"));

                Criterion cusname = Restrictions.like("customerscolName", "%" + txtSearch.getText() + "%");
                Criterion active = Restrictions.like(""
                        + "", "Deactive");
                LogicalExpression andExp = Restrictions.and(cusname, active);
                createCriteria.add(andExp);

                List<Customers> list = createCriteria.list();

                DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
                dtm.setRowCount(0);
                for (Customers customers : list) {

                    dtm.addRow(new Object[]{customers.getIdCustomers(), customers.getCustomersNic(), customers.getCustomerscolName(), customers.getCustomersAddress1() + "," + customers.getCustomersAddress2() + "," + customers.getCustomersCity(), customers.getCustomersContactNo()});

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked

    }//GEN-LAST:event_tableCustomerMouseClicked

    private void tableCustomerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseReleased

        if (evt.getButton() == 3) {
            jPopupMenu.show();
        }

    }//GEN-LAST:event_tableCustomerMouseReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        int showConfirmDialog = JOptionPane.showConfirmDialog(rootPane, " Are you sure want to Activate this customer?");

        System.out.println(showConfirmDialog);

        if (showConfirmDialog == 0) {

            try {
                int x = tableCustomer.getSelectedRow();
                String supCode = (tableCustomer.getModel().getValueAt(x, 0).toString());

                Session openSession = PoolManager.getSessionFactory().openSession();

                Transaction beginTransaction = openSession.beginTransaction();

                Criteria createCriteria = openSession.createCriteria(Customers.class);

                createCriteria.add(Restrictions.eq("idCustomers", Integer.parseInt(supCode)));

                Customers supplier = (Customers) createCriteria.uniqueResult();

                supplier.setIsActive("Active");

                openSession.update(supplier);
                beginTransaction.commit();
                openSession.close();
                NotificationPopup.save();

                loadCustom();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDeletedCustomers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public static void loadCustom() {

        try {
            Session openSession = PoolManager.getSessionFactory().openSession();

            Criteria createCriteria = openSession.createCriteria(Customers.class);

            createCriteria.add(Restrictions.like("isActive", "Deactive"));

            List<Customers> list = createCriteria.list();

            DefaultTableModel dtm = (DefaultTableModel) tableCustomer.getModel();
            dtm.setRowCount(0);
            for (Customers customers : list) {

                dtm.addRow(new Object[]{customers.getIdCustomers(), customers.getCustomersNic(), customers.getCustomerscolName(), customers.getCustomersAddress1() + "," + customers.getCustomersAddress2() + "," + customers.getCustomersCity(), customers.getCustomersContactNo()});

            }
            openSession.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
