package it.epicode.models.eventi;

import it.epicode.models.Evento;
import it.epicode.models.Genere;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Concerto")
public class Concerto extends Evento {
    private Genere genere;
    private boolean inStreaming;

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }
}
