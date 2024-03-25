package pl.pp;

import java.util.Scanner;

public class zadanie4_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====KALKULATOR=====");
        System.out.println("Wybierz działanie matematyczne, wprowadź wybrany operator (+, -, *, /) \n DODAWANIE + \n ODEJMOWANIE - \n MNOŻENIE * \n DZIELENIE /" );

        String operator = scanner.nextLine();

        while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            System.out.println("Wprowadź poprawny operator (+, -, *, /): ");
            operator = scanner.nextLine();
        }

        System.out.println("Wprowadź pierwszą liczbę");
        while (!scanner.hasNextDouble()) {
            System.out.println("To nie jest liczba. Wprowadź pierwszą liczbę ponownie:");
            scanner.next();
        }
        double num1 = scanner.nextDouble();

        System.out.println("Wprowadź drugą liczbę");
        while (!scanner.hasNextDouble()) {
            System.out.println("To nie jest liczba. Wprowadź pierwszą drugą ponownie:");
            scanner.next();
        }

        double num2 = scanner.nextDouble();

        switch (operator) {
            case "+":
                System.out.println("Wynik: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Wynik: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Wynik: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Nie można dzielić przez zero!");
                } else
                    System.out.println("Wynik: " + (num1 / num2));
                break;
            default:
                System.out.println("Wprowadź operator ponownie");
        }
        scanner.close();
    }
}
