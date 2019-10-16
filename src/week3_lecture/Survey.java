
package week3_lecture;

import java.util.Scanner;

/**
 *Revision task
 * Write a Java program which would prompt the user to enter data of a personal details for a survey and print out the information into the console:
 * The program must have correct class declaration, main method and using Scanner for input
 * The data should include:
 * Name (as a String)
 * Surname (as a String)
 * Gender (as a char, M or F)

 * Print out the data in the output console

 * @author Anna29
 */
public class Survey {
    public static void main(String[] args) {
        
        String name;
        String surname;
        char gender;
        
        double weight;
        int age;
        boolean married;
        String numberOfDays;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter your name");
        name = sc.nextLine();
        
        System.out.println("Enter your surname");
        surname = sc.nextLine();
        
        System.out.println("Enter \'F\' if you are female and \'M\' if you are male");
        gender = sc.next().charAt(0);
        
        System.out.println("What is your idea weight");
        weight = sc.nextDouble();
        
        System.out.println("How old are you?");
        age = sc.nextInt();
        
        System.out.println("type true if you are married and false if not");
        married  = sc.nextBoolean();
        
        System.out.println("Enter number of days we can keep your data for");
        numberOfDays = sc.next();
        
        int numberOfDaysAsInt = Integer.parseInt(numberOfDays);
       
        
        System.out.println("The user personal details are: \nname : "+name+"\nsurname: "+surname+"\ngender: "+gender+"\nweight: "+weight+"\nage"+age+"\nit is:"+married+" that you are married\nwe can keep your data for: "+numberOfDaysAsInt);
     
        
        System.out.println("We will keep your data  for the number of days + one week"+numberOfDaysAsInt + 7);
        
    }
    
}
