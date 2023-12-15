/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.Cidadao;

import javax.swing.*;

/**
 * @author User
 */
public class TelaPrincipalUsuario extends javax.swing.JFrame {

    private Cidadao cidadao;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipalUsuario() {
        initComponents();
    }

    public TelaPrincipalUsuario(Cidadao cidadao) {
        this.cidadao = cidadao;
        initComponents();
    }

    public void setCidadao(Cidadao cidadao) {
        this.cidadao = cidadao;
    }

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
            java.util.logging.Logger.getLogger(TelaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalUsuario().setVisible(true);
            }
        });
    }

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profileButtonActionPerformed

    private void cadDenunciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadDenunciaButtonActionPerformed
        // TODO add your handling code here:
        TelaCadastrarDenuncias telacad = new TelaCadastrarDenuncias(this.cidadao);
        telacad.setVisible(true);
    }//GEN-LAST:event_cadDenunciaButtonActionPerformed

    private void conDenunciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conDenunciaButtonActionPerformed
        // TODO add your handling code here:
        TelaConsultarDenuncias telacon = new TelaConsultarDenuncias(this.cidadao);
        telacon.setVisible(true);
    }//GEN-LAST:event_conDenunciaButtonActionPerformed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonMouseClicked

    private void editProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileButtonActionPerformed
        // TODO add your handling code here:
        TelaPerfilU telaperfil = new TelaPerfilU(this.cidadao);
        telaperfil.setVisible(true);
        System.out.println("TESTE");
    }//GEN-LAST:event_editProfileButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TelaDeLogin telalogin = new TelaDeLogin();
    }//GEN-LAST:event_quitButtonActionPerformed

    private void denunciasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denunciasButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_denunciasButtonActionPerformed

    private void conAllDenunciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conAllDenunciasActionPerformed
        // TODO add your handling code here:
        TelaConsultarTodasDenuncias telaconAll = new TelaConsultarTodasDenuncias();
        telaconAll.setVisible(true);
    }//GEN-LAST:event_conAllDenunciasActionPerformed

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        denunciasButton = new javax.swing.JMenu();
        cadDenunciaButton = new javax.swing.JMenuItem();
        conDenunciaButton = new javax.swing.JMenuItem();
        conAllDenuncias = new javax.swing.JMenuItem();
        profileButton = new javax.swing.JMenu();
        editProfileButton = new javax.swing.JMenuItem();
        quitButton = new javax.swing.JMenuItem();
        exitButton = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Se liga, cidadão!");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Seja Bem-Vindo(a) ao Se liga, Cidadão!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Para utilizar as funções utilize os menus no canto superior esquerdo.");

        denunciasButton.setText("Denúncias");
        denunciasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denunciasButtonActionPerformed(evt);
            }
        });

        cadDenunciaButton.setText("Cadastrar Nova denúncia");
        cadDenunciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadDenunciaButtonActionPerformed(evt);
            }
        });
        denunciasButton.add(cadDenunciaButton);

        conDenunciaButton.setText("Consultar minhas denúncias");
        conDenunciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conDenunciaButtonActionPerformed(evt);
            }
        });
        denunciasButton.add(conDenunciaButton);

        conAllDenuncias.setText("Visualizar todas as denúncias");
        conAllDenuncias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conAllDenunciasActionPerformed(evt);
            }
        });
        denunciasButton.add(conAllDenuncias);

        jMenuBar1.add(denunciasButton);

        profileButton.setText("Meu Perfil");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        editProfileButton.setText("Editar meu perfil");
        editProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileButtonActionPerformed(evt);
            }
        });
        profileButton.add(editProfileButton);

        quitButton.setText("Desconectar");
        quitButton.setToolTipText("");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        profileButton.add(quitButton);

        jMenuBar1.add(profileButton);

        exitButton.setText("Sair");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitButton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(60, 60, 60)))
                                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadDenunciaButton;
    private javax.swing.JMenuItem conAllDenuncias;
    private javax.swing.JMenuItem conDenunciaButton;
    private javax.swing.JMenu denunciasButton;
    private javax.swing.JMenuItem editProfileButton;
    private javax.swing.JMenu exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu profileButton;
    private javax.swing.JMenuItem quitButton;
    // End of variables declaration//GEN-END:variables
}
