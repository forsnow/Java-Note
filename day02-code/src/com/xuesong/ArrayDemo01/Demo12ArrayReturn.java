package com.xuesong.ArrayDemo01;
/*
*
* 一个方法可以又0，1，多个参数，但是只能有0或者1个返回值 不能有多个返回值
* 解决方法：
* 数组的可以作为方法的返回值类型
*
* */
public class Demo12ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculator(10,20,30);
        System.out.println("main array "+ result);
        System.out.println("sum:"+result[0]);
        System.out.println("avg:"+result[1]);
    }

    public static int[] calculator(int a , int b , int c){
        int sum = a + b + c;
        int avg = (a + b + c)/3;
        int[] array = {sum,avg};
        System.out.println("calculator array"+ array);
        return array;
    }
}
