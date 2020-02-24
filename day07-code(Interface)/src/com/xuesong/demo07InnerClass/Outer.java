package com.xuesong.demo07InnerClass;

public class Outer {
    int num = 10;
    public class Inner{
        int num = 20;
        public void innerMethod(){
            int num = 30;
            System.out.println(num);//内部类的局部变量
            System.out.println(this.num);//内部类的成员变量
            System.out.println(Outer.this.num);//外部类的成员变量
        }
    }
}
