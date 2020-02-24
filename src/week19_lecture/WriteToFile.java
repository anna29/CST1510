/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week19_lecture;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
           FileWriter writer = new FileWriter("mytextfile.txt"); 
           writer.write("Great poem");
           writer.close();
            System.out.println("Seccesfully wrote to the file");
        }catch(IOException e){
            System.out.println(""+e.toString());
        }
       
    }
    
}
