/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_lecture;

import java.util.Scanner;

/**
 *
 * @author Anna29
 */
public class SumGivingNumbers {
    public static void main(String[] args) {
        int data, sum =0;
        
        Scanner sc = new Scanner (System.in);
                
        do{
            System.out.println("Enter an integer to sum (the input ends if it is 0):/nThe sum is: "+sum);
            data = sc.nextInt();
            sum +=data;
            
        }while(data != 0);
        
        System.out.println("The sum is: "+ sum);
    }
    
}
