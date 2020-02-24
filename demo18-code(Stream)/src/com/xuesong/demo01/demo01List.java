package com.xuesong.demo01;

import java.util.ArrayList;
import java.util.List;

public class demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jiangxuesong");
        list.add("jiangxue");
        list.add("jiangsong");
        list.add("kaili");

        List<String> lista = new ArrayList<>();
        for (String s : list){
            if (s.startsWith("jiang")){
                lista.add(s);
            }
        }

        List<String> listb = new ArrayList<>();
        for (String s : lista){
            if (s.length() == 8 ){
                listb.add(s);
            }
        }

        for (String s : listb){
            System.out.println(s);
        }


    }
}
