package Beginner.Input;

import java.util.Scanner;

public class ReadingNumberInput {

    public static void main(String[] args){
        // Simple input statement
        // Creating an object ~Scanner is a class~ (where to read data from in brackets)
        Scanner scanner = new Scanner(System.in); // System.in reads data from the terminal window
        System.out.print("Age: ");              // User input will appear on the line under as sout returns a new line
        byte age = scanner.nextByte();          //          so we use .print not .println
        System.out.println("You are " + age); // Concatenate a string with a byte (implicit casting)

        // If other values other than byte are entered...
        float age1 = scanner.nextFloat(); // small decimal
        // or
        double age2 = scanner.nextDouble(); // large decimal
    }
}
