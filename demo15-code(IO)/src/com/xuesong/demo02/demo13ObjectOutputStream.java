package com.xuesong.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class demo13ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream("D:\\Java\\fileTest\\Serializable.txt"));
        ops.writeObject(new Person("xuesong",12));
        ops.close();
    }

}
