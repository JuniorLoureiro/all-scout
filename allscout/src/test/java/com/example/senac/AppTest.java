package com.example.senac;

import com.example.senac.Model.Atletas;
import com.example.senac.Controller.AtletasController;
import com.example.senac.salvar.AtletaException;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testaAGravacaoDeUmAtletaJaCadastrado() {
        AtletasController controller = new AtletasController();
        Atletas atleta = new Atletas("LÉO JARDIM", "1995-03-20", "VASCO DA GAMA", "GOLEIRO", "DIREITA", "BRASIL", 1, 188);

        // Adicionar o atleta pela primeira vez
        try {
            controller.criarAtleta(atleta.getNome(), atleta.getDataNasc(), atleta.getClubeAtual(), atleta.getPernaDominante(), atleta.getPosicao(), atleta.getNacionalidade(), atleta.getNumeroCamisa(), atleta.getAlturaCm());
        } catch (AtletaException e) {
            // Não deve lançar exceção aqui
            e.printStackTrace();
        }

        // Tentar adicionar o mesmo atleta novamente deve lançar AtletaException
        assertThrows(AtletaException.class, () -> {
            controller.criarAtleta(atleta.getNome(), atleta.getDataNasc(), atleta.getClubeAtual(), atleta.getPernaDominante(), atleta.getPosicao(), atleta.getNacionalidade(), atleta.getNumeroCamisa(), atleta.getAlturaCm());
        });

        controller.close();
    }
}
