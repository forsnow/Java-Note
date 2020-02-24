package com.xuesong.demo02;

import java.io.*;
import java.util.ArrayList;

public class demo15list {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person("xuesong", 12);
        Person p2 = new Person("jiang", 13);
        Person p3 = new Person("song", 14);
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java\\fileTest\\list.txt"));
        oos.writeObject(arrayList);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java\\fileTest\\list.txt"));
        Object o = ois.readObject();
        ArrayList<Person> p = (ArrayList<Person>)o;
        for (Person person : p){
            System.out.println(person);
        }
        ois.close();
        oos.close();


    }
}
