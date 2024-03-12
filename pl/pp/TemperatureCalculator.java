package pl.pp;

import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wprowadź temperaturę w skali Fahrenheit’a: ");
            double tempF = scanner.nextDouble();

            if (tempF == -1) {
                System.out.println("Program zakończony.");
                break;
            }

            System.out.println("Temperatura w skali Fahrenheit’a: " + tempF);

            double tempC = (tempF - 32) * 5 / 9;
            System.out.println("Temperatura w skali Celsjusza: " + tempC);

            double tempK = tempC + 273.16;
            System.out.println("Temperatura w skali Kelwina: " + tempK);

            System.out.println("-----------"); // Przerywnik

        }
        scanner.close();
    }
}
