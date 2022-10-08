package kapitel4.uebung;

import java.io.Serializable;

public class CEO extends Manager {
    private double ceoZulage;

    public CEO(String name, double grundGehalt, double provisionsSatz, double unternehmensUmsatz, double ceoZulage) {
        super(name, grundGehalt, provisionsSatz, unternehmensUmsatz);
        this.ceoZulage = ceoZulage;
    }

    @Override
    public double berechneGehalt() {
        return super.berechneGehalt() + ceoZulage;
    }

    public double getCeoZulage() {
        return ceoZulage;
    }

    public void setCeoZulage(double ceoZulage) {
        this.ceoZulage = ceoZulage;
    }
}
