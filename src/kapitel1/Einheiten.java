package kapitel1;

public class Einheiten {
    public static void main(String[] args) {
        double tempInC = 40.2;

        System.out.println(tempInC + "°C in Kelvin: " + getKelvinFromCelsius(tempInC));
        System.out.println(tempInC + "°C in Fahrenheit: " + getFahrenheitFromCelsius(tempInC));

        System.out.println("Now using Fahrenheit temperature!");

        double tempInF = 105;
        System.out.println(tempInF + "°F in Kelvin: " + getKelvinFromFahrenheit(tempInF));
        System.out.println(tempInF + "°F in Celcius: " + getCelsiusFromFahrenheit(tempInF));
    }

    static double getKelvinFromCelsius(double degreeCelsius) {
        return degreeCelsius + 273.15;
    }
    static double getFahrenheitFromCelsius(double degreeCelsius) {
        return 1.0 * degreeCelsius * 9/5 + 32;
    }

    static double getKelvinFromFahrenheit(double degreeFahrenheit) {
        return getKelvinFromCelsius(getCelsiusFromFahrenheit(degreeFahrenheit));
    }

    static double getCelsiusFromFahrenheit(double degreeFahrenheit) {
        return 1.0 * 5/9 * (degreeFahrenheit - 32);
    }
}
