package kapitel5;

public class Verwirrung {
    public int a = 10;

    public Verwirrung() {
        this.a += 1;

    }

    public Verwirrung(int a) {
        a = a + this.a;

        new Verwirrung();

        this.a = a;
    }

    public void printSomething(int something) {
        setA(something + a);
        System.out.println(something + a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
