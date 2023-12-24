package com.example.ArithmeticExpressions.ArithmeticExpressions;

public class Casting {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        // cannot cast number to string - not copatible
        short x = 1;
        int y = x + 2;
        System.out.println(y); //outputs 3

        double a = 1.1;
        double b = a + 2; // 2,0
        System.out.println(b); //outputs 3.1. Can't combine double with int

        double c = 1.1;
        int d = (int)c + 2; // 2,0
        System.out.println(d); //outputs 3.1. Can't combine double with int

        String e = '1';
        Float.parseShort() // int
        

    }
}
