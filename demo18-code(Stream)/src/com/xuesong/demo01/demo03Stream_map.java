package com.xuesong.demo01;

import java.util.stream.Stream;

public class demo03Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        Stream<Integer> integerStream = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        integerStream.forEach((num)-> System.out.println(num));
    }
}
