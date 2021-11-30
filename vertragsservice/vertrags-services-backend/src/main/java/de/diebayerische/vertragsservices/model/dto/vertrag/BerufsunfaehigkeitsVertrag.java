package de.diebayerische.vertragsservices.model.dto.vertrag;

public class BerufsunfaehigkeitsVertrag extends Vertrag {

    private double versicherteRente;
    private String bezugsrechtTodesfall;

    public BerufsunfaehigkeitsVertrag(String versicherungsbeginn, String sparte, String bankVerbindungIban, double versicherteRente, String bezugsrechtTodesfall) {
        super(VertragsTyp.BU, sparte, versicherungsbeginn, bankVerbindungIban);
        this.versicherteRente = versicherteRente;
        this.bezugsrechtTodesfall = bezugsrechtTodesfall;
    }

    public double getVersicherteRente() {
        return versicherteRente;
    }

    public String getBezugsrechtTodesfall() {
        return bezugsrechtTodesfall;
    }

    public void setVersicherteRente(double versicherteRente) {
        this.versicherteRente = versicherteRente;
    }

    public void setBezugsrechtTodesfall(String bezugsrechtTodesfall) {
        this.bezugsrechtTodesfall = bezugsrechtTodesfall;
    }
}
