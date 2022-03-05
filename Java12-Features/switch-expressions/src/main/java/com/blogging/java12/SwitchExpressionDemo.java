package com.blogging.java12;

import java.util.Locale;
import java.util.Scanner;

public class SwitchExpressionDemo {

    public static void main(String[] args) {
        System.out.println("Input your gender: ");
        final String gender = new Scanner(System.in).nextLine();
        switch(gender) {
            case "m", "M", "male", "Male", "MALE" -> System.out.println("Gender is male");
            case "f", "F", "female", "Female", "FEMALE" -> System.out.println("Gender is female");
        }
    }
}
