package com.blogging.java9;

public class InterfaceDemo {
    public static void main(String[] args) {
        Printer printer = new InkjetPrinter();
        printer.displayln("Hello World and new line!");
        printer.display("Hello World without new line!");
        printer.display("Hello World!");
    }
}
