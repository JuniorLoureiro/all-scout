package com.example.senac.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdmMainView extends JPanel{
    private javax.swing.JButton botaoAddAtleta;
    private javax.swing.JButton botaoAgcAtleta;
    private javax.swing.JButton botaoAgcUsuario;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelModerador;
    private javax.swing.JLabel miniLogo;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel sidePanel;

    public AdmMainView() {
        initComponents();
    }

    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        botaoAddAtleta = new javax.swing.JButton();
        botaoAgcAtleta = new javax.swing.JButton();
        botaoAgcUsuario = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        labelMenu = new javax.swing.JLabel();
        labelModerador = new javax.swing.JLabel();
        miniLogo = new javax.swing.JLabel();
        panelView = new javax.swing.JPanel();

        setBackground(new java.awt.Color(2, 31, 57));
        setForeground(new java.awt.Color(2, 31, 57));
        setPreferredSize(new java.awt.Dimension(800, 600));

        sidePanel.setBackground(new java.awt.Color(0, 0, 0));
        sidePanel.setForeground(new java.awt.Color(0, 110, 255));
        sidePanel.setPreferredSize(new java.awt.Dimension(230, 600));

        botaoAddAtleta.setBackground(new java.awt.Color(0, 0, 0));
        botaoAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        botaoAddAtleta.setForeground(new java.awt.Color(0, 110, 255));
        botaoAddAtleta.setText("ADICIONAR ATLETA");
        botaoAddAtleta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));
        botaoAddAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddAtletaActionPerformed(evt);
            }
        });

        botaoAgcAtleta.setBackground(new java.awt.Color(0, 0, 0));
        botaoAgcAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        botaoAgcAtleta.setForeground(new java.awt.Color(0, 110, 255));
        botaoAgcAtleta.setText("GERENCIAR ATLETA");
        botaoAgcAtleta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));
        botaoAgcAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgcAtletaActionPerformed(evt);
            }
        });

        botaoAgcUsuario.setBackground(new java.awt.Color(0, 0, 0));
        botaoAgcUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        botaoAgcUsuario.setForeground(new java.awt.Color(0, 110, 255));
        botaoAgcUsuario.setText("GERENCIAR USUÁRIO");
        botaoAgcUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));
        botaoAgcUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgcUsuarioActionPerformed(evt);
            }
        });

        botaoSair.setBackground(new java.awt.Color(0, 0, 0));
        botaoSair.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(0, 110, 255));
        botaoSair.setText("DESCONECTAR");
        botaoSair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        labelMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        labelMenu.setForeground(new java.awt.Color(0, 110, 255));
        labelMenu.setText("MENU");

        labelModerador.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        labelModerador.setForeground(new java.awt.Color(0, 110, 255));
        labelModerador.setText("MODERADOR");

        miniLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/example/senac/View/miniLogo.png")));

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoAddAtleta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoAgcAtleta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoAgcUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(botaoSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelModerador)
                            .addComponent(labelMenu))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(miniLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(labelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelModerador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(botaoAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAgcAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAgcUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(miniLogo)
                .addContainerGap())
        );

        panelView.setBackground(new java.awt.Color(2, 31, 57));
        panelView.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(panelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void botaoAddAtletaActionPerformed(ActionEvent evt) {
        // Implementação do evento do botão "ADICIONAR ATLETA"
    }

    private void botaoAgcAtletaActionPerformed(ActionEvent evt) {
        // Implementação do evento do botão "GERENCIAR ATLETA"
    }

    private void botaoAgcUsuarioActionPerformed(ActionEvent evt) {
        // Implementação do evento do botão "GERENCIAR USUÁRIO"
    }

    private void botaoSairActionPerformed(ActionEvent evt) {
        JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        LoginView loginView = new LoginView();
        loginFrame.setContentPane(loginView);
        loginFrame.revalidate();
        JOptionPane.showMessageDialog(loginFrame, "Desconectado com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    private void setContent(String content) {
        panelView.removeAll();
        panelView.add(new JLabel(content), BorderLayout.CENTER);
        panelView.revalidate();
        panelView.repaint();
    }

    private void setContentPanel(JPanel panel) {
        panelView.removeAll();
        panelView.add(panel, BorderLayout.CENTER);
        panelView.revalidate();
        panelView.repaint();
    }
}
