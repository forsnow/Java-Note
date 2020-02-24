package com.xuesong.demo09Lambda;

import java.util.function.Supplier;

public class demo03Supplier {
    public static void main(String[] args) {
        String s = supplierTest(()->{
            return "xuesong";
        });

        System.out.println(s);
    }

    private static String supplierTest(Supplier<String> str){
        return str.get();
    }
}
