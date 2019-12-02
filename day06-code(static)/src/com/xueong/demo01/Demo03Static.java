package com.xueong.demo01;
/*

静态代码块的格式：
public class 类名称{
    static{
        //静态代码内容
    }
}

特点：当第一次使用到本类的时，静态代码块执行唯一的一次。
        静态内容总是优于非静态，所有静态代码块比构造方法先执行。

        静态代码块的典型用途；
        用来一次性的对静态成员变量进行赋值

*/

public class Demo03Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
