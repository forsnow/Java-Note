package com.xuesong.demo01;

import java.util.LinkedList;

public class demo01LinkedList {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("x");
        strings.add("u");
        strings.add("e");
        strings.add("s");
        strings.add("o");
        strings.add("n");
        strings.add("g");

        strings.push("wwww");
        strings.addLast("com");
        System.out.println(strings);
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());

        String pop = strings.pop();
        System.out.println(pop);

    }
}
