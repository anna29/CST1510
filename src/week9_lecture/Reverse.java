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
public class Reverse {
    public static void main(String[] args) {
         int [] n = {100,6,8,76,3,9,5,7};
        
            for (int e : reverse(n)){
                System.out.println(e);
            }
        
        }   
    public static int[] reverse(int []list){
        int [] result = new int [list.length];
        for (int i = 0, j=result.length-1; i < result.length; i++,j--) {
            result[j]= list[i];           
        }       
        return result;
    }
    
 
    
}
