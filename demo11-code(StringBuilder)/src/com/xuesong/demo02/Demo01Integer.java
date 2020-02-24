package com.xuesong.demo02;

public class Demo01Integer {
    public static void main(String[] args) {
        Integer integer = new Integer(10);
        System.out.println(integer); //重写了toString方法

        Integer integer1 = new Integer("100");
        System.out.println(integer1);

        //静态方法
        Integer integer2 = Integer.valueOf(20);
        System.out.println(integer2);

        Integer integer3 = Integer.valueOf("200");
        System.out.println(integer3);


        int a = integer3.intValue();
        System.out.println(a);
    }
}
