package com.example.senac.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "INFO_GERAL")
public class InfoGeral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_INFO")
    private long id;
    @Column (name = "PESO")
    private int peso;
    @Column (name = "ALTURA")
    private int alturaCm;
    @Column (name = "POSICAO")
    private String posicao;
    @Column (name = "PERNA_DOMINANTE")
    private String pernaDominante;
    //Constructor    
    public InfoGeral(int peso, int alturaCm, String posicao, String pernaDominante) {
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
    public String getPernaDominante() {
        return pernaDominante;
    }
    public void setPernaDominante(String pernaDominante) {
        this.pernaDominante = pernaDominante;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }  
}