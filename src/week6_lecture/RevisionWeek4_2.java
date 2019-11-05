
package week6_lecture;

import java.util.Scanner;

/**
 * menu for a restaurant 
 *  Anna29
 */
public class RevisionWeek4_2 {
    
    public static void main(String[] args) {
    
       Scanner sc = new Scanner (System.in);
       
        System.out.println("Enter;\n1-Breakfasts\n2-Lunches\n3-Dinners if -1 exit");
        int selection = sc.nextInt(); 
        
        while (true){
            
               switch(selection){
            case 1: System.out.println("Eggs and bacon");break;
                
            case 2: System.out.println("Salad with chicken");break;
                
            case 3: System.out.println("Lamb shank");break;
                
            default: System.out.println("Envalid selection"); 
        }
              System.out.println("Enter;\n1-Breakfasts\n2-Lunches\n3-Dinners if -1 exit");
               selection = sc.nextInt();  
               
               if(selection ==-1){
                   break;
               }
        }
        
     
    }
    
}
