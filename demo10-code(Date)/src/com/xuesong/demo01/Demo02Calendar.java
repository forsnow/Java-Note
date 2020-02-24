package com.xuesong.demo01;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2099);
        calendar.set(Calendar.MONTH,10);
        calendar.add(Calendar.YEAR,1);
        calendar.add(Calendar.MONTH,-3);
        Date time = calendar.getTime();
        System.out.println(time);


        int year= calendar.get(Calendar.YEAR);
        System.out.println(year);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month+1);//西方的月份是0-11 东方的月份是1-12
        int date = calendar.get(Calendar.DATE);
        System.out.println(date);
    }
}
