package it.epicode.models.eventi;

import it.epicode.models.Evento;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("PartitaDiCalcio")
public class PartitaDiCalcio extends Evento {
    private String squadraDiCalcio;
    private String squadraOspite;
    private String squadraVincente;
    private int golSquadraDiCalcio;
    private int golSquadraOspite;

    public String getSquadraDiCalcio() {
        return squadraDiCalcio;
    }

    public void setSquadraDiCalcio(String squadraDiCalcio) {
        this.squadraDiCalcio = squadraDiCalcio;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGolSquadraDiCalcio() {
        return golSquadraDiCalcio;
    }

    public void setGolSquadraDiCalcio(int golSquadraDiCalcio) {
        this.golSquadraDiCalcio = golSquadraDiCalcio;
    }

    public int getGolSquadraOspite() {
        return golSquadraOspite;
    }

    public void setGolSquadraOspite(int golSquadraOspite) {
        this.golSquadraOspite = golSquadraOspite;
    }
}
