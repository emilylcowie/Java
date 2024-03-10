package Beginner;

            // Aim:
            // Asks for Principal (amount of loan money)
            // Asks for Annual Interest Rate
            // Asks for Period (Years)
            // Outputs Mortgage (monthly pay out)

import java.text.NumberFormat;
import java.util.Scanner;


public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Annual Interest rate: ");
        double annualInterest = scanner.nextDouble();
        System.out.print("Period: ");
        double period = scanner.nextDouble();

        double monthlyInterest = (annualInterest/PERCENT)/MONTHS_IN_YEAR;
        double months = period * MONTHS_IN_YEAR;

        double mortgage = principal * ((monthlyInterest * Math.pow(monthlyInterest + 1, months)) /
                (Math.pow((monthlyInterest+1), months) -1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
