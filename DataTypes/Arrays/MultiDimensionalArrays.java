package Beginner.DataTypes.Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // 2-dimensional array
        int[][] numbers = new int[2][3]; // [][] calls for a 2-dimensional array | with 2 rows and 3 columns
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers)); // prints weird string bc this is multi-dimensional cant use 'toString'
        System.out.println(Arrays.deepToString(numbers)); // outputs '[[1, 0, 0], [0, 0, 0]]'

        // 2-dimensional array quicker
        int[][] numbers2d = { {1, 2, 3}, {4, 5, 6} }; // each embedded array is a row, each number is a column
        System.out.println(Arrays.deepToString(numbers2d)); // output: [[1, 2, 3], [4, 5, 6]]

        // 3-dimensional array
        int[][][] numbers3d = new int[2][3][4];
        numbers3d[0][0][0] = 1; //outputs [[[1, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]]
        System.out.println(Arrays.deepToString(numbers3d));

        // 3-dimensional array quicker
        int[][][] numbers3dq =  { { {1, 2}, {3, 4}, {5, 6} }, { {4, 5}, {6, 7}, {8, 9} } };
        System.out.println(Arrays.deepToString(numbers3dq));
    }
}
