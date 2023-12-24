package com.example.DataTypes.Typesofvalue;

import java.util.Date;

public class ReferenceValues {
    public static void main(String[] args) {
        //Reference Values store:
        //    complex objects
        //    date
        //    mail messages

        byte age = 30; // primitive - not an object
        Date now = new Date();
        //now.getTime(); // 'now' is an object and has attributes
        System.out.println(now); // Shortcut is: sout+tab
    }
}
