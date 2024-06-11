package com.example.senac.Controller;

import com.example.senac.Model.Atletas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class AtletasController {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public AtletasController() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

    public Atletas criarAtleta(String nome, String dataNasc, String clubeAtual, String pernaDominante, String posicao, String nacionalidade, int numeroCamisa, int alturaCm) {
        Atletas atleta = new Atletas(nome, dataNasc, clubeAtual, posicao, pernaDominante, nacionalidade, numeroCamisa, alturaCm);
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

    public Atletas obterDetalhesAtleta(String nomeAtleta) {
        TypedQuery<Atletas> query = entityManager.createQuery(
                "SELECT a FROM Atletas a WHERE lower(a.nome) = lower(:nome)", Atletas.class);
        query.setParameter("nome", nomeAtleta);
        List<Atletas> resultados = query.getResultList();
        if (!resultados.isEmpty()) {
            return resultados.get(0);
        } else {
            return null;
        }
    }
    

    public List<Atletas> buscarAtletasPorNome(String nome) {
        TypedQuery<Atletas> query = entityManager.createQuery(
                "SELECT a FROM Atletas a WHERE lower(a.nome) LIKE lower(:nome)", Atletas.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }
}
