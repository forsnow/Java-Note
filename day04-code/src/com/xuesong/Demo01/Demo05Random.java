package com.xuesong.Demo01;
/*
* Random类的使用
* 获取一个随机的int数字，范围是在int的所有范围，正负都有  int num = random.nextInt();
* 获取一个随机的int数字，参数代表范围  左闭右开区间  int num = random.nextInt(3);
* 实际代表[0,2)  也就是0~2
*
* eg:
* 获取一个随机int数字 在[1~n]范围内
* */
import java.util.Random;

public class Demo05Random {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(4);
        System.out.println("the random num:"+num);


        Random random1 = new Random();
        int n = 5;
        for (int i = 0; i < 10; i++) {
            //本来范围是[0~n)
            int result = random1.nextInt(n)+1;
            System.out.println(result);
        }
    }
}
