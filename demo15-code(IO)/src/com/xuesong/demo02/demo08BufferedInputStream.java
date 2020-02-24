package com.xuesong.demo02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class demo08BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java\\fileTest\\test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];
        int len = 0 ;
        while ((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
    }
}
