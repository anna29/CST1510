/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7_lecture;

/**
 *
 * @author Anna29
 */
public class TestReturnGradeMethod {
    
    public static void main(String[] args) {
        System.out.println("The great is"+ getGrade(45.7));
        System.out.println("\nThe grade is " + getGrade(59.5));
    }
    
    public static char getGrade(double score){
        if (score >= 90.0)
          return 'A';
        else if (score >= 80.0)
          return 'B';
        else if (score >= 70.0)
          return 'C';
        else if (score >= 60.0)
          return 'D';
        else
          return 'F';
    }
    
    
}
