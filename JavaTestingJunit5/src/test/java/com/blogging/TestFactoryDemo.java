package com.blogging;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

public class TestFactoryDemo {

    @TestFactory
    public Stream<DynamicTest> dynamicTestStream() {
        return Stream.of(
                DynamicTest.dynamicTest("Test numbers equality",
                        () -> Assertions.assertEquals(1, 1)),
                DynamicTest.dynamicTest("Test string equality", () -> Assertions.assertEquals("string", "string")));
    }
}
