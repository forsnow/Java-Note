package com.xuesong.demo02;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class demo06PropertiesLoad {
    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("D:\\Java\\fileTest\\testprop.txt"));
        Set<String> set = properties.stringPropertyNames();
        for (String key : set){
            String value = properties.getProperty(key);
            System.out.println(key+" "+ value);
        }
    }

}
