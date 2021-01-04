package com.test.ioControl;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedSteam {

    public byte setByte(){
        //具傳回值的類別成員方法
        byte myByte =32;
        System.out.println("my output 物件輸出的位元組資料為: " + myByte);
        return (myByte);
    }
    //具傳參數列的類別成員方法
    public void showByte(byte showMyByte){
        System.out.println("my Input 物件接收到的位元組資料為: " + showMyByte);
    }

    public static void main(String[] args) throws IOException {
        //建立管線輸出入物件
        PipedOutputStream myOutput = new PipedOutputStream();
        PipedInputStream myInput = new PipedInputStream(myOutput);

        //建立主類別物件
        PipedSteam myObject = new PipedSteam();
        //將主類別成員方法的傳回值透過myOutput物件輸出
        myOutput.write(myObject.setByte());

        //將myInput接收的資料導入showByte()方法的參數列中
        myObject.showByte((byte) (myInput.read()));
    }
}
