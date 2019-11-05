package com.xuesong.ClassDemo01;

public class Demo02StudentUse {
    public static void main(String[] args) {
        Demo01Student student = new Demo01Student();
        System.out.println(student.name);
        System.out.println(student.age);

        student.name = "xuesong";
        student.age = 23;
        System.out.println(student.name);
        System.out.println(student.age);

        student.eat();
        student.sleep();
        student.study();
    }
}
