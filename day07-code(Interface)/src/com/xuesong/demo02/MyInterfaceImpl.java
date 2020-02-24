package com.xuesong.demo02;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {

    }

    @Override
    public void methodDefault() {
        System.out.println("this impl default method");
    }

    @Override
    public void methodB() {

    }
}
