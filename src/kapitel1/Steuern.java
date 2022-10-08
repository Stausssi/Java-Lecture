package kapitel1;

public class Steuern {
    public static void main(String[] args) {
        double singleWage = 2000;
        printWage(singleWage);

        double[] wages = {2000, 1234, 1238, 7261, 12389};
        double sum = 0;
        for (double wage : wages) {
            printWage(wage);
            sum += getTaxes(wage);
        }
        System.out.println("This adds up to a total of " + sum + "€ in taxes!");
    }


    static void printWage(double wage) {
        System.out.println("You pay " + getTaxes(wage) + "€ in taxes with your wage being " + wage + "€!");
    }

    static double getTaxes(double wage) {
        double taxes = 0.15;

        if (wage < 3000 && wage >= 2000) {
            taxes = 0.2;
        }
        else if (wage < 4000) {
            taxes = 0.3;
        }
        else if (wage < 5000) {
            taxes = 0.35;
        }
        else {
            taxes = 0.4;
        }

        System.out.println("With a wage of " + wage + " your tax rate is " + taxes);
        return wage * taxes;
    }
}
