package com.test.ioControl;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamMethod {
    public static String firstName [] = {"OS Ver: ", "Android Ver: ", "Diag Ver:"};
    private static String lashName [] = {"V1.0.0", "Android 9", "V1.0.3" };

    public static void main(String[] args) throws IOException {
        //建立DataOutputStream物件
        DataOutputStream myOutput = new DataOutputStream(new FileOutputStream("Customer.txt"));

        //自定格式化寫出動作
        for (int i=0; i < firstName.length; i++){
            myOutput.writeChars(firstName[i]);
            myOutput.writeChar(' ');
            myOutput.writeChars(lashName[i] + "\n");
//            myOutput.writeChars("\n");
        }
        myOutput.close();
    }
}
