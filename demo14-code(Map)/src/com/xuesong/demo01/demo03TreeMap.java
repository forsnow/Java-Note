package com.xuesong.demo01;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class demo03TreeMap {
    public static void main(String[] args) {
        Map<Student,Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore()==o2.getScore()){
                    return 0;
                }
                return o1.getScore()>o2.getScore()?  -1 : 1;
            }
        });
        map.put(new Student("xuesong",100),123);
        map.put(new Student("haha",91),456);
        map.put(new Student("xixi",93),123);
        map.put(new Student("hehe",59),3232);
        map.put(new Student("heihei",59),123);

        //遍历key
        for(Student student : map.keySet()){
            System.out.println(student);
        }

        for(Map.Entry<Student,Integer> entry : map.entrySet()){
            Student key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }

        System.out.println(map.get(new Student("heihei",59)));
    }
}

class Student{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


