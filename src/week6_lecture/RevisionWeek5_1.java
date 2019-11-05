
package week6_lecture;

/**
 * swapping numbers
 * @author Anna29
 */
public class RevisionWeek5_1 {
    
    public static void main(String[] args) {
        
        int number1 = 10;
        int number2 = 15;
        int temp;
        
       // number1 = number2;  // cannot swap by doing this
        
        System.out.println("Initialy, number1 = "+number1 + " number2 "+number2);
        
        if (number1 < number2){
            
            temp = number1;
            number1 = number2;
            number2 = temp;
            
        }
        
        System.out.println("After swaping, number1 = "+number1 + " number2 "+number2);
        
        
        
    }
    
}
