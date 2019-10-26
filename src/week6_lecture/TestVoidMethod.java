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
public class TestVoidMethod {
    public static void main(String[] args) {
         
        printGrade(56);
    }
    
    public static void printGrade(int score) {
        if (score >= 90.0) {
          System.out.println('A');
        } 
        else if (score >= 80.0) {
          System.out.println('B');
        } 
        else if (score >= 70.0) {
          System.out.println('C');
        } 
        else if (score >= 60.0) {
          System.out.println('D');
        } 
        else {
          System.out.println('F');
    }
  }
    
}
