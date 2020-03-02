package week20_lecture;
/*
Author: Matthew Bulat
*/
import java.io.IOException;
import java.net.*;

public class SimpleUDPExampleServer {

    public static void main(String[] args) throws SocketException, IOException{
        /*
        Datagram socket is used as an entry point for any datagram packets
        the parameter number is the port number that this Socket is going to be
        open on. 
        */
        DatagramSocket serverSocket = new DatagramSocket(9876);
        while (true) {
            /*
            byte arrays used for purpose of storing the raw byte data
            */
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
            /*
            DatagramPacket used for purpose of receiving the data sent by the client
            */
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            /*
            The raw byte array being translated over to String variable.
            */
            String sentence = new String(receivePacket.getData());
            System.out.println("RECEIVED: " + sentence);
            /*
            InetAddress is used to store the IP address of the machine that sent 
            the packet
            */
            InetAddress IPAddress = receivePacket.getAddress();
            /*
            port is used to store the port number on which the data was received.
            */
            int port = receivePacket.getPort();
            /*
            Capitalizing the sentence received from client
            */
            String capitalizedSentence = sentence.toUpperCase();
            /*
            Converting string into byte array 
            */
            sendData = capitalizedSentence.getBytes();
            /*
            Creating a DatagramPacket to be send back to a client
            */
            DatagramPacket sendPacket
                    = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            /*
            using a socket to send a packet client
            */
            serverSocket.send(sendPacket);
        }
    }
}
