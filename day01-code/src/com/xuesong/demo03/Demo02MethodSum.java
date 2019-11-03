package com.xuesong.demo03;
/*求1到一百的和*/
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("求和结果："+getSum(100));
    }

    public static int getSum(int i){
        int result = 0;
        for (int j = 1; j <= i; j++) {
            result = result + j;
        }
        return result;
    }
}
