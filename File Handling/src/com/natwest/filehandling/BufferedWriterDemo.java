package com.natwest.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("xyz.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello");
        bw.newLine();
        bw.write("Welcome to India");
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
