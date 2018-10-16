/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exClass;

import java.util.Random;

/**
 *
 * @author Danushka
 */
public class RandomPin {

    public static void main(String[] args) {
        RandomPin randomPin = new RandomPin();
        RandomPin.Pin();
        
    }
    public static int Pin(){
       int num = 0;
        try {
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            num = random.nextInt(99999) + 99999;
            if (num < 100000 || num > 999999) {
                num = random.nextInt(99999) + 99999;
             if (num < 100000 || num > 999999) {
                 System.out.println("ERR");
                
            }   
            }
//            System.out.println(num);
            
        } catch (Exception e) {
        }
        return num;
    
    
    }
    
}
