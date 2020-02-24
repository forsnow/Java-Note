package com.xuesong.demo02;

public class demo01MethodReference {
    public static void main(String[] args) {
        printString((s)-> System.out.println(s));
        printString(System.out::println);

    }

    private static void printString(Printer printer){
        printer.print("xuesong");
    }
}
