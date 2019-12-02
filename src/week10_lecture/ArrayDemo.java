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
public class ArrayDemo {
    
    public static void main(String[] args) {
     
        
    int [][] table = 
        
        {{100, 5,10,15,20},
         {10,15,20,25,30},
         {20,10,10,20,20},
         {10,20,30,40,50}};

    
    for (int row = 0; row < table.length; row++) {  
         for (int column = 0; column < table[0].length; column++) {
            System.out.print(" "+table[row][column]);
          
        }
         System.out.println("");
    }
    
    
       
    
    

    
    }
    
}
