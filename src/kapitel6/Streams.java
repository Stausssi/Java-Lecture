package kapitel6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 25; i++)
            list.add(Integer.toString(i));

        list.stream()
                .map(string -> string + "a, ")
                .forEach(string -> System.out.print(string.replace("24a,", "24a.")));

        System.out.println();
        System.out.println(list.stream().filter(string -> string.contains("1")).count() + "mal die 1!");

        System.out.print(list.stream().filter(string -> string.contains("2")).count() + "mal die 2: ");
        Optional<String> result = list.stream().filter(string -> string.contains("2")).reduce((a, b) -> a + ", " + b);
        result.ifPresent(System.out::println);

        list.stream()
                .map(Integer::valueOf)
                .reduce(Integer::sum)
                .map(string -> "Summe aller Zahlen: " + string)
                .ifPresent(System.err::println);
    }
}
