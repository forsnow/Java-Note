package com.xuesong.ClassDemo01;
/*
* 问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来
* 解决方法；用private关键字将需要保护的成员变量进行修饰
*
* 一旦使用了private进行修饰，那么本类当中仍然可以随意访问
* 但是超出了本类范围之外就不能再直接访问了
*
* 间接访问private成员变量，使用一对  getter和setter方法
*
*
*
*
* */
public class Demo08Private {
    private String name;
    private int age;

    public void show(){
        System.out.println(name+"  "+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
