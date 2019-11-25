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
public class LargestAndSmallest {
    
    public static void main(String[] args) {
           int [] n = {100,6,8,76,3,9,5,1,7};
           
           smallest(n);
        
    }
    
  
    public static void largestElement(int []ListOfNumbers){
        int max = ListOfNumbers[0];
        for (int i = 1; i < ListOfNumbers.length; i++) {
            if (ListOfNumbers[i]>max)
                max=ListOfNumbers[i];
        }
        System.out.println("The largest element is: "+max);
    }
    
    public static void smallest(int []ListOfNumbers){
       int min = ListOfNumbers[0];
        for (int i = 1; i < ListOfNumbers.length; i++) {
            if (ListOfNumbers[i]<min)
                min=ListOfNumbers[i];
        }
        System.out.println("The smallest element is: "+min); 
    }
    
    
    
}
