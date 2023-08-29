package com.polsl.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

/**
 * 
 * Handles transactions in database
 */
public class Data_handler {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence_unit");
    EntityManager em = emf.createEntityManager();
    
    
    public void closeEntityManager()
    {
        em.close();
    }
    public void persistObject(Object object) {

        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
            System.out.println("Object persisted");
        } catch (PersistenceException e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } 
    }

    public void findMatrix() {

        em.getTransaction().begin();
        try {
            Query query = em.createQuery("SELECT p FROM Person p");
            List<MatrixData> matrixList = query.getResultList();
            for (MatrixData matrix : matrixList) {
                System.out.println("Found object: " + matrix.getValues());
            }
        } catch (PersistenceException e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } 
    }
}