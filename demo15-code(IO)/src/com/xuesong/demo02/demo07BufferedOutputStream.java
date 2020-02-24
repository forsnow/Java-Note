package com.xuesong.demo02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo07BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Java\\fileTest\\buffered.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("我是江雪松".getBytes());
        bos.flush();
    }
}
