/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.chatapp.views;

import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import prog.uni.chatapp.panels.Chat;
import prog.uni.chatapp.panels.IFChat;
import prog.uni.chatapp.panels.Login;
import prog.uni.chatapp.panels.LoginDialog;
import prog.uni.chatapp.panels.controllers.ChatAppController;
import prog.uni.chatapp.panels.controllers.ChatController;
import prog.uni.chatapp.panels.controllers.LoginController;


/**
 *
 * @author Pablo
 */
public class ChatApp extends javax.swing.JFrame {
    private Login pnlLogin;
    private LoginController loginController;
    
    private ChatApp chatfr;
    private Chat chat;
    
    private ChatController chatController;
    private LoginDialog loginDialog;
    
    private IFChat internalFCht;
    private ChatAppController chatControllerP;
    
    /**
     * Creates new form ChatApp
     */
    public ChatApp() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        chatControllerP = new ChatAppController(this);
    }
    
    
    public ChatAppController getChatApp()
    {
        return chatControllerP;
    }
    public JDesktopPane getDkCont() {
        return dkCont;
    }

    public void setDkCont(JDesktopPane dkCont) {
        this.dkCont = dkCont;
    }

    public JMenuItem getMniClose() {
        return mniClose;
    }

    public void setMniClose(JMenuItem mniClose) {
        this.mniClose = mniClose;
    }

    public JMenuItem getMniLog() {
        return mniLog;
    }

    public void setMniLog(JMenuItem mniLog) {
        this.mniLog = mniLog;
    }

    public JMenu getMnuOptions() {
        return mnuOptions;
    }

    public void setMnuOptions(JMenu mnuOptions) {
        this.mnuOptions = mnuOptions;
    }

    public ChatController getChatController() {
        return chatController;
    }
    
    
    
//    private void addPnlChat(boolean condition)
//    {
//        if (condition)
//        {
//            //chatfr.removeAll();
//            if (chat == null)
//            {
//                chat = new Chat();
//                chatController = new ChatController(chat);
//            }
//        }
//        System.out.println("TODO OK");
//
//    }
//    
//    public void flag(boolean f)
//    {
//        addPnlChat(f);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkCont = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuOptions = new javax.swing.JMenu();
        mniLog = new javax.swing.JMenuItem();
        mniClose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setSize(new java.awt.Dimension(317, 485));
        getContentPane().add(dkCont, java.awt.BorderLayout.CENTER);

        mnuOptions.setText("Options");

        mniLog.setText("Log in");
        mnuOptions.add(mniLog);

        mniClose.setText("Exit");
        mnuOptions.add(mniClose);

        jMenuBar1.add(mnuOptions);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    private void addComponent(JComponent component) {
//        pnlInfo.removeAll();
//        pnlInfo.add(component, BorderLayout.CENTER); // aqui da vacio
//        System.out.println(component.equals(null));
//        pnlInfo.repaint();
//        this.validate();
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkCont;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniClose;
    private javax.swing.JMenuItem mniLog;
    private javax.swing.JMenu mnuOptions;
    // End of variables declaration//GEN-END:variables
}
