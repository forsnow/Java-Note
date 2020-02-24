package com.xuesong.demo01;

public class demo04Generic {
    public static void main(String[] args) {
        GenericClass<Integer> gernericClass1 = new GenericClass<>();
        gernericClass1.setName(123);
        System.out.println(gernericClass1.getName());

        GenericClass<String> gernericClass2 = new GenericClass<>();
        gernericClass2.setName("xuesong");
        System.out.println(gernericClass2.getName());



    }
}
