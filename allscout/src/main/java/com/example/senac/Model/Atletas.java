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

    @Column(name = "ALTURA")
    private int alturaCm;

    @JoinColumn(name = "ID_AGENCIADOR")
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

    
    @Column(name = "NACIONALIDADE")
    private String nacionalidade;

    
    @Column(name = "NUMERO_CAMISA")
    private int numeroCamisa;

    // Construtor
    public Atletas() {

    }

    public Atletas(String nome, String dataNasc, String clubeAtual, Agenciador agenciador,
                   List<Estatistica> estatisticas, Posicao posicao, PernaDominante pernaDominante, String nacionalidade, int numeroCamisa) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.clubeAtual = clubeAtual;
        this.agenciador = agenciador;
        this.estatisticas = estatisticas;
        this.posicao = posicao;
        this.pernaDominante = pernaDominante;
        this.nacionalidade = nacionalidade;
        this.numeroCamisa = numeroCamisa;
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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    
}
