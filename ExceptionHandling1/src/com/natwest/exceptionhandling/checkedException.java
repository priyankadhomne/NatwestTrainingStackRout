package com.natwest.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class checkedException {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.createNewFile();
    }
}
