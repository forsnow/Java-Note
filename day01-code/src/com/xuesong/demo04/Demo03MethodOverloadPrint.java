package com.xuesong.demo04;
/*
* println这个方法的源码也用到了 重载
* */
public class Demo03MethodOverloadPrint {
    public static void main(String[] args) {
        printNum(10);
        printNum(20L);
    }

    public static void printNum(int a){
        System.out.println(a);
    }

    public static void printNum(double a){
        System.out.println(a);
    }

    public static void printNum(long a){
        System.out.println(a);
    }

    public static void printNum(byte a){
        System.out.println(a);
    }
}
