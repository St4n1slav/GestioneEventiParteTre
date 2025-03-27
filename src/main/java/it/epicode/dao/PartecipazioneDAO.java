package it.epicode.dao;

import it.epicode.models.Partecipazione;
import jakarta.persistence.EntityManager;

public class PartecipazioneDAO {

    private EntityManager em;

    public PartecipazioneDAO(EntityManager entityManager) {
        this.em = entityManager;
    }

    public void save(Partecipazione partecipazione) {
        em.getTransaction().begin();
        em.persist(partecipazione);
        em.getTransaction().commit();
    }
}
