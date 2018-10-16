/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcs;

import exClass.dateForm;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author oditha
 */
public class NewClass {

    public static void BACKUPDB() {
        
        System.out.println("Metod Started");
        
        String format = new SimpleDateFormat("yyyy-MM-DD-hh-mm-ss").format(new Date());
        
        File dir = new File("C:/DBBackup/" + dateForm.currentdateFolder());

        if (!dir.exists()) {

            try {

                boolean mkdir = dir.mkdirs();
                System.out.println(mkdir);
            } catch (Exception e) {

                e.printStackTrace();

            }

        }

        String path = dir.toString()+"/"+format+".sql";
        String backup = "C:/Program Files/MySQL/MySQL Server 5.7/bin/mysqldump -uroot -p*222*odk* jrtraders -r" + path;
        try {
            Process exec = Runtime.getRuntime().exec(backup);
            int waitFor = exec.waitFor();
            if (waitFor == 0) {
                JOptionPane.showMessageDialog(null, "Backup Completed");
            } else {

                JOptionPane.showMessageDialog(null, "Backup Error");

            }
        } catch (IOException ex) {

        } catch (InterruptedException ex) {

            ex.printStackTrace();
        }

    }

}
