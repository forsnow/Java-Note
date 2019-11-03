package com.xuesong.demo03;

/*
* 题目：比较两个数是否相等
* */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println("compare result:"+isSame(3,3));
    }

    public static boolean isSame(int a , int b){
        //way1
        //boolean same = a == b? true : false;
        //way2
        //boolean same = a == b;
        //way3
        return a == b;
    }
}
