package com.xuesong.Demo04;

import java.util.Arrays;
/*
* 题目：
* 将一个随机字符串中的所有字符升序排列，并倒序打印
*
* */
public class Demo02ArraysPractice {
    public static void main(String[] args) {
        String str = "akfaj32jrjkalsjnuioruonvaadf";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

        System.out.println(Arrays.toString(chars));
    }
}
