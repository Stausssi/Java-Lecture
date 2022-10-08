package kapitel4.uebung;

public class Manager extends Mitarbeiter {
    private double grundGehalt;
    private double provisionsSatz;
    private double unternehmensUmsatz;

    public Manager(String name, double grundGehalt, double provisionsSatz, double unternehmensUmsatz) {
        super(name);

        this.grundGehalt = grundGehalt;
        this.provisionsSatz = provisionsSatz;
        this.unternehmensUmsatz = unternehmensUmsatz;
    }

    @Override
    public double berechneGehalt() {
        return grundGehalt + provisionsSatz * unternehmensUmsatz;
    }

    public double getGrundGehalt() {
        return grundGehalt;
    }

    public void setGrundGehalt(double grundGehalt) {
        this.grundGehalt = grundGehalt;
    }

    public double getProvisionsSatz() {
        return provisionsSatz;
    }

    public void setProvisionsSatz(double provisionsSatz) {
        this.provisionsSatz = provisionsSatz;
    }

    public double getUnternehmensUmsatz() {
        return unternehmensUmsatz;
    }

    public void setUnternehmensUmsatz(double unternehmensUmsatz) {
        this.unternehmensUmsatz = unternehmensUmsatz;
    }
}
