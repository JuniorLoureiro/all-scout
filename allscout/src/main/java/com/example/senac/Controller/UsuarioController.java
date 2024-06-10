package com.example.senac.Controller;

import com.example.senac.Model.Usuario;
import com.example.senac.Model.Endereco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.example.senac.Model.Contato;

public class UsuarioController {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private Usuario usuario;

    public UsuarioController() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

    public void criarUsuario(String nome, Contato contato, Endereco endereco, String senha, String nomeUsuario) {
        
        usuario = new Usuario(nome, senha,nomeUsuario);
        // FUTURA implementação para gravar em um banco de dados ou realizar outras operações necessárias.
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public Usuario login(String nomeUsuario, String senha) {
        try {
            TypedQuery<Usuario> query = entityManager.createQuery(
                "SELECT u FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario AND u.senha = :senha", Usuario.class);
            query.setParameter("nomeUsuario", nomeUsuario);
            query.setParameter("senha", senha);
            return query.getSingleResult(); // Se encontrar um usuário, retorna-o
        } catch (NoResultException e) {
            return null; // Se não encontrar nenhum usuário, retorna null
        }
    }
}