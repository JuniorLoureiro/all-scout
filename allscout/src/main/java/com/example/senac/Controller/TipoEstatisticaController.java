package com.example.senac.Controller;

import com.example.senac.Model.TipoEstatistica;

public class TipoEstatisticaController {
    private TipoEstatistica tipoEstatistica;

    public void criarTipoEstatistica(String nome, String medida) {
        tipoEstatistica = new TipoEstatistica(nome, medida);
    }

    public TipoEstatistica getTipoEstatistica() {
        return tipoEstatistica;
    }
}