package com.xuesong.Demo01;

import com.xuesong.Demo02.Person;

/*
* 匿名对象只能使用一次
* 如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
*
* */
public class Demo04Anoymous {
    public static void main(String[] args) {
        //person就是对象的名字
        Person person = new Person();
        person.setName("xuesong");
        person.showName();

        //匿名对象
        new Person().setName("xuesong");
        new Person().showName();
    }
}
