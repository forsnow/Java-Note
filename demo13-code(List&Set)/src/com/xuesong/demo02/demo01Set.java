package com.xuesong.demo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo01Set {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("jiang");
        strings.add("xue");
        strings.add("song");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
