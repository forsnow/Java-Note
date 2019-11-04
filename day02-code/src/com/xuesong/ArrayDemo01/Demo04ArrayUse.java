package com.xuesong.ArrayDemo01;
/*
*1.直接打印数组名称，得到的是数组的内存地址哈希值
*
* 访问数组元素的格式，数组名称（索引值）
* 索引值从0开始，到数组长度结束
*
*
* */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        int[] Array01 = {1,2,3,4,5};
        System.out.println(Array01);
        System.out.println(Array01[2]);
     }
}
