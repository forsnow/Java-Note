package com.xuesong.demo01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class demo01ByteArrayInputStream {
    public static void main(String[] args) throws IOException {
        String getResult;
        try(InputStream input = new FileInputStream("D:\\Java\\fileTest\\readme.txt")){
            getResult = getAsString(input);
        }
        System.out.println(getResult);
    }

    static String getAsString(InputStream input) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        while ((n = input.read())!= -1){
            stringBuilder.append((char)n);
        }
        return stringBuilder.toString();
    }
}
