package it.epicode.models;


import jakarta.persistence.*;

@Entity
public class Partecipazione {
    @Id
    private int id;
    @ManyToOne
    private Persona persona;
    @ManyToOne
    private Evento evento;
    @Enumerated(EnumType.STRING)
    private StatoPartecipazione statoPartecipazione;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public StatoPartecipazione getStatoPartecipazione() {
        return statoPartecipazione;
    }

    public void setStatoPartecipazione(StatoPartecipazione statoPartecipazione) {
        this.statoPartecipazione = statoPartecipazione;
    }
}
