package com.example.DataTypes.Typesofvalue;

public class PrimitiveValues {
    public static void main(String[] args) {
        // Primitive values store:
        //    numbers
        //    characters
        //    booleans

        // Numbers
        byte reallySmallValue = 30;
        short smallValue = 200;
        int mediumValue = 1_876_543_210;
        long largeValue = 9_876_543_210L; // 'L' is needed as number is seen as - and is too large for - int.
        float smallDecimal = 10.33F; // 'F' is needed as number is seen as double.
        double largeDecimal = 152.98653245;
        // Text
        char singleLetter = 'A'; // Single quotes '' for single letter values
        boolean trueOrFalse = false;

        // byte -> 1 byte [-128, 127]
        // short -> 2 bytes [-32k, 32k]
        // int -> 4 bytes [-2B, 2B]
        // long -> 8 bytes [-18Quintillion,18Quintillion]
        // float -> 4 bytes [-2B, 2B]
        // double -> 8 bytes [-18Quintillion,18Quintillion]
        // char -> 2 bytes [-32k, 32k]
        // boolean -> 1 byte [-128, 127]
    }
}
