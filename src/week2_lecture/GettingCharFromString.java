/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_lecture;

/**
 *
 * @author Anna29
 */
public class GettingCharFromString {
    public static void main(String[] args) {
        String welcome = "Welcome to Java";
        
        System.out.println("The string length is: "+ welcome.length());
        System.out.println("First letter from the  String is: "+welcome.charAt(0));
        
        
        // In this example I passed as a parameter welecome.length() in order to get the last letter
        // but the welcome.length() method returns nimber 15 in this case
        System.out.println("The last letter in the string is: "+ welcome.charAt(welcome.length()));
        
    }
    
}
