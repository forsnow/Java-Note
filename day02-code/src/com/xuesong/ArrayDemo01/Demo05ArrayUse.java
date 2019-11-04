package com.xuesong.ArrayDemo01;
/*
* 使用动态初始化数组的时候，其中的元素将自动拥有一个默认值 规则如下：
* 1.整数类型，默认为0
* 2.浮点类型，默认为0.0
* 3.字符类型，默认为 \u0000
* 4.boolean类型 默认为false
*
*注意事项：
* 静态初始化 其实也有默认值的情况，只不过系统自动马上将默认值替换为大括号中的具体数值
* */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        int[] Array01 = new int[3];
        //给数组中的元素进行赋值
        Array01[1] = 100;
        System.out.println(Array01);
        for (int i = 0; i < 3; i++) {
            System.out.println(Array01[i]);
        }
    }
}
