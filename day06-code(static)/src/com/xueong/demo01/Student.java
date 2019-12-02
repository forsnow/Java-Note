package com.xueong.demo01;

public class Student {
    private int age;
    private String name;
    private int id;
    static String schoolName;

    private static int countID = 0 ;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.id = ++countID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public static int getCountID() {
        return countID;
    }

    public static void setCountID(int countID) {
        Student.countID = countID;
    }
}
