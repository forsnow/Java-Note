package com.xuesong.Demo04;

import java.util.Arrays;
/*
Arrays

        java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组的常见操作

public static String toString(数组)
        将参数数组变成字符串(按照默认格式，[elment1,elment2,..])

public static void sort(数组)
        按照默认升序(从小到大)对数组的元素进行排序

        备注：
        1.如果是数值，sort默认按照升序从小到大
        2.如果是字符串，sort默认按照字母升序
        3，如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] num = {1,2,444,12,43,21,4,32,43534,23,121,3};
        String[] string = {"ccc","bbb","aaa"};

        System.out.println(Arrays.toString(num));

        Arrays.sort(num);
        Arrays.sort(string);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(string));


    }
}
