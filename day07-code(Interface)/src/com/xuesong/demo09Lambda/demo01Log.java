package com.xuesong.demo09Lambda;

public class demo01Log {
    public static void main(String[] args) {
        String info1 = "Hello";
        String info2 = "xuesong";
        String info3 = "kkk";
        log(2,info1+info2+info3);
        log2(1,()->{
            return info1+info2+info3;
        });

    }

    private static void log(int level,String info){
        if (level == 1){
            System.out.println(info);
        }
    }

    private static void  log2(int level , demo02Log log){
        if (level == 1 ){
            System.out.println(log.logPrint());
        }
    }
}
