package com.xuesong.demo01;

import java.io.File;
import java.io.IOException;

public class demo01File {
    public static void main(String[] args) throws IOException {
//        File file = new File(".");
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getCanonicalPath());

//        String pathSeparator = File.pathSeparator;
//        System.out.println(pathSeparator);
//
//        String separator = File.separator;
//        System.out.println(separator);
        File file = new File("E:\\我的坚果云\\01-工作\\03-太保智学院");
//        String[] list = file.list();
//        for(String s : list){
//            System.out.println(s);
//        }
        File[] files = file.listFiles();
        for (File file1 : files){
            System.out.println(file1);
        }
    }
}
