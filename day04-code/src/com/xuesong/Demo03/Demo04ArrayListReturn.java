package com.xuesong.Demo03;

import java.util.ArrayList;
import java.util.Random;
/*
* 题目
* 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中
*
*
* */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100)+1);
        }
        System.out.println(list);
        System.out.println(getevenArray(list));;
    }

    public static ArrayList<Integer> getevenArray(ArrayList<Integer> arrayList){
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            if (num % 2 == 0){
                evenList.add(num);
            }
        }
        return evenList;
    }
}
