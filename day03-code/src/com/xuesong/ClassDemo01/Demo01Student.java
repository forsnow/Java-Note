package com.xuesong.ClassDemo01;
/*
* 现实世界的一类事物：
* 属性:事物的状态信息
* 行为:事物能够做什么
*
* Java用class描述事物
* 成员变量:事物的属性
* 成员方法:事物的行为
*
* 注意事项
* 1.成员变量是直接定义在类当中的，在方法外面
* 2.成员方法不要写static关键字
*
*
* */
public class Demo01Student {
    private String name;
    private int age;

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }

    public void study(){
        System.out.println("study");
    }


}
