package it.epicode.dao;

import it.epicode.models.Evento;
import it.epicode.models.Genere;
import it.epicode.models.eventi.Concerto;
import jakarta.persistence.EntityManager;

import java.util.List;

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

    public List<Concerto> getConcerti(boolean inStreaming) {
        return em.createQuery("SELECT c FROM Concerto c where c.inStreaming = :inStreaming", Concerto.class)
                .setParameter("inStreaming", inStreaming)
                .getResultList();
    }

    public List<Concerto> getConcertiPerGenere(Genere genere) {
        return em.createQuery("SELECT c FROM Concerto c where c.genere = :genere", Concerto.class)
                .setParameter("genere", genere)
                .getResultList();
    }
}
