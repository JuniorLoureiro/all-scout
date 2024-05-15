package com.example.senac.Controller;

import com.example.senac.Model.Agenciador;
import com.example.senac.Model.Atletas;
import com.example.senac.Model.Estatistica;
import com.example.senac.Model.InfoGeral;

import java.util.List;

public class AtletasController {
    
    private Atletas atleta;

    public void criarAtleta(String nome, String dataNasc, String clubeAtual, String clubeFormador, 
            Agenciador agenciador, List<Estatistica> estatistica, InfoGeral infoGeral) {
       
        atleta = new Atletas(nome, dataNasc, clubeAtual, clubeFormador, agenciador, estatistica, infoGeral);
        // Implementação futura para gravar em um banco de dados ou realizar outras operações necessárias.
    }

    public Atletas getAtleta() {
        return atleta;
    }
}