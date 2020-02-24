package com.xuesong.demo02;

public class demo01hashCode {
    public static void main(String[] args) {
        String str1 = new String("xuesong");
        String str2 = new String("xuesong");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
