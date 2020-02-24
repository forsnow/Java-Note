package com.xuesong.demo01;

public class demo06GenericImpl implements demo05GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
