/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_lecture;

import java.util.Scanner;

/**
 *Create new project where you would generate a student email. 
 * Ask user for the first part of his/her email and concatenate it to the listed below variables in order to create one email.

 * @author Anna29
 */
public class GenerateEmail {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the first part of your email"
                + "\nExample: aw564 ... Enter your input now");
        String firstPartOfEmail = sc.nextLine();
        
        char at = '@';
        String endOfEmail = "live.mdx.ac.uk";
        
        System.out.println("Your student email is: "+firstPartOfEmail+at+endOfEmail);
    }
    
}
