package ORM;
// Generated Mar 26, 2018 12:50:47 AM by Hibernate Tools 4.3.1



/**
 * SupplierInvoiceReturnHasSupplier generated by hbm2java
 */
public class SupplierInvoiceReturnHasSupplier  implements java.io.Serializable {


     private Integer idRecord;
     private Supplier supplier;
     private SupplierInvoiceReturn supplierInvoiceReturn;

    public SupplierInvoiceReturnHasSupplier() {
    }

    public SupplierInvoiceReturnHasSupplier(Supplier supplier, SupplierInvoiceReturn supplierInvoiceReturn) {
       this.supplier = supplier;
       this.supplierInvoiceReturn = supplierInvoiceReturn;
    }
   
    public Integer getIdRecord() {
        return this.idRecord;
    }
    
    public void setIdRecord(Integer idRecord) {
        this.idRecord = idRecord;
    }
    public Supplier getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public SupplierInvoiceReturn getSupplierInvoiceReturn() {
        return this.supplierInvoiceReturn;
    }
    
    public void setSupplierInvoiceReturn(SupplierInvoiceReturn supplierInvoiceReturn) {
        this.supplierInvoiceReturn = supplierInvoiceReturn;
    }




}


