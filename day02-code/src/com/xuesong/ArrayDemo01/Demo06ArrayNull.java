package com.xuesong.ArrayDemo01;
/*
* 所有的引用类型变量，都可以赋值为一个null值，但是代表其中什么都没有
*
* 数组必须进行new初始化才能使用其中的元素，
* 如果只是赋值了一个null，没有进行new创建，
* 那么将会发生空指针异常，NullPointerException
*
* 原因 忘了 new
* 解决 补上 new
*
*
*
* */
public class Demo06ArrayNull {
    public static void main(String[] args) {
        int[] Array01 = null;
        Array01 = new int[3];
        System.out.println(Array01[0]);
    }
}
