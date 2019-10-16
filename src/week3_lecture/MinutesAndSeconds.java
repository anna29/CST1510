/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_lecture;

import java.util.Scanner;

/**
 *
 * @author Anna29
 */
public class MinutesAndSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of secounds");
        int inputSecounds = sc.nextInt();
        
        int minutes = inputSecounds/60;
        int secounds = inputSecounds%60;
        
        
        System.out.println(inputSecounds+ " secounds, comprise of: "+ minutes+" minutes and "+secounds+" secounds");
        
    }
    
}
