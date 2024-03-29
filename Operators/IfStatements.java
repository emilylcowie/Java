package Beginner.Operators;

import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30) {                          // if statement has 3 clauses
            System.out.println("It's a hot day");   // code blocks {} if more than one statement follows
            System.out.println("Drink water");
        } else if (temp > 20 && temp <= 30)      // no {} needed as one statement follows
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

        int income = 120_000;
        boolean hasHighIncome = (income > 100_000); // most efficient if statement
    }
}
