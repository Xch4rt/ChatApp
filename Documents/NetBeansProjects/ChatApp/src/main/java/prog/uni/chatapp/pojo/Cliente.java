/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.chatapp.pojo;

import java.net.InetAddress;

/**
 *
 * @author Pablo
 */
/*
    Clase cliente contiene: nick( Nombre de quien enviara el msj)
                            IP_recep que es la ip a quien se la enviara (Si se ejecuta en local)
                            IP es un objeto InetAddress para acceder a la IP del usuario que enviara el msj
                            msg que es el mensaje que enviara el cliente A al cliente B
*/
public class Cliente {
    private String Nick;
    private InetAddress IP_recep;
    private InetAddress IP;
    private String msg;
    public Cliente() {}

    public Cliente(String Nick, InetAddress IP_recep, InetAddress IP) {
        this.Nick = Nick;
        this.IP_recep = IP_recep;
        this.IP = IP; 
    }
    
    public Cliente(String Nick, InetAddress IP_recep, InetAddress IP, String msg) {
        this.Nick = Nick;
        this.IP_recep = IP_recep;
        this.IP = IP;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public String getNick() {
        return Nick;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public InetAddress getIP_recep() {
        return IP_recep;
    }

    public void setIP_recep(InetAddress IP_recep) {
        this.IP_recep = IP_recep;
    }

    public InetAddress getIP() {
        return IP;
    }

    public void setIP(InetAddress IP) {
        this.IP = IP;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nick=" + Nick + ", IP_recep=" + IP_recep + ", IP=" + IP + '}';
    }
    
    
    
    
}
