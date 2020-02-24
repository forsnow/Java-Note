package com.xuesong.demo02;

public class demo03Param {
    public static void main(String[] args) {
        int result = addSum(12,3,2,21,31,23);
        System.out.println(result);

    }

    public static int addSum(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
