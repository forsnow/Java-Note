package com.xuesong.demo02;

public class Demo03String {
    public static void main(String[] args) {
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

        int i  = Integer.parseInt(s1);
        System.out.println(i);
    }
}
