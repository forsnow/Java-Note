package com.xuesong.demo02;

import java.io.*;

public class CopyPicTest2 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\Java\\fileTest\\test.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\Java\\fileTest\\test_buffer.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        long e = System.currentTimeMillis();
        bos.flush();
        bis.close();
        fis.close();
        fos.close();
        System.out.println("执行了多少"+(e-s)+"ms");
    }
}
