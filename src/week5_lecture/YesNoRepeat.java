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
public class YesNoRepeat {
    
    public static void main(String[] args) {
        
        char ans = 'y';
        Scanner sc = new Scanner (System.in);
        
        while (ans=='Y' || ans== 'y' ){
            System.out.println("WElcome to Java ");
            
            System.out.println("Do you want to repeat ? (Y/N)");
            ans = sc.next().charAt(0);
        }
    }
    
}
