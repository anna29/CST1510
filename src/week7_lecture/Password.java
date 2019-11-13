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
public class Password {
    public static void main(String[] args) {
        
        
        
        String password = "Password123.mdx.ac.uk.NW4";
        
        int numOrDigits = 0;
        for (int i = 0; i < password.length(); i++) {
   
                if ( Character.isDigit(password.charAt(i))){
                    
                    numOrDigits =numOrDigits+ 1;
                }
               
            }
        System.out.println("the number of digit in the password is: "+ numOrDigits);
    }
    
}
