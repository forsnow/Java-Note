package com.xuesong.demo01;

import java.io.File;
import java.io.FilenameFilter;

public class demo01Filelist {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\fileTest");
        File[] files = file.listFiles();
        printFiles(files);

        File[] fileFilter = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("txt");
            }
        });
        printFiles(fileFilter);

    }

    public static void printFiles(File[] files){
        System.out.println("=========");
        if (files != null){
            for (File file : files){
                System.out.println(file);
            }
        }
        System.out.println("=========");
    }
}
