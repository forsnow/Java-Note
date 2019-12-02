package com.xuesong.Demo02;
/*
* ArrayList当中的常用方法有
*
* public boolean add(E e)  向集合当中添加元素，参数类型和泛型一致
* 备注：对于ArrayList集合来说 add添加动作一定是成功的，所以返回值可用可不用
* 但是对于其他集合（今后学习）来说 add添加动作不一定成功
*
* public E get(int index) 从集合当中获取元素，参数是索引编号，返回值是对应的位置的元素
*
* public E remove(int index) 从集合当中删除元素，参数是索引编号，返回值就是被删除的元素
*
* public int size() 获取集合的尺寸长度，返回值是集合当中包含元素的个数
*
* */
import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //向集合中添加元素 add
        boolean flag = list.add("xuesong");
        System.out.println(list);
        System.out.println("Is it success?  "+flag);

        list.add("jiangjiang");
        list.add("songsong");

        //从集合中获取元素 get 索引从0开始
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        //从集合中删除元素，remove 索引值从0开始
        String whoRemoved = list.remove(2);
        System.out.println("removed people:"+whoRemoved);
        System.out.println(list);

        //获取集合的长度尺寸，也就是其中额元素个数
        int size = list.size();
        System.out.println("集合的长度是："+size);
    }
}
