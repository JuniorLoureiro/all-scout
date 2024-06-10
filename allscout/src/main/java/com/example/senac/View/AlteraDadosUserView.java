package com.example.senac.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.senac.Model.Usuario;
import com.example.senac.Controller.UsuarioController;

public class AlteraDadosUserView extends JPanel {

    private JButton BotaoSalvar;
    private JLabel LabelAlterarDados;
    private JCheckBox NomeCompletoCheckBox;
    private JTextField NomeCompletoTextField;
    private JPanel PanelAlterarDados;
    private JCheckBox SenhaCheckBox;
    private JTextField SenhaTextField;
    private JCheckBox UsernameCheckBox;
    private JTextField UsernameTextField;
    private JLabel jLabel1;

    private Usuario usuario; // Adicionado para armazenar o usuário atual
    private UsuarioController controller;

    public AlteraDadosUserView(Usuario usuario, UsuarioController controller) {
        this.usuario = usuario;
        this.controller = controller;
        initComponents();
        loadUserData();
    }

    private void initComponents() {
        jLabel1 = new JLabel();
        PanelAlterarDados = new JPanel();
        LabelAlterarDados = new JLabel();
        NomeCompletoCheckBox = new JCheckBox();
        UsernameTextField = new JTextField();
        SenhaTextField = new JTextField();
        NomeCompletoTextField = new JTextField();
        UsernameCheckBox = new JCheckBox();
        SenhaCheckBox = new JCheckBox();
        BotaoSalvar = new JButton();

        jLabel1.setText("jLabel1");

        setBackground(new Color(2, 31, 57));
        setPreferredSize(new Dimension(600, 600));

        PanelAlterarDados.setBackground(new Color(2, 31, 57));

        LabelAlterarDados.setFont(new Font("Segoe UI Black", 0, 48)); // NOI18N
        LabelAlterarDados.setForeground(new Color(0, 110, 255));
        LabelAlterarDados.setText("ALTERAR DADOS");

        NomeCompletoCheckBox.setBackground(new Color(2, 31, 57));
        NomeCompletoCheckBox.setForeground(new Color(0, 110, 255));
        NomeCompletoCheckBox.setAlignmentY(0.0F);
        NomeCompletoCheckBox.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        NomeCompletoCheckBox.setBorderPaintedFlat(true);
        NomeCompletoCheckBox.setContentAreaFilled(false);
        NomeCompletoCheckBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        NomeCompletoCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        NomeCompletoCheckBox.setHorizontalTextPosition(SwingConstants.CENTER);
        NomeCompletoCheckBox.setMaximumSize(new Dimension(30, 30));
        NomeCompletoCheckBox.setMinimumSize(new Dimension(30, 30));
        NomeCompletoCheckBox.setPreferredSize(new Dimension(30, 30));
        NomeCompletoCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NomeCompletoCheckBoxActionPerformed(evt);
            }
        });

        UsernameTextField.setBackground(new Color(2, 31, 57));
        UsernameTextField.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        UsernameTextField.setForeground(new Color(0, 110, 255));
        UsernameTextField.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        UsernameTextField.setEnabled(false); // Inicialmente desativado
        UsernameTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        SenhaTextField.setBackground(new Color(2, 31, 57));
        SenhaTextField.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        SenhaTextField.setForeground(new Color(0, 110, 255));
        SenhaTextField.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        SenhaTextField.setEnabled(false); // Inicialmente desativado
        SenhaTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SenhaTextFieldActionPerformed(evt);
            }
        });

        NomeCompletoTextField.setBackground(new Color(2, 31, 57));
        NomeCompletoTextField.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        NomeCompletoTextField.setForeground(new Color(0, 110, 255));
        NomeCompletoTextField.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        NomeCompletoTextField.setEnabled(false); // Inicialmente desativado
        NomeCompletoTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NomeCompletoTextFieldActionPerformed(evt);
            }
        });

        UsernameCheckBox.setBackground(new Color(2, 31, 57));
        UsernameCheckBox.setForeground(new Color(0, 110, 255));
        UsernameCheckBox.setAlignmentY(0.0F);
        UsernameCheckBox.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        UsernameCheckBox.setBorderPaintedFlat(true);
        UsernameCheckBox.setContentAreaFilled(false);
        UsernameCheckBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        UsernameCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        UsernameCheckBox.setHorizontalTextPosition(SwingConstants.CENTER);
        UsernameCheckBox.setMaximumSize(new Dimension(30, 30));
        UsernameCheckBox.setMinimumSize(new Dimension(30, 30));
        UsernameCheckBox.setPreferredSize(new Dimension(30, 30));
        UsernameCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UsernameCheckBoxActionPerformed(evt);
            }
        });

        SenhaCheckBox.setBackground(new Color(2, 31, 57));
        SenhaCheckBox.setForeground(new Color(0, 110, 255));
        SenhaCheckBox.setAlignmentY(0.0F);
        SenhaCheckBox.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        SenhaCheckBox.setBorderPaintedFlat(true);
        SenhaCheckBox.setContentAreaFilled(false);
        SenhaCheckBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SenhaCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        SenhaCheckBox.setHorizontalTextPosition(SwingConstants.CENTER);
        SenhaCheckBox.setMaximumSize(new Dimension(30, 30));
        SenhaCheckBox.setMinimumSize(new Dimension(30, 30));
        SenhaCheckBox.setPreferredSize(new Dimension(30, 30));
        SenhaCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SenhaCheckBoxActionPerformed(evt);
            }
        });

        BotaoSalvar.setBackground(new Color(0, 110, 255));
        BotaoSalvar.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        BotaoSalvar.setForeground(new Color(2, 31, 57));
        BotaoSalvar.setText("SALVAR");
        BotaoSalvar.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        BotaoSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                salvarAlteracoes();
            }
        });

        GroupLayout PanelAlterarDadosLayout = new GroupLayout(PanelAlterarDados);
        PanelAlterarDados.setLayout(PanelAlterarDadosLayout);
        PanelAlterarDadosLayout.setHorizontalGroup(
            PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, PanelAlterarDadosLayout.createSequentialGroup()
                    .addContainerGap(150, Short.MAX_VALUE)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(UsernameCheckBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(NomeCompletoCheckBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(SenhaCheckBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoSalvar, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(NomeCompletoTextField, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
                                .addComponent(UsernameTextField, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(SenhaTextField, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE))
                    .addGap(54, 54, 54))
                .addGroup(PanelAlterarDadosLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(LabelAlterarDados)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAlterarDadosLayout.setVerticalGroup(
            PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(PanelAlterarDadosLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(LabelAlterarDados)
                    .addGap(65, 65, 65)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(NomeCompletoTextField, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(NomeCompletoCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(48, 48, 48)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(UsernameTextField, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(UsernameCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(48, 48, 48)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(SenhaTextField, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(SenhaCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(53, 53, 53)
                    .addComponent(BotaoSalvar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(PanelAlterarDados, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelAlterarDados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
    }

    private void NomeCompletoCheckBoxActionPerformed(ActionEvent evt) {
        NomeCompletoTextField.setEnabled(NomeCompletoCheckBox.isSelected());
    }

    private void UsernameTextFieldActionPerformed(ActionEvent evt) {
    }

    private void SenhaTextFieldActionPerformed(ActionEvent evt) {
    }

    private void NomeCompletoTextFieldActionPerformed(ActionEvent evt) {
    }

    private void UsernameCheckBoxActionPerformed(ActionEvent evt) {
        UsernameTextField.setEnabled(UsernameCheckBox.isSelected());
    }

    private void SenhaCheckBoxActionPerformed(ActionEvent evt) {
        SenhaTextField.setEnabled(SenhaCheckBox.isSelected());
    }

    private void salvarAlteracoes() {
        String novoNomeCompleto = NomeCompletoTextField.getText();
        String novoUsername = UsernameTextField.getText();
        String novaSenha = SenhaTextField.getText();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        if (NomeCompletoCheckBox.isSelected() && !novoNomeCompleto.isEmpty()) {
            usuario.setNome(novoNomeCompleto);
        }

        if (UsernameCheckBox.isSelected() && !novoUsername.isEmpty()) {
            usuario.setNomeUsuario(novoUsername);
        }

        if (SenhaCheckBox.isSelected() && !novaSenha.isEmpty()) {
            usuario.setSenha(novaSenha); // Considere hash de senha em produção
        }

        entityManager.merge(usuario);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        JOptionPane.showMessageDialog(this, "Dados do usuário atualizados com sucesso.");
    }

    private void loadUserData() {
        NomeCompletoTextField.setText(usuario.getNome());
        UsernameTextField.setText(usuario.getNomeUsuario());
    }
}
