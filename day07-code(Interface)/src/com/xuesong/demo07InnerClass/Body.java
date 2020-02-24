package com.xuesong.demo07InnerClass;

public class Body { //外部类

    public class Heart{ //内部类
        public void beat(){  //内部类方法
            System.out.println("心动的感觉");
            // System.out.println("my name is " + name); //正确写法
        }

    }

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bodyMethod(){ //外部类方法
        new Heart().beat();//匿名对象访问
        System.out.println("健康的身体");
    }
}
