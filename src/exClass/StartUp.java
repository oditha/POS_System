/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exClass;

import com.alee.laf.WebLookAndFeel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import srcs.Activation;
import srcs.Login;

/**
 *
 * @author oditha
 */
public class StartUp {

    String[] Mac = {};
    static File file;
    static File path;
    public static String pin;

    public static void main(String[] args) {

        WebLookAndFeel.install();
        WebLookAndFeel.setAllowLinuxTransparency(true);
        WebLookAndFeel.setDecorateAllWindows(true);
        WebLookAndFeel.setDecorateDialogs(true);
        WebLookAndFeel.setDecorateFrames(true);
//        WebLookAndFeel.setScrollMode(1);
        
        path = new File("C:\\Users\\Default\\AppData\\Local\\ms");
        file = new File(path + "/msys.dll");
        if (!file.exists()) {

            try {

                boolean mkdirs = path.mkdirs();
                System.out.println(mkdirs);

            } catch (Exception e) {

                e.printStackTrace();

            }

            pin = "" + RandomPin.Pin();

            StartUp startUp = new StartUp();

            System.out.println(pin);

            SendEmail.doSendMail("msactivationsystem@gmail.com", "*222*odk*", "msactivationsystem@gmail.com", "Activaton MiraclePOS", "Activation Pin " + pin);

            new Activation().setVisible(true);

        } else {

            try {
               
//                if (en == null ? ReadFile == null : en.equals(ReadFile)) {

                if (true) {

                    new Login().setVisible(true);

                } else {
                    pin = "" + RandomPin.Pin();
                    StartUp startUp = new StartUp();

                    System.out.println(pin);
                    SendEmail.doSendMail("msactivationsystem@gmail.com", "*222*odk*", "msactivationsystem@gmail.com", "Activaton MiraclePOS", "Activation Pin " + pin);
                    new Activation().setVisible(true);

                }
            } catch (Exception ex) {
                Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private static String ReadFile() {

        String returns = null;

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
//                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                String everything = sb.toString();
                returns = everything;
            } catch (IOException ex) {
                Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return returns;

    }

    public static void WriteFile() {
        try {
            exClass.encript encript = new encript();
            PrintWriter writer = new PrintWriter(file, "UTF-8");
            List list = new ArrayList();
           

            writer.print("NMS");
            writer.close();

            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static String getMac() {
        List list = new ArrayList();
        try {

            for (Enumeration<NetworkInterface> e
                    = NetworkInterface.getNetworkInterfaces();
                    e.hasMoreElements();) {
                NetworkInterface ni = e.nextElement();
//                System.out.println(ni.getName() + " - " + formatMac(ni.getHardwareAddress()));
                list.add(ni.getName() + " - " + formatMac(ni.getHardwareAddress()));

            }
//            System.out.println(list);
//            System.out.println(mac);

        } catch (SocketException ex) {
            Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list.toString();

    }

    protected static String formatMac(byte[] mac) {
        if (mac == null) {
            return "UNKNOWN";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
        }
        return sb.toString();
    }

    public String encriptSHA(String passwordToHash, String salt) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = md.digest(passwordToHash.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }

}
