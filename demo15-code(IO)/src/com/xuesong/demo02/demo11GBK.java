package com.xuesong.demo02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo11GBK {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("D:\\Java\\fileTest\\bianma.txt"));
        String s ;
        while ((s = bf.readLine())!=null){
            System.out.println(s);
        }
    }
}
