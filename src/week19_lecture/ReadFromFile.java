/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week19_lecture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anna29
 */
public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {        
        ArrayList <String> text = new ArrayList<String> ();
        
    try{
            File f = new File ("mytextfile.txt");
            Scanner sc = new Scanner (f);
           
           while (sc.hasNextLine()){
               String data = sc.nextLine();
               text.add(data);             
           }
        sc.close();
           
        }  catch(IOException e){
            System.out.println(""+e.toString());
        }
   
        for (int i = 0; i < text.size(); i++) {
            System.out.println(text.get(i));
                
        }
           
          
      
        
    }
    
}
