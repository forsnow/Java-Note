package com.xuesong.demo01;

import java.util.stream.Stream;

public class demo07Stream_concat {
    public static void main(String[] args) {
        String[] arr = {"xuesong","kkkk","heihei"};
        Stream<String> stream1 = Stream.of(arr);

        Stream<String> stream2 = Stream.of("jiang", "song");

        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(name-> System.out.println(name));


    }
}
