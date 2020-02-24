package com.xuesong.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class demo14ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java\\fileTest\\Serializable.txt"));
        Object o = ois.readObject();
        ois.close();
        Person p = (Person)o;
        System.out.println(p.getAge()+p.getName());

    }
}
