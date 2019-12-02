package com.xuesong.Demo03;

import java.util.ArrayList;

/*
* 自定义4个学生对象，添加到集合，并遍历
*
*
* */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        Student student1 = new Student("xuesong",24);
        Student student2 = new Student("xiaoming",25);
        Student student3 = new Student("ez",27);
        Student student4 = new Student("anny",28);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getName()+"  "+arrayList.get(i).getAge());
        }
    }
}
