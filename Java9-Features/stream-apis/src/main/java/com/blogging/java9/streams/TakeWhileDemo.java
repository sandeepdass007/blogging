package com.blogging.java9.streams;

import java.util.stream.Stream;

/**
 * <b>takeWhile</b> in streams allows us to take first few set of elements as stream
 * until a specific condition is met. In <b>filter</b>, processing of stream continues
 * even if predicate fails but here if predicate fails then rest of the stream is
 * discarded.
 *
 * Best option to process initial few elements.
 *
 * @author sandeepdass003@gmail.com
 */
public class TakeWhileDemo {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.takeWhile(number -> number <= 5)
                .forEach(System.out::println);
    }
}
