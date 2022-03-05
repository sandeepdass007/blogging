package com.blogging.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatDemo {
    public static void main(String[] args) {
        int number = 20568;
        shortStyleCase(number);
        longStyleCase(number);
    }

    private static void longStyleCase(int number) {
        NumberFormat longNumberFormat = NumberFormat.getCompactNumberInstance(new Locale("en", "US"),
                NumberFormat.Style.LONG);
        longNumberFormat.setMaximumFractionDigits(2);
        System.out.println(number + " in long style is - " + longNumberFormat.format(number));
    }

    private static void shortStyleCase(int number) {
        NumberFormat shortNumberFormat = NumberFormat.getCompactNumberInstance(new Locale("en", "US"),
                NumberFormat.Style.SHORT);
        shortNumberFormat.setMaximumFractionDigits(2);
        System.out.println(number + " in short style is - " + shortNumberFormat.format(number));
    }
}
