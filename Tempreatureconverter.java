import java.util.Scanner;

public class Tempreatureconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Temperature Converter");
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the unit of measurement [C for Celsius, F for Fahrenheit, K for Kelvin]: ");
        String realunit = scanner.next().toUpperCase();

        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;

        switch (realunit) {
            case "C":
                celsius = temperature;
                fahrenheit = c2f(celsius);
                kelvin = c2k(celsius);
                break;
            case "F":
                fahrenheit = temperature;
                celsius = f2c(fahrenheit);
                kelvin = c2k(celsius);
                break;
            case "K":
                kelvin = temperature;
                celsius = k2c(kelvin);
                fahrenheit = c2f(celsius);
                break;
            default:
                System.out.println("Invalid unit of measurement.");
                return;
        }

        System.out.println("Converted Temperatures:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        scanner.close();
    }

    // Conversion functions
    public static double c2f(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double c2k(double celsius) {
        return celsius + 273.15;
    }

    public static double f2c(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double k2c(double kelvin) {
        return kelvin - 273.15;
    }
}
