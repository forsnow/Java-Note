package com.xuesong.demo01;

public class GenericClass<E> {
     private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
