package com.blogging.java9;

import java.util.List;
import java.util.Set;

public class CollectionFactoryDemo {

    public static void main(String[] args) {
        List<String> names = List.of("George", "Jason", "Michelle");

        try {
            names.add("new name");
        } catch(UnsupportedOperationException usoe) {
            System.err.println("List is unmodifiable.");
        }

        try {
            List.of("some string", null);
        } catch(NullPointerException npe) {
            System.err.println("List cannot have null elements.");
        }

        try {
            Set.of(1,2,2);
        } catch(IllegalArgumentException iae) {
            System.err.println("Set cannot have duplicates.");
        }
    }
}
