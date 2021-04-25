/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.chatapp.panels.controllers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import prog.uni.chatapp.panels.Chat;
//import javafx.event.ActionEvent;
import prog.uni.chatapp.panels.Login;
import prog.uni.chatapp.pojo.Cliente;
import prog.uni.chatapp.views.ChatApp;

/**
 *
 * @author Pablo
 */
public class LoginController {
    private Login login;
    private Cliente cliente;
    private ChatApp chatfr;
    private Chat chat;
    private ChatController chatController;
    
    public LoginController(Login login) {
        this.login = login;
        initComponents();
    }
    
    private void initComponents()
    {
        // Agregar actionlistener a los botones
        login.getBtnAccept().addActionListener(((e)->
        {
            try {
                btnAcceptActionListener(e);
            } catch (UnknownHostException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
    }
    
    private void btnAcceptActionListener(ActionEvent e) throws UnknownHostException
    {
        String nick = login.getTxtUser().getText();
        InetAddress IP_recept = InetAddress.getByName(login.getTxtIP().getText());
        InetAddress IP = InetAddress.getLocalHost();
        
        cliente = new Cliente(nick, IP_recept, IP);
        System.out.println(cliente.toString());
        
        //;
        chatfr = new ChatApp();
        chatfr.flag((nick == null && IP_recept == null)); //Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
        System.out.println(chatfr.equals(null));
        System.out.println(flag((nick == null && IP_recept == null)));
    }
    

    public boolean flag(boolean f)
    {
        return f;
    }
    
}
