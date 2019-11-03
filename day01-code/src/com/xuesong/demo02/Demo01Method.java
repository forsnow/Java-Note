package com.xuesong.demo02;
/*
* 方法定义的基础知识
* 定义格式：
* public static void 方法名字(){
*   方法体
* }
*
*
* */
public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

