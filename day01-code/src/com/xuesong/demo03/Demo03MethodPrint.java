package com.xuesong.demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printHello(3);
    }

    public static void printHello(int i){
        for (int j = 0; j < i; j++) {
            System.out.println("hello world");
        }
    }
}
