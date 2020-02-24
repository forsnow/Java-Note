package com.xuesong.demo01;

import java.util.ArrayList;

public class demo03ForEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 456, 245, 234, 3423, 4234};
        for (int i : arr) {
            System.out.println(i);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("xuesong");
        arrayList.add("forsnow");
        arrayList.add("xue");
        arrayList.add("song");
        for (String s :
                arrayList) {
            System.out.println(s);
        }

    }
}
