package com.xuesong.ClassDemo01;
/*
* 构造方法是用来专门用来创建对象的方法，当我们通过关键字new来创建兑现时，其实就是在调用构造方法。
* 格式：
* public 类名称（参数类型 参数列表）{
*     方法体
* }
*
* 注意事项
* 1. 构造方法的名称和所在类名称完全一样。
* 2.构造方法不要写返回值类型，连viod都不写
* 3.构造方法不能return一个具体的返回值
* 4.吐过没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数，方法体什么事情都不做。
* 4.一旦编写了至少一个构造方法，那么编译器将不再赠送
*
* 一个标准的类通常要拥有下面四个组成部分
* 1.所有的成员变量都要使用private关键字修饰
* 2.为每一个成员变量编写getter/setter方法
* 3.编写一个无参的构造方法
* 4.编写一个全参数的构造方法
*
* 这样的标准的类也叫Java Bean
* */
public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
