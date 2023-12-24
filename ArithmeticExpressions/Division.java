package com.example.ArithmeticExpressions.ArithmeticExpressions;

public class Division {
    public static void main(String[] args) {
        //whole numbers
        int result = 10 / 5;
        System.out.println(result);

        //decimal answers
        int result2 = 10 / 3;
        System.out.println(result2); //outputs '3'

        //fixed decimal answers
        double result3 = (double)10 / (double)3;
        System.out.println(result3);

        //compound assignments
        int x = 8;
        x /= 2; //also x = x / 2
        System.out.println(x);
    }
}
