package com.example.senac.Controller;

import com.example.senac.Model.Moderador;

public class ModeradorController {
        
    private Moderador moderador;

    public void criarModerador(String nome, String senha, String nomeUsuario,String permissoes, boolean statusAtividade) {
       
        moderador = new Moderador (nome, senha,nomeUsuario,permissoes,statusAtividade );
        // FUTURA implementação para gravar em um banco de dados ou realizar outras operações necessárias.
    }

    public Moderador getModerador() {
        return moderador;
    }
}
