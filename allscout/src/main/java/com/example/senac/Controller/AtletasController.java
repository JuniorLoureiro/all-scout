package com.example.senac.Controller;

import com.example.senac.Model.Agenciador;
import com.example.senac.Model.Atletas;
import com.example.senac.Model.Estatistica;
import com.example.senac.Model.PernaDominante;
import com.example.senac.Model.Posicao;

import java.util.List;

public class AtletasController {
    
    private Atletas atleta;

    public Atletas criarAtleta(String nome, String dataNasc, String clubeAtual, String clubeFormador, 
            Agenciador agenciador, List<Estatistica> estatisticas, PernaDominante pernaDominante, Posicao posicao) {
       
        atleta = new Atletas(nome, dataNasc, clubeAtual, clubeFormador, agenciador, estatisticas, posicao, pernaDominante);
        // Implementação futura para gravar em um banco de dados ou realizar outras operações necessárias.
        return atleta;
    }

    public Atletas getAtleta() {
        return atleta;
    }
}
