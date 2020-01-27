/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week15_lecture;


import java.util.Scanner;


public class Exception   {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num1=0;
        
        while(true){
          
        try{
              num1 = sc.nextInt();
              break;
        }catch(java.util.InputMismatchException e){
            System.out.println("enter a number");
            sc.nextLine();
        }
        System.out.println(num1);
    }
        
      
        
        
    }
    
    
}
