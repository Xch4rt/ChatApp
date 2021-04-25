/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.chatapp.panels.controllers;

import javax.swing.JTextField;
import prog.uni.chatapp.panels.Chat;
import prog.uni.chatapp.pojo.Cliente;

/**
 *
 * @author Pablo
 */
public class ChatController {
    private Chat chatpnl;
    private Cliente cliente;
    private String nick, recept;
    
    private JTextField a;
    public ChatController() {}
    
    
    public ChatController(Chat chatpnl) {
        this.chatpnl = chatpnl;
        initComponents();
    }
    
    private void initComponents()
    {
        nick = cliente.getNick();
        recept = cliente.getIP_recep().toString();
        a = new JTextField();
        a.setText(recept);
        chatpnl.setName(nick);
        chatpnl.setTxtTo(a);
        
    }
}
