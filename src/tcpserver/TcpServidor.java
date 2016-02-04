/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver;

import com.sun.net.httpserver.HttpServer;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PROPESPINFO
 */
public class TcpServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here 
        HttpServer servidorHttp = HttpServer.create(new InetSocketAddress(36874),0);
        ServerSocket socketServidor = new ServerSocket(36874);//Max port = 65535
        String resposta = "";               
        while(true){
//            socketServidor.setSoTimeout(10000);
            System.out.println(socketServidor.getSoTimeout());
            Socket cliente = socketServidor.accept();                        
            BufferedReader entradaCliente = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            System.out.println(resposta);
        }
    }
    
}
