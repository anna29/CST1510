/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week20_lecture;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Anna29
 */
public class Server {
    private Socket socket;
    private ServerSocket server;
    private DataInputStream in;
    
    
    public Server(int port){
        try{
            server = new ServerSocket (port);
            System.out.println("Server started");
            
            System.out.println("Waiting for a client ...");
            
            socket = server.accept();
            System.out.println("Client accepted");
            
            
            //takes input from  the client socket
            in = new DataInputStream(new BufferedInputStream (socket.getInputStream()));
            
            
            String line = "";
            
            while(!line.equals("Over")){
                line = in.readUTF();
                System.out.println(line);
            }
            
        }catch(IOException e){
            System.out.println(e.toString());
        }
    }
    
    public static void main(String[] args) {
        Server s = new Server (8000);
    }
}
