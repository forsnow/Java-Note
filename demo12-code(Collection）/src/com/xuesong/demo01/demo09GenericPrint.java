package com.xuesong.demo01;

import java.util.ArrayList;
import java.util.Iterator;

public class demo09GenericPrint {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("xuesong");
        stringArrayList.add("jiang");
        stringArrayList.add("xue");

        printArray(integerArrayList);
        printArray(stringArrayList);

    }

    public static void printArray(ArrayList<?> arrayList){
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
