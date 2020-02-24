package com.xuesong.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class demo08Lock implements Runnable {
    private int ticket = 100;

    Lock ticketLock = new ReentrantLock();

    @Override
    public void run() {

        for (; ; ) {
            ticketLock.lock();

            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出第" + ticket + "票");
                ticket--;
            }

            ticketLock.unlock();
        }
    }
}
