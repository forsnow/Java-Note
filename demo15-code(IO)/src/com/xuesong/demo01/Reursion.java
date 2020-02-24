package com.xuesong.demo01;

public class Reursion {
    public static void main(String[] args) {
        a();
    }

    private static void a(){
        System.out.println("a");
        a();
    }
}
