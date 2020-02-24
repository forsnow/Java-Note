package com.xuesong.demo07InnerClass;

public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.bodyMethod();

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
