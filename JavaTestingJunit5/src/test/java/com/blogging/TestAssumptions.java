package com.blogging;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class TestAssumptions {

    @Test
    public void testAssumptions() {
        Assumptions.assumeFalse(1 == 2);
        Assumptions.assumeTrue(1 == 1);
        Assumptions.assumingThat("String".equals("String"), () -> {
            System.out.println("Yes, both strings are equal.");
        });
    }
}
