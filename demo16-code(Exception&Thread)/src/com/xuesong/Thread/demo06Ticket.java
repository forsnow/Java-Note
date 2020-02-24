package com.xuesong.Thread;

public class demo06Ticket {
    public static void main(String[] args) {
        demo07RunnableImpl ticket1 = new demo07RunnableImpl();
        Thread t1 = new Thread(ticket1);
        Thread t2 = new Thread(ticket1);
        Thread t3 = new Thread(ticket1);
        t1.start();
        t2.start();
        t3.start();
    }
}
