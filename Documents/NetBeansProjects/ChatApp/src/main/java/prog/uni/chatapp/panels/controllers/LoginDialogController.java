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
import prog.uni.chatapp.panels.Chat;
import prog.uni.chatapp.panels.LoginDialog;
import prog.uni.chatapp.pojo.Cliente;
import prog.uni.chatapp.views.ChatApp;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Freddy.Machado
 */
public class LoginDialogController {
     private LoginDialog loginDialog;
    private Cliente cliente;
    private ChatApp chatfr;
    private Chat chat;
    private ChatController chatController;

    public LoginDialogController(LoginDialog loginDialog) {
        this.loginDialog = loginDialog;
        initComponent();
    }

    private void initComponent() {
       loginDialog.getBtnAccept().addActionListener((e) -> {
           try {
               btnAcceptActionListener(e);
           } catch (UnknownHostException ex) {
               Logger.getLogger(LoginDialogController.class.getName()).log(Level.SEVERE, null, ex);
           }
       });
    }

    private void btnAcceptActionListener(ActionEvent e) throws UnknownHostException {
        String nick = loginDialog.getTxtUsername().getText();
        InetAddress IP_recept = InetAddress.getByName(loginDialog.getTxtIp().getText());
        InetAddress IP = InetAddress.getLocalHost();
        
        cliente = new Cliente(nick, IP_recept, IP);
        System.out.println(cliente.toString());
        //;
        this.chatfr.flag(flag((nick == null && IP_recept == null) ? false:true)); //Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
    }
    

    public boolean flag(boolean f)
    {
        return f;
    }
    }
    
    

