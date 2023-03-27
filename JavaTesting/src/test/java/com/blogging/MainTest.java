package com.blogging;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        executeAssertionsTest();
        executeCustomTestClass();
    }

    private static void executeCustomTestClass() {
        TestSuite testSuite = new TestSuite();
        testSuite.addTestSuite(CustomTestClass.class);
        TestResult result = TestRunner.run(testSuite);
        result.errors().asIterator().forEachRemaining(failure -> {
            System.err.println(failure.toString());
        });
        int countTestCases = testSuite.countTestCases();
        System.out.println("Test Cases executed - " + countTestCases);
        System.out.println("CustomTestClass successful - " + result.wasSuccessful());
    }

    private static void executeAssertionsTest() {
        Result result = JUnitCore.runClasses(AssertionsTest.class);
        List<Failure> failures = result.getFailures();
        for(Failure failure : failures) {
            System.err.println(failure.toString());
        }
        System.out.println("AssertionsTest successful - " + result.wasSuccessful());
    }
}
