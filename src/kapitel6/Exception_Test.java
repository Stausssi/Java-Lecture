package kapitel6;

import java.io.FileNotFoundException;

public class Exception_Test {
    public static void main(String[] args) {
        try {
            try {
                file("Hallo?");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            System.out.println("Berechne etwas...");

            int a = sp(10);
        } catch (SchlechteProgrammierung sp) {
            System.err.println("Schlechte Programmierung: " + sp.getMessage() + "Hier war der Fehler:");
            for (StackTraceElement error : sp.getStackTrace())
                System.err.println("\t" + error.toString());

        } finally {
            System.out.println("Aber was solls :shrug:");
            try {
                file("Banause");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Ohh man alles geht schief!");
            }
        }
    }

    public static int sp(int x) throws SchlechteProgrammierung {
        throw new SchlechteProgrammierung("Kein Grund für eine öffentliche Methode!");
    }

    private static void file(String filename) throws FileNotFoundException {
        throw new FileNotFoundException("File " + filename + " kann nicht gefunden werden!");
    }
}

