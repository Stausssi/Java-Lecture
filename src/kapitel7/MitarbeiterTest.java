package kapitel7;

import kapitel4.uebung.Angestellter;
import kapitel4.uebung.Arbeiter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MitarbeiterTest {

    @Test
    public void testAngestellterGehalt() {
        Angestellter a = new Angestellter("Horst", 2500, 700);
        Assertions.assertEquals(3200, a.berechneGehalt(), "Gehalt von Angestelltem stimmt nicht!");
        // Oder mit statischen import .*
        // Dann kein Assertions. mehr nötig
    }

    @Test
    public void testArbeiterGehalt() {
        Arbeiter a = new Arbeiter("Heinz", 40, 123);
        Assertions.assertEquals(4920, a.berechneGehalt(), "Gehalt vom Arbeiter stimmt nicht!");
    }
}
