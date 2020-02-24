package com.xuesong.demo08Function;

public class functionMain {
    public static void main(String[] args) {
        show01(new functionTestImpl());
        show01(new functionTest() {
            @Override
            public void method1() {
                System.out.println("匿名内部类");
            }
        });

        show01(()-> System.out.println("Lambda表达式"));
    }

    private static void show01(functionTest function){
        function.method1();
    }
}
