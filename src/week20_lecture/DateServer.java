/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week20_lecture;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author Anna29
 */
public class DateServer {
    private static final int PORT = 9090;
    
    public static void main(String[] args) throws IOException {        
        ServerSocket  listiner = new ServerSocket(PORT);
        System.out.println("Server is waiting for client connection");
        Socket client = listiner.accept();
        System.out.println("server Connect to client");
        PrintWriter out = new PrintWriter (client.getOutputStream(), true);
        out.println(new Date ().toString());
        System.out.println("Send data .Closing ");
        
        client.close();
        listiner.close();
    }
    
}
