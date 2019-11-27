package com.xuesong.demo03;

import java.util.Scanner;

/*
 * 题目
 * 键盘输入一个字符串，并且统计其中各种字符出现的次数
 * 种类有：大写字母，小写字母，数字，其他
 *
 * */
public class Demo02StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = scanner.next();
        char[] inputToChar = input.toCharArray();

        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        for (int i = 0; i < inputToChar.length; i++) {
            char c = inputToChar[i];
            if (c >= 'A' && c <= 'Z') {
                countUpper++;
            } else if (c >= 'a' && c <= 'z') {
                countLower++;
            } else if (c >= '0' && c <= '9') {
                countNum++;
            } else {
                countOther++;
            }
        }

        System.out.println("大写字母有：" + countUpper);
        System.out.println("小写字母有：" + countLower);
        System.out.println("数字有：" + countNum);
        System.out.println("其他符号有：" + countOther);


    }
}
