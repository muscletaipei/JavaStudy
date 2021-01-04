package com.test.ioControl;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataOutputStreamMethod2 {
    public static void main(String[] args) throws IOException {
        //建立兩個DataInputStream物件
        //建立第一個DataInputStream件,用以作為資料流指標判斷依據
        DataInputStream myCounter = new DataInputStream(new FileInputStream("Customer.txt"));
        //建立第二個DataInputStream件,將Customer.txt檔案內容讀入暫存區中
        DataInputStream myIn = new DataInputStream(new FileInputStream("Customer.txt"));

        //讀取暫存區內的資料
        while (myCounter.readLine() != null){
            System.out.println(myIn.readLine());
        }
        //關閉資料流
        myCounter.close();
        myIn.close();

    }
}
