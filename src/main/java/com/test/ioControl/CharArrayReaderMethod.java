package com.test.ioControl;
/*
說明:讀耶字元陣列類別(CharArrayReader)使用方法
*/

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderMethod {
    public static void main(String[] args) throws IOException {
        String x = "CharArrayReader Test";
        char [] c = new  char[x.length()];
        x.getChars(0,x.length(),c,0); //將字串存入緩衝器中
        int a;
        CharArrayReader ch = new CharArrayReader(c);
        while ((a=ch.read()) != -1){
            System.out.print((char) a);
        }
    }
}
