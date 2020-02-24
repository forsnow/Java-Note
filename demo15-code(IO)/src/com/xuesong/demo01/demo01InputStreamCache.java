package com.xuesong.demo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class demo01InputStreamCache {
    public static void main(String[] args) throws IOException {
        try(InputStream input = new FileInputStream("D:\\Java\\fileTest\\readme.txt")){
            byte[] buffer = new byte[1000];
            int n ;
            //在循环里面赋值不会死循环是因为n的值有更新，当文件读取完成后，buffer的存储数量为0，read()方法返回-1。
            //
            //每次循环都会读取1000字节，并返回存储数量。read()方法会记录读取到的位置，下次循环接着读取，直到读到文件末尾。
            while ((n = input.read(buffer)) != -1){
                System.out.println(n);
            }
        }
    }
}
