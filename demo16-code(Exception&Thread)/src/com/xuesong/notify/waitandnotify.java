package com.xuesong.notify;

public class waitandnotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
               synchronized (obj){
                   System.out.println("消费者0告诉老板要买包子的种类和数量");
                   try {
                       obj.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("消费者0拿到包子了，开吃！");

               }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("消费者1告诉老板要买包子的种类和数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("消费者1拿到包子了，开吃！");

                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("老板用了5s取包子给消费者");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    obj.notifyAll();
                }
            }
        }).start();
    }
}
