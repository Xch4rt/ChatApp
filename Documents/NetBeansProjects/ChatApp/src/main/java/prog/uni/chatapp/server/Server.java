/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.chatapp.server;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import prog.uni.chatapp.pojo.Cliente;
/**
 *
 * @author Pablo
 */

// EJECUTAR CADA VEZ QUE SE NECESITA PROBAR EL CLIENTE (cliente aun no sirve)
public class Server implements Runnable {
    private Cliente clienteServer;
    private String nick, msg, ip;
    @Override
    public void run() {
        try {
            ServerSocket myServer = new ServerSocket(9999); // Espero que no tengan el puerto 9999 ocupado xd
            while (true)
            {
                Socket mySocket = myServer.accept(); // Aceptamos las entradas de datos
                ObjectInputStream packageData = new ObjectInputStream(mySocket.getInputStream());
                
                clienteServer = (Cliente) packageData.readObject();
                
                nick = clienteServer.getNick();
                ip = clienteServer.getIP_recep().toString();
                msg = clienteServer.getMsg();
                
                System.out.println("\nDe: "+nick+" "+msg+"para: "+ip);
                
                mySocket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
