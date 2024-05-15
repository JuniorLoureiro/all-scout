package com.example.senac.Model;

public class InfoGeral {
    private int peso;
    private int alturaCm;
    private String posicao;
    private PernaDominante pernaDominante;
    //Constructor    
    public InfoGeral(int peso, int alturaCm, String posicao, PernaDominante pernaDominante) {
        this.peso = peso;
        this.alturaCm = alturaCm;
        this.posicao = posicao;
        this.pernaDominante = pernaDominante;
    }
    //Getters and Setters
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getAlturaCm() {
        return alturaCm;
    }
    public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public PernaDominante getPernaDominante() {
        return pernaDominante;
    }
    public void setPernaDominante(PernaDominante pernaDominante) {
        this.pernaDominante = pernaDominante;
    }  
}