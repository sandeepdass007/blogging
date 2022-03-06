package com.blogging.java9.streams;

import java.util.stream.Stream;

/**
 * <b>iterate</b> is a static function of {@link Stream} class which provides a variation
 * to existing iterate method. Now, we can provide predicate to limit it's boundary.
 *
 * @author sandeepdass003@gmail.com
 */
public class IterateDemo {

    public static void main(String[] args) {
        Stream.iterate(1, number -> number <= 10, number -> number + 1)
                .forEach(System.out::println);
    }
}
