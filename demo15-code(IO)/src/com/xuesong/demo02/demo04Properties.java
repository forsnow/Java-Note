package com.xuesong.demo02;

import java.util.Properties;
import java.util.Set;

public class demo04Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("xuesong","123");
        properties.setProperty("kkk","321");
        properties.setProperty("xxx","456");
        Set<String> set = properties.stringPropertyNames();
        for(String key : set){
            String value = properties.getProperty(key);
            System.out.println(key+"   "+value);
        }

    }
}
