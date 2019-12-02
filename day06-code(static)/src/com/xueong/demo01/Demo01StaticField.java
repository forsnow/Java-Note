package com.xueong.demo01;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student(24,"xuesong");
        one.schoolName = "Peking University";
        System.out.println("ID："+one.getId()+" name:"+one.getName()+" age:"+one.getAge()+" school:"+one.schoolName);
        Student two = new Student(25,"snow");
        System.out.println("ID："+two.getId()+" name:"+two.getName()+" age:"+two.getAge()+" school:"+two.schoolName);


    }
}
