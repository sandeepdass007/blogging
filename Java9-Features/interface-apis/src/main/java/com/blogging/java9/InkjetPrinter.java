package com.blogging.java9;

public class InkjetPrinter implements Printer {
    @Override
    public void display(final String message) {
        System.out.printf(message);
    }

}
