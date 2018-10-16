package ORM;
// Generated Mar 26, 2018 12:50:47 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SupplierInvoice generated by hbm2java
 */
public class SupplierInvoice  implements java.io.Serializable {


     private Integer idInvoice;
     private Supplier supplier;
     private String invoiceNo;
     private String invoiceDate;
     private Double subTotal;
     private Double discount;
     private Double nettTotal;
     private String isActive;
     private String createdBy;
     private Set supplierInvoiceItems = new HashSet(0);
     private Set supplierInvoiceReturns = new HashSet(0);
     private Set supplierInvoicePaymentses = new HashSet(0);

    public SupplierInvoice() {
    }

	
    public SupplierInvoice(Supplier supplier) {
        this.supplier = supplier;
    }
    public SupplierInvoice(Supplier supplier, String invoiceNo, String invoiceDate, Double subTotal, Double discount, Double nettTotal, String isActive, String createdBy, Set supplierInvoiceItems, Set supplierInvoiceReturns, Set supplierInvoicePaymentses) {
       this.supplier = supplier;
       this.invoiceNo = invoiceNo;
       this.invoiceDate = invoiceDate;
       this.subTotal = subTotal;
       this.discount = discount;
       this.nettTotal = nettTotal;
       this.isActive = isActive;
       this.createdBy = createdBy;
       this.supplierInvoiceItems = supplierInvoiceItems;
       this.supplierInvoiceReturns = supplierInvoiceReturns;
       this.supplierInvoicePaymentses = supplierInvoicePaymentses;
    }
   
    public Integer getIdInvoice() {
        return this.idInvoice;
    }
    
    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }
    public Supplier getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public String getInvoiceNo() {
        return this.invoiceNo;
    }
    
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    public String getInvoiceDate() {
        return this.invoiceDate;
    }
    
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    public Double getSubTotal() {
        return this.subTotal;
    }
    
    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }
    public Double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public Double getNettTotal() {
        return this.nettTotal;
    }
    
    public void setNettTotal(Double nettTotal) {
        this.nettTotal = nettTotal;
    }
    public String getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public Set getSupplierInvoiceItems() {
        return this.supplierInvoiceItems;
    }
    
    public void setSupplierInvoiceItems(Set supplierInvoiceItems) {
        this.supplierInvoiceItems = supplierInvoiceItems;
    }
    public Set getSupplierInvoiceReturns() {
        return this.supplierInvoiceReturns;
    }
    
    public void setSupplierInvoiceReturns(Set supplierInvoiceReturns) {
        this.supplierInvoiceReturns = supplierInvoiceReturns;
    }
    public Set getSupplierInvoicePaymentses() {
        return this.supplierInvoicePaymentses;
    }
    
    public void setSupplierInvoicePaymentses(Set supplierInvoicePaymentses) {
        this.supplierInvoicePaymentses = supplierInvoicePaymentses;
    }




}

