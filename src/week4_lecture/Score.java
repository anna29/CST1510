/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4_lecture;

/**
 * Example of if -else  
 * @author Anna29
 */
public class Score {
    public static void main(String[] args) {
        
        int SOBsNumber = 17;
        double test1 = 10 * 0.4;
        
        
        
        int score =63;
        
        String classification = "";
        
        if(score>=70){
            classification = "First class ";
        }else if (score >=60){
            classification = "Upper second class";
        }else if (score >=50){
            classification = "Lower second class";
        }else if (score >=40){
            classification = "Third";
        }else if (score >=35){
            classification = "Compositable Fail";
        }else {
            classification = "Uncompositable Fail";
        }
        
        System.out.println(classification);
        
        
      
        
    }
    
}
