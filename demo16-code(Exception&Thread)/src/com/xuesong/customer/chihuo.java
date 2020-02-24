package com.xuesong.customer;

public class chihuo extends Thread {
    private baozi bz;

    public chihuo(baozi bz) {
        this.bz = bz;
    }
    @Override
    public void run() {
        for(;;){
            synchronized (bz){
                if (bz.flag == false);
                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("吃货正在吃"+bz.pi+bz.xian+"的包子");
            bz.flag = false;
            bz.notify();
            System.out.println("吃货正在吃"+bz.pi+bz.xian+"的包子"+"吃货已经吃完啦");

        }

    }
}
