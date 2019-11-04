package com.xuesong.ArrayDemo01;

public class Demo10ArrayReverse {
    public static void main(String[] args) {
        int[] Array = {1,3,5,23,43,54,756,454,242,232,645,34};
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+" ");
        }

        System.out.println("----------");


        for (int min = 0, max = Array.length-1; min < max; max--,min++) {
           int temp = Array[min];
           Array[min] = Array[max];
           Array[max] = temp;
        }




        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+" ");
        }

    }
}
