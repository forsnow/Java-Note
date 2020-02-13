package com.xuesong.demo03;

public class Son extends Father{
    int num = 200;

    public void methodSon(){
        int num = 100;
        System.out.println(num);  //100 局部变量
        System.out.println(this.num); //200 本类中的成员变量
        System.out.println(super.num); //300 父类中的成员变量
    }

    public void method(){
        System.out.println("子类中的同名方法");
    }
}
