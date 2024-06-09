package com.example.senac.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlteraDadosUserView extends JPanel {

    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JLabel LabelAlterarDados;
    private javax.swing.JCheckBox NomeCompletoCheckBox;
    private javax.swing.JTextField NomeCompletoTextField;
    private javax.swing.JPanel PanelAlterarDados;
    private javax.swing.JCheckBox SenhaCheckBox;
    private javax.swing.JTextField SenhaTextField;
    private javax.swing.JCheckBox UsernameCheckBox;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;

    public AlteraDadosUserView() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelAlterarDados = new javax.swing.JPanel();
        LabelAlterarDados = new javax.swing.JLabel();
        NomeCompletoCheckBox = new javax.swing.JCheckBox();
        UsernameTextField = new javax.swing.JTextField();
        SenhaTextField = new javax.swing.JTextField();
        NomeCompletoTextField = new javax.swing.JTextField();
        UsernameCheckBox = new javax.swing.JCheckBox();
        SenhaCheckBox = new javax.swing.JCheckBox();
        BotaoSalvar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(2, 31, 57));
        setPreferredSize(new java.awt.Dimension(600, 600));

        PanelAlterarDados.setBackground(new java.awt.Color(2, 31, 57));

        LabelAlterarDados.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        LabelAlterarDados.setForeground(new java.awt.Color(0, 110, 255));
        LabelAlterarDados.setText("ALTERAR DADOS");

        NomeCompletoCheckBox.setBackground(new java.awt.Color(2, 31, 57));
        NomeCompletoCheckBox.setForeground(new java.awt.Color(0, 110, 255));
        NomeCompletoCheckBox.setAlignmentY(0.0F);
        NomeCompletoCheckBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 1, true));
        NomeCompletoCheckBox.setBorderPaintedFlat(true);
        NomeCompletoCheckBox.setContentAreaFilled(false);
        NomeCompletoCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NomeCompletoCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NomeCompletoCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NomeCompletoCheckBox.setMaximumSize(new java.awt.Dimension(30, 30));
        NomeCompletoCheckBox.setMinimumSize(new java.awt.Dimension(30, 30));
        NomeCompletoCheckBox.setPreferredSize(new java.awt.Dimension(30, 30));
        NomeCompletoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCompletoCheckBoxActionPerformed(evt);
            }
        });

        UsernameTextField.setBackground(new java.awt.Color(2, 31, 57));
        UsernameTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        UsernameTextField.setForeground(new java.awt.Color(0, 110, 255));
        UsernameTextField.setText("Username");
        UsernameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 1, true));
        UsernameTextField.setEnabled(false); // Inicialmente desativado
        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        SenhaTextField.setBackground(new java.awt.Color(2, 31, 57));
        SenhaTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        SenhaTextField.setForeground(new java.awt.Color(0, 110, 255));
        SenhaTextField.setText("Senha");
        SenhaTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 1, true));
        SenhaTextField.setEnabled(false); // Inicialmente desativado
        SenhaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaTextFieldActionPerformed(evt);
            }
        });

        NomeCompletoTextField.setBackground(new java.awt.Color(2, 31, 57));
        NomeCompletoTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        NomeCompletoTextField.setForeground(new java.awt.Color(0, 110, 255));
        NomeCompletoTextField.setText("Nome Completo");
        NomeCompletoTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 1, true));
        NomeCompletoTextField.setEnabled(false); // Inicialmente desativado
        NomeCompletoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCompletoTextFieldActionPerformed(evt);
            }
        });

        UsernameCheckBox.setBackground(new java.awt.Color(2, 31, 57));
        UsernameCheckBox.setForeground(new java.awt.Color(0, 110, 255));
        UsernameCheckBox.setAlignmentY(0.0F);
        UsernameCheckBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 1, true));
        UsernameCheckBox.setBorderPaintedFlat(true);
        UsernameCheckBox.setContentAreaFilled(false);
        UsernameCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsernameCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UsernameCheckBox.setMaximumSize(new java.awt.Dimension(30, 30));
        UsernameCheckBox.setMinimumSize(new java.awt.Dimension(30, 30));
        UsernameCheckBox.setPreferredSize(new java.awt.Dimension(30, 30));
        UsernameCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameCheckBoxActionPerformed(evt);
            }
        });

        SenhaCheckBox.setBackground(new java.awt.Color(2, 31, 57));
        SenhaCheckBox.setForeground(new java.awt.Color(0, 110, 255));
        SenhaCheckBox.setAlignmentY(0.0F);
        SenhaCheckBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 1, true));
        SenhaCheckBox.setBorderPaintedFlat(true);
        SenhaCheckBox.setContentAreaFilled(false);
        SenhaCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SenhaCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SenhaCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SenhaCheckBox.setMaximumSize(new java.awt.Dimension(30, 30));
        SenhaCheckBox.setMinimumSize(new java.awt.Dimension(30, 30));
        SenhaCheckBox.setPreferredSize(new java.awt.Dimension(30, 30));
        SenhaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaCheckBoxActionPerformed(evt);
            }
        });

        BotaoSalvar.setBackground(new java.awt.Color(0, 110, 255));
        BotaoSalvar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        BotaoSalvar.setForeground(new java.awt.Color(2, 31, 57));
        BotaoSalvar.setText("SALVAR");
        BotaoSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 1, true));

        javax.swing.GroupLayout PanelAlterarDadosLayout = new javax.swing.GroupLayout(PanelAlterarDados);
        PanelAlterarDados.setLayout(PanelAlterarDadosLayout);
        PanelAlterarDadosLayout.setHorizontalGroup(
            PanelAlterarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAlterarDadosLayout.createSequentialGroup()
                    .addContainerGap(150, Short.MAX_VALUE)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(UsernameCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NomeCompletoCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SenhaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAlterarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelAlterarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NomeCompletoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SenhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelAlterarDadosLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(LabelAlterarDados)))
                    .addGap(144, 144, 144))
        );
        PanelAlterarDadosLayout.setVerticalGroup(
            PanelAlterarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelAlterarDadosLayout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAlterarDadosLayout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(NomeCompletoCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UsernameCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(SenhaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAlterarDadosLayout.createSequentialGroup()
                            .addComponent(LabelAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(NomeCompletoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(SenhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelAlterarDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SenhaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void NomeCompletoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void NomeCompletoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        NomeCompletoTextField.setEnabled(NomeCompletoCheckBox.isSelected());
    }

    private void UsernameCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        UsernameTextField.setEnabled(UsernameCheckBox.isSelected());
    }

    private void SenhaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        SenhaTextField.setEnabled(SenhaCheckBox.isSelected());
    }
}
 