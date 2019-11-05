package com.xuesong.ClassDemo01;

public class Demo05PhoneParam {
    public static void main(String[] args) {
        Demo03Phone iPhone = new Demo03Phone();
        iPhone.name = "iPhone11 Pro";
        iPhone.color = "black gray";
        iPhone.price = 8699;
        phonePrint(iPhone);
    }

    public static void phonePrint(Demo03Phone phone){
        System.out.println(phone.name);
        System.out.println(phone.color);
        System.out.println(phone.price);
    }
}
