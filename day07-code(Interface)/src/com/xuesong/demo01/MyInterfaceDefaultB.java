package com.xuesong.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void method() {
        System.out.println("B");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类d");
    }
}
