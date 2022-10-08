package kapitel4.uebung;

public class Angestellter extends Mitarbeiter {
    private double grundGehalt;
    private double zulage;

    public Angestellter(String name, double grundGehalt, double zulage) {
        super(name);

        this.grundGehalt = grundGehalt;
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return grundGehalt + zulage;
    }

    public double getGrundGehalt() {
        return grundGehalt;
    }

    public void setGrundGehalt(double grundGehalt) {
        this.grundGehalt = grundGehalt;
    }

    public double getZulage() {
        return zulage;
    }

    public void setZulage(double zulage) {
        this.zulage = zulage;
    }
}
