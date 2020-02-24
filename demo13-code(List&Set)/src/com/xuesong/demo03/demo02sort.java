package com.xuesong.demo03;

import java.util.ArrayList;
import java.util.Collections;

public class demo02sort {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(45);
        list1.add(12);
        list1.add(-1);
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("c");
        list2.add("b");
        list2.add("e");
        Collections.sort(list2);
        System.out.println(list2);

        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("xuesong",12);
        Person person2 = new Person("xuesong",18);
        Person person3 = new Person("xuesong",8);
        Collections.addAll(people,person1,person2,person3);
        Collections.sort(people);
        System.out.println(people);
    }
}
