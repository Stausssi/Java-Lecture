package kapitel6;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File f = new File("test.txt");


        System.out.println("Writing to 'test.txt'...");

        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (int i = 1; i <= 25; i++) {
                bw.write("Das ist die " + i + ". Zeile!");
                bw.newLine();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

        System.out.println("Done!");

        System.out.println("Reading from 'test.txt:");
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while((line = br.readLine()) != null)
                System.out.println(line);

        } catch (IOException e1) {
            e1.printStackTrace();
        }

        System.out.println("Done!");

        System.out.println("Deleting '" + f.getAbsolutePath() + "' ...");
        if (f.delete())
            System.out.println("Deleted file!");
        else
            System.out.println("Something went wrong!");
    }
}
