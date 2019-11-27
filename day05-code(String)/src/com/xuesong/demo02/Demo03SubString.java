package com.xuesong.demo02;

public class Demo03SubString {
    public static void main(String[] args) {
        String str1 = "xuesong";

        //public String subtring(int index) 截取从参数位置一直到字符串末尾，返回新字符串
        System.out.println(str1.substring(3));//song

        //public String subtring(int begin,int end),截取从begin开始，一直到end结束，中间的字符串
        //备注 [begin,end)
        System.out.println(str1.substring(0,3));//xue
    }
}
