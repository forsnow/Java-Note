package com.xuesong.ArrayDemo01;
/*
* 数组可以作为方法的参数
* 当调用方法的时候，向方法的小括号传参，传递进去的其实是数组的地址值
*
* */
public class Demo11ArrayParam {
    public static void main(String[] args) {
        int[] Array = {1,3,5,23,43,54,756,454,242,232,645,34};
        printArray(Array);

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
