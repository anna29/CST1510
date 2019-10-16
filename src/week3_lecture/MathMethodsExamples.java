
package week3_lecture;

/**
 *
 * @author Anna29
 */
public class MathMethodsExamples {
    public static void main(String[] args) {
        
        System.out.println(Math.pow(5, 2)); //5 to the power of 2
        System.out.println(Math.min(45.23, 34)); //It is used to return the Smallest of two values.
        System.out.println(Math.max(67,33));//It returns the Largest of the two values.
        System.out.println(Math.PI); // return 3.141592653589793 exact value of PI 
        System.out.println(Math.sin(45)); //It is used to return the trigonometric Sine value of a Given double value.
        System.out.println(Math.cos(90)); //It is used to return the trigonometric Cosine value of a Given double value.
        System.out.println(Math.ceil(56.45)); //It is used to find the smallest integer value that is greater than or equal to the argument or mathematical integer.
        System.out.println(Math.floor(56.45)); //It is used to find the largest integer value which is less than or equal to the argument and is equal to the mathematical integer of a double value.
        
        System.out.println(Math.random());//It returns a double value greater than or equal to 0.0 and less than 1.0.
        System.out.println(1+ Math.random());//It returns a double value greater than or equal to 1.0 and less than 2.0.
        System.out.println(1+ Math.random() * 10);//It returns a double value greater than or equal to 1.0 and less than 11.0.
        System.out.println((int)(1+ Math.random() * 10));//It returns a int value greater than or equal to 1  and less or equale to 10
        

    }
    
}
