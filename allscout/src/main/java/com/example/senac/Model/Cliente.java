package com.example.senac.Model;

public class Cliente extends Usuario{

    private String identificacao;

    public Cliente(String nome, String senha, String nomeUsuario, String identificacao) {
        super(nome, senha, nomeUsuario);
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    

    
    
}
