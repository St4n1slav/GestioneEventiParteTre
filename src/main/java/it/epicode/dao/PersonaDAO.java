package it.epicode.dao;

import it.epicode.models.Persona;
import jakarta.persistence.EntityManager;

public class PersonaDAO {

    private EntityManager em;

    public PersonaDAO(EntityManager entityManager) {
        this.em = entityManager;
    }

    public void save(Persona persona) {
        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();
    }
}
