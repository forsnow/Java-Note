package com.xuesong.demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class demo02FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java\\fileTest\\test4.txt");
        byte[] bytes = new byte[1024];
        int read = fis.read(bytes);
        System.out.println(read);
//        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));






    }
}
