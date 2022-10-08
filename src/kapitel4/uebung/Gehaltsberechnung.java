package kapitel4.uebung;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Gehaltsberechnung {
        static double umsatz = 2_000_000;
        static List<Gehaltsberechenbar> mitarbeiter = new ArrayList<>();


    public static void main(String[] args) {
        mitarbeiter.add(new Angestellter("Simon", 2500, 500));
        mitarbeiter.add(new Arbeiter("Klaus", 160, 34));
        mitarbeiter.add(new Manager("Heinz", 5000, 0.1, umsatz));
        mitarbeiter.add(new CEO("Markus", 0, 0.2, umsatz, 2500));

        System.out.println(berechneGehalt(mitarbeiter));
        feature1();
        feature1(true).stream().map(m -> (Arbeiter) m).map(Mitarbeiter::getName).forEach(System.out::println);
    }

    public static double berechneGehalt(List<Gehaltsberechenbar> g) {
        return g.stream()
                .map(Gehaltsberechenbar::berechneGehalt)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    public static void feature1() {
        // Alle Arbeiter, die mehr als 200/h verdienen
        for (Gehaltsberechenbar m : mitarbeiter) {
            if(m instanceof Arbeiter) {
                if (((Arbeiter) m).getStundenlohn() > 30) {
                    System.out.println(((Arbeiter) m).getName());
                }
            }
        }
    }

    public static List<Gehaltsberechenbar> feature1(boolean stream) {
        return mitarbeiter.stream()
                .filter(m -> m instanceof Arbeiter)
                .map(m -> (Arbeiter) m)
                .filter(m -> m.getStundenlohn() > 30)
                .collect(Collectors.toList());
    }
}
