
package week5_lecture;
import java.util.Scanner;
/**
 *
 * Swapping between two numbers
 */
public class Swapping {
    
    public static void main(String[] args) {
    
     int num1 =100;
     int num2 = 30;
     int temp;
     
     System.out.println("Before swapping = num1: "+num1+" num2: "+ num2);
     
     temp = num2;
     num2 = num1;
     num1 = temp;
       
     System.out.println("After swapping = num1: "+num1+" num2: "+ num2);   
    }
    
}
