package com.blogging;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AssertionsTest {

//    @Test
//    public void testFail() {
//        Assertions.fail("Custom Failure");
//    }

    @Test
    public void testAssertTrue() {
        assertTrue(true);
        assertTrue(1 == 1);
        assertTrue("string".equals("string"));
    }

    @Test
    @Ignore
    public void testAssertFalse() {
        assertFalse(false);
        assertFalse(1 == 2);
        assertFalse("string".equals("String"));
    }

    @Test
    public void testAssertNull() {
        String string = null;
        assertNull(null);
        assertNull(string);
    }

    @Test
    public void testAssertNotNull() {
        String string = "string";
        assertNotNull(string);
    }

    @Test
    public void testAssertEquals() {
        assertEquals(1, 1);
        assertEquals('d', 'd');
        assertEquals("String", "String");
    }

    @Test
    public void testAssertNotEquals() {
        assertNotEquals(1, 2);
        assertNotEquals(1.1f, 1.2f);
        assertNotEquals('d', 'b');
        assertNotEquals("String", "string");
    }

    @Test
    public void testAssertArrayEqual() {
        assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
        assertArrayEquals(new int[] {}, new int[] {});
    }

    @Test
    public void testAssertSame() {
        String string = "String";
        String copyString = string;
        assertSame(string, copyString);
    }

    @Test
    public void testAssertNotSame() {
        String string = "String";
        String copyString = new String(string);
        assertNotSame(string, copyString);
    }
}
