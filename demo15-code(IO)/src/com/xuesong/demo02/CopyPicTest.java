package com.xuesong.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicTest  {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\Java\\fileTest\\test.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\Java\\fileTest\\test_copy.jpg");
        //用一个数组设置读取缓冲
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        long e = System.currentTimeMillis();
        fos.close();
        fis.close();
        System.out.println("执行了多少"+(e-s)+"ms");
    }
}
