package com.xuesong.demo01;

import java.util.stream.Stream;

public class demo02Stream_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("xuesong", "kkkk");
        Stream<String> k = stream.filter((String name) -> {
            return name.endsWith("k");
        });
        k.forEach(name-> System.out.println(name));


    }
}
