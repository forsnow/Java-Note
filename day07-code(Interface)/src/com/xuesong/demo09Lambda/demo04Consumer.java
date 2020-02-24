package com.xuesong.demo09Lambda;

import java.util.function.Consumer;

public class demo04Consumer {
    public static void main(String[] args) {
        consumerTest("xuesong",(String name)->{
            System.out.println(name);
        });
    }

    private static void consumerTest(String name,Consumer<String> str){
        str.accept(name);
    }
}
