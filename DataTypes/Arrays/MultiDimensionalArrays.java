package com.example.DataTypes.Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // 2-dimensional array
        int[][] numbers = new int[2][3]; // [][] calls for a 2-dimensional array with 2 rows and 3 columns
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers)); // prints weird string bc this is multi-dimensional
        System.out.println(Arrays.deepToString(numbers)); // outputs '[[1, 0, 0], [0, 0, 0]]'

        // 2-dimensional array quicker
        int[][] numbers2d = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers2d));

    }
}
