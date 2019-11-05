package com.xuesong.ClassDemo01;

public class Demo04PhoneUse {
    public static void main(String[] args) {
        Demo03Phone phone = new Demo03Phone();
        System.out.println(phone.name);
        System.out.println(phone.color);
        System.out.println(phone.price);

        phone.name = "iPhone";
        phone.color = "black";
        phone.price = 8699;
        System.out.println(phone.name);
        System.out.println(phone.color);
        System.out.println(phone.price);
        phone.call("xuesong");
        phone.sendMessage();


    }
}
