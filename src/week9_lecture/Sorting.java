/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_lecture;

/**
 *
 * @author Anna29
 */
public class Sorting {
    public static void main(String[] args) {
         int[] array = {4,2,1,3,5,91,61,8,7};
         
         for (int i = 0; i < array.length; i++) {
             for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                            
                } 
                 
             }
   
            
        }
        
         for (int e : array){
             System.out.println(""+e);
         }
        
    }
    
}
