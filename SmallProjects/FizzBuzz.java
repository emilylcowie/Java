package Beginner.SmallProjects;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        // number divisible by 5 = fizz
        // number divisible by 3 = buzz
        // number divisible by 5 and 3 = fizzbuzz
        // number not = prints same number back

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number: ");
        int number = scanner.nextInt();

        boolean divisibleBy3 = (number % 3 == 0);
        boolean divisibleBy5 = (number % 5 == 0);

        if (divisibleBy3 && divisibleBy5)
            System.out.println("FizzBuzz");
        else if (divisibleBy3)
            System.out.println("Fizz");
        else if (divisibleBy5)
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}
