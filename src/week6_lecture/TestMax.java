/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_lecture;

/**
 *
 * @author Anna29
 */
public class TestMax {
   
    public static void main(String[] args) {
        double i = 5.3;
        int j = 2;
        double k = max(i,j);//invoke max method
        System.out.println("The maximum between "
                +i+" and "+j +" is: "+k);                
    }
    
     /** Return the max between two numbers */
    public static int max(int num1, int num2){
        int result = 0;
        if (num1> num2)
            result = num1;
        else 
            result = num2;
        
        return result;
    }
    
    public static double max(double num1, int num2) {
        double result = 0.0;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
}

    
}
