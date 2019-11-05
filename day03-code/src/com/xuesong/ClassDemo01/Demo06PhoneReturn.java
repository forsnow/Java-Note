package com.xuesong.ClassDemo01;

public class Demo06PhoneReturn {
    public static void main(String[] args) {
        Demo03Phone iPhone = getPhone();
        System.out.println(iPhone.name);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);
    }

    public static Demo03Phone getPhone(){
        Demo03Phone phone = new Demo03Phone();
        phone.name = "iPhone11 Pro";
        phone.color = "black gray";
        phone.price = 8699;
        return phone;
    }
}
