package com.xuesong.demo04;

public class Demo01Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        //如果想调用子类的特有方法，需要向下转型
        //判断一下父类引用animal本来是不是dog
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.dogMethod();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catMethod();
        }
        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal){
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.dogMethod();
        }

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catMethod();
        }
    }
}
