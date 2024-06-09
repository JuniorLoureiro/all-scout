package com.example.senac.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "atletas")
public class Atletas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ATLETA")
    private long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "DATA_NASCIMENTO")
    private String dataNasc;

    @Column(name = "CLUBE_ATUAL")
    private String clubeAtual;

    @Column(name = "CLUBE_FORMADOR")
    private String clubeFormador;

    @Column(name = "PESO")
    private int peso;

    @Column(name = "ALTURA")
    private int alturaCm;

    @JoinColumn(name = "ID_AGENCIADOR", referencedColumnName = "ID_PESSOA")
    @OneToOne(cascade = {CascadeType.PERSIST})
    private Agenciador agenciador;

    @OneToMany(mappedBy = "atleta", cascade = CascadeType.ALL)
    private List<Estatistica> estatisticas = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "POSICAO")
    private Posicao posicao;

    @Enumerated(EnumType.STRING)
    @Column(name = "PERNA_DOMINANTE")
    private PernaDominante pernaDominante;

    // Construtor
    public Atletas() {

    }

    public Atletas(String nome, String dataNasc, String clubeAtual, String clubeFormador, Agenciador agenciador,
                   List<Estatistica> estatisticas, Posicao posicao, PernaDominante pernaDominante) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.clubeAtual = clubeAtual;
        this.clubeFormador = clubeFormador;
        this.agenciador = agenciador;
        this.estatisticas = estatisticas;
        this.posicao = posicao;
        this.pernaDominante = pernaDominante;
    }

    // Getters and Setters
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

    public Agenciador getAgenciador() {
        return agenciador;
    }

    public void setAgenciador(Agenciador agenciador) {
        this.agenciador = agenciador;
    }

    public List<Estatistica> getEstatisticas() {
        return estatisticas;
    }

    public void setEstatisticas(List<Estatistica> estatisticas) {
        this.estatisticas = estatisticas;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public PernaDominante getPernaDominante() {
        return pernaDominante;
    }

    public void setPernaDominante(PernaDominante pernaDominante) {
        this.pernaDominante = pernaDominante;
    }
}
