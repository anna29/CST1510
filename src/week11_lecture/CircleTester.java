/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11_lecture;

/**
 *
 * @author Anna29
 */


public class CircleTester {
    
    public static void main(String[] args) {
        
        Circle c =  new Circle();
        c.setRadious(10);
        System.out.println(""+c.numberOfObjects);
        System.out.printf("%.2f",c.getArea()); 
        System.out.println("\n"+c);
        
        Circle c2 = new Circle(5);
        System.out.println(c2.numberOfObjects+"\n");
        System.out.printf("\n%.2f",c2.getArea()); 
        
    }
    
    
}
