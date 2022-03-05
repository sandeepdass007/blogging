package com.blogging.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double avg = findAvg(numbers);
        System.out.println("Avg of numbers 1 - 10 is " + avg);
    }

    private static double findAvg(Stream<Integer> numbers) {
        Double avg = numbers.collect(Collectors.teeing( // this is new api added
                Collectors.summingDouble(number -> number), // argument 1 process the stream in some way
                Collectors.counting(), // argument 2 process the same stream in another way
                (sum, count) -> sum / count // result of both processing are collected and final operation is performed
        ));
        return avg.doubleValue();
    }
}
