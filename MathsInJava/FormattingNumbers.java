package Beginner.MathsInJava;

import javax.xml.stream.events.StartDocument;
import java.awt.*;
import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        //NumberFormat currency = new NumberFormat(); XX  Class is abstract - like a half-baked cake
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //factory method - makes new objects
        String result = currency.format(1234567.891); // outputs £1,234,567.89
        System.out.println(result);

        // percentages
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);     //output: 10%

        // percentages - quicker
        String result3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);
    }
}
