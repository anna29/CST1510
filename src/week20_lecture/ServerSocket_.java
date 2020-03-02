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
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket_ {
    public static void main(String[] args) throws IOException {
        System.out.println("Server Ready!");
    //1. Create a server socket and bind it to a specific port number
        ServerSocket ss = new ServerSocket(9999);
    // 2. Listen for a connection from the client and accept it. 
        System.out.println("Server is waiting for client request");
        Socket socket = ss.accept();
        System.out.println("Client connected");

    //3. Read data from the client via an InputStream obtained from the client socket.
        BufferedReader br = new BufferedReader (new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println("ClientData: "+str);    
        
    //4. Send data to the client via the client socket’s OutputStream.
        OutputStreamWriter os = new OutputStreamWriter (socket.getOutputStream());
        PrintWriter out = new PrintWriter (os);
        out.println("Hello from server!");
        out.flush();
     //   System.out.println("Data sent");
        
      //5. Close the connection with the client.
        
        ss.close();
    }
    
}


     
        

      