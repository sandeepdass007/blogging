package com.blogging.java9.streams;

import java.util.stream.Stream;

/**
 * <b>dropWhile</b> in streams allows us to discard first few set of elements as stream
 * until a specific condition is met. It is the opposite of {@link TakeWhileDemo}.
 *
 * Best option to process last few elements.
 *
 * @author sandeepdass003@gmail.com
 */
public class DropWhileDemo {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.dropWhile(number -> number <= 5)
                .forEach(System.out::println);
    }
}
