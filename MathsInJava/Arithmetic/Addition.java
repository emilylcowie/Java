package com.example.ArithmeticExpressions.ArithmeticExpressions;

public class Addition {
    public static void main(String[] args) {
        int result = 10 + 3;
        System.out.println(result);

        //incrementation by 1
        int x = 1;
        ++x; // same as x++
        System.out.println(x);

        //incrementation order
        int y = 1;
        int z = y++;
        System.out.println(y); //outputs 2
        System.out.println(z); //outputs 1

        int a = 1;
        int b = ++a;
        System.out.println(a); //outputs 2
        System.out.println(b); //outputs 2

        //compound assignments
        int c = 1;
        c += 2; //also c = c + 2
        System.out.println(c);
    }
}
