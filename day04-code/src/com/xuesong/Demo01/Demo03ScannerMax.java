package com.xuesong.Demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input first num:");
        int a = scanner.nextInt();
        System.out.println("Please input second num:");
        int b = scanner.nextInt();
        System.out.println("Please input third num:");
        int c = scanner.nextInt();

        int temp = a > b ? a : b;
        int max = c > temp ? c : temp;
        System.out.println("max:"+max);
    }
}
