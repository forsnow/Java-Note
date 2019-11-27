package com.xuesong.demo02;
/*
* 分割字符串的方法
* public String[] split(String regex)
* 按照参数规则，把字符串切分成若干部分
* 注意事项：
* split方法的参数其实是一个"正则表达式"
* 如果对英文句点 .  进行切分 必须写 \\.
* */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "jiang,xue,song";
        String[] split1 = str1.split(",");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }
        String str2 = "jiang.xue.song";
        String[] split2 = str2.split("\\.");
        for (int i = 0; i < split2.length; i++) {
            System.out.println(split2[i]);
        }
    }
}
