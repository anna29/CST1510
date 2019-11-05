
package week6_lecture;

/**
 *
 * Char methods and String methods
 * @author Anna29
 */
public class RevisionWeek2_2 {
    public static void main(String[] args) {
       
        //deceleration of three variables types of char and 
        char sizeS = 'A';
         
        //gives you true if the character is digit 
        System.out.println(Character.isDigit(sizeS));
       
        
        //gives you true if the character is a Letter 
        System.out.println(Character.isLetter(sizeS));
        
        //it is changing the character into a lower case
        System.out.println(Character.toLowerCase(sizeS));
        
        
       String s = "Hello world";
       
       //method which prints the number of characters in the string s 
        System.out.println(s.length());
        
        //methods which print the 1st character from the string
        System.out.println(s.charAt(0));
        
        //method which makes the string to be upper case
        System.out.println(s.toUpperCase());
        
        
    }
    
}
