package com.xuesong.demo01;

public interface MyInterfacePrivate {
    public default void methodA(){
        System.out.println("默认方法A");
        System.out.println("kkk");
        System.out.println("kkk");
        System.out.println("kkk");
    }

    public default void methodB(){
        System.out.println("默认方法B");
        System.out.println("kkk");
        System.out.println("kkk");
        System.out.println("kkk");
    }
}
