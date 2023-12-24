package com.example.DataTypes;

public class Strings {
    public static void main(String[] args) {
        String messageLongMethod = new String("Hello World"); // redundant as their is a shorter way...
        String messageShortMethod = "Hello World"; // shorter way to do above code
        System.out.println(messageShortMethod);

        String message = "   Hello World" + "!!    ";
        System.out.println(message.endsWith("!!")); // it is an object to we can use .x
        System.out.println(message.startsWith("!!")); // returns boolean value
        System.out.println(message.length()); // outputs length of string
        System.out.println(message.indexOf("H")); // outputs value of H -> 0
        System.out.println(message.indexOf("sky")); // gets -1
        System.out.println(message.replace("!", "*")); // does not modify og string
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); // gets rid of white space
        // Strings are immutable in java
    }
}
