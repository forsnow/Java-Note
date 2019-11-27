package com.xuesong.demo02;

public class Demo04StringConvert {
    public static void main(String[] args) {
        String str1 = "xuesong";

        //将字符串转化为字符数组toCharArray
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + ",");
            }
        }

        //将字符床转化为字节数组getBytes
        byte[] bytes = str1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (i == bytes.length - 1) {
                System.out.println(bytes[i]);
            } else {
                System.out.print(bytes[i] + ",");
            }
        }

        //replace 将所有出现的老字符串替换为新的字符串，返回替换之后的结果新字符串
        //public String	replace(CharSequence target, CharSequence replacement)
        //备注 CharSequence就是说可以接受字符串类型
        String str2 = str1.replace("xue","snow");
        System.out.println(str2);

    }
}
