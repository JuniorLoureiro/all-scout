package com.example.senac;

import com.example.senac.Model.Atletas;
import com.example.senac.Model.Pessoa;
import com.example.senac.View.LoginView;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;


public class App extends JFrame {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        // Inserindo uma nova pessoa no banco de dados
        entityManager.getTransaction().begin();
        Pessoa p1 = new Pessoa("Pedro");
        entityManager.persist(p1);
        entityManager.getTransaction().commit();
        // Fechando o EntityManager e o EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
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


    

