/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week20_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocket_ {
    
    public static void main(String[] args) throws IOException {
//1. The client initiates connection to a server specified by hostname/IP address and port number.
        System.out.println("Client ready!");
        Socket socket = new Socket("localhost", 9999);
        
//2. Send data to the server using an OutputStream.
        OutputStreamWriter os = new OutputStreamWriter (socket.getOutputStream());
        PrintWriter out = new PrintWriter (os);
        out.println("Hello world!");
        out.flush();
        
 //3. Read data from the server using an InputStream.       
        BufferedReader br = new BufferedReader (new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println("Server reply: "+ str);
        
   //4. Close the connection.
       socket.close();
    }   
}



        
        
        
       
