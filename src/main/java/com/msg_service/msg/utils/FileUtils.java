package com.msg_service.msg.utils;

import com.msg_service.msg.model.Hongzha;

import java.io.*;

/**
 *
 */
public class FileUtils {

    public static void main(String[] args) throws Exception {
        //File file = new File("D:\\workspace\\week\\msg\\src\\main\\resources\\Bms费用试算.md");
        //File outFile = new File("D:\\workspace\\week\\msg\\src\\main\\resources\\bms.txt");
        //FileInputStream fileInputStream = new FileInputStream(file);
        //byte[] temp = new byte[1024];
        //FileOutputStream outputStream = new FileOutputStream(outFile);
        //int size = 0;
        //while ((size = fileInputStream.read(temp)) != -1){
        //    outputStream.write(temp,0,size);
        //}
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\workspace\\week\\msg\\src\\main\\resources\\ams.txt"));
        Hongzha hongzha = new Hongzha();
        hongzha.setUid(1);
        hongzha.setTouser("aaa");
        out.writeObject(hongzha);
        out.close();
        //fileInputStream.close();
        //outputStream.close();
    }


}
