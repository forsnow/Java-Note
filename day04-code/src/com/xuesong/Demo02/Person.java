package com.xuesong.Demo02;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public void showName(){
        System.out.println("My name is :"+name);
    }

    public Person(String name, int age) {
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
