package com.xuesong.demo02;

public class Demo03MethodParam {
    public static void main(String[] args) {
        System.out.println(multiply(4,5));
        hello();
    }

    public static int multiply (int a , int b){
        int result = a * b;
        return result;
    }

    public static void hello(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world" +i);
        }
    }
}
