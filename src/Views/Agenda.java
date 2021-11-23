/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.AgendaController;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.bean.Agendamento;
import Model.bean.Cliente;
import Model.bean.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Ana
 */
public class Agenda extends javax.swing.JFrame {
Conexao conecta = new Conexao();
     Connection con = Conexao.getConnection();
     PreparedStatement stmt = null;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        setTitle("Salão de Beleza - Agenda");
        Connection con = Conexao.getConnection();
        ClienteDAO dao = new ClienteDAO(con);
        ServicoDAO sdao = new ServicoDAO(con);
        ServicoDAO cdao = new ServicoDAO(con);
        
        for(Cliente a: dao.read()){
            CaixaNome.addItem(a);
        }
        for(Servico s: sdao.read()){
            CaixaServico.addItem(s);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoVisualizaAgenda = new javax.swing.JButton();
        CaixaNome = new javax.swing.JComboBox<>();
        CaixaData = new javax.swing.JFormattedTextField();
        CaixaServico = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CaixaHora = new javax.swing.JTextField();
        CaixaValor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 71, -1, -1));

        jLabel2.setText("Valor R$");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 151, -1, -1));

        jLabel3.setText("Serviço");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 111, -1, -1));

        jLabel4.setText("Horário");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 198, 53, -1));

        jLabel5.setText("Data");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 236, 47, -1));

        BotaoCadastrar.setBackground(new java.awt.Color(255, 51, 51));
        BotaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCadastrar.setText("Agendar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        BotaoVisualizaAgenda.setBackground(new java.awt.Color(255, 51, 51));
        BotaoVisualizaAgenda.setForeground(new java.awt.Color(255, 255, 255));
        BotaoVisualizaAgenda.setText("Ver Agendamentos");
        BotaoVisualizaAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVisualizaAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoVisualizaAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        CaixaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaNomeActionPerformed(evt);
            }
        });
        getContentPane().add(CaixaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 67, 226, -1));
        getContentPane().add(CaixaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 233, 227, -1));

        getContentPane().add(CaixaServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 107, 226, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Agenda");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 27, -1, -1));
        getContentPane().add(CaixaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 195, 227, -1));

        CaixaValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10,00", "15,00", "20,00", "80,00", "90,00", "140,00" }));
        CaixaValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaValorActionPerformed(evt);
            }
        });
        getContentPane().add(CaixaValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 147, 226, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\HDD\\Desktop\\unnamed.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
       Object nome_cliente =  CaixaNome.getSelectedItem();
       Object nome_servico =  CaixaServico.getSelectedItem();
       Object valor = CaixaValor.getSelectedItem();
       String data = CaixaData.getText();
       String hora = CaixaHora.getText();
        
        Agendamento agendamento = new Agendamento();
        
        Connection con = Conexao.getConnection();
        AgendamentoDAO agendamentoDao = new AgendamentoDAO(con);
        
        agendamento.setCliente(CaixaNome.getSelectedItem());
        agendamento.setServico(CaixaServico.getSelectedItem());       
        agendamento.setValor(CaixaValor.getSelectedItem());  
        agendamento.setData(CaixaData.getText()); 
        agendamento.setHora(CaixaHora.getText()); 
        agendamentoDao.create(agendamento);
        
        CaixaNome.setSelectedItem("");
        CaixaServico.setSelectedItem("");
        CaixaValor.setSelectedItem("");
        CaixaData.setText("");
        CaixaHora.setText("");
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void CaixaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaNomeActionPerformed

    private void CaixaValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaValorActionPerformed

    private void BotaoVisualizaAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVisualizaAgendaActionPerformed
        // TODO add your handling code here:
        VisualizaAgendamentos visuAgenda = new VisualizaAgendamentos();
        visuAgenda.setVisible(true);
    }//GEN-LAST:event_BotaoVisualizaAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoVisualizaAgenda;
    private javax.swing.JFormattedTextField CaixaData;
    private javax.swing.JTextField CaixaHora;
    private javax.swing.JComboBox<Object> CaixaNome;
    private javax.swing.JComboBox<Object> CaixaServico;
    private javax.swing.JComboBox<Object> CaixaValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    
}
