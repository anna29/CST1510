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
public class MultiDimantional {
    public static void main(String[] args) {
        
        int [][] rents = {
            {400, 500, 600},
            {350, 425, 670},
            {560, 230, 410}};
        
        System.out.println("Jan\tFeb\tMarch");
        
        for (int row = 0; row < rents.length; row++) {
            for (int col = 0; col < rents[0].length; col++) {
                System.out.print("£"+rents[row][col]+"\t");
                
            }
            System.out.println(""+row);
            
        }
        
    }
    
}
