package com.blogging;

import junit.framework.TestCase;

public class CustomTestClass extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("Setting up pre-test environment configurations.");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("Resetting/Clearing the post-test environment configurations.");
    }

    public void testNumbers() {
        assertEquals(1,1);
    }

    public void testStrings() {
        assertEquals("String", "String");
    }
}
