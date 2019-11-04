package com.xuesong.ArrayDemo01;

public class Demo09ArrayMax {
    public static void main(String[] args) {
        int[] Array = {1,3,5,23,43,54,756,454,242,232,645,34};
        int max = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (max < Array[i]){
                max = Array[i];
            }
        }
        System.out.println("max number:"+ max);
    }
}
