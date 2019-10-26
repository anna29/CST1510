/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_lecture;

import java.util.Scanner;

/**
 *
 * @author Anna29
 */
public class CountNumbersInText {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your password. Please remember that the pasword should include some numbers");
        String password = sc.next();
        System.out.println("the password has: "+coutNumbers(password)+ "digits in it");
          
    }
    
    public static int coutNumbers(String n){
        
        int numOrDigits = 0;
        
        for (int i = 0; i < n.length(); i++) {
   
                if ( Character.isDigit(n.charAt(i))){
                    
                    numOrDigits += 1;
                }
               
            }
       return numOrDigits;
            
       
        
         
     
    }
    
}
