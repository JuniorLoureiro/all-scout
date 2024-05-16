package com.example.senac;

import com.example.senac.View.LoginView;

import javax.swing.*;


public class App extends JFrame {
    public static void main(String[] args) {
        //SwingUtilities.invokeLater(() -> {
            App frame = new App();
            frame.setTitle("AllScout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new LoginView());
            frame.pack();
            frame.setLocationRelativeTo(null); // Centralizar a janela
            frame.setVisible(true);
        };
    }


    

