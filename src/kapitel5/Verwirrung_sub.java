package kapitel5;

public class Verwirrung_sub extends Verwirrung {
    private int a = 189;

    public Verwirrung_sub() {
        super();
        this.a = 18;
    }

    @Override
    public void printSomething(int something) {
        super.printSomething(something - super.a);
        System.out.println(a);
        super.a = 999;
    }
}
