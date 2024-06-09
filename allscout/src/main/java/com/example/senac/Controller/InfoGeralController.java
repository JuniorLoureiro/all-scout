package com.example.senac.Controller;

import com.example.senac.Model.InfoGeral;


public class InfoGeralController {
    
    private InfoGeral infoGeral;

    public void criarInfoGeral(int peso, int alturaCm, String posicao,  String pernaDominante) {
       
        infoGeral = new InfoGeral(peso,alturaCm,posicao,pernaDominante);
        // Implementação futura para gravar em um banco de dados ou realizar outras operações necessárias.
    }

    public InfoGeral getInfoGeral() {
        return infoGeral;
    }
}