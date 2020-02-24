package com.xuesong.demo02;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        long timeMillisBegin = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long timeMillisEnd = System.currentTimeMillis();
        System.out.println("执行时间为：" + (timeMillisEnd-timeMillisBegin));


        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.arraycopy(arr1,0,arr2,0,3);
        System.out.println(Arrays.toString(arr2));


    }
}
