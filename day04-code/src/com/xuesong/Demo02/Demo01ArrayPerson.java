package com.xuesong.Demo02;

/*
* 题目
* 定义一个数组，用来存储3个Person对象
*
* 数组有一个缺点，一旦创建，程序运行期间长度不能发生改变
* */
public class Demo01ArrayPerson {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        Person one = new Person("xuesong",12);
        Person two = new Person("jiang",33);
        Person three = new Person("songsong",12);

        people[0] = one;
        people[1] = two;
        people[2] = three;

        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[2]);

        System.out.println(people[0].getName());


    }
}
