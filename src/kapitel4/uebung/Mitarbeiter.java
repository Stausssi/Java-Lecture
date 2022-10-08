package kapitel4.uebung;

import java.io.Serializable;
import java.util.Date;

public abstract class Mitarbeiter implements Gehaltsberechenbar, Serializable {
    private int personalNummer;
    private String name;
    private Date geburtsdatum;

    public Mitarbeiter(String name) {
        this.name = name;
    }

    public int getPersonalNummer() {
        return personalNummer;
    }

    public void setPersonalNummer(int personalNummer) {
        this.personalNummer = personalNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
}
