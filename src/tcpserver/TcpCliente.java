/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver;
import java.io.*;
import java.net.*;
/**
 *
 * @author PROPESPINFO
 */
public class TcpCliente {
    public static void main(String[] args) throws IOException {
        Socket cliente = new Socket(InetAddress.getByName("Http://www.google.com"), 36874);
        BufferedReader envioUsuario = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bom dia");
    }
}
