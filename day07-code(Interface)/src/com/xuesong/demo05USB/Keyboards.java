package com.xuesong.demo05USB;

public class Keyboards implements USB {
    @Override
    public void open() {
        System.out.println("Open Keyboards");
    }

    @Override
    public void close() {
        System.out.println("Close Keyboards");
    }
    public void type(){
        System.out.println("keyboads type");
    }
}
