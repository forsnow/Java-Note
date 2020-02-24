package com.xuesong.customer;

public class demo {
    public static void main(String[] args) {
        baozi bz = new baozi();
        new baozipu(bz).start();
        new chihuo(bz).start();
    }
}
