package com.xuesong.demo01;

public class demo08GenericImpl2<I> implements demo05GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
