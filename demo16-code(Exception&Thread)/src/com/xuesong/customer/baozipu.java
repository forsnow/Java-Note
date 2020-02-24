package com.xuesong.customer;

public class baozipu extends Thread{
    private baozi bz;

    public baozipu(baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;

        for(;;){
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (count % 2 == 0) {
                    bz.pi = "小皮";
                    bz.xian = "三鲜馅";
                } else {
                    bz.pi = "大皮";
                    bz.xian = "牛肉馅";
                }
                count++;
                System.out.println("包子铺正在生成：" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺已经做好包子了"+bz.pi + bz.xian+"吃货可以开始吃了");
            }
        }

    }
}
