package de.diebayerische.vertragsservices.model.dto.kunde;

public class Bonitaet {
    private double score;

    public Bonitaet(double v) {
        this.score = v;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
