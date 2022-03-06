package com.blogging.java9;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>() {
            {
                add("Sandeep");
                add("Dass");
            }
        };
        names.forEach(System.out::println);
    }
}
