package week20_lecture;
/*
Author: Matthew Bulat
*/
import java.io.*;
import java.net.*;

/**
 *
 * @author Matthew
 */
class TCPClient {

    static TextProtocol textProt;

    public static void main(String argv[]) throws IOException, ClassNotFoundException {
        System.out.println("Client ready!");
        /*
        BufferedReader used for purpose of collecting inputs from a user
        */
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        /*
        boolean variable used for terminating the program
        */
        boolean endLoop = true;
        /*
        Socket used for establishing TCP session with a server
        */
        Socket clientSocket = new Socket("localhost", 6789);
        /*
        ObjectOutputStream and ObjectInputStream used for sending and receving 
        objects from and to a server
        */
        ObjectOutputStream outStream = new ObjectOutputStream(clientSocket.getOutputStream());
        ObjectInputStream inStream = new ObjectInputStream(clientSocket.getInputStream());
        
        while (endLoop) {
            /*
            list of instructions
            */
            System.out.println("\nEnter instruction for server: \n"
                    + "saveMessage to save message to a file \n"
                    + "readFile to read file from server \n"
                    + "closeConnection to terminate connection with server.");
            /*
            String variable used for purpose of string the instruction for a server
            */
            String action = inFromUser.readLine();
            /*
            Switch statement used for purpose of interpreting the server instructions,
            it will perform a different action depending on instruction selected.
            This program will use TextProtocol class to contain the instruction to a server
            as well as the text data in case of saveMessage instruction
            */
            switch (action) {
                case "saveMessage":
                    System.out.println("Enter message: ");
                    String message = inFromUser.readLine();
                    textProt = new TextProtocol(action, message);
                    outStream.writeObject(textProt);
                    textProt = (TextProtocol) inStream.readObject();
                    System.out.println(textProt.getHeader());
                    break;
                case "readFile":
                    textProt = new TextProtocol(action);
                    outStream.writeObject(textProt);
                    textProt = (TextProtocol) inStream.readObject();
                    for (String line : textProt.getStringArray()) {
                        System.out.println(line);
                    }
                    break;
                case "closeConnection":
                    textProt = new TextProtocol(action);
                    outStream.writeObject(textProt);
                    endLoop = false;
                    break;
            }
        }
        clientSocket.close();
    }
}