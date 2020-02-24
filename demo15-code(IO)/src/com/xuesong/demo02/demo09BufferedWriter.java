package com.xuesong.demo02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class demo09BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java\\fileTest\\test.txt",true));
        for (int i = 0; i < 10; i++) {
            bw.write("hahahah");
        }
        bw.flush();
        bw.close();
    }
}
