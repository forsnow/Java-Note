package com.xuesong.demo02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo10BufferedRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\fileTest\\test.txt"));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
    }
}
