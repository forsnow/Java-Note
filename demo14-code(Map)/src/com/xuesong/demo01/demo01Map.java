package com.xuesong.demo01;

import java.util.HashMap;
import java.util.Map;

public class demo01Map {
    public static void main(String[] args) {
        print();
    }

    private static void print(){
        Map<String, String> stringMap = new HashMap<>();

        String s1 = stringMap.put("xue","song1");
        System.out.println(s1);
        String s2 = stringMap.put("xue","song1");
        System.out.println(s2);
        String s3 = stringMap.put("xue", "song2");
        System.out.println(s3);


    }
}
