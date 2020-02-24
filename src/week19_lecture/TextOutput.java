package week19_lecture;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextOutput {    
    public static void main(String[] args) throws FileNotFoundException{
        /*
        PrintWriter is used fo purpose of writing to a file as a text
        the parameter is the location of the file where the data will be stored
        */
        PrintWriter output = new PrintWriter("myfile.txt");
        /*
        PrintWriter uses very similar methods to Scanner to write data
        println will write a token into a file and then produce a new line
        print will write a token into a file without of producing a new line
        printf will write a token into a file using a formula
        close method is used to release the resources used by the object
        the close method is not neccesary as newer version of Java include close via 
        try-catch. But for legacy purposes it is good idea to keep it there.
        */
        output.println("Hello World! with println");
        output.print("Hello World with print");
        output.printf("\nHello %s with %s","World","printf");        
        output.close();
    }   
}