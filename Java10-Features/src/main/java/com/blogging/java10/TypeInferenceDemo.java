package com.blogging.java10;

public class TypeInferenceDemo {

    // var global; it only works in local scope

    public static void main(String[] args) {
        var str = "Message";
        System.out.println(str);
        System.out.println(str.toUpperCase());

        var num = 1;
        // num = "s"; it keeps the type associated once declared and cannot be changed
        // var justDeclaration; it cannot infer the type until we provide data.
    }
}
