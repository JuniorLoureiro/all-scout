package com.example.senac.Model;

public class TipoEstatistica {
    private String nome;
    private String medida;
    //Constructor
    public TipoEstatistica(String nome, String medida) {
        this.nome = nome;
        this.medida = medida;
    }
    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMedida() {
        return medida;
    }
    public void setMedida(String medida) {
        this.medida = medida;
    }
}