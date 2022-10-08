package kapitel3;

public class DateCalculator {
    private static final String[] days = {
            "Sonntag",
            "Montag",
            "Dienstag",
            "Mittwoch",
            "Donnerstag",
            "Freitag",
            "Samstag"
    };

    int test = 0;

    public static void main(String[] args) {
        System.out.println(wochenTag(1, 1, 1900));
        System.out.println(wochenTag(1, 1, 1990));
        System.out.println(wochenTag(4, 4, 2010));
        System.out.println(wochenTag(8, 4, 2007));
        System.out.println(wochenTag(1, 3, 2006));
        System.out.println(wochenTag(21, 2, 2007));
        System.out.println(wochenTag(17, 2, 2010));
        System.out.println(wochenTag(27, 5, 2020));
    }

    public static String wochenTag(int tag, int monat, int jahr) {
        System.out.println("\nDatum: " + tag + "." + monat + "." + jahr);

        int totalDays = 0;

        jahr -= 1900;
        totalDays += jahr * 365;
        totalDays += jahr / 4;

        if (jahr > 0 && jahr % 4 == 0 && monat < 3) {
            totalDays--;
        }

        for (int i = 1; i < monat; i++) {
            totalDays += getDaysFromMonth(i);
        }

        totalDays += tag;

        String output = "Wochentag: ";
        output += days[totalDays % 7];

        return output;
    }

    static int getDaysFromMonth(int month) {
        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 2 -> days = 28;
            case 4, 6, 9, 11 -> days = 30;
        }

        return days;
    }
}
