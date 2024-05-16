package com.example.senac.Model;

import com.example.senac.Model.Pessoa;

public class Usuario extends Pessoa {

    private String senha;
    private String nomeUsuario;
    
    public Usuario(String nome, String senha, String nomeUsuario) {
        super(nome);
        this.senha = senha;
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    
    



}
