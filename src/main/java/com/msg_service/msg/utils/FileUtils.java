package com.msg_service.msg.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 */
public class FileUtils {

    public static void main(String[] args) throws Exception {
        File file = new File("D:\\workspace\\week\\msg\\src\\main\\resources\\Bms费用试算.md");
        File outFile = new File("D:\\workspace\\week\\msg\\src\\main\\resources\\bms.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] temp = new byte[1024];
        FileOutputStream outputStream = new FileOutputStream(outFile);
        int size = 0;
        while ((size = fileInputStream.read(temp)) != -1){
            outputStream.write(temp,0,size);
        }
        fileInputStream.close();
        outputStream.close();
    }


}
