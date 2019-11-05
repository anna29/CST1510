
package week6_lecture;

import java.util.Scanner;

/**
 * in week 4 we did 
 * if 
 * if else 
 * Logical operator such as || or and && and 
 * @author Anna29
 */
public class RevisionWeek4 {
    
    public static void main(String[] args) {
    
      //Guess game allowing to guess number from 1 to 5
        
        int number = (int)(1+ Math.random()*6);
       
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Guess a dice number from 1 to 6");       
        int dice = sc.nextInt();
        
        if (number == dice){
            System.out.println("Well done "+ number +" is same as: "+dice);
        }else if (number>dice){
            System.out.println("Too snall: "+ number +" > "+dice);
        }else if (number<dice){
            System.out.println("Too big: "+ number +" < "+dice);
        }
        
        
        
    }
    
}
