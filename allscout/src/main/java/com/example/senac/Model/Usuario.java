package com.example.senac.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.senac.Model.Pessoa;

@Entity
@Table (name = "usuarios")
public class Usuario extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name= "ID_MODERADORES")
    private long id;

    @Column (name= "SENHA")
    private String senha;

    @Column (name= "NOME_USUARIO")
    private String nomeUsuario;
    
    public Usuario() {
        
    }
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
    



}
