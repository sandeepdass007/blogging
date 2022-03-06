package com.blogging.java9;

public interface Printer {

    void display(final String message);

    default void displayln(final String message) {
        String messageWithNewLine = addNewLine(message);
        display(messageWithNewLine);
    }

    private String addNewLine(final String message) {
        return message + "\n";
    }
}
