package Beginner.Iteration;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        int i = 5;
        while (i > 0) {             // here is the same as a for loop
            System.out.println("Hello World " + i);
            i--;
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        //do while loop
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
