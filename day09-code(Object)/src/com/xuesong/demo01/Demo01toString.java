package com.xuesong.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01toString {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        System.out.println(person.toString());

        Random random = new Random();
        System.out.println(random); //没有重写toString方法

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner); //重写了toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list); //重写了toString方法

        Person p1 = new Person("xuesong",12);
        Person p2 = new Person("xuesong",12);
        System.out.println(p1.equals(p2));
    }
}
