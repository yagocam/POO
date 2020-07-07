/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.util.Arrays;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author yagoc
 */
public class TelaLogin extends javax.swing.JFrame {

    
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameCriacao = new javax.swing.JInternalFrame();
        jLabelNome = new javax.swing.JLabel();
        jLabelSenhaCriada = new javax.swing.JLabel();
        jTextFieldCadastroUsuario = new javax.swing.JTextField();
        jPasswordFieldCadastroSenha = new javax.swing.JPasswordField();
        jButtonCriar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelUsuário = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelLogoPrincipal = new javax.swing.JLabel();
        jLabelTelaFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameCriacao.setClosable(true);
        jInternalFrameCriacao.setIconifiable(true);
        jInternalFrameCriacao.setMaximizable(true);
        jInternalFrameCriacao.setResizable(true);
        jInternalFrameCriacao.setTitle("Tela de Cadastro");
        jInternalFrameCriacao.setVisible(true);
        jInternalFrameCriacao.getContentPane().setLayout(null);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNome.setText("Nome:");
        jInternalFrameCriacao.getContentPane().add(jLabelNome);
        jLabelNome.setBounds(250, 60, 70, 60);

        jLabelSenhaCriada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSenhaCriada.setText("Senha:");
        jInternalFrameCriacao.getContentPane().add(jLabelSenhaCriada);
        jLabelSenhaCriada.setBounds(250, 120, 80, 22);
        jInternalFrameCriacao.getContentPane().add(jTextFieldCadastroUsuario);
        jTextFieldCadastroUsuario.setBounds(320, 80, 150, 30);
        jInternalFrameCriacao.getContentPane().add(jPasswordFieldCadastroSenha);
        jPasswordFieldCadastroSenha.setBounds(320, 120, 150, 30);

        jButtonCriar.setText("Criar");
        jButtonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarActionPerformed(evt);
            }
        });
        jInternalFrameCriacao.getContentPane().add(jButtonCriar);
        jButtonCriar.setBounds(270, 170, 90, 32);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jInternalFrameCriacao.getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(380, 170, 110, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background-site.jpg"))); // NOI18N
        jInternalFrameCriacao.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 240);

        getContentPane().add(jInternalFrameCriacao);
        jInternalFrameCriacao.setBounds(0, 300, 800, 270);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(520, 300, 78, 32);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(610, 300, 77, 32);

        jLabelUsuário.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuário.setText("Usuário:");
        getContentPane().add(jLabelUsuário);
        jLabelUsuário.setBounds(490, 210, 70, 17);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(491, 240, 50, 20);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(550, 202, 140, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(550, 240, 140, 30);

        jLabelLogoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Principal.png"))); // NOI18N
        getContentPane().add(jLabelLogoPrincipal);
        jLabelLogoPrincipal.setBounds(-20, -50, 590, 580);

        jLabelTelaFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background-site.jpg"))); // NOI18N
        getContentPane().add(jLabelTelaFundoLogin);
        jLabelTelaFundoLogin.setBounds(0, 0, 790, 570);

        setSize(new java.awt.Dimension(808, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        if(jTextFieldUsuario.getText().equals(jTextFieldCadastroUsuario.getText()) && Arrays.equals(jPasswordFieldCadastroSenha.getPassword(), jPasswordField1.getPassword()))
        {
            TelaPrincipal telaprincipal = new TelaPrincipal();
            telaprincipal.setVisible(true);
            dispose();
        } 
    }//GEN-LAST:event_jButtonAcessarActionPerformed

        
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarActionPerformed
       Usuario usuario = new Usuario(jTextFieldCadastroUsuario.getText(),new String(jPasswordFieldCadastroSenha.getPassword()));
       jTextFieldCadastroUsuario.setText(jTextFieldCadastroUsuario.getText());
       jPasswordFieldCadastroSenha.setText (new String(jPasswordFieldCadastroSenha.getPassword()));
      jInternalFrameCriacao.setVisible(false);
    }//GEN-LAST:event_jButtonCriarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin telalogin = new TelaLogin();
               telalogin.setVisible(true);
               
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCriar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JInternalFrame jInternalFrameCriacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogoPrincipal;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSenhaCriada;
    private javax.swing.JLabel jLabelTelaFundoLogin;
    private javax.swing.JLabel jLabelUsuário;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordFieldCadastroSenha;
    private javax.swing.JTextField jTextFieldCadastroUsuario;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
