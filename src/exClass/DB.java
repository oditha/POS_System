package exClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class DB {

    private static Connection c;

    private static void createNewConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jrtraders", "root", "*222*odk*");
//        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/newkamal", "root", "");
    }

    public static void idu(String sql) throws Exception {
        if (c == null) {
            createNewConnection();
        }
        c.createStatement().executeUpdate(sql);

//      JOptionPane.showMessageDialog(null, "Sucess", "Done", JRootPane.INFORMATION_DIALOG);

    }

    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            createNewConnection();
        }
        return c.createStatement().executeQuery(sql);
    }

    public static Connection getCon() throws Exception {
        if (c == null) {
            createNewConnection();
        }
        return c;
    }

    
}
