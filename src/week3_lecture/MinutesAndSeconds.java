
package week3_lecture;

import java.util.Scanner;

/**
 *Write a Java program which obtains minutes and remaining seconds from an amount of time in second. 
 * For example, 500 seconds contains 8 minutes and 20 seconds. 
 * Using Scanner to prompt the user for an inputs of seconds and calculate the remaining minutes and seconds.

 * @author Anna29
 */
public class MinutesAndSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of secounds");
        int inputSecounds = sc.nextInt();
        
        int minutes = inputSecounds/60; // return the number of minutes from the giving number of secounds
        int secounds = inputSecounds%60; //remaining number of secounds 
        
        
        System.out.println(inputSecounds+ " secounds, comprise of: "+ minutes+" minutes and "+secounds+" secounds");
        
    }
    
}
