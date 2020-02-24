package com.xuesong.demo01;

import java.util.stream.Stream;

public class demo05Stream_limit {
    public static void main(String[] args) {
        String[] arr = {"xuesong","kkkk","forsnow"};
        Stream<String> arr1 = Stream.of(arr);
        Stream<String> limit = arr1.limit(2);
        limit.forEach(name-> System.out.println(name));
    }
}
