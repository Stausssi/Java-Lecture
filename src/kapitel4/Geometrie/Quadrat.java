package kapitel4.Geometrie;

public class Quadrat extends Rechteck {
    private int seitenlaenge;

    public Quadrat() {
        System.out.println("Quadrat ohne Argumente erzeugt!");
    }

    public Quadrat(int seitenlaenge) {
        super(seitenlaenge, seitenlaenge);

        this.seitenlaenge = seitenlaenge;
        System.out.println("Quadrat mit Argumenten erzeugt! Seitenlaenge: " + this.getSeitenlaenge());
    }

    public static void main(String[] args) {
        Rechteck r1 = new Rechteck();
        System.out.println("Umfang: " + r1.getUmfang());
        System.out.println();
        Rechteck r2 = new Rechteck(1, 3);
        System.out.println("Umfang: " + r2.getUmfang());
        System.out.println();

        Quadrat q1 = new Quadrat();
        System.out.println("Umfang: " + q1.getUmfang());
        System.out.println();

        Quadrat q2 = new Quadrat(5);
        System.out.println("Umfang: " + q2.getUmfang());

        q2.setSeitenlaenge(10);
        System.out.println("Neuer Umfang: " + q2.getUmfang());
        System.out.println();
    }

    @Override
    public void setBreite(int breite) {
        super.setBreite(breite);
        super.setLaenge(breite);
    }

    @Override
    public void setLaenge(int laenge) {
        super.setBreite(laenge);
        super.setLaenge(laenge);
    }

    public int getSeitenlaenge() {
        return seitenlaenge;
    }

    public void setSeitenlaenge(int seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
        setBreite(seitenlaenge);
    }
}
