package week20_lecture;
/*
Author: Matthew Bulat
*/
import java.io.*;
import java.net.*;
import java.util.ArrayList;

/**
 *
 * @author Matthew
 */
class TCPServer {

    public static void main(String argv[]) throws IOException, ClassNotFoundException {
        
        System.out.println("Server Ready!");
        /*
        ServerSocket is used for purpose of waiting for a connection from a client
        */
        ServerSocket welcomeSocket = new ServerSocket(6789);

        while (true) {
            /*
            Once a connection from client is received, the server soocket will accept it
            which will result in creation of Socket object
            Socket obejct will be used for sending and receiving data for and to a server
            */
            Socket connectionSocket = welcomeSocket.accept();
            boolean closeConnection = true;
            /*
            ObjectInputStream and ObjectOutputStream used for sending and receiving 
            data from  and to a client
            */
            ObjectInputStream inStream = new ObjectInputStream(connectionSocket.getInputStream());
            ObjectOutputStream outStream = new ObjectOutputStream(connectionSocket.getOutputStream());

            while (closeConnection) {
                /*
                switch statement used for purpose of interpreting the instructions
                from a client, and performing action depending on the instructions
                */
                TextProtocol clientMessage = (TextProtocol) inStream.readObject();
                switch (clientMessage.getHeader()) {
                    case "saveMessage":
                        writeToFile(clientMessage.getMessage());
                        outStream.writeObject(new TextProtocol("textSaved"));
                        System.out.println("Message saved to a file");
                        break;
                    case "readFile":
                        ArrayList<String> fileData = readFromFile();
                        outStream.writeObject(new TextProtocol("textFile", fileData));
                        System.out.println("File read and sent to client.");
                        break;
                    case "closeConnection":
                        connectionSocket.close();
                        closeConnection = false;
                        break;
                }
            }
        }
    }

    public static void writeToFile(String textFromClient) throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("myfile.txt", true));
        writer.write(textFromClient + "\n");
        writer.close();
        System.out.println("Message " + textFromClient + " Saved!");
    }

    public static ArrayList<String> readFromFile() throws IOException {
        ArrayList<String> fileText = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader
                = new BufferedReader(
                        new FileReader("resources/myfile.txt"))) {
            while ((line = bufferedReader.readLine()) != null) {
                fileText.add(line);
            }
        }
        return fileText;
    }
}