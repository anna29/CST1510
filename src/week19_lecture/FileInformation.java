/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week19_lecture;

import java.io.File;
import java.util.ArrayList;

public class FileInformation {
    public static void main(String[] args) {
          File f = new File ("mytextfile.txt");
          if(f.exists()){
              System.out.println("File name: "+ f.getName());
              System.out.println("Absolut path "+ f.getAbsolutePath());
              System.out.println("WriteTable: "+f.canWrite());
              System.out.println("Readable: "+f.canRead());
              System.out.println("File size in bytes: "+f.length());
          }else{
              System.out.println("file does not exists");
          }
    }
    
}
