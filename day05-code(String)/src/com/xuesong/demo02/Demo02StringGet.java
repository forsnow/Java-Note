package com.xuesong.demo02;
/*
*
* */
public class Demo02StringGet {
    public static void main(String[] args) {
        //字符串长度
        String str1 = "xuesong";
        System.out.println(str1.length());

        //拼接字符串
        String str2 = "hello";
        System.out.println(str2.concat(str1));

        //获取指定索引位置的单个字符
        System.out.println(str1.charAt(3));

        //查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1
        System.out.println(str1.indexOf("s"));
        System.out.println(str1.indexOf("z"));

    }
}
