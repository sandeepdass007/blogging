package com.blogging.java12;

public class TransformDemo {

    public static void main(String[] args) {
        final String string = "21 avaJ gninraeL peeK";
        String transformedString = string.transform(str -> new StringBuilder(str).reverse().toString());
        System.out.println(transformedString);
    }
}
