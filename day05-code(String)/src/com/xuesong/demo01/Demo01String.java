package com.xuesong.demo01;
/*
* java.lang.String类代表字符串
* api中，Java程序中的所有字符串面值如 "xuesong" 都作为此类的实例实现
* 就是说，程序中所有的双引号字符串，都是string类的对象，没有new照样也是
*
* 字符串的特点
* 1.字符串的内容永不可变。
* 2.正是因为字符不可改变，所以字符串是可以共享使用的。
* 3.字符串效果相当于char[] 字符数组，但是底层原理是byte[] 字节数组
*
* 创建字符串的常见 3+1种 方式
* 3种构造方法
* pubilc String(),创建一个空白字符串，不含有任何内容
* public String(char[] array) 根据字符数组的内容，来创建对应的字符串
* public String(byte[] array) 根据字节数组的内容，来创建对应的字符串
* 一种直接创建
* String str = "Hello";右边直接用双引号
* 注意
* */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("first string: "+ str1);

        //根据字符数组来创建字符串
        char[] charArray = {'A','p','p','l','e'};
        String str2 = new String(charArray);
        System.out.println("second string: " + str2);

        //根据字节数组来创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("third string: " + str3);

        //直接创建
        String str4 = "Hello";
        System.out.println("4th string: "+ str4);
    }

}
