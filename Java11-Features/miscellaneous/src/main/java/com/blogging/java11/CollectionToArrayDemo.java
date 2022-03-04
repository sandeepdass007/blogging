package com.blogging.java11;

import java.util.List;

public class CollectionToArrayDemo {

    public static void main(String[] args) {
        oldWay();
        newWay();
    }

    private static void oldWay() {
        System.out.println("**** Collections to array - before Java 11 *****");
        List<String> names = List.of("Ross", "Joey", "Chandler", "Rachel", "Phoebe", "Monica");
        String[] namesArr = names.toArray(new String[names.size()]);
        for(String name : namesArr) {
            System.out.printf(name + " ");
        }
        System.out.println();
    }

    private static void newWay() {
        System.out.println("**** Collections to array - after Java 11 *****");
        List<String> names = List.of("Ross", "Joey", "Chandler", "Rachel", "Phoebe", "Monica");
        String[] namesArr = names.toArray(String[]::new);
        for(String name : namesArr) {
            System.out.printf(name + " ");
        }
    }
}
