package com.example.senac.Controller;

//import com.example.senac.Model.Agenciador;
import com.example.senac.Model.Atletas;
import com.example.senac.Model.AtletasDAO;
<<<<<<< HEAD
//import com.example.senac.Model.Estatistica;
//import com.example.senac.Model.PernaDominante;
//import com.example.senac.Model.Posicao;
=======
import com.example.senac.Model.Estatistica;
import com.example.senac.Model.Moderador;
import com.example.senac.Model.PernaDominante;
import com.example.senac.Model.Posicao;
>>>>>>> 87b416f33445282cf6ee5737d8bbca4bffd0c567

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AtletasController {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private Atletas atleta;

    public AtletasController(EntityManager entityManager) {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
    
<<<<<<< HEAD
    public Atletas criarAtleta(String nome, String dataNasc, String clubeAtual, String pernaDominante, String posicao, String nacionalidade, int numeroCamisa) {
       
        Atletas atleta = new Atletas(nome, dataNasc, clubeAtual, posicao, pernaDominante,nacionalidade,numeroCamisa);
        atletasDAO.adicionarAtleta(atleta); // Adiciona o novo atleta ao banco de dados usando AtletasDAO
        return atleta;
    /* 
    public Atletas criarAtleta(String nome, String dataNasc, String clubeAtual, 
            Agenciador agenciador, List<Estatistica> estatisticas, PernaDominante pernaDominante, Posicao posicao, String nacionalidade, int numeroCamisa) {
       
        Atletas atleta = new Atletas(nome, dataNasc, clubeAtual, agenciador, estatisticas, posicao, pernaDominante,nacionalidade,numeroCamisa);
        atletasDAO.adicionarAtleta(atleta); // Adiciona o novo atleta ao banco de dados usando AtletasDAO
        return atleta;
=======
    public Atletas criarAtleta(String nome, String dataNasc, String clubeAtual, Agenciador agenciador, List<Estatistica> estatisticas,
                                PernaDominante pernaDominante, Posicao posicao, String nacionalidade, int numeroCamisa) {
            Atletas atleta = new Atletas(nome, dataNasc, clubeAtual, agenciador, estatisticas, posicao, pernaDominante, nacionalidade, numeroCamisa);
            adicionarAtleta(atleta);
            return atleta;
    }

    private void adicionarAtleta(Atletas atleta) {
        entityManager.getTransaction().begin();
        entityManager.persist(atleta);
        entityManager.getTransaction().commit();
    }

    public Atletas buscarAtletaPorId(long id) {
        return entityManager.find(Atletas.class, id);
    }

    public List<Atletas> buscarAtletasPorNome(String nome) {
        TypedQuery<Atletas> query = entityManager.createQuery(
                "SELECT a FROM Atletas a WHERE lower(a.nome) LIKE lower(:nome)", Atletas.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
>>>>>>> 87b416f33445282cf6ee5737d8bbca4bffd0c567
    }
    */
    }
}