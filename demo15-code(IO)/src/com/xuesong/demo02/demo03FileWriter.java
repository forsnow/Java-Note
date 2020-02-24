package com.xuesong.demo02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo03FileWriter {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Java\\fileTest\\test.txt");
        char[] chars = new char[1024];
        int read = 0;
        while((read = fr.read())!=-1){
            System.out.print((char)read);
        }
    }
}
