package week19_lecture;

import java.io.*;

public class TestObjectOutputStream {

    public static void main(String[] args) throws IOException {
        
        File f = new File ("object.dat");
        f.createNewFile();
        try (
                ObjectOutputStream output
                = new ObjectOutputStream(
                        new FileOutputStream("object.dat"))) {
            Sandwich sandwich = new Sandwich("White","Edam");
            output.writeObject(sandwich);
        }
    }
}