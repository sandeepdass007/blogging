package com.blogging.java9.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * <b>ofNullable</b> function in {@link Stream} class is used to provide empty
 * stream element if element being processed is null so that it can be exluded
 * from the processing.
 *
 * @author sandeepdass003@gmail.com
 */
public class OfNullableDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ross", "Chandler", "Joey", null, "Rachel", "Monica", "Phoebe");
        names.stream()
                .flatMap(x -> Stream.ofNullable(x))
                .forEach(System.out::println);
    }
}
