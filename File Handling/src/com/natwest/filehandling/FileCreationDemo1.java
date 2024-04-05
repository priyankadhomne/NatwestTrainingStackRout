package com.natwest.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreationDemo1 {
    public static void main(String[] args) throws IOException {
        //System.out.println("File handling demo");

        File file = new File("/home/ubuntu/Documents/FileHandlingFiles/abc.txt");
        if (file.exists()) {
            System.out.println("File is present");
        }
        else {
            file.createNewFile();
            System.out.println("File is not present");
        }
        //\\
    }
}
