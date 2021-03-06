package ORM;
// Generated Mar 26, 2018 12:50:47 AM by Hibernate Tools 4.3.1



/**
 * Grnpayments generated by hbm2java
 */
public class Grnpayments  implements java.io.Serializable {


     private Integer idGrnpayment;
     private Grn grn;
     private Supplier supplier;
     private String paymentDate;
     private Double amount;
     private String paymentType;
     private String isActive;

    public Grnpayments() {
    }

	
    public Grnpayments(Grn grn, Supplier supplier) {
        this.grn = grn;
        this.supplier = supplier;
    }
    public Grnpayments(Grn grn, Supplier supplier, String paymentDate, Double amount, String paymentType, String isActive) {
       this.grn = grn;
       this.supplier = supplier;
       this.paymentDate = paymentDate;
       this.amount = amount;
       this.paymentType = paymentType;
       this.isActive = isActive;
    }
   
    public Integer getIdGrnpayment() {
        return this.idGrnpayment;
    }
    
    public void setIdGrnpayment(Integer idGrnpayment) {
        this.idGrnpayment = idGrnpayment;
    }
    public Grn getGrn() {
        return this.grn;
    }
    
    public void setGrn(Grn grn) {
        this.grn = grn;
    }
    public Supplier getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
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


