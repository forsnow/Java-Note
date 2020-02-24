package com.xuesong.demo01;

import java.util.stream.Stream;

public class Demo01GetStream {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> xuesong = Stream.of("xuesong", "jiang", "song");
        //使用Stream流中的方法forEach对Stream流中的数据进行遍历
        xuesong.forEach((String name)->{
            System.out.println(name);
        });

    }
}
