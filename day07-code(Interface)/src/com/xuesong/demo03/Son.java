package com.xuesong.demo03;

public class Son extends Father {
    int num = 10;

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    @Override
    public void shouNum() {
        System.out.println(num);
    }

    public void playGames(){
        System.out.println("hahahha 我会打游戏yo");
    }
}
