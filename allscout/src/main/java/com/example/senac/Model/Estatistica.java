package com.example.senac.Model;

public class Estatistica {
    private double valor;
    private TipoEstatistica tipoEstatistica;
    //Constructor
    public Estatistica(double valor, TipoEstatistica tipoEstatistica) {
        this.valor = valor;
        this.tipoEstatistica = tipoEstatistica;
    }
    //Getters and Setters
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public TipoEstatistica getTipoEstatistica() {
        return tipoEstatistica;
    }
    public void setTipoEstatistica(TipoEstatistica tipoEstatistica) {
        this.tipoEstatistica = tipoEstatistica;
    }
}
