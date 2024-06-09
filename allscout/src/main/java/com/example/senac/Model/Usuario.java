package com.example.senac.Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;



@Entity
@Table (name = "usuarios")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name= "ID_USUARIO")
    private long id;

    @Column (name= "NOME")
    private String nome;

    @Column (name= "SENHA")
    private String senha;

    @Column (name= "NOME_USUARIO")
    private String nomeUsuario;
    
    public Usuario() {
        
    }
    public Usuario(String nome, String senha, String nomeUsuario) {
        this.nome = nome;
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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    



}
