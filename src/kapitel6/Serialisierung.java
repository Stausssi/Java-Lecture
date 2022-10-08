package kapitel6;

import kapitel4.OOModelierung.Landfahrzeuge.modelle.AudiQ5;
import kapitel4.uebung.CEO;

import java.io.*;

public class Serialisierung {
    public static void main(String[] args) throws Exception {
        File out = new File("output.txt");

        CEO ceo = new CEO("Anna", 1234.5, 0.,5, 1234124);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(out));
        objectOutputStream.writeObject(ceo);


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(out));
        Object o = objectInputStream.readObject();

        if (o instanceof CEO) {
            System.out.println(((CEO) o).getName());
        }
    }
}
