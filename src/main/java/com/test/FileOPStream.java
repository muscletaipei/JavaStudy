package com.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOPStream {
    public static void main(String[] args) throws IOException {
        byte [] fb = "FileOutputStream.. Test".getBytes();
        FileOutputStream f = new FileOutputStream("Test2.txt");
        for (int i=0; i < fb.length; i++){
            f.write(fb[i]);
        }
        f.close();
    }
}
