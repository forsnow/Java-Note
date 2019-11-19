package com.xuesong.Demo02;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xuesong1");
        list.add("xuesong2");
        list.add("xuesong3");
        list.add("xuesong4");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
