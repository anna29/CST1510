/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_lecture;

/**
 *
 * @author Anna29
 */
public class PasswordMethod {
    
    public static void main(String[] args) {
        
        String password = "Password123.mdx.ac.uk.NW4";
        System.out.println(NumberOfDigits(password));
        
    }
    
    
    public static int NumberOfDigits(String password){

        int numOrDigits = 0;
        for (int i = 0; i < password.length(); i++) {
   
                if ( Character.isDigit(password.charAt(i))){
                    
                    numOrDigits =numOrDigits+ 1;
                }     
        }
        return numOrDigits;
    }

    
}
