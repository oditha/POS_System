package ORM;
// Generated Mar 26, 2018 12:50:47 AM by Hibernate Tools 4.3.1



/**
 * Stock generated by hbm2java
 */
public class Stock  implements java.io.Serializable {


     private Integer idStock;
     private Item item;
     private Double qty;

    public Stock() {
    }

	
    public Stock(Item item) {
        this.item = item;
    }
    public Stock(Item item, Double qty) {
       this.item = item;
       this.qty = qty;
    }
   
    public Integer getIdStock() {
        return this.idStock;
    }
    
    public void setIdStock(Integer idStock) {
        this.idStock = idStock;
    }
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    public Double getQty() {
        return this.qty;
    }
    
    public void setQty(Double qty) {
        this.qty = qty;
    }




}


