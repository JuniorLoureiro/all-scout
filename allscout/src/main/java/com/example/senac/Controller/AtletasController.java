package com.example.senac.Controller;

import com.example.senac.Model.Agenciador;
import com.example.senac.Model.Atletas;
import com.example.senac.Model.AtletasDAO;
import com.example.senac.Model.Estatistica;
import com.example.senac.Model.PernaDominante;
import com.example.senac.Model.Posicao;

import java.util.List;

public class AtletasController {
    
    private AtletasDAO atletasDAO;

    public AtletasController() {
        this.atletasDAO = new AtletasDAO(); // Inicializa o AtletasDAO
    }
    
    public Atletas criarAtleta(String nome, String dataNasc, String clubeAtual, 
            Agenciador agenciador, List<Estatistica> estatisticas, PernaDominante pernaDominante, Posicao posicao, String nacionalidade, int numeroCamisa) {
       
        Atletas atleta = new Atletas(nome, dataNasc, clubeAtual, agenciador, estatisticas, posicao, pernaDominante,nacionalidade,numeroCamisa);
        atletasDAO.adicionarAtleta(atleta); // Adiciona o novo atleta ao banco de dados usando AtletasDAO
        return atleta;
    }
}