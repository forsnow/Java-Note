package com.xuesong.demo03;

public class Father {
    int num = 100;

    public void method(){
        System.out.println("父类方法");
    }

    public void methodFather(){
        System.out.println("父类特有方法");
    }

    public void shouNum(){
        System.out.println(num);
    }
}
