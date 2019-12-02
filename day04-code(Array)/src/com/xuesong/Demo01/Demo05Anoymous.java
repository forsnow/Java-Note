package com.xuesong.Demo01;

import java.util.Scanner;

public class Demo05Anoymous {
    public static void main(String[] args) {
//        //普通方式
//        Scanner scanner1 = new Scanner(System.in);
//        int num1 = scanner1.nextInt();
//        //匿名对象方式
//        int num2 = new Scanner(System.in).nextInt();
//        //普通方式传参
//        Scanner scanner2 = new Scanner(System.in);
//        anoymousMethod(scanner2);
//        //匿名方式传参
//        anoymousMethod(new Scanner(System.in));
        //匿名方法作为哦返回值
        Scanner scanner = anoymousReturn();
        int num = scanner.nextInt();
        System.out.println("num:"+num);

    }

    public static void anoymousMethod(Scanner scanner){
        int i = scanner.nextInt();
        System.out.println("the num is :"+i);
    }

    public static Scanner anoymousReturn(){
        return new Scanner(System.in);
    }
}
