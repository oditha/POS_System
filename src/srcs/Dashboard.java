package srcs;

import Reports.ViewCustomersUdaya;
import Reports.ViewItemUdaya;
import Reports.ViewReturnCustomer;
import Reports.ViewReturnGRN;
import Reports.ViewStock;
import Reports.ViewSuppUdaya;
import ReportsODK.DaillySalesSummery;
import ReportsODK.ViewCashBook;
import ReportsODK.ViewGRN;
import ReportsODK.ViewInvoice;
import ReportsODK.viewLowStock;
import com.alee.laf.WebLookAndFeel;
import java.awt.Window;
import srcs.CustomersAndInvoice.AddCusInvoicePayments;
import srcs.CustomersAndInvoice.AddCustomers;
import srcs.CustomersAndInvoice.AddInvoices;
import srcs.CustomersAndInvoice.AddInvoicesV2;
import srcs.CustomersAndInvoice.CustomerOutstranding;
import srcs.ItemAndStock.AddCatoBrands;
import srcs.ItemAndStock.AddItems;
import srcs.SupplierAndGRN.AddGRN;
import srcs.SupplierAndGRN.AddSupPayments;
import srcs.SupplierAndGRN.AddSupplyer;

public class Dashboard extends javax.swing.JFrame {
    
    public static int Serial;
    static boolean maximized = true;
    public Dashboard() {
        initComponents();
        
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        
//        int xsize = (int) tk.getScreenSize().getWidth();
//        int ysize = (int) tk.getScreenSize().getHeight();
      //  this.setSize(xsize, ysize);
        privilage();
        maximize();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        BillingPNL = new javax.swing.JPanel();
        CustomerInvoiceBTN = new javax.swing.JButton();
        ViewInvoiceBTN = new javax.swing.JButton();
        SalesSummeryBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        paymentsPNL = new javax.swing.JPanel();
        grnPaymentBTN = new javax.swing.JButton();
        CustomerInvoicePaymentsBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        returnPNL = new javax.swing.JPanel();
        AddGRnReturnBTN = new javax.swing.JButton();
        AddCustomerReturnBTN = new javax.swing.JButton();
        ViewGrnReturnBTN = new javax.swing.JButton();
        ViewCustomerReturnBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        GRNPNL = new javax.swing.JPanel();
        AddGrnBTN = new javax.swing.JButton();
        ViewGRnBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        AccountPNL = new javax.swing.JPanel();
        ViewCashBookBTN = new javax.swing.JButton();
        AddUsersBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        OutstandingsGRN1 = new javax.swing.JButton();
        StockPNL = new javax.swing.JPanel();
        AddCatagoryBTN = new javax.swing.JButton();
        viewItemBTN = new javax.swing.JButton();
        viewStockBTN = new javax.swing.JButton();
        StockrefillBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        AddItemBTN = new javax.swing.JButton();
        CustomerPNL = new javax.swing.JPanel();
        AddCustomerBTN = new javax.swing.JButton();
        AddSuplierBTN = new javax.swing.JButton();
        ViewCustomerBTN = new javax.swing.JButton();
        ViewSuplierBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("DashBoard | JRTraders");

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N

        CustomerInvoiceBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        CustomerInvoiceBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/invoice.png"))); // NOI18N
        CustomerInvoiceBTN.setText("Invoice");
        CustomerInvoiceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerInvoiceBTNActionPerformed(evt);
            }
        });

        ViewInvoiceBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        ViewInvoiceBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill.png"))); // NOI18N
        ViewInvoiceBTN.setText("View Invoice");
        ViewInvoiceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewInvoiceBTNActionPerformed(evt);
            }
        });

        SalesSummeryBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        SalesSummeryBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/receipt(1).png"))); // NOI18N
        SalesSummeryBTN.setText("Sales Summery");
        SalesSummeryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesSummeryBTNActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill(1).png"))); // NOI18N

        javax.swing.GroupLayout BillingPNLLayout = new javax.swing.GroupLayout(BillingPNL);
        BillingPNL.setLayout(BillingPNLLayout);
        BillingPNLLayout.setHorizontalGroup(
            BillingPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingPNLLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(BillingPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CustomerInvoiceBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(ViewInvoiceBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(SalesSummeryBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        BillingPNLLayout.setVerticalGroup(
            BillingPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingPNLLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(BillingPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillingPNLLayout.createSequentialGroup()
                        .addComponent(CustomerInvoiceBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewInvoiceBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(SalesSummeryBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGap(192, 192, 192))
                    .addGroup(BillingPNLLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37))))
        );

        jTabbedPane1.addTab("Billing", BillingPNL);

        grnPaymentBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        grnPaymentBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cash.png"))); // NOI18N
        grnPaymentBTN.setText("GRN Payments");
        grnPaymentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnPaymentBTNActionPerformed(evt);
            }
        });

        CustomerInvoicePaymentsBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        CustomerInvoicePaymentsBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cash.png"))); // NOI18N
        CustomerInvoicePaymentsBTN.setText("Customer Invoice Payments");
        CustomerInvoicePaymentsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerInvoicePaymentsBTNActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/payment-method.png"))); // NOI18N

        javax.swing.GroupLayout paymentsPNLLayout = new javax.swing.GroupLayout(paymentsPNL);
        paymentsPNL.setLayout(paymentsPNLLayout);
        paymentsPNLLayout.setHorizontalGroup(
            paymentsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentsPNLLayout.createSequentialGroup()
                .addGroup(paymentsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentsPNLLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(grnPaymentBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                    .addGroup(paymentsPNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CustomerInvoicePaymentsBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(56, 56, 56)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
        );
        paymentsPNLLayout.setVerticalGroup(
            paymentsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentsPNLLayout.createSequentialGroup()
                .addGroup(paymentsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentsPNLLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(grnPaymentBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(CustomerInvoicePaymentsBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(143, 143, 143))
                    .addGroup(paymentsPNLLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Payments", paymentsPNL);

        AddGRnReturnBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        AddGRnReturnBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/package.png"))); // NOI18N
        AddGRnReturnBTN.setText("Add GRN Return");
        AddGRnReturnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGRnReturnBTNActionPerformed(evt);
            }
        });

        AddCustomerReturnBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        AddCustomerReturnBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/package.png"))); // NOI18N
        AddCustomerReturnBTN.setText("Add Invoice Return");
        AddCustomerReturnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerReturnBTNActionPerformed(evt);
            }
        });

        ViewGrnReturnBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        ViewGrnReturnBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/package.png"))); // NOI18N
        ViewGrnReturnBTN.setText("View GRN Return");
        ViewGrnReturnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewGrnReturnBTNActionPerformed(evt);
            }
        });

        ViewCustomerReturnBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        ViewCustomerReturnBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/package.png"))); // NOI18N
        ViewCustomerReturnBTN.setText("View Invoice Return");
        ViewCustomerReturnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCustomerReturnBTNActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return.png"))); // NOI18N

        javax.swing.GroupLayout returnPNLLayout = new javax.swing.GroupLayout(returnPNL);
        returnPNL.setLayout(returnPNLLayout);
        returnPNLLayout.setHorizontalGroup(
            returnPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(returnPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddCustomerReturnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(AddGRnReturnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewCustomerReturnBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewGrnReturnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );
        returnPNLLayout.setVerticalGroup(
            returnPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnPNLLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(AddGRnReturnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddCustomerReturnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ViewGrnReturnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ViewCustomerReturnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(85, 85, 85))
            .addGroup(returnPNLLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Return", returnPNL);

        AddGrnBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        AddGrnBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill(2).png"))); // NOI18N
        AddGrnBTN.setText("Add GRN");
        AddGrnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGrnBTNActionPerformed(evt);
            }
        });

        ViewGRnBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        ViewGRnBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill(2).png"))); // NOI18N
        ViewGRnBTN.setText("View GRN");
        ViewGRnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewGRnBTNActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill(3).png"))); // NOI18N

        javax.swing.GroupLayout GRNPNLLayout = new javax.swing.GroupLayout(GRNPNL);
        GRNPNL.setLayout(GRNPNLLayout);
        GRNPNLLayout.setHorizontalGroup(
            GRNPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GRNPNLLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(GRNPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddGrnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(ViewGRnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );
        GRNPNLLayout.setVerticalGroup(
            GRNPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GRNPNLLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(AddGrnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(ViewGRnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(156, 156, 156))
            .addGroup(GRNPNLLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("GRN", GRNPNL);

        ViewCashBookBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        ViewCashBookBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coin(1).png"))); // NOI18N
        ViewCashBookBTN.setText("View Cash Book");
        ViewCashBookBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCashBookBTNActionPerformed(evt);
            }
        });

        AddUsersBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        AddUsersBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        AddUsersBTN.setText("Add Users");
        AddUsersBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUsersBTNActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cash(1).png"))); // NOI18N

        OutstandingsGRN1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        OutstandingsGRN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cash.png"))); // NOI18N
        OutstandingsGRN1.setText("Outstandings");
        OutstandingsGRN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutstandingsGRN1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AccountPNLLayout = new javax.swing.GroupLayout(AccountPNL);
        AccountPNL.setLayout(AccountPNLLayout);
        AccountPNLLayout.setHorizontalGroup(
            AccountPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPNLLayout.createSequentialGroup()
                .addGroup(AccountPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountPNLLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(AccountPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ViewCashBookBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(AddUsersBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)))
                    .addGroup(AccountPNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OutstandingsGRN1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
        );
        AccountPNLLayout.setVerticalGroup(
            AccountPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountPNLLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(OutstandingsGRN1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ViewCashBookBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddUsersBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(96, 96, 96))
            .addGroup(AccountPNLLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Account", AccountPNL);

        AddCatagoryBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        AddCatagoryBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delivery-cart.png"))); // NOI18N
        AddCatagoryBTN.setText("Add Category");
        AddCatagoryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCatagoryBTNActionPerformed(evt);
            }
        });

        viewItemBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        viewItemBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trolley.png"))); // NOI18N
        viewItemBTN.setText("View Item");
        viewItemBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemBTNActionPerformed(evt);
            }
        });

        viewStockBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        viewStockBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stock(1).png"))); // NOI18N
        viewStockBTN.setText("View Stock");
        viewStockBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStockBTNActionPerformed(evt);
            }
        });

        StockrefillBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        StockrefillBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warehouse.png"))); // NOI18N
        StockrefillBTN.setText("Stock Refill Reminder");
        StockrefillBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockrefillBTNActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stock.png"))); // NOI18N

        AddItemBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        AddItemBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trolley.png"))); // NOI18N
        AddItemBTN.setText("Add Item");
        AddItemBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StockPNLLayout = new javax.swing.GroupLayout(StockPNL);
        StockPNL.setLayout(StockPNLLayout);
        StockPNLLayout.setHorizontalGroup(
            StockPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockPNLLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(StockPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddCatagoryBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(AddItemBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(viewItemBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(viewStockBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(StockrefillBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
        );
        StockPNLLayout.setVerticalGroup(
            StockPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockPNLLayout.createSequentialGroup()
                .addGroup(StockPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StockPNLLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(AddItemBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addComponent(AddCatagoryBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addComponent(viewItemBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addComponent(viewStockBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(9, 9, 9)
                        .addComponent(StockrefillBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(StockPNLLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Items and Stock", StockPNL);

        AddCustomerBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        AddCustomerBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boy.png"))); // NOI18N
        AddCustomerBTN.setText("Add Customer");
        AddCustomerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerBTNActionPerformed(evt);
            }
        });

        AddSuplierBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        AddSuplierBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manager.png"))); // NOI18N
        AddSuplierBTN.setText("Add Supplier");
        AddSuplierBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSuplierBTNActionPerformed(evt);
            }
        });

        ViewCustomerBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        ViewCustomerBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boy.png"))); // NOI18N
        ViewCustomerBTN.setText("View Customer");
        ViewCustomerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCustomerBTNActionPerformed(evt);
            }
        });

        ViewSuplierBTN.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        ViewSuplierBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/manager.png"))); // NOI18N
        ViewSuplierBTN.setText("View Supplier");
        ViewSuplierBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSuplierBTNActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/business-presentation.png"))); // NOI18N

        javax.swing.GroupLayout CustomerPNLLayout = new javax.swing.GroupLayout(CustomerPNL);
        CustomerPNL.setLayout(CustomerPNLLayout);
        CustomerPNLLayout.setHorizontalGroup(
            CustomerPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPNLLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(CustomerPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddCustomerBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(AddSuplierBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(ViewCustomerBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(ViewSuplierBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
        );
        CustomerPNLLayout.setVerticalGroup(
            CustomerPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPNLLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerPNLLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(AddCustomerBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(AddSuplierBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(ViewCustomerBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(ViewSuplierBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );

        jTabbedPane1.addTab("Customers and Suppliers", CustomerPNL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        NewClass.BACKUPDB();
        
        Window[] wins = Window.getWindows();
        for (int i = 0; i < wins.length; i++) {
            System.out.println(wins[i]);
            wins[i].dispose();
        }
        
        new Login().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddCustomerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerBTNActionPerformed
        
        new AddCustomers().setVisible(true);

    }//GEN-LAST:event_AddCustomerBTNActionPerformed

    private void AddSuplierBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSuplierBTNActionPerformed
        new AddSupplyer().setVisible(true);
    }//GEN-LAST:event_AddSuplierBTNActionPerformed

    private void AddItemBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemBTNActionPerformed
        new AddItems().setVisible(true);
    }//GEN-LAST:event_AddItemBTNActionPerformed

    private void AddCatagoryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCatagoryBTNActionPerformed
        new AddCatoBrands().setVisible(true);
    }//GEN-LAST:event_AddCatagoryBTNActionPerformed

    private void StockrefillBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockrefillBTNActionPerformed
        
        new viewLowStock().setVisible(true);

    }//GEN-LAST:event_StockrefillBTNActionPerformed

    private void viewStockBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStockBTNActionPerformed
        new ViewStock().setVisible(true);
    }//GEN-LAST:event_viewStockBTNActionPerformed

    private void ViewCashBookBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCashBookBTNActionPerformed
        new ViewCashBook().setVisible(true);
    }//GEN-LAST:event_ViewCashBookBTNActionPerformed

    private void AddUsersBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUsersBTNActionPerformed
        new AddUser().setVisible(true);
    }//GEN-LAST:event_AddUsersBTNActionPerformed

    private void AddGrnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGrnBTNActionPerformed
        new AddGRN().setVisible(true);
    }//GEN-LAST:event_AddGrnBTNActionPerformed

    private void ViewGRnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewGRnBTNActionPerformed
        new ViewGRN().setVisible(true);
    }//GEN-LAST:event_ViewGRnBTNActionPerformed

    private void grnPaymentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnPaymentBTNActionPerformed
        new AddSupPayments().setVisible(true);
    }//GEN-LAST:event_grnPaymentBTNActionPerformed

    private void CustomerInvoicePaymentsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerInvoicePaymentsBTNActionPerformed
        new AddCusInvoicePayments().setVisible(true);
    }//GEN-LAST:event_CustomerInvoicePaymentsBTNActionPerformed

    private void CustomerInvoiceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerInvoiceBTNActionPerformed
        new AddInvoicesV2().setVisible(true);
    }//GEN-LAST:event_CustomerInvoiceBTNActionPerformed

    private void ViewInvoiceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewInvoiceBTNActionPerformed
        new ViewInvoice().setVisible(true);
    }//GEN-LAST:event_ViewInvoiceBTNActionPerformed

    private void SalesSummeryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesSummeryBTNActionPerformed
        new DaillySalesSummery().setVisible(true);
    }//GEN-LAST:event_SalesSummeryBTNActionPerformed

    private void AddCustomerReturnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerReturnBTNActionPerformed
        new InvoiceReturnCustomer().setVisible(true);
    }//GEN-LAST:event_AddCustomerReturnBTNActionPerformed

    private void ViewGrnReturnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewGrnReturnBTNActionPerformed
       new ViewReturnGRN().setVisible(true);
    }//GEN-LAST:event_ViewGrnReturnBTNActionPerformed

    private void ViewCustomerReturnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCustomerReturnBTNActionPerformed
        new ViewReturnCustomer().setVisible(true);
    }//GEN-LAST:event_ViewCustomerReturnBTNActionPerformed

    private void viewItemBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemBTNActionPerformed
        new ViewItemUdaya().setVisible(true);
    }//GEN-LAST:event_viewItemBTNActionPerformed

    private void ViewCustomerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCustomerBTNActionPerformed
        new ViewCustomersUdaya().setVisible(true);
    }//GEN-LAST:event_ViewCustomerBTNActionPerformed

    private void ViewSuplierBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSuplierBTNActionPerformed
        new ViewSuppUdaya().setVisible(true);
    }//GEN-LAST:event_ViewSuplierBTNActionPerformed

    private void OutstandingsGRN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutstandingsGRN1ActionPerformed
        new CustomerOutstranding().setVisible(true);
    }//GEN-LAST:event_OutstandingsGRN1ActionPerformed

    private void AddGRnReturnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGRnReturnBTNActionPerformed
       
        new GRNReturnSupplier().setVisible(true);
        
        
    }//GEN-LAST:event_AddGRnReturnBTNActionPerformed
    
    public static void main(String args[]) {
        
        WebLookAndFeel.install();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccountPNL;
    private javax.swing.JButton AddCatagoryBTN;
    private javax.swing.JButton AddCustomerBTN;
    private javax.swing.JButton AddCustomerReturnBTN;
    private javax.swing.JButton AddGRnReturnBTN;
    private javax.swing.JButton AddGrnBTN;
    private javax.swing.JButton AddItemBTN;
    private javax.swing.JButton AddSuplierBTN;
    private javax.swing.JButton AddUsersBTN;
    private javax.swing.JPanel BillingPNL;
    private javax.swing.JButton CustomerInvoiceBTN;
    private javax.swing.JButton CustomerInvoicePaymentsBTN;
    private javax.swing.JPanel CustomerPNL;
    private javax.swing.JPanel GRNPNL;
    private javax.swing.JButton OutstandingsGRN1;
    private javax.swing.JButton SalesSummeryBTN;
    private javax.swing.JPanel StockPNL;
    private javax.swing.JButton StockrefillBTN;
    private javax.swing.JButton ViewCashBookBTN;
    private javax.swing.JButton ViewCustomerBTN;
    private javax.swing.JButton ViewCustomerReturnBTN;
    private javax.swing.JButton ViewGRnBTN;
    private javax.swing.JButton ViewGrnReturnBTN;
    private javax.swing.JButton ViewInvoiceBTN;
    private javax.swing.JButton ViewSuplierBTN;
    private javax.swing.JButton grnPaymentBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel paymentsPNL;
    private javax.swing.JPanel returnPNL;
    private javax.swing.JButton viewItemBTN;
    private javax.swing.JButton viewStockBTN;
    // End of variables declaration//GEN-END:variables

    private void privilage() {
        
        Login login = new Login();

        
            
        //   System.out.println(login.Role);
        if (new Login().Role.equals("Cashier")) {

            // paymentsPNL.setVisible(false);
            //  JOptionPane.showMessageDialog(paymentsPNL, "ligipu");
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(4, false);
            //jTabbedPane1.setEnabledAt(5, false);
            ViewInvoiceBTN.setEnabled(false);
//            ViewSuplierinvoiceBTN.setEnabled(false);
            AddGRnReturnBTN.setEnabled(false);
            ViewGrnReturnBTN.setEnabled(false);
            ViewCustomerReturnBTN.setEnabled(false);
//            ViewSupplierreturnBTN.setEnabled(false);
            AddItemBTN.setEnabled(false);
            AddCatagoryBTN.setEnabled(false);
            viewItemBTN.setEnabled(false);
            StockrefillBTN.setEnabled(false);
            ViewCustomerBTN.setEnabled(false);
            ViewSuplierBTN.setEnabled(false);
            SalesSummeryBTN.setEnabled(false);
            
            
            
            
        }
     else   if (new Login().Role.equals("Modarator")) {

            // paymentsPNL.setVisible(false);
            //  JOptionPane.showMessageDialog(paymentsPNL, "ligipu");
          
//            //jTabbedPane1.setEnabledAt(5, false);
            ViewInvoiceBTN.setEnabled(false);
//            ViewSuplierinvoiceBTN.setEnabled(false);
            SalesSummeryBTN.setEnabled(false);
//            SupplierInvoicePaymentBTN.setEnabled(false);
            CustomerInvoicePaymentsBTN.setEnabled(false);
            OutstandingsGRN1.setEnabled(false);
//            OutstandingsGRN2.setEnabled(false);
            AddGRnReturnBTN.setEnabled(false);
            ViewGrnReturnBTN.setEnabled(false);
            ViewCustomerReturnBTN.setEnabled(false);
//            ViewSupplierreturnBTN.setEnabled(false);
            ViewGRnBTN.setEnabled(false);
            ViewCashBookBTN.setEnabled(false);
//            AddItemBTN.setEnabled(false);
//            AddCatagoryBTN.setEnabled(false);
            viewItemBTN.setEnabled(false);
           // StockrefillBTN.setEnabled(false);
            ViewCustomerBTN.setEnabled(false);
            ViewSuplierBTN.setEnabled(false);
            
            
            
            
        }
        
    }

    private void maximize() {
   
//         if (maximized) {
//
//            Component.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
//            Component.this.setMaximizedBounds(gv.getMaximumWindowBounds());
//            maximized = true;
//        } else {
//
//            setExtendedState(JFrame.NORMAL);
//            maximized = false;
//
//        }
        
        
        
        }
}
