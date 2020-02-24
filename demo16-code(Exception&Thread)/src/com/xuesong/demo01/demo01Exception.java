package com.xuesong.demo01;


import java.util.Objects;

public class demo01Exception {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //returnIndex(arr,3);
        isNull(null);
    }

    static int returnIndex(int[] arr , int index){
        int i = arr[index];
        return  i;
    }

    public static void isNull(Object obj){
        Objects.requireNonNull(obj);
    }
}
