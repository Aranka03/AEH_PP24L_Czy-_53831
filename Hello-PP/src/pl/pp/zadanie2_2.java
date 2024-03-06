package pl.pp;

import java.util.Scanner;

public class zadanie2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoj wiek w latach: ");
        int ageYears = scanner.nextInt();

        // Zakladam, ze rok ma 365 dni.
        int ageSec = ageYears * 365 * 24 * 60 * 60;

        System.out.println("Twoj wiek w sekudach: " + ageSec);
        scanner.close();
    }
}
