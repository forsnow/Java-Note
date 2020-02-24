package com.xuesong.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class demo01List {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("jiang");
        arrayList.add("xue");
        arrayList.add("song");
        arrayList.add("kkk");
        System.out.println(arrayList);

        arrayList.add(2,"hahahaha");
        String remove = arrayList.remove(0);
        System.out.println("removed stiring is: "+ remove);
        System.out.println(arrayList);

        //遍历list集合的3种方式
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        ListIterator<String> stringListIterator = arrayList.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

        for (String s :
                arrayList) {
            System.out.println(s);
        }
    }
}
