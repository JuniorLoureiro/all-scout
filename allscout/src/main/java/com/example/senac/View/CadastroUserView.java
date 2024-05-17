package com.example.senac.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUserView extends javax.swing.JPanel {

    public CadastroUserView() {
        panelCadastro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void panelCadastro() {

        jPanel1 = new javax.swing.JPanel();
        textFieldUsername = new javax.swing.JTextField();
        labelTituloCadastro = new javax.swing.JLabel();
        textFieldNomeCompleto = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        textFieldSenha = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        botaoCadastraEndereco = new javax.swing.JButton();
        botaoCadastraContato = new javax.swing.JButton();
        labelUsername = new javax.swing.JLabel();
        comboBoxEndereco = new javax.swing.JComboBox<>();
        comboBoxContato = new javax.swing.JComboBox<>();
        labelNomeCompleto = new javax.swing.JLabel();
        logoAllScout = new javax.swing.JLabel();

        setBackground(new java.awt.Color(2, 31, 57));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 110, 255)));

        textFieldUsername.setBackground(new java.awt.Color(0, 0, 0));
        textFieldUsername.setForeground(new java.awt.Color(0, 110, 255));
        textFieldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        labelTituloCadastro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTituloCadastro.setForeground(new java.awt.Color(0, 110, 255));
        labelTituloCadastro.setText("CADASTRO DE USUÁRIO");

        textFieldNomeCompleto.setBackground(new java.awt.Color(0, 0, 0));
        textFieldNomeCompleto.setForeground(new java.awt.Color(0, 110, 255));
        textFieldNomeCompleto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        botaoCadastrar.setBackground(new java.awt.Color(0, 110, 255));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastrar.setText("CADASTRAR");

        textFieldSenha.setBackground(new java.awt.Color(0, 0, 0));
        textFieldSenha.setForeground(new java.awt.Color(0, 110, 255));
        textFieldSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(0, 110, 255));
        labelSenha.setText("SENHA");

        botaoCadastraEndereco.setBackground(new java.awt.Color(0, 110, 255));
        botaoCadastraEndereco.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        botaoCadastraEndereco.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastraEndereco.setText("CADASTRAR ENDEREÇO");
        botaoCadastraEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraEnderecoActionPerformed(evt);
            }
        });

        botaoCadastraContato.setBackground(new java.awt.Color(0, 110, 255));
        botaoCadastraContato.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        botaoCadastraContato.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastraContato.setText("CADASTRAR CONTATO");
        botaoCadastraContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraContatoActionPerformed(evt);
            }
        });

        labelUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(0, 110, 255));
        labelUsername.setText("USERNAME");

        comboBoxEndereco.setBackground(new java.awt.Color(0, 0, 0));
        comboBoxEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboBoxEndereco.setForeground(new java.awt.Color(0, 110, 255));
        comboBoxEndereco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        comboBoxContato.setBackground(new java.awt.Color(0, 0, 0));
        comboBoxContato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboBoxContato.setForeground(new java.awt.Color(0, 110, 255));
        comboBoxContato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxContato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        labelNomeCompleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeCompleto.setForeground(new java.awt.Color(0, 110, 255));
        labelNomeCompleto.setText("NOME COMPLETO ");

        logoAllScout.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textFieldUsername, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textFieldNomeCompleto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(logoAllScout, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCadastraEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoCadastraContato, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxContato, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloCadastro)
                    .addComponent(logoAllScout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labelNomeCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastraEndereco)
                    .addComponent(botaoCadastraContato))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxContato, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void botaoCadastraEnderecoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void botaoCadastraContatoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JButton botaoCadastraContato;
    private javax.swing.JButton botaoCadastraEndereco;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JComboBox<String> comboBoxContato;
    private javax.swing.JComboBox<String> comboBoxEndereco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNomeCompleto;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTituloCadastro;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel logoAllScout;
    private javax.swing.JTextField textFieldNomeCompleto;
    private javax.swing.JTextField textFieldSenha;
    private javax.swing.JTextField textFieldUsername;
    // End of variables declaration
}