package Beginner.Input;

import java.util.Scanner;

public class ReadingStringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // If inputted Emily, this will return " You are Emily "
        System.out.print("Name: ");                 // If inputted Emily Cowie, this will return "You are Emily"
        String name = scanner.next();               // This is as these words are called tokens - the 'next' method
        System.out.println("You are " + name);      //         only reads one token

        // To fix this...
        String name1 = scanner.nextLine();          // Outputs "You are Emily Cowie"
        // However, if "    Emily" is inputted, it will return "You are     Emily"

        //To fix this...
        String name2 = scanner.nextLine().trim();   // Outputs "You are Emily"
    }
}
