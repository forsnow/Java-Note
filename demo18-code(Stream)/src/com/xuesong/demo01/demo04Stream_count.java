package com.xuesong.demo01;

import java.util.ArrayList;
import java.util.stream.Stream;

public class demo04Stream_count {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        Stream<Integer> stream = arrayList.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
