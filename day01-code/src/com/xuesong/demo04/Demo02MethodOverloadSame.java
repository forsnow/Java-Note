package com.xuesong.demo04;
/*
* 题目：
* 比较两个数据是否相等
* 参数类型分别为两个 byte 类型，两个short类型，两个int类型，两个long类型
*
* */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 30;
        byte b = 40;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)10,(short)20));
        System.out.println(isSame(10,10));
        System.out.println(isSame(10L,10L));
    }

    public static boolean isSame(byte a , byte b){
        return a == b;
    }

    public static boolean isSame(short a , short b){
        return a == b;
    }

    public static boolean isSame(int a , int b){
        return a == b;
    }
    public static boolean isSame(long a , long b){
        return a == b;
    }
}
