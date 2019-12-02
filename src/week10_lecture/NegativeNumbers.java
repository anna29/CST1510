/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10_lecture;

import java.util.Scanner;

/**
 * This program counts the number of negative numbers in 2D array
 * @author Anna29
 */
public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int [] []  numbers ={
                {-4, -3, -1, 1},
                {-2, -2, 1, 2},
                {-1, 1, 2, 3},
                {1, 2, 4, 5}};
        
        int count =0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[0].length; col++) {
                 if (numbers[row][col]<0){
                count = count+1;
            }   
            }
            
        }
        System.out.println("the number of negative numbers in it is: "+ count);
    }
    
}
