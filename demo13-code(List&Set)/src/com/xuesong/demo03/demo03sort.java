package com.xuesong.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo03sort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("jiang", 12));
        students.add(new Student("xue", 20));
        students.add(new Student("xuesong", 17));
        students.add(new Student("xuesong", 18));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge()-o2.getAge();
                if (o1.getAge()==o2.getAge()){
                   result =  o1.getName().charAt(0)- o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(students);
    }
}
