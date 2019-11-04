package com.xuesong.ArrayDemo01;

/*
* 动态初始化（指定长度），在创建数组的时候，直接指定数组当中的数据元素个数
* 静态初始化（指定内容），在创建数据的时候，不直接指定数组中数据的个数多少，而是直接将具体的数据内容进行指定。
*
* 静态初始化基本格式
* 数据类型[] 数组名称 = new 数据类型[] {元素1，元素2，.. ，};
*
* 注意事项：
* 静态初始化的数组长度可以通过大括号里的元素个数推断出来
*
*
* */
public class Demo02Array {
    public static void main(String[] args) {
        int[] Array01 = new int[] {1,2,3,4};
        String[] Array02 = new String[] {"xuesong","song","xue"};
    }
}
