/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.chatapp.panels.controllers;

import java.awt.event.ActionEvent;
import prog.uni.chatapp.panels.IFChat;
import prog.uni.chatapp.panels.LoginDialog;
import prog.uni.chatapp.views.ChatApp;

/**
 *
 * @author Pablo
 */
public class ChatAppController {
    private ChatApp chatApp;
    private IFChat ifChat;
    private LoginDialog loginD;
    private LoginController logC;
    
    private String nick; // le podria pasar por parametro un to string de la clase cliente getUser o desde el jtextfield con un get text pero de igual manera da error
    
    public String getNick()
    {
        return nick;// deberia de funcionar si acceso atraves de la clase cliente u obteniendo desde el jtextfield pero da error null
    }
    
    public ChatAppController(ChatApp chatApp) {
        this.chatApp = chatApp;
        initComponent();
    }
    
    public void initComponent()
    {
        chatApp.getMniLog().addActionListener((ActionEvent e)->
        {
            mniLogInActionPerfomed(e);
        }
        );
    }
    
    public void mniLogInActionPerfomed(ActionEvent e)
    {
        loginD = new LoginDialog(null, true);
        loginD.setVisible(true);
        
        ifChat = new IFChat();
        
        chatApp.getDkCont().add(ifChat);
        ifChat.setVisible(true);
    }
    
    
    
    
    
}
