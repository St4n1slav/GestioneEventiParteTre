package it.epicode.dao;

import it.epicode.models.Location;
import jakarta.persistence.EntityManager;

public class LocationDAO {
    private EntityManager em;

    public LocationDAO(EntityManager entityManager) {
        this.em = entityManager;
    }

    public void save(Location location) {
        em.getTransaction().begin();
        em.persist(location);
        em.getTransaction().commit();
    }

}
