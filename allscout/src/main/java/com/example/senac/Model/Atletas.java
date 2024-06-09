package com.example.senac.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table(name = "ATLETAS")
public class Atletas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "NOME")
    private String nome;
    @Column (name = "DATA_NASCIMENTO")
    private String dataNasc;
    @Column (name = "CLUBE_ATUAL")
    private String clubeAtual;
    @Column (name = "CLUBE_FORMADOR")
    private String clubeFormador;
    @JoinColumn(name = "AGENCIADOR", referencedColumnName ="ID_AGENCIADOR")
    @OneToOne(cascade={CascadeType.PERSIST})
    private Agenciador agenciador;
    @OneToMany(mappedBy = "ATLETAS", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Estatistica> estatisticas = new ArrayList<Estatistica>(); 
    @JoinColumn(name = "INFO_GERAL", referencedColumnName = "ID_INFO")
    @OneToOne(cascade={CascadeType.PERSIST})
    private InfoGeral infoGeral;
    //Constructor
   
    public Atletas(String nome, String dataNasc, String clubeAtual, String clubeFormador, Agenciador agenciador,
            List<Estatistica> estatisticas, InfoGeral infoGeral) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.clubeAtual = clubeAtual;
        this.clubeFormador = clubeFormador;
        this.agenciador = agenciador;
        this.estatisticas = estatisticas;
        this.infoGeral = infoGeral;
    }
    //Getters and Setters
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
    public List<Estatistica> getEstatisticas() {
        return estatisticas;
    }
    public void setEstatistica(List<Estatistica> estatisticas) {
        this.estatisticas = estatisticas;
    }
    public InfoGeral getInfoGeral() {
        return infoGeral;
    }
    public void setInfoGeral(InfoGeral infoGeral) {
        this.infoGeral = infoGeral;
    }
}