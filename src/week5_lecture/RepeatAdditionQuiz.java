/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_lecture;

import java.util.Scanner;

/**
 *
 * @author Anna29
 */
public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        
        int number1 = (int)(1+Math.random()*10);
        int number2 = (int)(1+Math.random()*10);
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("What is: "+ number1 + " + "+number2+" ?");
        int answer = sc.nextInt();
        
        while(number1+number2!=answer){
            System.out.println("Wrong answer try again.\n What is: "+ number1 + " + "+number2+" ?");
            answer = sc.nextInt();
        }
        
        System.out.println("Well done you got it");
        
    }
    
}
