package com.example.senac.Model;

public class Agenciador extends Pessoa{
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
}