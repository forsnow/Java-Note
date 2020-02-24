package com.xuesong.demo01;

import java.util.ArrayList;
import java.util.Collection;

public class demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> collection1 = new ArrayList<>();

        collection1.add("xuesong");
        collection1.add("kklein");
        collection1.remove("xuesong");
        collection1.clear();
        System.out.println(collection1);


    }
}
