package com.xuesong.Thread;

public class Demo03MyThreadMain {
    public static void main(String[] args) {
//        Demo02MyThread mt = new Demo02MyThread();
//        mt.start();
//        new Demo02MyThread().start();
//        new Demo02MyThread().start();

//        for (int i = 0; i < 20; i++) {
//            System.out.println("main"+i);
//        }
//        Demo05Runnable demo05Runnable = new Demo05Runnable();
//        new Thread(demo05Runnable).start();

        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

    }
}
