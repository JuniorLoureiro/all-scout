package com.example.senac.Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="moderadores")
public class Moderador extends Usuario {

    
    @Column(name= "ID_MODERADORES")
    private long id;

    @Column(name= "PERMISSOES")
    private String permissoes;

    @Column(name= "STATUS_ATIVIDADE")
    private boolean statusAtividade;

    public Moderador() {
        super();
    }

    public Moderador(String nome, String senha, String nomeUsuario, String permissoes, boolean statusAtividade) {
        super(nome, senha, nomeUsuario);
        this.permissoes = permissoes;
        this.statusAtividade = statusAtividade;
    }

    public String getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String permissoes) {
        this.permissoes = permissoes;
    }

    public boolean isStatusAtividade() {
        return statusAtividade;
    }

    public void setStatusAtividade(boolean statusAtividade) {
        this.statusAtividade = statusAtividade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}