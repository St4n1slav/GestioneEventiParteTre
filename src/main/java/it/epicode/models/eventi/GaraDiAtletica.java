package it.epicode.models.eventi;

import it.epicode.models.Evento;
import it.epicode.models.Persona;
import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("GaraDiAtletica")
public class GaraDiAtletica extends Evento {
    @ManyToOne
    private Persona vincitore;
    @ManyToMany
    private List<Persona> partecipanti;



}
