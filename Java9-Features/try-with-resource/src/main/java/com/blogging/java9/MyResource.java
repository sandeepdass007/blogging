package com.blogging.java9;

public class MyResource implements AutoCloseable{

    private String name;

    MyResource(final String name) {
        this.name = name;
    }

    private MyResource(){}

    @Override
    public void close() throws Exception {
        System.out.println("Closing resource " + name);
    }

    public void displayMessage() {
        System.out.println("Hello World from " + name);
    }
}
