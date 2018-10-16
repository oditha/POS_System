
package exClass;

import java.text.DecimalFormat;


public class Decimal_Formats {

    private static DecimalFormat supCode;
    private static DecimalFormat ItemCode;
    private static DecimalFormat price;
    private static DecimalFormat INVNO;
    private static DecimalFormat QTY;

    
    public static String Sup_Code(int supcode){
    
        if (supCode == null) {
            
            supCode = new DecimalFormat("0000");
            
        }
        
        return supCode.format(supcode).toString();
    
    }
    
      public static String Qty(Double qty){
    
        if (QTY == null) {
            
            QTY = new DecimalFormat("###");
            
        }
        
        return QTY.format(qty);
    
    }
    
    public static String Item_Code(int i){
    
        if (ItemCode == null) {
            
            ItemCode = new DecimalFormat("00000");
            
        }
        
        return ItemCode.format(i).toString();
    } 
    public static String InvNo(int i){
    
        if (INVNO == null) {
            
            INVNO = new DecimalFormat("00000");
            
        }
        
        return INVNO.format(i).toString();
    
    }
    
    public static String Price(Double PRICE){
    
        if (price == null) {
            
            price = new DecimalFormat(".00");
            
        }
    
        return price.format(PRICE).toString();
    }
    
}
