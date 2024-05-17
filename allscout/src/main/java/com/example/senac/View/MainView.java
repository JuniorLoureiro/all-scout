package com.example.senac.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainView extends JPanel{
    private JPanel sidePanel;
    private JPanel contentPanel;

    public MainView() {
        
        setSize(800,600);
        
        
        setLayout(new BorderLayout());

        // Configuração do painel lateral (menu)
        sidePanel = createSidePanel();

        // Configuração do painel de conteúdo principal
        contentPanel = new JPanel();
        contentPanel.setBackground(new java.awt.Color(2, 31, 57));
        contentPanel.setLayout(new CardLayout()); // Permite a troca de conteúdo
        contentPanel.add(new JLabel("Bem-vindo! Selecione uma opção do menu.", SwingConstants.CENTER), "home");
        add(contentPanel, BorderLayout.CENTER);

        // Adiciona o painel lateral
        sidePanel.setPreferredSize(new Dimension(200, 600));
        add(sidePanel, BorderLayout.WEST);
        sidePanel.setVisible(true);
    }

    private JPanel createSidePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new java.awt.Color(0, 0, 0));

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Junior\\Documents\\Curso\\all-scout\\allscout\\src\\main\\java\\com\\example\\senac\\View\\Login.png");
        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel, BorderLayout.NORTH);
    
        JPanel buttonPanel = new JPanel(new GridLayout(0, 1)); // GridLayout com uma coluna e linhas indefinidas
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        buttonPanel.setBackground(Color.BLACK);
    
        addMenuItem(buttonPanel, "Perfil", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showContent();
            }
        });
        addMenuItem(buttonPanel, "", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showContent();
            }
        });
        addMenuItem(buttonPanel, "", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showContent();
            }
        });
        addMenuItem(buttonPanel, "Configurações", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showContent();
            }
        });
        addMenuItem(buttonPanel, "Sair da Conta", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showContent();
            }
        });
        
    
        panel.add(buttonPanel, BorderLayout.CENTER);
    
        return panel;
    }

    private void addMenuItem(JPanel panel, String name, final ActionListener actionListener) {
        JButton button = new JButton(name);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setBackground(new java.awt.Color(0, 0, 0));
        button.setForeground(new java.awt.Color(0, 110, 255));
        button.setSize(200,100);;
        button.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 110, 255)));
        button.setFont(new java.awt.Font("Segoe UI Black", 1, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionListener.actionPerformed(e);
            }
        });
        panel.add(button);
    }

    private void setContentPanel(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    // Métodos para mostrar diferentes conteúdos
    private void showContent() {
        setContent("Test");
    }

    private void setContent(String content) {
        contentPanel.removeAll();
        contentPanel.add(new JLabel(content), BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public JPanel getMainPanel() {
        return contentPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
}
