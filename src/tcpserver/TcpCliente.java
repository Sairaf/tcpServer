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
        System.out.print("Digite a url (ou ip) do site servidor: ");
        BufferedReader entradaTexto = new BufferedReader(new InputStreamReader(System.in));
        try{
            String enderecoServidor = entradaTexto.readLine();
            Socket cliente = new Socket(enderecoServidor, 39674);                 
            System.out.print("Digite o texto a ser enviado para o servidor: ");
            String requisicao = entradaTexto.readLine();
            cliente.close();
        }catch(ConnectException cExc){
            System.out.println("Não foi possível contatar o servidor indicado");
        }catch(UnknownHostException uHE){
            System.out.println("OOps");
        }

    }
}
