package Beginner.Iteration;

import java.util.Scanner;

public class BreakAndContinue {

    public static void main(String[] args) {
        // PROBLEM: when quit, it echoes quit back
        // 1
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit"))
                System.out.println(input);
        }

        // 2
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

        // 3
        while (true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue; // goes back to beginning
            if (input.equals("quit"))
                break; // terminates loop
            System.out.println(input);
        }
    }
}
