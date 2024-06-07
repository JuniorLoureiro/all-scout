package com.example.senac.View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.example.senac.Controller.EnderecoController;
import java.awt.*;

public class EnderecoView extends JPanel {

    private JTextField nomeRuaField;
    private JTextField nomeCidadeField;
    private JTextField numeroRuaField;
    private JTextField cepField;
    private JTextField complementoField;
    private JTextField nomePaisField;
    private JTextField nomeEstadoField;
    private EnderecoController controller;
    private CadastroUserView cadastroUserView;
    private JButton cadastraEndereco;
    


    public EnderecoView(EnderecoController controller,CadastroUserView cadastroUserView) {
        this.controller = controller;
        this.cadastroUserView = cadastroUserView;
        initUI();
    }

    private void initUI(){

        JButton cadastraEndereco;
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(400, 400));
        Border padding = BorderFactory.createLineBorder(Color.BLACK,550);
          setBorder(padding);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 0, 5, 0);

        Color corTextField = new Color (0,110,255);

        nomeRuaField = new JTextField(20);
        nomeRuaField.setBackground(Color.BLACK);
        nomeRuaField.setForeground(corTextField);
        nomeRuaField.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        nomeRuaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        numeroRuaField = new JTextField(20);
        numeroRuaField.setBackground(Color.BLACK);
        numeroRuaField.setForeground(corTextField);
        numeroRuaField.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        numeroRuaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        complementoField = new JTextField(20);
        complementoField.setBackground(Color.BLACK);
        complementoField.setForeground(corTextField);
        complementoField.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        complementoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        nomeCidadeField = new JTextField(20);
        nomeCidadeField.setBackground(Color.BLACK);
        nomeCidadeField.setForeground(corTextField);
        nomeCidadeField.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        nomeCidadeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        nomeEstadoField = new JTextField(20);
        nomeEstadoField.setBackground(Color.BLACK);
        nomeEstadoField.setForeground(corTextField);
        nomeEstadoField.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        nomeEstadoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        nomePaisField = new JTextField(20);
        nomePaisField.setBackground(Color.BLACK);
        nomePaisField.setForeground(corTextField);
        nomePaisField.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        nomePaisField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        cepField = new JTextField(20);
        cepField.setBackground(Color.BLACK);
        cepField.setForeground(corTextField);
        cepField.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        cepField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));


        cadastraEndereco = new JButton("CADASTRAR ENDEREÇO");
        Color corBotaoCadastrar = new Color (0,110,255);
        cadastraEndereco.setBackground(corBotaoCadastrar);
        cadastraEndereco.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        cadastraEndereco.setForeground(Color.BLACK);     
        cadastraEndereco.setPreferredSize(new Dimension(200, 50));
        cadastraEndereco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastraEndereco();
            }
        });
        JLabel labelRua = new JLabel();
        labelRua.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        labelRua.setForeground(corBotaoCadastrar);
        labelRua.setText("LOGRADOURO: ");

        JLabel labelNumero = new JLabel();
        labelNumero.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        labelNumero.setForeground(corBotaoCadastrar);
        labelNumero.setText("NÚMERO: ");

        JLabel labelComplemento = new JLabel();
        labelComplemento.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        labelComplemento.setForeground(corBotaoCadastrar);
        labelComplemento.setText("COMPLEMENTO: ");

        JLabel labelCidade = new JLabel();
        labelCidade.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        labelCidade.setForeground(corBotaoCadastrar);
        labelCidade.setText("CIDADE: ");

        JLabel labelEstado = new JLabel();
        labelEstado.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        labelEstado.setForeground(corBotaoCadastrar);
        labelEstado.setText("ESTADO: ");

        JLabel labelPais = new JLabel();
        labelPais.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        labelPais.setForeground(corBotaoCadastrar);
        labelPais.setText("PAÍS: ");

        JLabel labelCep = new JLabel();
        labelCep.setFont(new java.awt.Font("Segoe UI Black", 1, 15));
        labelCep.setForeground(corBotaoCadastrar);
        labelCep.setText("CEP: ");

        add(labelRua, gbc);
        add(nomeRuaField, gbc);
        add(labelNumero, gbc);
        add(numeroRuaField, gbc);
        add(labelComplemento, gbc);
        add(complementoField, gbc);
        add(labelCidade, gbc);
        add(nomeCidadeField, gbc);
        add(labelEstado, gbc);
        add(nomeEstadoField, gbc);
        add(labelPais, gbc);
        add(nomePaisField, gbc);
        add(labelCep, gbc);
        add(cepField, gbc);
        add(cadastraEndereco, gbc); //botao
    }

    protected void cadastraEndereco(){
        String rua = nomeRuaField.getText();
        String numero = numeroRuaField.getText();
        String complemento = complementoField.getText();
        String cidade = nomeEstadoField.getText();
        String estado = nomeCidadeField.getText();
        String pais = nomePaisField.getText();
        String cep = cepField.getText();

        if (rua.isEmpty() || numero.isEmpty() || complemento.isEmpty()|| cidade.isEmpty()|| estado.isEmpty()|| pais.isEmpty()|| cep.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return; 
        }
        else{
            controller.criarEndereco(cep, cidade, estado, pais, rua, numero, complemento);
            cadastroUserView.addEnderecoToComboBox(rua,numero,complemento, estado, cidade,pais,cep);
            JOptionPane.showMessageDialog(this, "Endereço adicionado com Sucesso!");

            //LIMPA OS METODOS APOS O CADASTRO
            nomeRuaField.setText("");
            numeroRuaField.setText("");
            complementoField.setText("");
            nomeEstadoField.setText("");
            nomeCidadeField.setText("");
            nomePaisField.setText("");
            cepField.setText("");
        }
    }
}