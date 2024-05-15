package com.example.senac.Controller;

import com.example.senac.Model.Estatistica;
import com.example.senac.Model.TipoEstatistica;

public class EstatisticaController {
    private Estatistica estatistica;

    public void criarEstatistica(double valor, TipoEstatistica tipoEstatistica) {
        estatistica = new Estatistica(valor, tipoEstatistica);
    }

    public Estatistica getEstatistica() {
        return estatistica;
    }
}