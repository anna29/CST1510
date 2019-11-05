
package week6_lecture;

import java.util.Scanner;

/**
 *int, double 
 *
 */
public class RevisionWeek3 {
    
    public static void main(String[] args) {
        
    
       //declaring variables typ of int (whole number)
       int num1, num2, num3; 
        
       //assigning values to thoues variables
        num1 = 10;
        num2 = 20;
        
        
        //using the Math.min() method getting the smallest number and storing it in variable call smaller
        int smaller = Math.min(num1, num2);
        //printing the solution to the consol
        System.out.println("The smalles of two numbers is "+ smaller);
        
        
        
        
        
         //declaring variables typ of double (fraction) and assigning value to it
        double proc1 = 2.5;
        double proc2 = 5.0/100;
        
        double price = 100.0;
        
        //calculation a procentage on price and printing to the consol 
        double priceWithProc;
        
        priceWithProc = price + (price * proc1);
        
        System.out.println("The result is: "+priceWithProc);
         
        
        
        
        
    }
    
}
