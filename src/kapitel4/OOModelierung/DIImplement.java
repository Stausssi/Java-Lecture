package kapitel4.OOModelierung;

public class DIImplement implements DefaultInterface {
    public static void main(String[] args) {
        DIImplement dii = new DIImplement();
        System.out.println(dii.methode1(10));
        System.out.println(dii.methode2(1, 2));
    }

    @Override
    public int methode1(int i) {
        return 2 * i;
    }
}
