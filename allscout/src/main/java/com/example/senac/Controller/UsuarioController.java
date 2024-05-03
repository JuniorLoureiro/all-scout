package com.example.senac.Controller;

import com.example.senac.Model.Usuario;

public class UsuarioController {
        
        private Usuario Usuario;
    
        public void criarUsuario(String nome, String senha, String nomeUsuario) {
           
            Usuario = new Usuario(nome, senha,nomeUsuario);
            // FUTURA implementação para gravar em um banco de dados ou realizar outras operações necessárias.
        }
    
        public Usuario getUsuario() {
            return Usuario;
        }
}
    

