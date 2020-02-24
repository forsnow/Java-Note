package com.xuesong.demo03;

public class Demo01Multi {
    public static void main(String[] args) {
        Father test = new Son();
        test.method();
        test.methodFather();
        System.out.println(test.num);
        test.shouNum();
        Son son = (Son)test;
        son.playGames();
    }
}
