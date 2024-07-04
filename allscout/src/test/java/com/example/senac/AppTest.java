package com.example.senac;

import com.example.senac.Model.Atletas;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import atleta.salvar.AtletaException;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(true);
    }

    @Test
    public void testaAGravacaoDeUmAtletaJaCadastrado() {
        Atletas atleta = new Atletas("LÉO JARDIM", "1995-03-20", "VASCO DA GAMA", "GOLEIRO", "DIREITA", "BRASIL", 1, 188);
        assertThrows(atleta.salvar.AtletaException.class);
    }

    private void assertThrows(Class<AtletaException> class1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertThrows'");
    }
}