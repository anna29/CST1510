/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_lecture;

/**
 *
 * @author Anna29
 */
public class MaxTwoNumbers {
    
    public static void main(String[] args) {
        
        int number1 = 10;
        int number2 =15;
        int temp;
        System.out.println("Initialy, number1 = "+number1 + " number2 "+number2);
        
        if (number1< number2){
            temp = number1;
            number1 = number2;
            number2 = temp;
            
        }
        
        System.out.println("After swaping, number1 = "+number1 + " number2 "+number2);
        
        
        
        
    }
    
}
