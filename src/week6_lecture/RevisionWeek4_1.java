
package week6_lecture;

import java.util.Scanner;

/**
 *
 * @author Anna29
 */
public class RevisionWeek4_1 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter you BMI It should be a number between 18 - 30");
        double bmi = sc.nextDouble();
        
        if (bmi <= 18.5){
            System.out.println("A BMI of less than 18.5 indicates that you are underweight, so you may need to put on some weight. You are recommended to ask your doctor or a dietitian for advice.");
        }else if (bmi>= 18.5 && bmi<=24.9){
            System.out.println("A BMI of 18.5–24.9 indicates that you are at a healthy weight for your height. By maintaining a healthy weight, you lower your risk of developing serious health problems.\n" +
"BMI");
        }else if (bmi >= 25 && bmi <= 29.9 ){
            System.out.println("A BMI of 25–29.9 indicates that you are slightly overweight. You may be advised to lose some weight for health reasons. You are recommended to talk to your doctor or a dietitian for advice.\n");
        }else if (bmi >= 30){
            System.out.println("A BMI of over 30 indicates that you are heavily overweight. Your health may be at risk if you do not lose weight. You are recommended to talk to your doctor or a dietitian for advice\n" +
" ");
        }
        
        
        
    }
    
}
