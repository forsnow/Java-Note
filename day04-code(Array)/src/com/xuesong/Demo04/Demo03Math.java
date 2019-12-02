package com.xuesong.Demo04;
/*
Math

java.util.Math是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数学运算相关操作
public static double abs(double num) 获取绝对值
public static double ceil(double num) 向上取整
public static double floor(double num) 向下取整
public static long round(double num) 四舍五入


Math.PI近似的圆周率
*/
public class Demo03Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3.1));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.floor(4.9));
        System.out.println(Math.round(5.3));
        System.out.println(Math.round(5.5));
        System.out.println(Math.PI);
    }
}
