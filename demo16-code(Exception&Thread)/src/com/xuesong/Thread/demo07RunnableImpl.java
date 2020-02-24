package com.xuesong.Thread;

/*
 * 目的实现卖票
 *
 * */
public class demo07RunnableImpl implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //创建一个锁对象
    Object object = new Object();

    //设置线程任务：卖票
    @Override
    public void run() {
        for (; ; ) {
            sellTicket();
        }
    }

    public /*synchronized*/ void sellTicketStatic() {
        synchronized (demo07RunnableImpl.class) {
            if (ticket > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "--->" + "正在卖第" + ticket + "票");
                ticket--;
            }
        }
    }


    public /*synchronized*/ void sellTicket() {
        synchronized (this) {
            if (ticket > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "--->" + "正在卖第" + ticket + "票");
                ticket--;
            }
        }
    }
}
