package com.xuesong.Demo02;

import java.util.ArrayList;
/*
* 数组的长度不能随便变化
* 但是ArrayList集合的长度是可以随意变化的
*
* 对于ArrayList的<>代表泛型
* 泛型：也就是装在集合中的所有元素，全部统一成什么类型的，
* 注意：泛型只能是引用数据类型，不能是基本数据类型
*
* 注意事项：
* 对于ArrayList来说，直接打印得到是内容不是地址值
* 如果内容是空的话，得到的是[]
* */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //从jdk1.7开始 右侧的<>可以不写内容但是 <>必须有
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);

        //向list中添加元素 用add方法
        list.add("xuesong");
        list.add("songsong");
        list.add("jiangjiang");

        System.out.println(list);
    }
}
