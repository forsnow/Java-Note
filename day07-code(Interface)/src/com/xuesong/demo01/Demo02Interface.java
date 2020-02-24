package com.xuesong.demo01;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA  a = new MyInterfaceDefaultA();
        a.method();//调用的抽象方法，实际运行的是右侧实现类。
        a.methodDefault();//调用默认方法，如果实现类没有，会向上找接口
    }
}
