package com.xuesong.demo01;

public interface MyInterfaceDefault {
    public abstract void method();

    //新添加的方法，改成默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
