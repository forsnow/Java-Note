package com.xuesong.demo02;
/*
* ==是对象地址值的比较，如果确实需要字符串的内容比较，可以使用两个方法
*
* public boolean equals(Object obj)
* 参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false
* 备注：
* 1.任何对象都能使用object进行接受
* 2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
* 3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面
*  推荐 "abc".equals(str)
*
* public boolean equalsIgnoreCase(String str) 忽略大小写，进行内容的比较
*
* */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "hello";

        char[] charArray = {'h','e','l','l','o'};
        String string3 = new String(charArray);

        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3));
        System.out.println(string1.equals("hello"));
        System.out.println("hello".equals(string1));
        System.out.println("Hello".equalsIgnoreCase(string1));

    }
}
