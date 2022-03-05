package com.blogging.java12;

public class IndentDemo {

    public static void main(String[] args) {
        final String sentences = "Hello World!\nHow are you?\nI hope you are learning quite well!";
        System.out.println("Original String - ");
        sentences.lines().forEach(System.out::println);
        String indentedSentences = sentences.indent(4);
        System.out.println("Indented String - ");
        indentedSentences.lines().forEach(System.out::println);
    }
}
