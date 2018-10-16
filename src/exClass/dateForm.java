package exClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateForm {

    private static SimpleDateFormat sdf0;
    private static SimpleDateFormat sdf1;
    private static SimpleDateFormat cursdf;
    private static SimpleDateFormat cursdf0;
    private static SimpleDateFormat cursdf4;

    public static String currentdate() {

        if (cursdf0 == null) {

            cursdf0 = new SimpleDateFormat("yyyy/MM/dd");

        }

        return cursdf0.format(new Date());

    }
    public static String currentdateFolder() {

        if (cursdf4 == null) {

            cursdf4 = new SimpleDateFormat("yyyy-MM-dd");

        }

        return cursdf4.format(new Date());

    }
    public static String setdate() {

        if (cursdf == null) {

            cursdf = new SimpleDateFormat("yyyy/MM/dd");

        }

        return cursdf.format(new Date());

    }
    
//    public static String convertDate(String date) throws ParseException{
//    
//        if (sdf0==null) {
//            
//            sdf0 = new SimpleDateFormat("dd.MM.yyyy");
//            
//        }
//        
//        if (sdf1==null) {
//            
//            sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//            
//        }
//        
//    
//        Date format = sdf0.parse(date);
//        
//        
//        
//        return sdf1.format(format);
//        
//    
//    }

    
    public static void main(String[] args) throws ParseException {
        
        currentdate();
    }
    
}
