package com.xuesong.demo01;

import java.util.ArrayList;
import java.util.List;

public class demo01Stream_filter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jiangxuesong");
        list.add("jiangxue");
        list.add("jiangsong");
        list.add("kaili");

        list.stream().filter(name->name.startsWith("j"))
                .filter(name->name.length()==8)
                .forEach(name-> System.out.println(name));
    }
}
