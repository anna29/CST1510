/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14_lecture_ArrayList;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
      
        
        
        ArrayList <Integer> numbers = new ArrayList<Integer>(); //creating a list of Integers
        
        
        
        ArrayList <String> words = new ArrayList<String>();//creating a list of String
        
        
        
        ArrayList <Object> object = new ArrayList<Object>();//creating a list of Objects
        
        
        
        
        
        
        
        numbers.add(100);           //adding a new element to the end of the list
        numbers.add(1, 120);        // adding a new element at the specific index space      
    //    System.out.println(numbers.contains(10));
        numbers.get(0);             //return the element from this list at the specific index
        numbers.size();             // return the number of elements in this list
        numbers.remove(1);
        numbers.clear();            //removes all elements from the list
      
        numbers.add(11);
        numbers.add(12);
        
        
        String [] names = {"Anna", "Olga", "Renata", "Katarina"};        
        ArrayList <String > names1 = new ArrayList <String>(Arrays.asList(names));
        
        
        /* Sorting in asscending order*/
        Collections.sort(names1);
        for(String s : names1){
            System.out.println(s);
        }
        
        /* Sorting in decreasing order*/	
        Collections.sort(names1, Collections.reverseOrder());
       
        for(String s : names1){
            System.out.println(s);
        }
        
        System.out.println("Max: "+Collections.max(names1));
        System.out.println("Min: "+Collections.min(names1));
        
        Collections.shuffle(names1);
        
       
    }
    
    
}
