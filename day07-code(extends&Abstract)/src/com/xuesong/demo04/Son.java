package com.xuesong.demo04;

public class Son extends Father {
    int num = 300;

    public Son() {
        super();
    }

    @Override
    public void method() {
        super.method();
        System.out.println(super.num);
    }
}
