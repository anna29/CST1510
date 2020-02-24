package week19_lecture;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) throws IOException {

    String str = "Hello world!";
    /*
    BufferedWriter encapsulates FileWriter which will handle the actual file 
    operations
    The false flag is used for purpose of choosing if the FileWriter should append 
    the file or overwrite the entire file
    true flag will append the file
    false flag will overwrite the file
    */
    BufferedWriter writer = new BufferedWriter( new FileWriter("myfile.txt",false));
    /*
    newLine method is used for purpose of creating a new line in a file
    write method is used for purpose of writing the string to a file
    close method is used for purpose of closing down the file
    */
    writer.newLine();
    writer.write(str);
    writer.close();
    }
}
