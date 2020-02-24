package com.xuesong.demo01;

import java.util.stream.Stream;

public class demo06Stream_skip {
    public static void main(String[] args) {
        String[] arr = {"xuesong","kkkk","heihei"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> skip = stream.skip(2);
        skip.forEach(name-> System.out.println(name));
    }
}
