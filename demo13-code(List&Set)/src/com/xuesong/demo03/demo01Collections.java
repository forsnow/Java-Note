package com.xuesong.demo03;

import java.util.ArrayList;
import java.util.Collections;


public class demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList,"jiang","xuesong","hahahaha");
        System.out.println(stringArrayList);
        Collections.shuffle(stringArrayList);
        System.out.println(stringArrayList);

    }
}
