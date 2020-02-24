package week19_lecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TextIO {
    public static void main(String[] args) {
        /*
        Scanner class is used for purpose of reading data from many sources
        in this case the Scanner will read the data from a File object.
        */
        try{
        
            
            Scanner input = new Scanner(new File("myfile.txt"));
        
     
        /*
        A while loop that will repeat itself until there is a next line
        nextLine is used for purpose of reading an entire line out of the file
        */
        while (input.hasNext()) {
            System.out.println(input.nextLine());
        }
        
        }catch(IOException e){
                System.out.println(""+e.toString());
                }
    }
}