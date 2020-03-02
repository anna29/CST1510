/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week20_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Anna29
 */
public class DateClient {
      private static final String SERVER_IP = "127.0.0.1";
      private static final int SERVER_PORT = 9090;
      
    public static void main(String[] args) throws IOException{
      
        
        Socket socket = new Socket(SERVER_IP, SERVER_PORT);
        BufferedReader input = new BufferedReader (new InputStreamReader(socket.getInputStream()));
        
        String serverRespons = input.readLine();
        
        System.out.println(serverRespons);
     
        socket.close();
    }
}
