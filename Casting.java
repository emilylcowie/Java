package com.example;

public class Casting {
    // Casting is the process of storing values in data types.
    // Implicit casting is the automatic casting of a value into a data type that can store more values
    // E.g. you can store byte in short because byes stores 1 byte and short stores 2 bytes
    // However this means that you cannot store a short in a byte because this exceeds the storage limit
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        // cannot cast number to string - not compatible
        short a = 1;
        int b = a + 2;
        System.out.println(b); //outputs 3

        //solution to cast double with int - convert int to double
        double c = 1.1;
        int d = (int)c + 2; // 2,0
        System.out.println(d); //outputs 3.1. Can't cast double onto int

        //Casting string to int
        String e = "1";
        int f = Integer.parseInt(e) + 2; // also have Short.parseShort() etc etc
        System.out.println(f); // outputs 3

        //Parsing string float value as int
        String g = "1.1";
        double h = Double.parseDouble(g) + 2; //need to change int to double
        System.out.println(h); //Outputs 3.1
    }
}
