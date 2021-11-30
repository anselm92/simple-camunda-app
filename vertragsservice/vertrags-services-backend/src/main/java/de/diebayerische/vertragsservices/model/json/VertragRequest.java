package de.diebayerische.vertragsservices.model.json;

import de.diebayerische.vertragsservices.model.dto.vertrag.Vertrag;

public class VertragRequest {
    private Vertrag.VertragsTyp type;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private String vertragsBeginn;
    private String iban;

    public Vertrag.VertragsTyp getType() {
        return type;
    }

    public void setType(Vertrag.VertragsTyp type) {
        this.type = type;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getVertragsBeginn() {
        return vertragsBeginn;
    }

    public void setVertragsBeginn(String vertragsBeginn) {
        this.vertragsBeginn = vertragsBeginn;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
