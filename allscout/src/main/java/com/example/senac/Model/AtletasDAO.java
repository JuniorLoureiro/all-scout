package com.example.senac.Model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class AtletasDAO {
    
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public AtletasDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

    public Atletas buscarAtletaPorId(long id) {
        return entityManager.find(Atletas.class, id);
    }

    public void adicionarAtleta(Atletas atleta) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(atleta);
        transaction.commit();
    }

    public List<Atletas> buscarAtletasPorNome(String nome) {
        TypedQuery<Atletas> query = entityManager.createQuery(
                "SELECT a FROM Atletas a WHERE lower(a.nome) LIKE lower(:nome)", Atletas.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }
}
