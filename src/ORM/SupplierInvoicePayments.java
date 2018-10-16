package ORM;
// Generated Mar 26, 2018 12:50:47 AM by Hibernate Tools 4.3.1



/**
 * SupplierInvoicePayments generated by hbm2java
 */
public class SupplierInvoicePayments  implements java.io.Serializable {


     private Integer idInvoicePayment;
     private Supplier supplier;
     private SupplierInvoice supplierInvoice;
     private String paymentDate;
     private Double amount;
     private String paymentType;
     private String isActive;

    public SupplierInvoicePayments() {
    }

	
    public SupplierInvoicePayments(Supplier supplier, SupplierInvoice supplierInvoice) {
        this.supplier = supplier;
        this.supplierInvoice = supplierInvoice;
    }
    public SupplierInvoicePayments(Supplier supplier, SupplierInvoice supplierInvoice, String paymentDate, Double amount, String paymentType, String isActive) {
       this.supplier = supplier;
       this.supplierInvoice = supplierInvoice;
       this.paymentDate = paymentDate;
       this.amount = amount;
       this.paymentType = paymentType;
       this.isActive = isActive;
    }
   
    public Integer getIdInvoicePayment() {
        return this.idInvoicePayment;
    }
    
    public void setIdInvoicePayment(Integer idInvoicePayment) {
        this.idInvoicePayment = idInvoicePayment;
    }
    public Supplier getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public SupplierInvoice getSupplierInvoice() {
        return this.supplierInvoice;
    }
    
    public void setSupplierInvoice(SupplierInvoice supplierInvoice) {
        this.supplierInvoice = supplierInvoice;
    }
    public String getPaymentDate() {
        return this.paymentDate;
    }
    
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getPaymentType() {
        return this.paymentType;
    }
    
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public String getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }




}


