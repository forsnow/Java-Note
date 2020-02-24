package com.xuesong.demo02;

public interface MyInterfaceB {
    public abstract void methodB();

    public default void methodDefault(){
        System.out.println("this is B default method");
    }
}
