package de.diebayerische.vertragsservices.model.dto.vertrag;

import java.util.Random;

public abstract class Vertrag {
    private final VertragsTyp vertragsArt;
    private String versicherungsscheinNummer;
    private String versicherungsbeginn;
    private String sparte;
    private String bankVerbindungIban;

    Vertrag(VertragsTyp vertragsArt, String sparte, String versicherungsbeginn, String bankVerbindungIban) {
        this.vertragsArt = vertragsArt;
        this.versicherungsscheinNummer = get8DigitNumber();
        this.versicherungsbeginn = versicherungsbeginn;
        this.sparte = sparte;
        this.bankVerbindungIban = bankVerbindungIban;
    }

    public String getBankVerbindungIban() {
        return bankVerbindungIban;
    }

    public String getVersicherungsscheinNummer() {
        return versicherungsscheinNummer;
    }

    public String getSparte() {
        return sparte;
    }

    public void setVersicherungsscheinNummer(String versicherungsscheinNummer) {
        this.versicherungsscheinNummer = versicherungsscheinNummer;
    }

    public void setSparte(String sparte) {
        this.sparte = sparte;
    }

    public void setBankVerbindungIban(String bankVerbindungIban) {
        this.bankVerbindungIban = bankVerbindungIban;
    }

    public VertragsTyp getVertragsArt() {
        return vertragsArt;
    }

    String get8DigitNumber() {
        Random random = new Random();
        StringBuilder number = new StringBuilder();
        number.append("S0");
        for (int i = 0; i < 8; i++) {
            number.append(random.nextInt(9));
        }
        return number.toString();
    }

    public String getVersicherungsbeginn() {
        return versicherungsbeginn;
    }

    public void setVersicherungsbeginn(String versicherungsbeginn) {
        this.versicherungsbeginn = versicherungsbeginn;
    }

    public enum VertragsTyp {
        BU("BU"),
        KZV("KZV");

        private String name;

        VertragsTyp(String name) {
            this.name = name;
        }
    }
}
