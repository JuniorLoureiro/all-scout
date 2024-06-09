package com.example.senac.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddAtletaView extends JPanel{

    private javax.swing.JPanel panelView;
    private javax.swing.JButton botaoAddAgenciador;
    private javax.swing.JButton botaoAddEstatistica;
    private javax.swing.JComboBox<String> comboBoxPernaD;
    private javax.swing.JComboBox<String> comboBoxPosicao;
    private javax.swing.JComboBox<String> comboBoxAgenciador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgenciador;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelClubeAtual;
    private javax.swing.JLabel labelClubeFormador;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelEstatistica;
    private javax.swing.JLabel labelFotoPerfil;
    private javax.swing.JLabel labelNomeAtl;
    private javax.swing.JLabel labelPernaD;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelPosicao;
    private javax.swing.JTextArea textAreaEstatistica;
    private javax.swing.JTextField textFieldAltura;
    private javax.swing.JTextField textFieldClubeAtual;
    private javax.swing.JTextField textFieldClubeFormador;
    private javax.swing.JTextField textFieldDataNasc;
    private javax.swing.JTextField textFieldNomeAtl;
    private javax.swing.JTextField textFieldPeso;

    public AddAtletaView() {
        initComponents();
    }
    private void initComponents() {

        panelView = new javax.swing.JPanel();
        textFieldNomeAtl = new javax.swing.JTextField();
        labelFotoPerfil = new javax.swing.JLabel();
        labelNomeAtl = new javax.swing.JLabel();
        labelAgenciador = new javax.swing.JLabel();
        textFieldDataNasc = new javax.swing.JTextField();
        textFieldClubeFormador = new javax.swing.JTextField();
        labelDataNasc = new javax.swing.JLabel();
        labelClubeFormador = new javax.swing.JLabel();
        botaoAddEstatistica = new javax.swing.JButton();
        labelEstatistica = new javax.swing.JLabel();
        labelClubeAtual = new javax.swing.JLabel();
        textFieldClubeAtual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaEstatistica = new javax.swing.JTextArea();
        botaoAddAgenciador = new javax.swing.JButton();
        labelAltura = new javax.swing.JLabel();
        textFieldAltura = new javax.swing.JTextField();
        textFieldPeso = new javax.swing.JTextField();
        labelPeso = new javax.swing.JLabel();
        labelPosicao = new javax.swing.JLabel();
        comboBoxPosicao = new javax.swing.JComboBox<>();
        labelPernaD = new javax.swing.JLabel();
        comboBoxPernaD = new javax.swing.JComboBox<>();
        comboBoxAgenciador = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(2, 31, 57));
        setForeground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setVerifyInputWhenFocusTarget(false);

        panelView.setBackground(new java.awt.Color(2, 31, 57));
        panelView.setForeground(new java.awt.Color(2, 31, 57));
        panelView.setPreferredSize(new java.awt.Dimension(800, 600));

        textFieldNomeAtl.setBackground(new java.awt.Color(2, 31, 57));
        textFieldNomeAtl.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        textFieldNomeAtl.setForeground(new java.awt.Color(255, 255, 255));
        textFieldNomeAtl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldNomeAtl.setToolTipText("");
        textFieldNomeAtl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        labelFotoPerfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Junior\\Downloads\\fotoPefil.jpg")); // NOI18N
        labelFotoPerfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        labelNomeAtl.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelNomeAtl.setForeground(new java.awt.Color(255, 255, 255));
        labelNomeAtl.setText("NOME COMPLETO");

        labelAgenciador.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelAgenciador.setForeground(new java.awt.Color(255, 255, 255));
        labelAgenciador.setText("AGENCIADOR");

        textFieldDataNasc.setBackground(new java.awt.Color(2, 31, 57));
        textFieldDataNasc.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        textFieldDataNasc.setForeground(new java.awt.Color(255, 255, 255));
        textFieldDataNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldDataNasc.setToolTipText("");
        textFieldDataNasc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        textFieldClubeFormador.setBackground(new java.awt.Color(2, 31, 57));
        textFieldClubeFormador.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        textFieldClubeFormador.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClubeFormador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldClubeFormador.setToolTipText("");
        textFieldClubeFormador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        labelDataNasc.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelDataNasc.setForeground(new java.awt.Color(255, 255, 255));
        labelDataNasc.setText("DATA DE NASCIMENTO");

        labelClubeFormador.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelClubeFormador.setForeground(new java.awt.Color(255, 255, 255));
        labelClubeFormador.setText("CLUBE FORMADOR");

        botaoAddEstatistica.setBackground(new java.awt.Color(0, 110, 255));
        botaoAddEstatistica.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        botaoAddEstatistica.setForeground(new java.awt.Color(255, 255, 255));
        botaoAddEstatistica.setText("+");
        botaoAddEstatistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddEstatisticaActionPerformed(evt);
            }
        });

        labelEstatistica.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelEstatistica.setForeground(new java.awt.Color(255, 255, 255));
        labelEstatistica.setText("ESTATÍSTICAS");

        labelClubeAtual.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelClubeAtual.setForeground(new java.awt.Color(255, 255, 255));
        labelClubeAtual.setText("CLUBE ATUAL");

        textFieldClubeAtual.setBackground(new java.awt.Color(2, 31, 57));
        textFieldClubeAtual.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        textFieldClubeAtual.setForeground(new java.awt.Color(255, 255, 255));
        textFieldClubeAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldClubeAtual.setToolTipText("");
        textFieldClubeAtual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        textAreaEstatistica.setBackground(new java.awt.Color(2, 31, 57));
        textAreaEstatistica.setColumns(20);
        textAreaEstatistica.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        textAreaEstatistica.setForeground(new java.awt.Color(255, 255, 255));
        textAreaEstatistica.setRows(5);
        textAreaEstatistica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));
        jScrollPane1.setViewportView(textAreaEstatistica);

        botaoAddAgenciador.setBackground(new java.awt.Color(0, 110, 255));
        botaoAddAgenciador.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        botaoAddAgenciador.setForeground(new java.awt.Color(255, 255, 255));
        botaoAddAgenciador.setText("+");
        botaoAddAgenciador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddAgenciadorActionPerformed(evt);
            }
        });

        labelAltura.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelAltura.setForeground(new java.awt.Color(255, 255, 255));
        labelAltura.setText("ALTURA (CM)");

        textFieldAltura.setBackground(new java.awt.Color(2, 31, 57));
        textFieldAltura.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        textFieldAltura.setForeground(new java.awt.Color(255, 255, 255));
        textFieldAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldAltura.setToolTipText("");
        textFieldAltura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        textFieldPeso.setBackground(new java.awt.Color(2, 31, 57));
        textFieldPeso.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        textFieldPeso.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldPeso.setToolTipText("");
        textFieldPeso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        labelPeso.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelPeso.setForeground(new java.awt.Color(255, 255, 255));
        labelPeso.setText("PESO (KG)");

        labelPosicao.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelPosicao.setForeground(new java.awt.Color(255, 255, 255));
        labelPosicao.setText("POSIÇÃO");

        comboBoxPosicao.setBackground(new java.awt.Color(2, 31, 57));
        comboBoxPosicao.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxPosicao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        labelPernaD.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelPernaD.setForeground(new java.awt.Color(255, 255, 255));
        labelPernaD.setText("PERNA DOMINANTE");

        comboBoxPernaD.setBackground(new java.awt.Color(2, 31, 57));
        comboBoxPernaD.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxPernaD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        comboBoxAgenciador.setBackground(new java.awt.Color(2, 31, 57));
        comboBoxAgenciador.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxAgenciador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(labelFotoPerfil)
                                .addGap(18, 18, 18)
                                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelViewLayout.createSequentialGroup()
                                        .addComponent(labelNomeAtl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelDataNasc))
                                    .addGroup(panelViewLayout.createSequentialGroup()
                                        .addComponent(textFieldNomeAtl, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelViewLayout.createSequentialGroup()
                                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldClubeFormador, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelClubeFormador))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelClubeAtual)
                                            .addComponent(textFieldClubeAtual)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(botaoAddEstatistica, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelViewLayout.createSequentialGroup()
                                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelViewLayout.createSequentialGroup()
                                                .addComponent(comboBoxPernaD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(textFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                                                .addComponent(botaoAddAgenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboBoxAgenciador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(79, 79, 79))
                                    .addGroup(panelViewLayout.createSequentialGroup()
                                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelAgenciador)
                                            .addGroup(panelViewLayout.createSequentialGroup()
                                                .addComponent(labelPernaD)
                                                .addGap(124, 124, 124)
                                                .addComponent(labelPeso)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPosicao))
                        .addGap(18, 18, 18)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(textFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(labelAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelEstatistica)
                                .addGap(141, 141, 141))))))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNomeAtl)
                            .addComponent(labelDataNasc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldNomeAtl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelClubeFormador)
                            .addComponent(labelClubeAtual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldClubeFormador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldClubeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelFotoPerfil))
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPosicao)
                    .addComponent(labelEstatistica)
                    .addComponent(labelAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAddEstatistica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPernaD)
                            .addComponent(labelPeso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxPernaD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelAgenciador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoAddAgenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxAgenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }
    private void botaoAddAgenciadorActionPerformed(java.awt.event.ActionEvent evt) {

    }                                                  

    private void botaoAddEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {

    }
}
