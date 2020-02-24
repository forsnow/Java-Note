package com.xuesong.demo02;

public class demo04StaticMethodReference {
    //定义一个方法方法的参数传递要计算绝对值的整数和函数式接口Calcable
    public static int calMethod(int num , Calcable calcable){
        return calcable.CalAbs(num);
    }

    public static void main(String[] args) {
        int numAbs = calMethod(-10,Math::abs);
        System.out.println(numAbs);
    }
}
