package com.xueong.demo01;

public class MyClass {

    int num;//成员方法
    static int numStatic;//静态变量


    public void method(){
        System.out.println("普通成员方法");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);

    }

    public static void  methodStatic(){
        System.out.println("静态成员方法");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态不能直接访问非静态
//      System.out.println(num);
    }
}
