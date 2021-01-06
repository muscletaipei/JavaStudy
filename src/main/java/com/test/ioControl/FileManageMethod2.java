package com.test.ioControl;

import java.io.File;

public class FileManageMethod2 {
    public static void main(String[] args) {
        try {
            //利用主程式區塊參數建立File物件
            File myFile = new File(args[0]);

            //File物件是否為目錄型態
            if (myFile.isDirectory()){
                //將目錄內所有成員資料轉存成子串陣列
                String list[] = myFile.list();
                for (int i =0; i < list.length; i++){
                    //實作目錄內部成員的File物件
                    File mySubFile = new File(args[0] + "/" + list[i]);
                    //判斷mySubFile物件是否為檔案
                    if (mySubFile.isFile())
                        System.out.println(list[i] + "\t長度" + mySubFile.length());
                    else
                        System.out.println("目錄\t" + "[" + list[i] + "]");
                }
            }
            else //丟出自訂錯誤
            throw new Exception("指定路徑錯誤");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("沒有指定路徑");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
