package week20_lecture;
/*
Author: Matthew Bulat
*/
import java.io.*;
import java.net.*;

public class SimpleUDPExampleClient {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException{
        /*
        try-catch with resources is used to create a datagram socket
        it will be used for purpose of sending and receving packets 
        */
        try (DatagramSocket clientSocket = new DatagramSocket()) {
                
            while (true) {
                /*
                byte arrays used for sending and receiving data in a raw format
                */
                byte[] sendData = new byte[1024];
                byte[] receiveData = new byte[1024];
                /*
                BufferReader used to collect an input from a user
                */
                BufferedReader inFromUser
                        = new BufferedReader(new InputStreamReader(System.in));
                /*
                ip address of a server's location
                */
                InetAddress IPAddress = InetAddress.getByName("localhost");
                /*
                reading data from a user and converting it to a byte array
                */
                String sentence = inFromUser.readLine();
                sendData = sentence.getBytes();
                /*
                creating a datagram packet that should be send to a server,
                it contains the data array, the size of the array, 
                ip address of the server and a port number
                */
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
                clientSocket.send(sendPacket);
                /*
                Datagram Packet created for purpose of data received from a server
                */
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                clientSocket.receive(receivePacket);
                /*
                converting the byte array into a String
                */
                String modifiedSentence = new String(receivePacket.getData());
                /*
                printing the sentence to a console
                */
                System.out.println("FROM SERVER:" + modifiedSentence);
            }
        }
    }
}
