package com.xuesong.Demo02;

import java.util.ArrayList;


/*
* 如果希望向集合ArrayList当中存储基本数据类型，必须使用基本数据类型对应的“包装类”
*
* 基本类型   包装类（引用类型，包装类都位于java.lang下面）
* byte       Byte
* short      Short
* int        Integer
* long       Long
* float      Float
* double     Double
* char       Character
* boolean    Boolean
*
* 从jdk1.5开始  开始自动装箱，自动拆箱
* 自动装箱  基本类型-->包装类型
* 自动拆箱  包装类型-->基本类型
*
* */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        //错误写法，泛型只能是引用类型，不能是基本类型
//        ArrayList<int> list = new ArrayList<>();

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(22);
        intList.add(33);
        System.out.println(intList);

    }
}
