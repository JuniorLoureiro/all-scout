package com.example.senac.Model;

public class Moderador extends Usuario {

    private String permissoes;
    private boolean StatusAtividade;
    
    public Moderador(String nome, String senha, String nomeUsuario, String permissoes, boolean statusAtividade) {
        super(nome, senha, nomeUsuario);
        this.permissoes = permissoes;
        StatusAtividade = statusAtividade;
    }

    public String getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String permissoes) {
        this.permissoes = permissoes;
    }

    public boolean isStatusAtividade() {
        return StatusAtividade;
    }

    public void setStatusAtividade(boolean statusAtividade) {
        StatusAtividade = statusAtividade;
    }

    

    
}
