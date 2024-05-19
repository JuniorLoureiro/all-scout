package com.example.senac.View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.example.senac.Controller.ContatoController;
import java.awt.*;

public class ContatoView extends JPanel {

    private JTextField nomeContatoField;
    private JTextField numTelefoneField;
    private JTextField emailField;
    private ContatoController controller;
    private CadastroUserView cadastroUserView;
    private JButton cadastraContato;
    


    public ContatoView(ContatoController controller,CadastroUserView cadastroUserView) {
        this.controller = controller;
        this.cadastroUserView = cadastroUserView;
        initUI();
    }

    private void initUI(){

        JButton cadastraContato;
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(400, 400));
        Border padding = BorderFactory.createLineBorder(Color.BLACK,550);
          setBorder(padding);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 0, 5, 0);

        Color corTextField = new Color (0,110,255);

        nomeContatoField = new JTextField(20);
        nomeContatoField.setBackground(Color.BLACK);
        nomeContatoField.setForeground(corTextField);
        nomeContatoField.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        nomeContatoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        numTelefoneField = new JTextField(20);
        numTelefoneField.setBackground(Color.BLACK);
        numTelefoneField.setForeground(corTextField);
        numTelefoneField.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        numTelefoneField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        emailField = new JTextField(20);
        emailField.setBackground(Color.BLACK);
        emailField.setForeground(corTextField);
        emailField.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        emailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        cadastraContato = new JButton("CADASTRAR CONTATO");
        Color corBotaoCadastrar = new Color (0,110,255);
        cadastraContato.setBackground(corBotaoCadastrar);
        cadastraContato.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        cadastraContato.setForeground(Color.BLACK);     
        cadastraContato.setPreferredSize(new Dimension(200, 50));
        cadastraContato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastraContato();
            }
        });
        JLabel labelContato = new JLabel();
        labelContato.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        labelContato.setForeground(corBotaoCadastrar);
        labelContato.setText("NOME DO CONTATO: ");

        JLabel labelTelefone = new JLabel();
        labelTelefone.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        labelTelefone.setForeground(corBotaoCadastrar);
        labelTelefone.setText("TELEFONE: ");

        JLabel labelEmail = new JLabel();
        labelEmail.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        labelEmail.setForeground(corBotaoCadastrar);
        labelEmail.setText("E-MAIL: ");

        add(labelContato, gbc);
        add(nomeContatoField, gbc);
        add(labelTelefone, gbc);
        add(numTelefoneField, gbc);
        add(labelEmail, gbc);
        add(emailField, gbc);
        add(cadastraContato, gbc); //botao
    }

    protected void cadastraContato(){
        String nomeContato = nomeContatoField.getText();
        String numTelefone = numTelefoneField.getText();
        String email = emailField.getText();

        if (nomeContato.isEmpty() || numTelefone.isEmpty() || email.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return; 
        }
        else{
            controller.criarContato(nomeContato,numTelefone, email);
            cadastroUserView.addContatoToComboBox(nomeContato,numTelefone,email);
            JOptionPane.showMessageDialog(this, "Contato adicionado com Sucesso!");

            //LIMPA OS METODOS APOS O CADASTRO
            nomeContatoField.setText("");
            numTelefoneField.setText("");
            emailField.setText("");
        }
    }
}
