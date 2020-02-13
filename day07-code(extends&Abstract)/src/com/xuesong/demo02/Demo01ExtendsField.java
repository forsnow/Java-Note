package com.xuesong.demo02;
/*
1.继承中成员变量的访问特点

在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式。

直接通过子类对象访问成员变量(等号左边是谁，就优先用谁，没有则向上找)
间件通过成员方法访问成员变量(改方法属于谁，就优先用谁)
*/
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.numFather);

        Son son = new Son();
        System.out.println(son.numFather);
        System.out.println(son.numSon);

        System.out.println(son.num);

        son.methodSon();
        father.methodFather();

    }
}
