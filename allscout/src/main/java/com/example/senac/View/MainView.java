package com.example.senac.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JPanel {
    private JPanel sidePanel;
    private JPanel panelView;
    private JButton botaoConfig;
    private JButton botaoPerfil;
    private JButton botaoPesquisa;
    private JButton botaoSair;
    private JLabel logoLabel;

    public MainView() {
        initComponents();
    }

    private void initComponents() {
        // Configurações do painel principal
        setBackground(new Color(2, 31, 57));
        setForeground(new Color(2, 31, 57));
        setPreferredSize(new Dimension(800, 600));
        setLayout(new BorderLayout());

        // Painel lateral
        sidePanel = new JPanel();
        sidePanel.setBackground(new Color(0, 0, 0));
        sidePanel.setForeground(new Color(0, 110, 255));
        sidePanel.setPreferredSize(new Dimension(200, 600));

        logoLabel = new JLabel();
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/com/example/senac/View/LogoMenu.png")));

        botaoPesquisa = criarBotao("PESQUISA");
        botaoPesquisa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });

        botaoPerfil = criarBotao("PERFIL");
        botaoPerfil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoPerfilActionPerformed(evt);
            }
        });

        botaoConfig = criarBotao("CONFIGURAÇÃO");
        botaoConfig.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoConfigActionPerformed(evt);
            }
        });

        botaoSair = criarBotao("SAIR");
        botaoSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoConfig, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        // Painel de conteúdo
        panelView = new JPanel();
        panelView.setBackground(new Color(2, 31, 57));
        panelView.setPreferredSize(new Dimension(600, 600));
        panelView.setLayout(new BorderLayout());

        // Adicionando os painéis ao painel principal
        add(sidePanel, BorderLayout.WEST);
        add(panelView, BorderLayout.CENTER);
    }

    private JButton criarBotao(String texto) {
        JButton botao = new JButton();
        botao.setBackground(new Color(0, 0, 0));
        botao.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        botao.setForeground(new Color(0, 110, 255));
        botao.setText(texto);
        botao.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 3, true));
        return botao;
    }

    private void botaoPesquisaActionPerformed(ActionEvent evt) {
        setContent("Pesquisa");
    }

    private void botaoPerfilActionPerformed(ActionEvent evt) {
        AlteraDadosUserView alteraDadosUserView = new AlteraDadosUserView();
        setContentPanel(alteraDadosUserView);
        /* 
        JFrame AlteraDadosUserFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        AlteraDadosUserView alteraDadosUserView = new AlteraDadosUserView();
        AlteraDadosUserFrame.setContentPane(alteraDadosUserView);
        AlteraDadosUserFrame.revalidate();

        */

        /*private void showUsuario() {
        UsuarioController controller = new UsuarioController();
        setContentPanel(new UsuarioView(controller));
    } */
        
        
    }

    private void botaoConfigActionPerformed(ActionEvent evt) {
        setContent("Configuração");
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Main View");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);
                frame.add(new MainView());
                frame.setVisible(true);
            }
        });
    }
}
