package com.xuesong.demo01;

import java.util.Scanner;

/*
* 要求：模拟注册操作，如果用户名存在，则抛出异常并提示，已经注册
*
* */
public class demo02Exception {
    static String[] usernames = {"xuesong","kl","xs"};

    public static void main(String[] args) throws RegisterException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String inputName = scanner.next();
        checkUsrname(inputName);
    }

    //定义一个方法，对用户输入的注册的用户名进行判断
    public static void checkUsrname(String username) throws RegisterException {
        for (String name : usernames){
            if (name.equals(username)){
                throw new RegisterException("您已经注册了");
            }
        }
        System.out.println("注册成功");

    }
}
