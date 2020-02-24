package com.xuesong.Lambda;

public class CookTest {
    public static void main(String[] args) {
        MyCook(()->{
            System.out.println("hahahahah");
        });

    }

    public static void MyCook(Cook cook){
        cook.cookFood();
    }
}
