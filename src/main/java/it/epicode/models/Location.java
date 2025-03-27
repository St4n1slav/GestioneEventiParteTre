package it.epicode.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Location {
    @Id
    private int id;
    private String name;
    private String citta;
    @OneToMany(mappedBy = "location")
    private List<Evento> eventi;

    public List<Evento> getEventi() {
        return eventi;
    }

    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }
}
