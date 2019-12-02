/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10_lecture;

/**
 *
 * @author Anna29
 */
public class Smallest {
    public static void main(String[] args) {
        
       
         int [][] rents = {
            {400, 500, 600,187,120},
            {350, 425, 670,287,220},
            {560, 230, 410,387,320}};
        
         int smallest = rents[0][0];
        
         for (int row = 0; row < rents.length; row++) {
             for (int col = 1; col < rents[row].length; col++) {
                
                 if (rents[row][col] < smallest ){
                     smallest = rents[row][col];
                 }
                 
             }
            
        }
        
        System.out.println("teh smallest rent is: "+ smallest);
        
        
        
        
        
        
        
        
        
    }
    
}
