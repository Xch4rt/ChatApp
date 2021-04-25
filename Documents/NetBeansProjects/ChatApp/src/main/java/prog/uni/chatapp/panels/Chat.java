/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.uni.chatapp.panels;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Pablo
 */
public class Chat extends javax.swing.JPanel {

    /**
     * Creates new form Chat
     */
    public Chat() {
        initComponents();
    }
    // txtfiel de user y txtTo no son editables porque le pasaremos los parametros que tengamos de las clases (NICK, IP)
    public JButton getBtnSend() {
        return btnSend;
    }
    

    public void setBtnSend(JButton btnSend) {
        this.btnSend = btnSend;
    }

    public JTextArea getTxtAreaMessages() {
        return txtAreaMessages;
    }

    public void setTxtAreaMessages(JTextArea txtAreaMessages) {
        this.txtAreaMessages = txtAreaMessages;
    }

    public JTextField getTxtMessage() {
        return txtMessage;
    }

    public void setTxtMessage(JTextField txtMessage) {
        this.txtMessage = txtMessage;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlTxtMessage = new javax.swing.JPanel();
        txtMessage = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        pnltop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMessages = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        pnlTxtMessage.setBackground(new java.awt.Color(153, 255, 255));
        pnlTxtMessage.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 27.0;
        gridBagConstraints.weighty = 15.0;
        gridBagConstraints.insets = new java.awt.Insets(14, 26, 14, 26);
        pnlTxtMessage.add(txtMessage, gridBagConstraints);

        btnSend.setText("Send");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 9);
        pnlTxtMessage.add(btnSend, gridBagConstraints);

        add(pnlTxtMessage, java.awt.BorderLayout.PAGE_END);

        pnltop.setBackground(new java.awt.Color(255, 255, 255));
        pnltop.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 31);
        pnltop.add(jLabel1, gridBagConstraints);

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Para:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 31);
        pnltop.add(jLabel2, gridBagConstraints);

        add(pnltop, java.awt.BorderLayout.PAGE_START);

        pnlCenter.setLayout(new java.awt.BorderLayout());

        txtAreaMessages.setEditable(false);
        txtAreaMessages.setColumns(20);
        txtAreaMessages.setRows(5);
        jScrollPane1.setViewportView(txtAreaMessages);

        pnlCenter.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(pnlCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlTxtMessage;
    private javax.swing.JPanel pnltop;
    private javax.swing.JTextArea txtAreaMessages;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
