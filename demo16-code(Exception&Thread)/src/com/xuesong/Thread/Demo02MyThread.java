package com.xuesong.Thread;

public class Demo02MyThread extends Thread{
    @Override
    public void run() {
//        for (int i = 0; i < 20; i++) {
//            System.out.println("run"+i);
//        }
//        Thread thread = currentThread();
//        System.out.println(thread);
//        String name = thread.getName();
//        System.out.println(name);
        System.out.println(Thread.currentThread().getName());
    }
}
