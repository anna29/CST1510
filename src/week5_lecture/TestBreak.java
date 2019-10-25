/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_lecture;

/**
 *
 * @author Anna29
 */
public class TestBreak {
    public static void main(String[] args) {
        
        int sum =0;
        int number =0;
        
        while (number < 20){
            number++;
            
            
            if (number == 10 || number == 11)
                continue;
                System.out.println("number-"+ number);
                sum += number;
                
        }
        
        System.out.println("the sum vale is: "+sum);
        
    }
    
}
