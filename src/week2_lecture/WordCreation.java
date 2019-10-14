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
        char  c = sc.next().charAt(0);
        
        System.out.println ("this is the input"+ c );
        
    }
    
}
