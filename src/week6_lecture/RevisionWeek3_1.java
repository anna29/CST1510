
package week6_lecture;

import java.util.Scanner;

/**
 * Getting int and double from user using Scanner 
 * @author Anna29
 */
public class RevisionWeek3_1 {
    
    public static void main(String[] args) {
        
     Scanner sc = new Scanner (System.in); 
     
     System.out.println("Enter a whole number");
     int num1 = sc.nextInt();

     System.out.println("Enter a fractional number");
     double num2 = sc.nextDouble();
     
     
    //adding two numbers and getting the solution as a integer
     int solution = (int) (num1 +num2);
     System.out.println("The addition of "+num1 + " and "+num2 +" is equale: " +solution +" as a whole number");
     
     
     
        
    }
    
}
