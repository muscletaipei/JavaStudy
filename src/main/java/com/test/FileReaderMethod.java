package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
說明:讀取檔案類別(FileReader)使用方法
*/
public class FileReaderMethod {
    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader("FileReader.txt"); //建立FileReader物件

        BufferedReader bufferedReader = new BufferedReader(f); //讀入buffer
        String x;
        while ((x = bufferedReader.readLine()) != null){
            System.out.println(x); //開始讀取內容字元
        }
        f.close();
    }
}
