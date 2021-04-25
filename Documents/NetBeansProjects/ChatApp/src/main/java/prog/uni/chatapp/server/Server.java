/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.chatapp.server;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.DataInputStream;
import java.io.IOException;
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
    private String msg;
    private int port;
    private PropertyChangeSupport pcs; //https://docs.oracle.com/javase/tutorial/uiswing/events/propertychangelistener.html
    /*
        Principal motivo de uso de clase es por el textfield o los dialogs
    */
    
    
    public void addPChangeListener(PropertyChangeListener a)
    {
        pcs.addPropertyChangeListener(a);
    }
    public void removePChangeListener(PropertyChangeListener a)
    {
        pcs.removePropertyChangeListener(a);
    }

    public Server(int port) {
        this.port = port;
        pcs = new PropertyChangeSupport(this);
    }
    
    @Override
    public void run() {
        DataInputStream dis;
        Socket mySocket;
        try {
            ServerSocket myServer = new ServerSocket(9999); // Espero que no tengan el puerto 9999 ocupado xd
            while (true)
            {
                mySocket = myServer.accept(); // Aceptamos las entradas de datos
                
                dis = new DataInputStream(mySocket.getInputStream());
                String msh = dis.readUTF();
                pcs.firePropertyChange("Msg:", msg, msh);
                
                
                
                
                mySocket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
}
