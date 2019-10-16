/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_lecture;

/**
 *If today is Saturday and we want to meet a friend in 10 days time, 
 * which day of the week would that be on?
 * 
 * Mon - 1
 * Tue - 2
 * Wen - 3
 * Thu - 4
 * Fri - 5
 * Sat - 6
 * Sun - 0
 * 
 * @author Anna29
 */
public class ConstantExample {
    public static void main(String[] args) {
        
        
        final int DAYS_IN_WEEK = 7;
        
       int dayInWeek = (6 +10) % DAYS_IN_WEEK ;
       
        System.out.println("It is the: "+dayInWeek+" day in the week");
        
    }
    
}
