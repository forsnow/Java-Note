package com.xuesong.demo01;

public class demo07GenericMain {
    public static void main(String[] args) {
        demo06GenericImpl demo06Generic = new demo06GenericImpl();
        demo06Generic.method("xuesong");

        demo08GenericImpl2 demo08GenericImpl2 = new demo08GenericImpl2();
        demo08GenericImpl2.method(123);
        demo08GenericImpl2.method("xuesong");
    }
}
