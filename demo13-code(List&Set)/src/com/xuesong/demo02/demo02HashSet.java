package com.xuesong.demo02;

import java.util.HashSet;

public class demo02HashSet {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person p1 = new Person("xuesong",12);
        Person p2 = new Person("xuesong",12);
        Person p3 = new Person("xuesong",13);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(people);

    }
}
