package com.blogging.java11;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotDemo {

    public static void main(String[] args) {
        List<String> words = List.of("John", "", "Running", "   ", "For", "\n", "5mins");
        beforeJava11(words);
        afterJava11_way1(words);
        afterJava11_way2(words);
    }

    private static void afterJava11_way2(List<String> words) {
        System.out.println("**** Before Java 11 - Way 2 *****");
        words.stream()
                .filter(Predicate.not(String::isBlank)) // new feature
                .forEach(System.out::println);
    }

    private static void afterJava11_way1(List<String> words) {
        System.out.println("**** Before Java 11 - Way 1 *****");
        words.stream()
                .filter(x -> !x.isBlank())
                .forEach(System.out::println);
    }

    private static void beforeJava11(List<String> words) {
        System.out.println("**** Before Java 11 *****");
        words.stream()
                .filter(x -> x.trim().length() > 0)
                .forEach(System.out::println);
    }
}
