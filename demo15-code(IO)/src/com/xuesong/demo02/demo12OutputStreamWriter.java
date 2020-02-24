package com.xuesong.demo02;

import java.io.*;

public class demo12OutputStreamWriter {
    public static void main(String[] args) throws IOException {
//        showGBK();
//        showDefault();
        readGBK();
    }

    private static void showGBK() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Java\\fileTest\\xueesong.txt"),"gbk");
        osw.write("xuesong江雪松");
        osw.flush();
        osw.close();
    }

    private static void showDefault() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Java\\fileTest\\xueesongUTF8.txt"));
        osw.write("xuesong江雪松 utf");
        osw.flush();
        osw.close();
    }

    private static void readGBK() throws IOException{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Java\\fileTest\\xueesong.txt"),"utf-8");
        int read;
        while ((read = isr.read())!=-1){
            System.out.print((char)read);
        }
        isr.close();
    }
}
