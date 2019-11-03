package com.xuesong.demo04;

/*
* 功能类似的方法，只是参数列表不一样
*
* 方法的重载(overload),多个方法名称一样，但是参数列表不一样
* 好处：只需要记住一个唯一的方法名称，就可以实现类似的多个功能
*
* 方法重载与下列因素相关
* 1.参数个数不同
* 2.参数类型不同
* 3.参数多类型顺序不同
*
* 方法重载与下列因素无关
* 1.与参数的名称无关
* 2.与方法的返回值类型无关
* */

public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(3,4,5));
        System.out.println(sum(6,7,8,9));
    }

    public static int sum (int a,int b){
        return a + b;
    }

    public static int sum (int a,int b,int c){
        return a + b + c;
    }

    public static int sum (int a,int b,int c,int d){
        return a + b + c + d;
    }
}
