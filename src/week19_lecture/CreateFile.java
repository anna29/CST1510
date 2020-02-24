/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week19_lecture;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        
        try{
   
           File f = new File ("mytextfile.txt");
           if(f.createNewFile()){
               System.out.println("file created");
           }else{
               System.out.println("file already exists");
           }
            
        }catch (IOException e){
               System.out.println("file not found");
        }
        
        
        
        
    }
    
}
