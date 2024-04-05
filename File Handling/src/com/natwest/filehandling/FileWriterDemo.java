package com.natwest.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("xyz.txt",true);
        fw.write("Hello");
        fw.write("Java");

        fw.flush();
        fw.close();
    }
}
