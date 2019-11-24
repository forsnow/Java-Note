package com.xuesong.demo01;
/*
* 字符串常量池，程序中直接写上的双引号字符串，就在字符串常量池中
*
* 对于基本数据类型，== 是进行数值的比较
* 对于引用数据类型，== 是进行地址值的比较
*
* */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2); //ture
        System.out.println(str1 == str3); //false
        System.out.println(str2 == str3); //false
    }
}
