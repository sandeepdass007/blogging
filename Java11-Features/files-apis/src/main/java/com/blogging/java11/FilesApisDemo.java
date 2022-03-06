package com.blogging.java11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FilesApisDemo {

    public static void main(String[] args) throws IOException {
        createFileWithString();
        readStringsFromFile();
    }

    private static void readStringsFromFile() throws IOException {
        final File file = new File("file.txt");
        String content = Files.readString(file.toPath());
        System.out.println(content);
    }

    private static void createFileWithString() throws IOException {
        final String content = "Hello World!\nThis is some content!";
        final File file = new File("file.txt");
        Files.writeString(file.toPath(), content);
    }
}
