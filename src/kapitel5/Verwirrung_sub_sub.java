package kapitel5;

public class Verwirrung_sub_sub extends Verwirrung_sub {
    private int a;

    public Verwirrung_sub_sub() {
        int a = 10;
        this.a = a + a + this.a;
    }

    @Override
    public void printSomething(int something) {
        Verwirrung v = new Verwirrung(something);
        System.out.println(v.getA() + this.a - something);
        super.printSomething(v.getA());
    }

    public static void main(String[] args) {
        Verwirrung sub = new Verwirrung_sub_sub();
        sub.printSomething(187);

        sub = new Verwirrung_sub();
        sub.setA(17);
        sub.printSomething(42);
        System.out.println(15);
    }
}
