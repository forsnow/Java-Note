package com.xuesong.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo02Iterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("jiang");
        collection.add("xuesong");
        collection.add("kk");
        collection.add("klein");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------------");
        for (Iterator<String> iterator1 = collection.iterator(); iterator1.hasNext();) {
            String e = iterator1.next();
            System.out.println(e);
        }

        System.out.println("---------------------");
        for (String s : collection){
            System.out.println(s);
        }
    }
}
