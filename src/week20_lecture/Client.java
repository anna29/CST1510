/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week20_lecture;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Anna29
 */
public class Client {
    private Socket socket;
    private DataInputStream input ;
    private DataOutputStream output ;
    
    public Client (String address, int port) {
        try{
            // to  establish connection
            socket = new Socket(address, port);
            System.out.println("Connected!");
            
            //takes input from terminal
            input = new DataInputStream(System.in);
            
            //send output to the socket
            output = new DataOutputStream(socket.getOutputStream());
        
        }catch(IOException e){
            System.out.println(e.toString());
        }
 
    //string to read message from input tab
   String line = " ";
    
    while (!line.equals("Over")){
        try{
            // line = input.readUTF();  
            line = input.readLine();
            output.writeUTF(line);
        }catch(UnknownHostException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
       
    }
    
    
    try{
        input.close();
        output.close();
        socket.close();
        
    }catch(IOException e){
        System.out.println(e);
    }

    
       }
    
    
    
    public static void main(String[] args) {
        Client c = new Client ("192.168.0.10", 8000);
    }
}
