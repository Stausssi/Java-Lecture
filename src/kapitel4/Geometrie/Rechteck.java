package kapitel4.Geometrie;

public class Rechteck {
    private int laenge, breite;

    public Rechteck() {
        System.out.println("Rechteck ohne Argumente erzeugt!");
    }

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
        System.out.println("Rechteck mit Argumenten erzeugt! Laenge: " + this.getLaenge() + ", Breite: " + this.getBreite());
    }

    public int getUmfang() {
        return getBreite() * 2 + getLaenge() * 2;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }
}
