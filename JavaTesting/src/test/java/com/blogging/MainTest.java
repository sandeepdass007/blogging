package com.blogging;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AssertionsTest.class);
        List<Failure> failures = result.getFailures();
        for(Failure failure : failures) {
            System.err.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
