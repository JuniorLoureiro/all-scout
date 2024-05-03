package com.example.senac.Model;

import java.util.List;

public class Atletas {
    private String nome;
    private String dataNasc;
    private String clubeAtual;
    private String clubeFormador;
    private Agenciador agenciador;
    private List<Estatistica> estatistica;
    private InfoGeral infoGeral;
    //Constructor
    public Atletas(String nome, String dataNasc, String clubeAtual, String clubeFormador, Agenciador agenciador,
            List<Estatistica> estatistica, InfoGeral infoGeral) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.clubeAtual = clubeAtual;
        this.clubeFormador = clubeFormador;
        this.agenciador = agenciador;
        this.estatistica = estatistica;
        this.infoGeral = infoGeral;
    }
    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getClubeAtual() {
        return clubeAtual;
    }
    public void setClubeAtual(String clubeAtual) {
        this.clubeAtual = clubeAtual;
    }
    public String getClubeFormador() {
        return clubeFormador;
    }
    public void setClubeFormador(String clubeFormador) {
        this.clubeFormador = clubeFormador;
    }
    public Agenciador getAgenciador() {
        return agenciador;
    }
    public void setAgenciador(Agenciador agenciador) {
        this.agenciador = agenciador;
    }
    public List<Estatistica> getEstatistica() {
        return estatistica;
    }
    public void setEstatistica(List<Estatistica> estatistica) {
        this.estatistica = estatistica;
    }
    public InfoGeral getInfoGeral() {
        return infoGeral;
    }
    public void setInfoGeral(InfoGeral infoGeral) {
        this.infoGeral = infoGeral;
    }
}