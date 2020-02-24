package com.xuesong.demo02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class demo05PropertiesStore {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void  show01() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("xuesong","123");
        prop.setProperty("kkl","456");
        prop.setProperty("song","789");

        FileWriter fw = new FileWriter("D:\\Java\\fileTest\\testprop.txt");
        prop.store(fw,"save data");
        fw.close();
    }
}
