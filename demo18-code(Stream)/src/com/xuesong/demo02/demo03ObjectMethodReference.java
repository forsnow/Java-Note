package com.xuesong.demo02;
/*
*
* 通过对象名引用成员方法
* 使用前提是对象名已经存在，成员方法也是存在的
* 就可以使用对象名来引用成员方法
*
* */
public class demo03ObjectMethodReference {
    public static void main(String[] args) {
        printString((s)->{
            demo02Object demo02Object = new demo02Object();
            demo02Object.printUpperCaseString(s);
        });


        demo02Object obj = new demo02Object();
        printString(obj::printUpperCaseString);
    }

    public static void printString(Printer p){
        p.print("hello");
    }
}
