package com.xuesong.demo07InnerClass;

public class Outer02 {
    public void outerMethod(){

        class Inner{
            int num = 100;
            public void innerMethod(){
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.innerMethod();
    }
}
