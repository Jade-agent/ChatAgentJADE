/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agentechat;

import jade.gui.GuiAgent;
import jade.gui.GuiEvent;

/**
 *
 * @author miller.barrera
 */
public class ChatRoom extends javax.swing.JFrame {
    
    private GuiAgent owner;
    public final int SENT_TYPE = 0;

    /**
     * Creates new form chatRoom
     * @param guiAgent
     */
    public ChatRoom(GuiAgent guiAgent) {
        initComponents();
       
        this.owner = guiAgent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgentDestiny = new javax.swing.JLabel();
        lblReceivedMessages = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taReceivedMessages = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblMessageToSend = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taMessageToSend = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        comboAgente = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblAgentDestiny.setText("Agente destino:");
        getContentPane().add(lblAgentDestiny);
        lblAgentDestiny.setBounds(10, 11, 90, 14);

        lblReceivedMessages.setText("Mensajes recibidos:");
        getContentPane().add(lblReceivedMessages);
        lblReceivedMessages.setBounds(10, 60, 110, 14);

        taReceivedMessages.setColumns(20);
        taReceivedMessages.setRows(5);
        jScrollPane1.setViewportView(taReceivedMessages);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 350, 110);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 40, 0, 2);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 50, 360, 2);

        lblMessageToSend.setText("Mensaje a enviar:");
        getContentPane().add(lblMessageToSend);
        lblMessageToSend.setBounds(10, 210, 100, 14);

        taMessageToSend.setColumns(20);
        taMessageToSend.setRows(5);
        jScrollPane2.setViewportView(taMessageToSend);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 230, 350, 30);

        btnSend.setText("Enviar");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnSend);
        btnSend.setBounds(10, 290, 63, 23);

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(220, 290, 65, 23);

        comboAgente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione agente:", "miller@192.168.7.98:1099/JADE", "karen@192.168.7.98:1099/JADE", " " }));
        getContentPane().add(comboAgente);
        comboAgente.setBounds(100, 10, 270, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        System.out.println("Mensaje enviado!");
        
        GuiEvent ge = new GuiEvent(this, SENT_TYPE);
        ge.addParameter(comboAgente.getSelectedItem());
        ge.addParameter(taMessageToSend.getText());
        
        owner.postGuiEvent(ge);
        taMessageToSend.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        System.out.println("Mensaje borrados!");
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox comboAgente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAgentDestiny;
    private javax.swing.JLabel lblMessageToSend;
    private javax.swing.JLabel lblReceivedMessages;
    private javax.swing.JTextArea taMessageToSend;
    public javax.swing.JTextArea taReceivedMessages;
    // End of variables declaration//GEN-END:variables
}
