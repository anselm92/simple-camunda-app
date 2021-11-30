package de.diebayerische.vertragsservices.model.dto.vertrag;

public class ZahnzusatzVertrag extends Vertrag{

    private final String zahnstaffel;
    private final String zahnLeistungsUmfang;

    public ZahnzusatzVertrag(String vertragsBeginn, String sparte, String bankVerbindungIban, String zahnstaffel, String zahnLeistungsUmfang) {
        super(VertragsTyp.KZV, sparte, vertragsBeginn, bankVerbindungIban);
        this.zahnstaffel = zahnstaffel;
        this.zahnLeistungsUmfang = zahnLeistungsUmfang;
    }

    public String getZahnstaffel() {
        return zahnstaffel;
    }

    public String getZahnLeistungsUmfang() {
        return zahnLeistungsUmfang;
    }
}
