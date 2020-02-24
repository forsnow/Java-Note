package com.xuesong.Thread;

public class demo09LockMain {
    public static void main(String[] args) {
        demo08Lock test = new demo08Lock();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        t1.start();
        t2.start();
        t3.start();
    }
}
