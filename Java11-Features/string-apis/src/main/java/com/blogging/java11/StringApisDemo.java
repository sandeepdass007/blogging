package com.blogging.java11;

public class StringApisDemo {

    public static void main(String[] args) {
        demonstrateRepeat();
        demonstrateStrip();
        demonstrateIsBlank();
        demonstrateLines();
    }

    /**
     * {@link String#lines()} method split the string by line terminator character and creates a Stream of Strings.
     * A line terminator character can be either of - “\n”, “\r”, or “\r\n”.
     */
    private static void demonstrateLines() {
        System.out.println("***** Demonstrating Lines *****");
        final String stringWithNewLines = "Hello Everyone!\nMy name is Sandeep Dass.\nAnd my website is www.simplyengineers.in.";
        stringWithNewLines.lines().forEach(System.out::println);
    }

    /**
     * {@link String#isBlank()} is more superior as it ignores white spaces as well as spaced presented
     * using unicode.
     */
    private static void demonstrateIsBlank() {
        System.out.println("***** Demonstrating Is Blank *****");
        final String stringWithSpaces = "\n\t  \u2005";
        System.out.println(stringWithSpaces + " is blank? - " + stringWithSpaces.isBlank());
    }

    /**
     * {@link String#strip()}, {@link String#stripLeading()} and {@link String#stripTrailing()}
     * methods strip the spaces including space characters presented using unicode.
     */
    private static void demonstrateStrip() {
        System.out.println("***** Demonstrating Strip *****");
        final String stringWithSpaces = "\n\t  normal string   \u2005";
        final String stripped = stringWithSpaces.strip();
        final String stripLeading = stringWithSpaces.stripLeading();
        final String stripTrailing = stringWithSpaces.stripTrailing();
        System.out.println(stripped + ": " + stripped.length());
        System.out.println(stripLeading + ": " + stripLeading.length());
        System.out.println(stripTrailing + ": " + stripTrailing.length());
    }

    /**
     * {@link String#repeat(int)} repeat a string based upon the count passed and return it.
     */
    private static void demonstrateRepeat() {
        System.out.println("***** Demonstrating Repeat *****");
        final String la = "la ";
        final String song = la.repeat(5);
        System.out.println(song);
    }
}
