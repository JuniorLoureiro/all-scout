package com.example.senac.Model;

import javax.persistence.*;

@Entity
@Table(name = "agenciador")
@PrimaryKeyJoinColumn(name = "ID_PESSOA")
public class Agenciador extends Pessoa {

    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;

    // Construtor padrão exigido pelo JPA
    public Agenciador() {
        super();
    }

    // Construtor com parâmetros
    public Agenciador(String nome, String cpfCnpj) {
        super(nome);
        this.cpfCnpj = cpfCnpj;
    }

    // Getters and Setters
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}
