
package week6_lecture;

import java.util.Scanner;



/**
 * Input from a user using Scanner and  concatenating them together 
 * 
 * @author Anna29
 */
public class RevisionWeek2_1 {
    
    
    public static void main(String[] args) {
        
        //declaring Scanner
        Scanner sc = new Scanner (System.in);
        
        //printing a question to a console
        System.out.println("Enter User selected clothes name :");
        //using a scanner sc.nextLine() method allowing the user to enter  String and store into a variable call name
        String name = sc.nextLine();
        
        //printing a question to a console
        System.out.println("Enter your size s-small, m- middium, l-large");  
        //using a scanner sc.next().charAt(0); allowing the user to enter char variable  
        char size1 = sc.next().charAt(0);
        
        //printing a question to a console
        System.out.println("Enter your other size s-small, m- middium, l-large");
        //using a scanner sc.next().charAt(0); allowing the user to enter char variable  
        char size2 = sc.next().charAt(0);
        
        
        
        //adding two char variable and printing them to the consol
        System.out.println(size1+size2);//the answer will be as an integer as the addition under the cover is of UNICODE characters
        
        //printing the solution as a String of character
        System.out.println("The user: "+name+ " Is looking for a sizes "+size1+" or " +size2);
        
        
        
        
        
        
    }
}
