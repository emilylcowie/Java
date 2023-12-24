package com.example.DataTypes.Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //integer array default = 0
        //string array default = empty string
        //boolean array default = false

        // want to store 1 as an array
        int number = 1;
        //int[] number = 1; // error as trying to store a single number in an array
        int[] numbers = new int[5]; // arrays are reference types so we need 'new'

        //assigning values
        numbers[0] = 1; // indexing starts at 0
        numbers[1] = 2;
        numbers[10] = 3; // gets Exception (error) as index is out of range

        //printing it
        System.out.println(numbers); // output is '[I@38af3868'  as it is the address of the memory space
        System.out.println(Arrays.toString(numbers)); // solved '[1, 2, 0, 0, 0]'

        //assigning values quicker
        int[] numbersQuick = { 2, 3, 5, 1, 4};
        System.out.println(numbersQuick.length);
        Arrays.sort(numbersQuick);
        System.out.println(Arrays.toString(numbersQuick));
    }
}
