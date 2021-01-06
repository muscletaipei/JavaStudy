package com.test.ioControl;

import java.io.File;
import java.io.IOException;

public class FileManageMethod {
    public static void main(String[] args) throws IOException {

        File myFile = new File("FileManageMethod.txt");
        File myReName = new File("FileManageMethod.doc");

        //新增檔案
        if (myFile.createNewFile() == true)
            System.out.println("File FileManageMethod.txt was created successfully");
        else
            System.out.println("File FileManageMethod.txt was created failed");

        //變更檔案名稱
        if (myFile.renameTo(myReName) == true)
            System.out.println("File FileManageMethod.txt was rename to FileManageMethod.doc successfully");
        else
            System.out.println("File FileManageMethod.txt was rename to FileManageMethod.doc failed");

        //刪除檔案
        if (myReName.delete() == true)
            System.out.println("File FileManageMethod.txt was deleted successfully");
        else
            System.out.println("File FileManageMethod.txt was deleted failed");
    }
}
