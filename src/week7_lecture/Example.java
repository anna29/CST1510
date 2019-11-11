/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_lecture;

import java.util.Scanner;

/**
 *
 * @author Anna29
 */
public class Example {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        
       
        
        System.out.println(mileToKilometer(1));
       
       
        
    }
    
    
    
    public static double mileToKilometer(double mile){
        double km =0;
        
        km = mile *1.609;
        
        return km;
    }
    
    public static double kmToMiles(double mile){
        double km =0;
        
        km = mile *1.609;
        
        return km;
    }
    
    
}
