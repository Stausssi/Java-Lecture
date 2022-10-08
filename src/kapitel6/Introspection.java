package kapitel6;

import kapitel4.OOModelierung.Landfahrzeuge.modelle.AudiQ5;

import java.util.Arrays;

public class Introspection {
    public static void main(String[] args) {
        Arrays.stream(AudiQ5.class.getDeclaredFields()).forEach(System.out::println);
    }
}
