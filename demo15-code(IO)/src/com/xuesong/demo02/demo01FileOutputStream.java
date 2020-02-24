package com.xuesong.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class demo01FileOutputStream {
    public static void main(String[] args) throws IOException {
//        OutputStream output = new FileOutputStream("D:\\Java\\fileTest\\test.txt");
//        output.write("hello".getBytes("UTF-8"));
//        output.close();
//        try(OutputStream output = new FileOutputStream("D:\\Java\\fileTest\\test2.txt")){
//            output.write("xuesong hahahhaha".getBytes("UTF-8"));
//        }

        FileOutputStream fos = new FileOutputStream("D:\\Java\\fileTest\\test4.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("jiangxuesong".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
