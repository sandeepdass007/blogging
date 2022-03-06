package com.blogging.java11;

import java.util.List;

public class LocalVariableLambdaDemo {

    public static void main(String[] args) {
        List<String> names = List.of("Ross", "Joey", "Chandler", "Rachel", "Phoebe", "Monica");
        oldWay(names);
        newWay(names);
    }

    private static void newWay(List<String> names) {
        names.stream()
                .map((var x)-> x.toUpperCase())
                .forEach(System.out::println);
    }

    private static void oldWay(List<String> names) {
        names.stream()
                .map(x -> x.toUpperCase()) // or .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
