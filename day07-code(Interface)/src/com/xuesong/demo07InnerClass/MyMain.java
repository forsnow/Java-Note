package com.xuesong.demo07InnerClass;

public class MyMain {
    public static void main(String[] args) {
        MyInnterface myInnterface = new MyInnterface() {
            @Override
            public void myMethod2() {
                System.out.println("匿名内部类实现了方法二");
            }

            @Override
            public void myMethod() {
                System.out.println("匿名内部类实现了方法一");
            }
        };
        //myInnterface.myMethod();
        //myInnterface.myMethod2();

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInnterface() {
            @Override
            public void myMethod() {
                System.out.println("test");
            }

            @Override
            public void myMethod2() {

            }
        }.myMethod();
    }
}
