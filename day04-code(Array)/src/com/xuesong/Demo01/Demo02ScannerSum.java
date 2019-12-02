package com.xuesong.Demo01;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input first num:");
        int a = scanner.nextInt();
        System.out.println("Please input second num:");
        int b = scanner.nextInt();
        System.out.println("sum:"+(a+b));
    }
}
