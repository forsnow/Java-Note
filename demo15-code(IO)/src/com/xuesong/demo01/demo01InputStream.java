package com.xuesong.demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class demo01InputStream {
    public static void main(String[] args) throws IOException {
/*        InputStream input = new FileInputStream("D:\\Java\\fileTest\\readme.txt");
        for (;;){
            int n = input.read();
            if (n == -1){
                break;
            }
            System.out.println(n);
        }
        input.close();
        */
        try(InputStream input = new FileInputStream("D:\\Java\\fileTest\\readme.txt")){
            int n = input.read();
            while (n != -1){
                System.out.println(n);
            }
        }// 编译器会自动在这调用finally 并close input释放资源

    }
}
