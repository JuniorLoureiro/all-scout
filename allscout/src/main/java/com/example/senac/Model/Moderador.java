package com.example.senac.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "moderadores")
public class Moderador extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name= "ID_MODERADORES")
    private long id;

    @Column (name= "PERMISSOES")
    private String permissoes;

    @Column (name= "STATUS_ATIVIDADE")
    private boolean StatusAtividade;

    public Moderador() {
        
    }

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    

    
}
