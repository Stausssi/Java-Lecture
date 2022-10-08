package kapitel6;

public class Generic {
    public static void main(String[] args) {
        GenericList<String> stringList = new GenericList<>(5);

        for (int i = 0; i < 5; i++)
            stringList.addElementAt("" + i, i);

        try {
            stringList.getAt(7);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println(stringList.getAt(4));
    }
}
