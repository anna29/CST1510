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
public class BiggerNumber {
    public static void main(String[] args) {
        
        int biggest=0;
        int secountBiggest=0;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter number of values you would like to compare"); 
        int NoOfNumbers = sc.nextInt();
        
        int numberOfTimesToLoop = NoOfNumbers+1;  
       
        for (int i = 1; i < numberOfTimesToLoop; i++) {
            
            System.out.println("Enter value number: "+i);
            int value = sc.nextInt();
            
            if (value >biggest && value >secountBiggest ){
                secountBiggest = biggest;
                biggest = value;
            }else if (value > secountBiggest){
                secountBiggest = value;
            }else if (value == biggest || value == secountBiggest){
                
            }
            
            System.out.println("Biggest is: "+biggest +" Secount Biggest is: "+secountBiggest);
            
        }
        
    }
    
}
