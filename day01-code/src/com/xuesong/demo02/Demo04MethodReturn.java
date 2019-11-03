package com.xuesong.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        System.out.println(getSum(1,2));
        printSun(3,4);
    }

    public static int getSum(int a , int b){
        int result = a + b;
        return result;
    }

    public static void printSun(int a , int b){
        int result = a + b;
        System.out.println("result:"+ result);
    }
}
