package com.xuesong.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) throws ParseException {
//        System.out.println(System.currentTimeMillis());
//        Date date = new Date();
//        System.out.println(date);
//
//        Date date1 = new Date(0);
//        System.out.println( date1);
//
//        Long l = date.getTime();
//        System.out.println(l);

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
////        System.out.println(simpleDateFormat.format(new Date()));
//        Date date = simpleDateFormat.parse("2019-01-01 20:42:444 100");
//        System.out.println(date);
        Calendar calendar = Calendar.getInstance(); //多态？
        System.out.println(calendar);


    }
}
