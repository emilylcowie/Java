package Beginner.SmallProjects;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorHarder {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float annualInterest = 0;
        float monthlyInterest = 0;
        byte period = 0;
        int months = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal > 1000 && principal < 1000000)
                break;
            System.out.print("Please enter a value between 1,000 and 1,000,000. ");
        }

        while (true) {
            System.out.print("Annual Interest rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30) {
                monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        while (true) {
            System.out.print("Period: ");
            period = scanner.nextByte();
            if (period > 1 && period < 30) {
                months = period * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(monthlyInterest + 1, months)
                / (Math.pow((monthlyInterest+1), months) -1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
