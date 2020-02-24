package com.xuesong.demo02;

public interface MyInterfaceA {
    public abstract void methodA();

    public default void methodDefault(){
        System.out.println("this is A default method");
    }
}
