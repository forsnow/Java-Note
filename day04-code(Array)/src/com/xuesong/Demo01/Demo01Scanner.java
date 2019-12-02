package com.xuesong.Demo01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/*
* Java中的数据类型分为两种
* 1.基本数据类型  4类8种。
* 2.引用数据类型：数组，类，接口
*
* */
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("the num is:"+num);
        String string = scanner.next();
        System.out.println("the string is:"+string);
    }

}
