package com.xuesong.Demo03;

import java.util.ArrayList;

/*
* 题目
* 定义以指定格式打印集合的方法（Arraylist类型作为参数），使用{}扩起集合，使用@分割每个元素
*
*
* */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("xuesong");
        arrayList.add("ez");
        arrayList.add("kk");
        arrayList.add("cc");
        System.out.println(arrayList);
        printArraylist(arrayList);
    }

    public static void printArraylist(ArrayList<String> arrayList){
        System.out.print("{");
        for (int i = 0; i < arrayList.size(); i++) {
            String name = arrayList.get(i);
            if (i == arrayList.size()-1){
                System.out.print(name+"}");
            }else {
                System.out.print(name + "@");
            }
        }
    }
}
