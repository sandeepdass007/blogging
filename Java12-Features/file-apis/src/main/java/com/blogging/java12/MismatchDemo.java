package com.blogging.java12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MismatchDemo {

    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        identicalCase(file1, file2);
        mismatchCase(file1, file2);
    }

    private static void mismatchCase(File file1, File file2) throws IOException {
        System.out.println("***** Executing Mismatch Case *****");
        Files.writeString(file1.toPath(), "https://www.simplyengineers.in");
        Files.writeString(file2.toPath(), "https://www.simplyengineers.in/");
        checkMismatch(file1, file2);
    }

    private static void identicalCase(File file1, File file2) throws IOException {
        System.out.println("***** Executing Identical Case *****");
        Files.writeString(file1.toPath(), "www.simplyengineers.in");
        Files.writeString(file2.toPath(), "www.simplyengineers.in");
        checkMismatch(file1, file2);
    }

    private static void checkMismatch(File file1, File file2) throws IOException {
        long mismatchIndex = Files.mismatch(file1.toPath(), file2.toPath());
        if(mismatchIndex == -1) {
            System.out.println("Both files are identical");
        } else {
            System.out.println("Both files are not identical. They are different from index: " + mismatchIndex);
        }
    }
}
