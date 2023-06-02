package com.blogging;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class TestExecutionListener extends RunListener {

    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("Finished Test Execution of - " + description.getMethodName());
    }

    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("Started Test Execution of - " + description.getMethodName());
    }

    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("Tests Execution started. Test Count - " + description.testCount());
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("Tests Executed - " + result.getRunCount());
    }

    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("Ignored Test Execution of - " + description.getMethodName());
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("Failed Test Execution failed for - " + failure.getDescription().getMethodName() + ". Message - " + failure.getMessage());
    }
}
