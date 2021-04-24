/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.chatapp.panels.controllers;

import java.awt.event.ActionEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javafx.event.ActionEvent;
import prog.uni.chatapp.panels.Login;
import prog.uni.chatapp.pojo.Cliente;

/**
 *
 * @author Pablo
 */
public class LoginController {
    private Login login;
    private Cliente cliente;
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
    }
}
