package it.epicode.dao;

import it.epicode.models.Evento;
import jakarta.persistence.EntityManager;

public class EventoDAO {
    private EntityManager em;

    public EventoDAO(EntityManager entityManager) {
        this.em = entityManager;
    }

    public void save(Evento evento) {
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
    }
    public Evento getById(Long id) {
        return em.find(Evento.class, id);
    }
    public void delete(Long id) {
        em.getTransaction().begin();
        Evento evento = em.find(Evento.class, id);
        if (evento != null) {
            em.remove(evento);
        }
        em.getTransaction().commit();
    }
}
