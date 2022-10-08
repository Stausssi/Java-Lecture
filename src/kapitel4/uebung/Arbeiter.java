package kapitel4.uebung;

public class Arbeiter extends Mitarbeiter {
    private double stunden;
    private double stundenlohn;

    public Arbeiter(String name, double stunden, double stundenlohn) {
        super(name);

        this.stunden = stunden;
        this.stundenlohn = stundenlohn;
    }

    @Override
    public double berechneGehalt() {
        return stunden * stundenlohn;
    }

    public double getStunden() {
        return stunden;
    }

    public void setStunden(double stunden) {
        this.stunden = stunden;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }
}
