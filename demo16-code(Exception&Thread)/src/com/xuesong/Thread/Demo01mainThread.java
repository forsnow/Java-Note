package com.xuesong.Thread;

public class Demo01mainThread {
    public static void main(String[] args) {
        Person p1 = new Person("xuesong");
        p1.run();

        Person kl = new Person("kl");
        kl.run();
    }
}
