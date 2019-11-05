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
public class RevisionWeek5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enetr 1st number to sum, If you want to stop just enter -1");
        int number = sc.nextInt();
        int sum =0;
        
        while (number != -1){
                sum = sum +number;
                System.out.println("the sum vale is: "+sum); 
             
                System.out.println("Enetr next number");
                number = sc.nextInt();
                    
        }
        
        System.out.println("the sum vale is: "+sum);
        
    }

    
}
