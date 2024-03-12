package pl.pp;

import java.util.Scanner;

public class WeeksToDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj liczbe dni:");

            int days1 = scanner.nextInt();

            if (days1 < 0) {
                break;
            }

            int weeks = days1 / 7;
            int days2 = days1 % 7;
            System.out.println(days1 + " dni to " + weeks + " tygodni i " + days2 + " dni");

        }
        scanner.close();
    }
}