package week2_lecture;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna29
 */
public class StringMethodsExamples {
    public static void main(String[] args) {
        String title = " Introduction to Java Programming ";
        
        System.out.println("The numbers of characters in the title: "+title+" is: "+ title.length());
        System.out.println("The first letter in the title: "+title+" is: "+ title.length());
        System.out.println("The author of Java book : "+ title.concat(" is:  Y. Liang "));
        System.out.println("The title is: "+ title.toUpperCase());
        System.out.println("The title is: "+ title.toLowerCase());
        System.out.println("The title trimmed is: "+title.trim());
        
        
    }
    
}
