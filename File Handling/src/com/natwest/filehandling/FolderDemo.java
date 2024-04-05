package com.natwest.filehandling;

import java.io.File;

public class FolderDemo {
    public static void main(String[] args) {
        File file = new File("/home/ubuntu/Documents/FileHandlingFiles/Movie");
        //file.mkdirs();
        file.delete();
    }
}
