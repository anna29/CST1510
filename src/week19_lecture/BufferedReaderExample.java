package week19_lecture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {
        String line;
        /*
        BufferedReader encapsulates the FileReader which will perform the file operations
        This example also shows the try-catch with resources
        therefore there is no need to use the close method
        the try-catch with resources will perform the closing operations
        */
        try {
            File f = new File("myfile.txt");
            FileReader fr = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(fr);
        
            /*
            The while loop will continue on reading the data until it reaches a 
            line that doesn't contain any files and will return null value
            */
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println(""+e.toString());  
        }
    }
}