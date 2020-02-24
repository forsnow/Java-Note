package com.xuesong.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class PersonTest {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("xuesong",16),
                new Person("jiangjiang",21),
                new Person("songsong",17),
        };

//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        for(Person p : arr){
            System.out.println(p);
        }
    }
}
