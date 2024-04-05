package com.natwest.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("xyz.txt");
        BufferedReader br = new BufferedReader(fr);
        //System.out.println(br.readLine());

        String ch = br.readLine();
        while (ch != null) {
            System.out.println(ch);
            ch = br.readLine();
        }
    }
}
