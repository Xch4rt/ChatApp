/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.chatapp.panels.controllers;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import prog.uni.chatapp.panels.Chat;
import prog.uni.chatapp.panels.IFChat;
import prog.uni.chatapp.pojo.Cliente;
import prog.uni.chatapp.server.Server;

/**
 *
 * @author Pablo
 */
public class ChatController implements Runnable, PropertyChangeListener{
    private Chat chatpnl;
    private Cliente cliente;
    private IFChat inChat;
    private Server server;
    private String nick, recept;
    

    public ChatController() {}
    
    
    public ChatController(Chat chatpnl) 
    {    
        initComponents();
        inChat = new IFChat();
        server = new Server(9999);
        server.addPChangeListener(this);
        Thread t = new Thread(server);
        t.start();
    }
    
    private void initComponents() 
    {
        System.out.println("estamos en el init");
        
        chatpnl.getBtnSend().addActionListener((e)->
        {
            try {
                SendEventActionListener(e);
            } catch (IOException ex) {
                Logger.getLogger(ChatController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread miHilo = new Thread(this);
        miHilo.start();
    }
    
    private void SendEventActionListener(ActionEvent e) throws IOException
    {
        Socket mySocket = new Socket(cliente.getIP().toString(), 9999);
        
        Cliente dataClient = new Cliente();
        dataClient.setNick(cliente.getNick());
        dataClient.setIP(cliente.getIP());
        dataClient.setMsg(chatpnl.getTxtMessage().getText());
        
        ObjectOutputStream packageD = new ObjectOutputStream(mySocket.getOutputStream());
        packageD.writeObject(dataClient);
        
        mySocket.close();
    }

    @Override
    public void run() {
        try {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            ServerSocket serverClient = new ServerSocket(9090);
            Socket cliente;
            Cliente clienteR;
            
            while (true)
            {
                cliente = serverClient.accept();
                
                ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());
                
                clienteR = (Cliente) flujoEntrada.readObject();
                
                chatpnl.getTxtAreaMessages().append("\n"+clienteR+": "+clienteR.getMsg()+" ");
            }
        } catch (IOException ex) {
            Logger.getLogger(ChatController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ChatController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        chatpnl.getTxtAreaMessages().append((String) evt.getNewValue());
    }
}
