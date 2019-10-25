/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_lecture;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anna29
 */
public class Additions {
    public static void main(String[] args) {
        Random r = new Random();
        int number1 = r.nextInt(10);
        int number2 = (int)(1+ Math.random()*10);
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("What is: "+ number1 + " + "+number2+" ?");
        int answer = sc.nextInt();
        
        
        if (number1+number2 ==answer){
            System.out.println("Correct");
            System.out.println(number1 + " + "+number2+" = "+ answer);
        }else{
            System.out.println("Sorry "+ answer + " is not a correct aswer");
            System.out.println(number1 + " + "+number2+" = "+ (number1 +number2));
        }
        
        
        
        
    }
    
}
