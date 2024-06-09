package com.example.senac.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ANGENCIADOR")

public class Agenciador extends Pessoa{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_AGENCIADOR")
    private long id;

    @Column (name="CPF/CNPJ")
    private String cpfCnpj;
   
   
    //Contructor
    public Agenciador(String nome, String cpfCnpj) {
        super(nome);
        this.cpfCnpj = cpfCnpj;
    }
    //Getters and Setters
    public String getCpfCnpj() {
        return cpfCnpj;
    }
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
    public Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}