/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_lecture;

import java.util.Scanner;

/**
 *
 * @author Anna29
 */
public class WordCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter a letter");
        char  letter1 = sc.next().charAt(0);
        
        System.out.println("enter a letter");
        char  letter2 = sc.next().charAt(0);
        
        System.out.println("enter a letter");
        char  letter3 = sc.next().charAt(0);
        
        System.out.println("enter a letter");
        char  letter4 = sc.next().charAt(0);
        
        System.out.println("enter a letter");
        char  letter5 = sc.next().charAt(0);
        
        System.out.println ("The word is: "+ letter1+letter2+letter3+letter4+letter5 );
        
    }
    
}
