package ORM;
// Generated Mar 26, 2018 12:50:47 AM by Hibernate Tools 4.3.1



/**
 * SupplierInvoiceItemHasItemSereal generated by hbm2java
 */
public class SupplierInvoiceItemHasItemSereal  implements java.io.Serializable {


     private Integer idRecord;
     private ItemSereal itemSereal;
     private SupplierInvoiceItem supplierInvoiceItem;

    public SupplierInvoiceItemHasItemSereal() {
    }

    public SupplierInvoiceItemHasItemSereal(ItemSereal itemSereal, SupplierInvoiceItem supplierInvoiceItem) {
       this.itemSereal = itemSereal;
       this.supplierInvoiceItem = supplierInvoiceItem;
    }
   
    public Integer getIdRecord() {
        return this.idRecord;
    }
    
    public void setIdRecord(Integer idRecord) {
        this.idRecord = idRecord;
    }
    public ItemSereal getItemSereal() {
        return this.itemSereal;
    }
    
    public void setItemSereal(ItemSereal itemSereal) {
        this.itemSereal = itemSereal;
    }
    public SupplierInvoiceItem getSupplierInvoiceItem() {
        return this.supplierInvoiceItem;
    }
    
    public void setSupplierInvoiceItem(SupplierInvoiceItem supplierInvoiceItem) {
        this.supplierInvoiceItem = supplierInvoiceItem;
    }




}

