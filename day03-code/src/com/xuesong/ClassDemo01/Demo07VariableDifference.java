package com.xuesong.ClassDemo01;
/*
* 局部变量和成员变量
*
* 1.定义的位置不一样
* 局部变量：在方法的内部
* 成员变量；在类的内部，方法的外部
*
* 2.作用域不一样
* 局部变量；只能方法内使用
* 成员变量；整个类都能使用
*
* 3.默认值不一样
* 局部变量；没有默认值，要想使用必须手动赋值
* 成员变量；如果没有赋值会有默认值，规则和数组的一样
*
* 4.内存中位置不一样
* 局部变量；栈
* 成员变量；堆
*
* 5.生命周期不一样
* 局部变量；随着方法进栈而诞生，随着方法出栈而消失
* 成员变量；随着对象的创建而诞生，随着对象被垃圾回收而消失
*
*
* */
public class Demo07VariableDifference {
    String name;//成员变量

    public void methodA(){
        int num = 233;//局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param){//方法的参数就是局部变量
        //参数在方法被调用的时候必然会被赋值的
        System.out.println(param);

//        int age;
//        System.out.println(age); 错误
        System.out.println(name);

    }
}
