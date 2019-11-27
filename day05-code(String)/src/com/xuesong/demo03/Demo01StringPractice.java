package com.xuesong.demo03;

/*
 * 题目
 * 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串，格式参考如下[word1#word2#word3]
 *
 *  */
public class Demo01StringPractice {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(arrayToString(array));
    }

    public static String arrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}
