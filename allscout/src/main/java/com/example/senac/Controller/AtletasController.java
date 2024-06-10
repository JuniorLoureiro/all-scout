package com.example.senac.Controller;

import com.example.senac.Model.Agenciador;
import com.example.senac.Model.Atletas;
import com.example.senac.Model.Estatistica;
import com.example.senac.Model.PernaDominante;
import com.example.senac.Model.Posicao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AtletasController {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public AtletasController(EntityManager entityManager) {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
    
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
    }
}