package com.xuesong.ClassDemo01;

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
