package pl.pp;

import java.util.Scanner;

public class zadanie4_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lowerLimit, upperLimit;

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            lowerLimit = scanner.nextInt();
            upperLimit = scanner.nextInt();

            if (upperLimit <= lowerLimit) {
                System.out.println("Done");
                break;
            }

            int sumOfSquares = 0;

            for (int i = lowerLimit; i <= upperLimit; i++) {
                sumOfSquares += i * i;
            }
            System.out.println("The sums of the squares from " + (lowerLimit * lowerLimit) +
                    " to " + (upperLimit * upperLimit) + " is " + sumOfSquares);
        }
    }
}