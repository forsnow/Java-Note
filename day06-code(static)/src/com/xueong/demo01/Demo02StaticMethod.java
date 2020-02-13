package com.xueong.demo01;
/*
* 一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而属于类的
*
* 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
* 如果有了static关键字，那么不需要创建对象，直接通过类名称来使用它。
*
* 无论是成员变量，还是成员方法，如果有了static，都推荐使用类名称进行调用
* 静态变量：类名称.静态变量
* 静态方法：类名称.静态方法()
*
* 注意事项
* 1.静态不能直接访问非静态
*    原因: 因为在内存中是先有的静态内容，后有的非静态内容（先人不知道后人，但是后人知道先人）
* 2.静态方法中不能用this
*   原因：this代表当前对象，通过谁调用的方法，谁就是当前对象
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass one = new MyClass();
        one.method();

        //对于静态方法，可以通过对象名进行调用，也可以直接通过类名称进行调用
        one.methodStatic();//不推荐 这种写法编译之后也会被java翻译成类名称.静态方法名
        MyClass.methodStatic();//推荐

        //对于本类当中的静态方法，可以省略名称
        myMethod();
        Demo02StaticMethod.myMethod();//完全等效

    }

    public static void myMethod(){
        System.out.println("my own method!");
    }
}