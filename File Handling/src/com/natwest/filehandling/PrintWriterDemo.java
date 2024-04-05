package com.natwest.filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("xyz.txt");
        pw.write("Hii");
        pw.write(65);
        pw.print(98);
        pw.print("Bat");
        pw.println("Cat");
        pw.println(99);

        pw.flush();
        pw.close();
    }
}
