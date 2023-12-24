package com.example.DataTypes.Typesofvalue;

import java.awt.*;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        // primitive type
        byte x = 1;
        byte y = 2;
        x = 2;
        System.out.println(y);
        // y is not affected as x and y are independent
        // primitive types are copied by their value - completely independent

        // reference type
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        // point2 becomes point1 as they are referencing the same object
        // reference types are copied by their references
    }
}
